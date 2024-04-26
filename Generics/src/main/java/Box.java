public class Box <T>{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    Box (T content){
        this.content = content;

    }

    public void castValue(T content){
        if (content instanceof this.getClass()){

        }
    }
}
