import math
c = int(input('Digite o comprimento do cateto oposto: '))
c1 = int(input('Digite o valor do comprimento do cateto adjacente: '))
h1 = ((c**2) + (c1**2))
h = math.sqrt(h1)
print('O valor da hipotenusa é {}'.format(int(h)))