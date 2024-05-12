# Singleton Pattern

The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

## Dealing with Multithreading
- Use synchronized in getInstance() - [code](./multithreading/SingletonSynchronized.java)
- Use Eagerly created instance - [code](./multithreading/SingletonEagerly.java)
- Use double-checked locking - [code](./multithreading/SingletonDoubleLocking.java)

