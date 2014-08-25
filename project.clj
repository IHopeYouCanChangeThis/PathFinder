(defproject pathfinder "0.1.0-SNAPSHOT"
  :description "A code search application"
  :url "https://github.com/IHopeYouCanChangeThis/PathFinder"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.reader "0.8.7"]
                 [org.clojure/tools.analyzer.jvm "0.5.4"]
                 [clojurewerkz/elastisch "2.1.0-beta4"]]
  :main pathfinder.core
  :profiles {:dev {:dependencies [[midje "1.6.3"]
                                  [org.clojure/tools.namespace "0.2.5"]]
                   :plugins [[lein-midje "3.1.3"]]}
             :uberjar {:aot :all}})
