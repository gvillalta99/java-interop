(defproject java-interop/example "1.0.0"
  :description "Testing java interop with clojure"
  :min-lein-version "2.9.0"
  :jvm-opts ["-XX:MaxPermSize=128m"]

  :dependencies [[org.clojure/clojure "1.9.0"]]
  :plugins [[lein-junit "1.1.9"]]

  :java-source-paths ["src/main/java" "src/test/java"]
  :javac-options ["-target" "1.8" "-source" "1.8"]
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure/" "src/test/java"]

  :profiles {:dev {:dependencies [[junit/junit "4.12"]]}}

  :junit ["src/test/java"]
  :junit-formatter :brief
  :junit-results-dir "target/junit-test-results"
  )
