from isPrime import isPrime,isPrime2

def test():
    assert isPrime2(1) == False
    assert isPrime2(2) == True
    assert isPrime2(3) == True
    assert isPrime2(4) == False
    assert isPrime2(5) == True
    assert isPrime2(20) == False
    assert isPrime2(21) == False
    assert isPrime2(22) == False
    assert isPrime2(23) == True
    assert isPrime2(24) == False
    assert isPrime2(25) == False