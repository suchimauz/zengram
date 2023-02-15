.PHONY: test

env:
  ifeq ($(wildcard .env),)
	cp "env.tpl" ".env"
  endif

init: env
	git submodule init && git submodule update

repl: init
	clj -M:nrepl:test

test: init
	clj -A:test:kaocha

test-ci: init
	clojure -A:test:kaocha