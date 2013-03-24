#Fujin

```clojure
(-> select users where {:id 10})
(-> users where {:id 10})
(-> users limit 5)

(-> insert users {:id 1 :monkeys true})

(-> update users {:monkeys false} where {:id 1})
```
