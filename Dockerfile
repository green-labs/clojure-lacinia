FROM clojure
COPY . /usr/src/app
WORKDIR /usr/src/app/uberdeps
RUN clj -e :ok
RUN clojure -M -m uberdeps.uberjar --deps-file ../deps.edn --target ../target/server.jar
EXPOSE 8080
WORKDIR /usr/src/app
CMD ["java", "-jar", "target/server.jar"]