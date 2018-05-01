package com.javacreativeapps.arisan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.javacreativeapps.arisan.model.ArisanField;

import java.util.List;

import static android.app.Activity.RESULT_OK;

/**
 * Created by wijaya on 4/22/2018.
 */

public class ArisanClosing {
    public static void submit(Context context, List<ArisanField> arisanFields){
        Intent data = new Intent();
        data.setData(Uri.parse(FieldAssembler.toJson(arisanFields)));
        ((Activity)context).setResult(RESULT_OK,data);
        ((Activity)context).finish();
    }
}
