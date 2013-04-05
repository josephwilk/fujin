(ns fujin.integration.t-app
  (:require
    [midje.sweet :refer :all]
    [fujin.core :refer :all]))
    

(facts "insert"
  (fact "deleting a user returns if the operation deleted something or not"
    (deftable :address)
    (-> delete users where {:id 1}))
    
  (fact "assocations are used to insert multiple rows"
    (deftable :address
      (belongs-to :users))

    (deftable :users
      (has-one :address))

    (-> insert users {:name "josephwilk" :address {:postcode "1234"}})

    (first (users limit 1)) => (contains {:name "josephwilk"})
    (first (address limit 1)) => (contains {:postcode "1234"})))