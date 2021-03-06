(defproject hypower-org/physicloud "0.1.1"
  :description "A platform for programming and managing cyber-physical systems (CPS)."
  :url "http://github.com/hypower-org/physicloud"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [hypower-org/physicloud "0.1.1"]
                 [hypower-org/watershed "0.1.5"]
                 [aleph "0.4.0-beta2"]
                 [incanter "1.5.5"]
                 [net.mikera/core.matrix "0.29.1"]
                 [manifold "0.1.0-beta10"]
                 [criterium "0.4.3"]
                 [com.taoensso/nippy "2.7.0"]
                 [byte-streams "0.2.0-alpha4"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [gloss "0.2.4"]
                 [org.clojure/data.int-map "0.1.0"]]
  :plugins [[lein-nodisassemble "0.1.3"]]
  :main deprecated.control-benchmark
  :repl-options {:timeout 10000000000}
)
