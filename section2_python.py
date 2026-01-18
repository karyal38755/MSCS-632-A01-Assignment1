def outer():
    x = 7
    def inner():
        nonlocal x
        x += 59
        return x
    return inner
 
closure_func = outer()
print(closure_func())  
print(closure_func())  
