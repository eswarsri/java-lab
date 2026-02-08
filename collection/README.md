# Java Collections Framework Examples

This directory contains simple, meaningful examples demonstrating the core interfaces of the Java Collections Framework.

## Concepts & Implementations

### 1. Lists (`ListExample.java`)
**Concept:** An ordered collection (also known as a *sequence*). Lists can contain duplicate elements.
*   **`ArrayList`**: Implementation backed by a dynamic array. Best for frequent access (`get(i)`).
*   **`LinkedList`**: Implementation backed by a doubly-linked list. Best for frequent insertions and deletions.

### 2. Sets (`SetExample.java`)
**Concept:** A collection that contains no duplicate elements.
*   **`HashSet`**: Implementation backed by a hash table. It does **not** guarantee the order of iteration. It offers the best performance for basic operations (add, remove, contains).
*   **`TreeSet`**: Implementation backed by a TreeMap (sorted map). It guarantees that elements will be in ascending element order, sorted according to the *natural ordering* of its elements (or by a Comparator).

### 3. Maps (`MapExample.java`)
**Concept:** An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
*   **`HashMap`**: Implementation backed by a hash table. It does **not** guarantee the order of the map.
*   **`TreeMap`**: Implementation backed by a Red-Black tree. It guarantees that the entries will be sorted according to the *natural ordering* of the keys.

### 4. Queues (`QueueExample.java`)
**Concept:** A collection designed for holding elements prior to processing.
*   **`PriorityQueue`**: An unbounded priority queue based on a priority heap. The elements of the priority queue are ordered according to their *natural ordering* (or by a Comparator). The head of this queue is the *least* element with respect to the specified ordering.

## Usage

To run these examples, navigate to the parent directory (`java-01`) in your terminal and compile the files:

```bash
cd /Users/eswaransrirengan/eswork/workbench/java-01
javac collection/*.java
```

Run each example individually:

```bash
# Run List Example
java collection.ListExample

# Run Set Example
java collection.SetExample

# Run Map Example
java collection.MapExample

# Run Queue Example
java collection.QueueExample
```
