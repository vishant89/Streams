# Streams
contains practice problems of streams
There are two main types of methods in Java streams:

Intermediate methods: These methods are used to transform, filter or sort the elements of a stream. Intermediate methods return a new stream object, so they can be chained together to form a pipeline of operations. Some common intermediate methods are filter(), map(), flatMap(), sorted(), and distinct().

Terminal methods: These methods are used to produce a final result from the elements of a stream. Terminal methods trigger the processing of the stream and consume the elements in the stream. Once a terminal method is invoked, no further intermediate methods can be applied to the stream. Some common terminal methods are forEach(), count(), reduce(), collect(), and min()/max().

There is also a third type of method, which is a special type of intermediate method called a "short-circuiting" method. These methods are used to terminate the stream early based on a condition. Some common short-circuiting methods are findFirst(), findAny(), allMatch(), anyMatch(), and noneMatch()
