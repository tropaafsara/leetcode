class MinStack {
    //with extra space
    public static Stack<Integer> s ;
    public static Stack<Integer> ss ;

    public MinStack() {
        s = new Stack<>();
        ss = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(ss.isEmpty() || ss.peek()>=val){
            ss.push(val);
        }
       
    }
    
    public void pop() {
        int ans = s.peek();
        s.pop();
        if(ss.peek()==ans){
            ss.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        if(ss.isEmpty()){
            return -1;
        }
        return ss.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */