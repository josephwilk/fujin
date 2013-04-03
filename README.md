#Fujin

[![Build Status](https://travis-ci.org/josephwilk/fujin.png?branch=master)](https://travis-ci.org/josephwilk/fujin)

```clojure

;Relationships
(deftables users monkies)

(deftable-> users (has-one monkies))

(deftable users
  (has-many monkies))


(select-> users where {:id 10})
;SELECT * FROM users WHERE id=10

(-> select users where {:id 10})
;SELECT * FROM users WHERE id=10

(-> (:id users) where {:id 3})
;SELECT users.id FROM users WHERE id=3

(-> users where {:id 10})
;SELECT * FROM users WHERE id=10

(-> users limit 5)
;SELECT * FROM users LIMIT 5

(users)
;SELECT * FROM users

(-> select users where (and {:id 1} {:name "joe"} {:age [> 18]}))
;SELECT * FROM users where id = 1 AND name = "joe" AND age > 18

(insert-> users {:id 1 :monkeys true})
(-> insert users {:id 1 :monkeys true})

(-> insert users {:id 1 :monkeys true :sum ["sum - ?" [10]]})

(update-> users {:monkeys false} where id=1)
(-> update users {:monkeys false} where {:id 1})

(-> delete users where {:id 1})

(-> transaction insert users {:id 1 :monkeys true} rollback)
(-> transaction insert users {:id 1 :monkeys true} commit)
(-> transaction insert users {:id 1 :monkeys true})

(sql "SELECT * from users")
```


## Other related projects
* ClojureQL: http://clojureql.org/examples.html
* Korma: https://github.com/korma/Korma
* http://clojure.github.com/clojure-contrib/sql-api.html
