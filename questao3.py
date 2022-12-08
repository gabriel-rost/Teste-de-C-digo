'''
3) Faça uma função que retorne apenas as vogais de uma palavra.

'''
        
vogais = []
palavra = str(input("Escreva uma palavra: "))

for i in range(len(palavra)):
    if palavra[i] == "a" or palavra[i] == "e" or palavra[i] == "i" or palavra[i] == "o" or palavra[i] == "u":
        vogais.append(palavra[i])
        
print(vogais)

