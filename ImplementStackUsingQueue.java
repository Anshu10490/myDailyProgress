class MyStack {
    Queue<Integer> Q1=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        Q1.add(x);
        for(int i=1;i<Q1.size();i++){
            int temp=Q1.remove();
            Q1.add(temp);
        }
    }
    
    public int pop() {
        return Q1.remove();
    }
    
    public int top() {
        return Q1.peek();
    }
    
    public boolean empty() {
        return Q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
