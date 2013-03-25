#Fujin

```clojure

(deftables users)

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


(insert-> users {:id 1 :monkeys true})
(-> insert users {:id 1 :monkeys true})

(-> update users {:monkeys false} where {:id 1})

(update-> users {:monkeys false} where id=1)
```


## Other related projects
* ClojureQL: http://clojureql.org/examples.html
* Korma: https://github.com/korma/Korma
