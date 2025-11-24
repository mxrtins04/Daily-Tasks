def getTwoOldestAgesInList(list):
    sorted_list = sorted(list)
    start = sorted_list[-3]
    end = sorted_list[-1]
    new_list = [sorted_list[-1], sorted_list[-2]]
    return new_list

list = [23,45,32,12,64,23]
print(getTwoOldestAgesInList(list))