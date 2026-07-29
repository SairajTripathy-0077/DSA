import sys
 
def solve():
    # Read the number of test cases
    t = int(sys.stdin.readline().strip())
    
    for _ in range(t):
        # Read the line, split by spaces, convert to integers, and store in a list
        a = list(map(int, sys.stdin.readline().split()))
        
        #sort the list to find the minimum and maximum easily
        a.sort()
        max_value = a.pop()
        a = [-x for x in a]
        
        sum_of_negatives = sum(a)
        sol = sum_of_negatives + max_value
        print(sol)
 
 
if __name__ == '__main__':
    solve()