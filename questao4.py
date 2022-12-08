'''
4) Faça uma função que receba uma data no formato MM/DD/YYYY,
exemplo: 03/01/2002. Você deverá informar a qual dia da semana
essa data se refere
'''

from datetime import date

DIAS = [
    'Segunda-feira',
    'Terça-feira',
    'Quarta-feira',
    'Quinta-Feira',
    'Sexta-feira',
    'Sábado',
    'Domingo'
]


data_atual = date.today()

data_em_texto = data_atual.strftime('%d/%m/%Y')
print(data_em_texto)

indice_da_semana = data_atual.weekday()
#print(indice_da_semana)

dia_da_semana = DIAS[indice_da_semana]
print(dia_da_semana)

numero_do_dia_da_semana = data_atual.isoweekday()
#print(numero_do_dia_da_semana)
