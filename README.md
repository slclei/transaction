# transaction
Database Transaction from Shiyanlou

**Generate information**
This is a demo for learning Database Transaction. All code
is copied from Shiyanlou, and I may change part of code for a better understand.

**Highlight points**
Database Transaction, indicate a series operation will be either executed completely, or not executed at all.
Key points: ACID (atomic, consistent, isolated, and durable).

**Isolate level**
Isolated level should be taken care; too high level will cause high possible of dead lock, 
and too low level wil cause bug for API. Following level is ranked from high to low.
1 Serializable. (read locks, write locks, and range locks)
2 Repeatable reads. (read locks, write locks, no range locks)
3 Read committed. (read locks after SELECT, write locks, no range locks)
4 Read uncommitted. (lowest, dirty reads is permitted.)

In springBoot, @Transactional is used for Database Transaction.

Setup a new dabase "test" in mysql
