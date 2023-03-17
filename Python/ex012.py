c = float(input('Qual é o comprimento da parede em m2?'))
L = float(input('Qual é a largura da parede em m2?  '))
A = c*L
t = A/2
print('Para pintar uma parede de área {}m2, será necessário {} litros de tinta ' .format(A, t))