# http-client-essentials

A lightweight http client model. All you need to implement an HTTP based protocol and nothing else.

## Purpose

This library provides a lightweight HTTP framework. It's primary use case is for libraries that implement HTTP-based protocols or clients of HTTP-based APIs without having to pull in the dependencies of a specific HTTP client implementation but leaving the choice of the implementation to the project that uses the library.

## Background

When developing a client library for an HTTP based protocol or library you often need to decide for an HTTP client implementation to do the actual communication. However, sometimes you may regret your choice later on and you want or have to move on to another implementation (like when Android deprecated and finally removed the Apache HttpClient from it's API).

On the other hand, when developing an application that makes use of serveral HTTP based protocols you usually want to use an existing libraries for that. In that case it's rather annoying when all the libraries you want to use pull in a different HTTP client as a dependency, or even worse, depend on different versions of the same HTTP client library.

## Why should I use http-client-essentials for my library?

You should use this framework if

* you want to leave the choice of a specific HTTP client implementation to the users of your library,
* you want to make it easy to switch to a different HTTP client implementation,
* you want to focus on the actual protocol you implement and you don't want to care about TCP/IP and HTTP basics like setting socket and connection timeouts, proxies, compression or authentication and all the stuff that is up to the consumer of your libarary to configure,
* you want to avoid dependency conflicts because different libraries pull in different versions of an HTTP client
* you want to avoid pulling in multiple HTTP client implementations, because some libaries use HTTP client X and others use HTTP client Y
* you want a clean architecture that is thread-safe by design.

## What makes it different from Apache's HttpClient, Volley, okhttp, HttpUrlConnection etc.?

http-client-essentials defines a set of interfaces that model HTTP requests and responses on a high abstract level. The model has certain similarities with Apache's HttpClient and with Google's Volley clients, though there are some essential differences.

The most important difference is: This is not a fully featured HTTP client implementation. It still relies on an actual HTTP client implementation like the ones in the title of this section. But: it doesn't matter which one is actually in use since the iterfaces abstract from any implementation details and you can adapt this framework to all of those.

Other differences are:

* There is an interface for each and every public method.
* All (non-Exception) classes in this framework are either abstract or final.
* No setters.
* Mostly immutable, there are some Iterators being returned as well as few Lists (the latter one is planned to be replaced by something that's immutable).
* Header values are typed. You don't have to deal with plain Strings, instead you get a MediaType or a List of Links, etc.
* Pure object oriented design.

## Requirements

This library uses [Iterators](https://github.com/dmfs/iterators).

## License

Copyright (c) Marten Gajda 2016, licensed under Apache2.


