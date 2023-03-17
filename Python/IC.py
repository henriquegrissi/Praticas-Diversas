num = int(input('Digite um numero: '))
MaiorNum = 0
while num >= 0:
    num = int(input('Digite um numero: '))
    if num > MaiorNum:
        MaiorNum = num
print(f'O maior número digitado foi: {MaiorNum}')