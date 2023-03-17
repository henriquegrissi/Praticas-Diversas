n1 = int(input('Digite um valor: '))
n2 = int(input('Outro valor: '))
s = n1+n2
d = n1/n2
m = n1*n2
di= n1//n2
e = n1**n2
print('A soma é {}, \n a divisão é {:.3f} e o produto é {} '.format(s, d, m,) , end= ' ')
#{:3f} significa que a divisão só mostrará 3 'casas flutuantes'
print('A divisão inteira vale {}, \n e a potência é {}' .format(di,e))
