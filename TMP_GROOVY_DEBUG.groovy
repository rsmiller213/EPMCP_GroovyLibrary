Map<String,Map<String,List<String>>> mapSimple = [:]
mapSimple["pov"] = [:]
mapSimple["cols"] = [:]
mapSimple["rows"] = [:]
mapSimple["pov"] = ["Scenario":["Operating Budget"], "Entity":["No Cost Center"], "Funds":["Funds"]]
mapSimple["cols"] = ["Years":["FY16","FY17"],"Period":["IDescendants(Q2)","IDescendants(Q3)"]]
mapSimple["rows"] = ["Version":["Adopted Budget","Requested"],"Account":["IDescendants(51100)"]]


Map<String,List<Map<String,List<String>>>> mapComplex = [:]
mapComplex["pov"] = []
mapComplex["pov"] << ["Scenario":["Operating Budget"], "Entity":["No Cost Center"], "Funds":["Funds"]]
mapComplex["cols"] = []
mapComplex["cols"] << ["Years":["FY16"],"Period":["IDescendants(Q2)"]]
mapComplex["cols"] << ["Years":["FY17"],"Period":["IDescendants(Q3)"]]
mapComplex["rows"] = []
mapComplex["rows"] << ["Version":["Adopted Budget"],"Account":["IDescendants(51100)"]]
mapComplex["rows"] << ["Version":["Requested"],"Account":["IDescendants(51200)"]]

Map<String,List<Map<String,List<String>>>> mapComplex2 = [:]
mapComplex2["pov"] = []
mapComplex2["pov"] << ["Scenario":["Operating Budget"], "Entity":["No Cost Center"], "Funds":["Funds"], "Version":["Adopted Budget"]]
mapComplex2["cols"] = []
mapComplex2["cols"] << ["Years":["FY16"],"Period":["IDescendants(Q2)"]]
mapComplex2["cols"] << ["Years":["FY17"],"Period":["IDescendants(Q3)"]]
mapComplex2["rows"] = []
mapComplex2["rows"] << ["Account":["IDescendants(51100)"]]
mapComplex2["rows"] << ["Account":["IDescendants(51200)"]]