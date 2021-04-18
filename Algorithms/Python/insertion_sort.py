def insertion_sort(array):
    for x in range(1, len(array), 1):
        current = array[x]
        y = x - 1

        while(y >= 0 and array[y] > current):
            array[y + 1] = array[y]
            y -= 1
        array[y + 1] = current
    return array

def main():
    print(insertion_sort([3, 2, 1, 10]))

if __name__ == "__main__":     
    main()