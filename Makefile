compile:
	cd uberdeps; \
	clojure -M -m uberdeps.uberjar --deps-file ../deps.edn --target ../target/server.jar

runjar:
	java -cp target/server.jar clojure.main -m core
