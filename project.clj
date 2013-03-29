(defproject fujin "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.2.3"]]
  
  :min-lein-version "2.0.0"
  :profiles {:dev {:plugins [[lein-midje "3.0-beta1"]]
                   :dependencies [[midje "1.5.1"]]}})
