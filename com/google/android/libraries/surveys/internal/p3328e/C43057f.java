package com.google.android.libraries.surveys.internal.p3328e;

import android.content.Context;
import android.os.Build;
import android.support.p033v7.app.C0391l;
import android.view.ContextThemeWrapper;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;

/* renamed from: com.google.android.libraries.surveys.internal.e.f */
/* compiled from: PG */
public final class C43057f {
    /* renamed from: a */
    public static C0391l m75964a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return new C44581b(new ContextThemeWrapper(context, R.style.SurveyMaterialComponentsTheme), R.style.SurveyMaterialAlertDialogStyle);
        }
        return new C0391l(context, R.style.SurveyAlertDialogTheme);
    }
}
