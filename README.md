Hamza Taaloucht

## Problem 4 analysis

- Random insert/delete: ArrayList wins. Both are O(n), but ArrayList just shifts the array while LinkedList has to walk through the nodes to find the index.
- Insert/delete at the start/end: LinkedList wins. addFirst/removeFirst are O(1), but add(0)/remove(0) on an ArrayList shift every element.
- Random access: ArrayList wins. get(i) is O(1) on an array, but LinkedList has to go node by node.
