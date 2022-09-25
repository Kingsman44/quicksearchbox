package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: com.google.android.gms.googlehelp.internal.common.ae */
/* compiled from: PG */
public final class C144299ae {
    /* renamed from: a */
    public static String m234545a(Activity activity) {
        ViewGroup viewGroup;
        String obj = activity.getTitle().toString();
        int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
        if (!(identifier == 0 || (viewGroup = (ViewGroup) activity.findViewById(identifier)) == null)) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    return ((TextView) childAt).getText().toString();
                }
            }
        }
        return obj;
    }
}
