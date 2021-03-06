(defproject org.cyverse/permissions-client "2.8.1-SNAPSHOT"
  :description "A Clojure client library for the CyVerse permissions service."
  :url "https://github.com/cyverse-de/permissions-client"
  :license {:name "BSD"
            :url "http://iplantcollaborative.org/sites/default/files/iPLANT-LICENSE.txt"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[cheshire "5.6.1"]
                 [clj-http "2.0.0"]
                 [com.cemerick/url "0.1.1"]
                 [medley "0.8.2"]
                 [org.clojure/clojure "1.8.0"]]
  :profiles {:test {:dependencies [[clj-http-fake "1.0.2"]]}})
