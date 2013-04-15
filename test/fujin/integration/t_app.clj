(ns fujin.integration.t-app
  (:require
    [midje.sweet :refer :all]
    [fujin.core :refer :all]))

(fact "select"
  (deftable :users)
  (-> insert users (values {:name "josephwilk"}))
  (users) => [{:name "josephwilk"}])

(facts "insert"
  (fact "deleting a user returns if the operation deleted something or not"
    (deftable :users)
    (-> delete users where {:id 1}) => 1)

  (fact "assocations are used to insert multiple rows"
    (deftable :address
      (belongs-to :users))

    (deftable :users
      (has-one :address))

    (-> insert users (values {:name "josephwilk" :address {:postcode "1234"}}))

    (users) => (contains {:name "josephwilk"})
    (address) => (contains {:postcode "1234"})))