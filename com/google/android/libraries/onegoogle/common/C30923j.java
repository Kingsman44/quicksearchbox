package com.google.android.libraries.onegoogle.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.common.j */
/* compiled from: PG */
public final class C30923j {
    /* renamed from: a */
    public static Activity m57715a(Context context) {
        Activity activity;
        C58838bb.m90866a(context, "context cannot be null");
        int i = 0;
        while (true) {
            activity = null;
            if (i >= 1000) {
                break;
            }
            Class<Activity> cls = Activity.class;
            if (!cls.isInstance(context)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
                i++;
            } else {
                activity = cls.cast(context);
                break;
            }
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            return activity2;
        }
        throw new IllegalArgumentException("Could not extract activity from context");
    }

    /* renamed from: b */
    public static Context m57716b(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterialTheme, R.attr.colorPrimaryGoogle});
        boolean z = false;
        try {
            if (obtainStyledAttributes.getBoolean(0, false) && obtainStyledAttributes.hasValue(1)) {
                z = true;
            }
            if (z) {
                return context;
            }
            return new ContextThemeWrapper(context, 2132150681);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
