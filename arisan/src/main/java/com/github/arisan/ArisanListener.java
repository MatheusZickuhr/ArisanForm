package com.github.arisan;

import com.github.arisan.adapter.ArisanAdapter;
import com.github.arisan.model.FormModel;
import com.github.arisan.model.ListenerModel;

import java.util.List;

public class ArisanListener {
    public interface OnCondition {
        public ListenerModel onValue(String value);
    }

    public static interface ChildCondition {
        ListenerModel onValue(String value, List<FormModel> fieldList);
    }

    public static interface SearchCondition{
        public ListenerModel onSearch(String value);
    }

    public static interface ViewMod{
        public Object modding(Object view);
    }

    public static interface CheckboxCondition{
        public ListenerModel onChecked(String just_checked, List<String> all_checked,ArisanAdapter adapter);
    }

    public static interface ProgressListener{
        public void showProgress();
    }
}
