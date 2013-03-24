#Fujin

```clojure
;select
(-> select users where {:id 10})

;insert
(-> insert users {:id 1 :monkeys true})

;update
(-> update users {:id 1 :monkeys true})
```