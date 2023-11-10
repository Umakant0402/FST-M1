import pandas

from pandas import ExcelWriter

data = {
    "FirstName": ["Satvik", "Avinash", "Lahri"],
    "LastName": ["Shah", "Kati", "Rath"],
    "Email": ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
    "PhoneNumber": [4537829158, 5892184058, 4528727830]
}
dataframe = pandas.DataFrame(data)
# writer = ExcelWriter('activity19.xlsx')
# dataframe.to_excel(writer, "Sheet1", index=False)
dataframe.to_excel("activity19.xlsx", index=False)
