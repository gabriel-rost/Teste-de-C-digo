'''
1) Faça uma função que receba um array composto de [ 1, 2, 3, 4, 5, 6, 6 ],
você deverá retornar o segundo maior número deste array.

'''

array = [1,2,3,4,5,6,6]
print(array)

for i in range(len(array)):
    valorMaximo = max(array)
    if array[i] == valorMaximo:
        print("Elemento: ", int(array[i-1]), "Posição: ", int(i-1))
        break
