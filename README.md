# Streams
contains practice problems of streams
There are two main types of methods in Java streams:

Intermediate methods: These methods are used to transform, filter or sort the elements of a stream. Intermediate methods return a new stream object, so they can be chained together to form a pipeline of operations. Some common intermediate methods are filter(), map(), flatMap(), sorted(), and distinct().

Terminal methods: These methods are used to produce a final result from the elements of a stream. Terminal methods trigger the processing of the stream and consume the elements in the stream. Once a terminal method is invoked, no further intermediate methods can be applied to the stream. Some common terminal methods are forEach(), count(), reduce(), collect(), and min()/max().

There is also a third type of method, which is a special type of intermediate method called a "short-circuiting" method. These methods are used to terminate the stream early based on a condition. Some common short-circuiting methods are findFirst(), findAny(), allMatch(), anyMatch(), and noneMatch()
Here are some of the most commonly used intermediate methods in Java streams:

filter(): This method filters elements from the stream based on a condition and returns a new stream containing only the matching elements.
map(): This method applies a function to each element in the stream and returns a new stream containing the transformed elements.
flatMap(): This method applies a function to each element in the stream that returns another stream, and then flattens the resulting streams into a single stream.
distinct(): This method returns a new stream containing only the distinct elements from the original stream.
sorted(): This method sorts the elements of the stream in ascending order (by default) or in a specified order.
peek(): This method allows you to perform a side effect on each element of the stream while it is being processed, without changing the elements themselves.
limit(): This method returns a new stream containing only the first n elements of the original stream.
skip(): This method returns a new stream containing all but the first n elements of the original stream.


Here are some of the most commonly used terminal methods in Java streams:

forEach(): This method applies an action to each element of the stream.
count(): This method returns the number of elements in the stream as a long value.
reduce(): This method performs a reduction on the elements of the stream, using a binary operator, and returns the reduced value.
collect(): This method collects the elements of the stream into a collection, such as a List, Set, or Map.
min(): This method returns the minimum element in the stream, according to the natural ordering of the elements or a specified comparator.
max(): This method returns the maximum element in the stream, according to the natural ordering of the elements or a specified comparator.
anyMatch(): This method returns true if any element in the stream matches a given predicate, otherwise it returns false.
allMatch(): This method returns true if all elements in the stream match a given predicate, otherwise it returns false.
noneMatch(): This method returns true if none of the elements in the stream match a given predicate, otherwise it returns false.
findFirst(): This method returns the first element in the stream (if any) or an empty Optional if the stream is empty.
findAny(): This method returns any element in the stream (if any) or an empty Optional if the stream is empty.
