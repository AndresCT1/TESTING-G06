from hypothesis import given
from hypothesis.strategies import integers
from colas import Queue

@given(integers(min_value=-1000000, max_value=1000000))
def test_enqueue(x):
    q = Queue(10)
    assert q.enqueue(x) is True
    assert q.size == 1

@given(integers(min_value=-1000000, max_value=1000000), integers(min_value=-1000000, max_value=1000000))
def test_enqueue_dequeue(x, y):
    q = Queue(10)
    q.enqueue(x)
    q.enqueue(y)
    assert q.dequeue() == x  # Debería salir primero el elemento x

def test_full():
    q = Queue(2)
    q.enqueue(1)
    q.enqueue(2)
    assert q.full() is True
    assert q.enqueue(3) is False  # No se debe poder agregar más
    assert q.size == 2  # La cola sigue con 2 elementos

def test_empty_dequeue():
    q = Queue(3)
    assert q.dequeue() is None  # No debe devolver nada si la cola está vacía
