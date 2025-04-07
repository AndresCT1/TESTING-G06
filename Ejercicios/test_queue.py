import pytest
from colas import Queue  

def test_queue_init():
    q = Queue(5)
    assert q.max == 5
    assert q.head == 0
    assert q.tail == 0
    assert q.size == 0
    assert q.empty() is True

def test_enqueue():
    q = Queue(3)
    assert q.enqueue(1) is True
    assert q.enqueue(2) is True
    assert q.enqueue(3) is True
    assert q.enqueue(4) is False
    assert q.size == 3

def test_dequeue():
    q = Queue(3)
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    assert q.dequeue() == 1
    assert q.dequeue() == 2
    assert q.size == 1
    assert q.head == 2

def test_full_empty():
    q = Queue(2)
    assert q.empty() is True
    q.enqueue(10)
    assert q.empty() is False
    q.dequeue()
    assert q.empty() is True
    assert q.full() is False
    q.enqueue(20)
    q.enqueue(30)
    assert q.full() is True

