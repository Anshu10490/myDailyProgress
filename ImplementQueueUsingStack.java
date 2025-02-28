class MyQueue {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(x);
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    
    public int pop() {
        return stack2.pop();
    }
    
    public int peek() {
        return stack2.peek();
    }
    
    public boolean empty() {
        if(stack2.size()==0){
            return true;
        }
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
