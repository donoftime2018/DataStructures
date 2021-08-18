# part c
class Queue
    def initialize(capacity)
        @array_queue = Array.new(capacity) #create an array that holds 'capacity' # of elements
        @index = 0 # loop variable for iterator mechanism
    end

    def dequeue()
        for i in @array_queue.length.downto(0) # start from e.length since elements are removed from the end
            if @array_queue[i] != nil
                @array_queue[i] = nil # remove most recent element added to e
                break # so loop doesn't keep iterating
            end
        end
    end

    def enqueue(element)
        for i in 0...@array_queue.length
            if @array_queue[i] == nil
                @array_queue[i] = element #add element to index if index is null
                break #break out of loop when element is assigned to an index
            end
        end
    end

    def iterate()
        # part e
        element = 0 # initialize a variable to store an 'array_queue' element; set it to 0 so it won't be null from the get go
        while element != nil
            element = iterator # set element to return value of 'iterator' (which is a specific element from array_queue)
            puts element # display element
        end
        @index = 0 # set 'index' back to 0 so it can iterate through all elements again
    end
    
    def iterator()
        while @index < @array_queue.length 
            element = @array_queue[@index] #assign 'element' to array position at current value of 'index' class variable
            break # so loop doesn't keep executing
        end
        @index+=1 # increment index to point to next element in 'array_queue'
        return element # return current element being pointed to
    end

end

#part d
queue_1 = Queue.new(15) # create new e object to hold 15 objects
queue_1.enqueue(3) # add element to queue_1
queue_1.enqueue(4) 
queue_1.enqueue(55)
queue_1.enqueue(6)
queue_1.enqueue(15)
queue_1.enqueue(15/3)
queue_1.enqueue(3**4)
queue_1.enqueue(11*2)
queue_1.enqueue(10*4+5)
queue_1.enqueue(4**2)

puts "Queue looks like..."
queue_1.iterate # call iterate function to display all elements in queue

