public class Flowers<VariableType>{
    private String FlowersName;
    private String FlowersType;
    private VariableType FlowersColor;
    

    public void setFlowersColor(VariableType FlowersColor){
        this.FlowersColor=FlowersColor;
    }
    public VariableType getFlowersColor(){
        return FlowersColor;
    }

    public void setFlowersType(String FlowersType){
        this.FlowersType=FlowersType;
    }
    public String getFlowersType(){
        return FlowersType;
    }

    public void setFlowersName(String FlowersName){
        this.FlowersName=FlowersName;
    }
    public String getFlowersName(){
        return FlowersName;
    }
}