# Quarkus Hibernate Reactive Bug

The following project uses Quarkus with Hibernate Reactive.

## Steps to reproduce error

```shell script
./mvnw package
```
```shell script
docker-compose up --build
```
Open `localhost:8080/foods` in your browser. This should throw:
- CompletionException: IllegalStateException: session is currently connecting to database
- IllegalStateException: session is currently connecting to database

See `stacktrace.txt` for more info.