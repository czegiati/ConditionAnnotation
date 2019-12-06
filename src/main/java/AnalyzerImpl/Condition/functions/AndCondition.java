package AnalyzerImpl.Condition.functions;


import AnalyzerImpl.Condition.AbstractCondition;
import AnalyzerImpl.Condition.Condition;

@Condition(name="AND")
public class AndCondition extends AbstractCondition {

    @Override
    public Boolean getValue() {
        for(AbstractCondition cond:this.getSubObjects())
        {
            if(!cond.getValue()) return false;
        }
        return true;
    }

}
