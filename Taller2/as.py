
from random import randint

def Insertion_Sort(a):
    for i in range (1,len(a)): 
        x = a[i]
        index = i
        while index > 0 and a[index -1] > x:
            a[index] = a[index - 1]
            index = index-1
        
        a[index] = x
    return a

def Lineal_Search(a,data):
    index = -1
    for i in range(0,len(a)):
        if a[i] == data:
            index = i
            break
        
        
    return index+1

def Binary_Search(a,data):
    LowerBound = 0 
    UpperBound = len(a)-1
    index = -1
    while LowerBound < UpperBound:
        middlePoint = int((LowerBound + UpperBound)/2)
        if data == a[middlePoint]:
            index = middlePoint
            break
        else:
            if data < a[middlePoint]:
                UpperBound = middlePoint -1
            else:
                LowerBound = middlePoint +1
    
    if LowerBound == UpperBound and a[LowerBound] == data:
        index = LowerBound
    
    return index

def Binary_Search_Recursive(a,data,lB,uB):
    middlePoint= int((lB+uB) /2)
    if lB== uB:
        if data == a[middlePoint]:
            return middlePoint
        else:
            return -1
    else:
        if data == a[middlePoint]:
            return middlePoint
        else:
            if data<a[middlePoint]:
                return Binary_Search_Recursive(a, data, lB, middlePoint)
            else:
                return Binary_Search_Recursive(a, data, middlePoint +1, uB)

def Interpolation_Search(a,data):
    lowerBound = 0
    upperBound = len(a)-1
    index = -1
    while lowerBound < upperBound:
        middlePoint = int(lowerBound + ((upperBound-lowerBound)/(a[upperBound] - a[lowerBound])) * (data - a[lowerBound]))
        if data == a[middlePoint]:
            index = middlePoint
            break
        else:
            if data< a[middlePoint]:
                upperBound = middlePoint-1
            else:
                lowerBound = upperBound + 1
                
    if lowerBound == upperBound and a[lowerBound] == data:
        index = lowerBound
    
    return index

def Interpolation_Search_Recursive (a,data,lB,uB):    
    middlePoint = int(lB + ((uB-lB)/(a[uB] - a[lB]))*(data - a[lB]))
    if lB == uB:
        if data == a[middlePoint]:
            return middlePoint
        else:
            return -1
    else:
        if data == a[middlePoint]:
            return middlePoint
        else:
            if data < a[middlePoint]:
                return Interpolation_Search_Recursive(a, data, lB, middlePoint)
            else:
                return Interpolation_Search_Recursive(a, data, middlePoint + 1, uB)     
    
    def Insertion_Sort(a):
        for i in range (1,len(a)): 
            x = a[i]
            index = i
            while index > 0 and a[index -1] > x:
                a[index] = a[index - 1]
                index = index-1
        
        a[index] = x
    return a

def Bubble_Sort(a):
        for i in range (1,len(a)-1):
            swapped = False
            for j in range (0, len(a)-1):
                if a[j]>a[j+1]:
                    swap = a[j]
                    a[j]=a[j+1]
                    a[j+1]= swap
                    swapped = True
                
        
                if not swapped:
                    break
        
        return a

def Merge_Sort(a):
    if len(a)>1:
        mid = len(a)//2
        lefthalf = a[:mid]
        righthalf = a[mid:]

        Merge_Sort(lefthalf)
        Merge_Sort(righthalf)
        
        i=0
        j=0
        k=0
        while i < len(lefthalf) and j < len(righthalf):
            if lefthalf[i] < righthalf[j]:
                a[k]=lefthalf[i]
                i=i+1
            else:
                a[k]=righthalf[j]
                j=j+1
            k=k+1

        while i < len(lefthalf):
            a[k]=lefthalf[i]
            i=i+1
            k=k+1

        while j < len(righthalf):
            a[k]=righthalf[j]
            j=j+1
            k=k+1

    return a

def Quick_Sort(a):
    if len(a) <= 1:
        return a
    else:
        pivot = a[0]
        less_Subarray = []
        greater_Subarray = []
        for i in range (1,len(a)):
            if a[i]<pivot:
                less_Subarray.append(a[i])
            else:
                greater_Subarray.append(a[i])
                
        result = []
        result.extend(Quick_Sort(less_Subarray))
        result.append(pivot)
        result.extend(Quick_Sort(greater_Subarray))
        
    return result

a= [randint(1,50) for i in range(10)]
a=Insertion_Sort(a)
print("Original: ",a)
print("")
print("Ingrese el valor a buscar ")
data = int(input())
lB= 0 
uB = len(a)-1
b = Interpolation_Search_Recursive(a, data, lB, uB)
print("")
print("Posicion: ",b)


