package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.app.C0388i;
import android.view.ContextThemeWrapper;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44534d;
import com.google.android.material.p3506c.C44581b;
import com.google.android.setupcompat.template.C45276c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bt */
/* compiled from: PG */
public final class C124849bt {
    /* renamed from: a */
    public static C44581b m204630a(Context context) {
        C44581b b = m204631b(context);
        b.f1347a.f1322c = R.drawable.product_logo_assistant_color_24;
        return b;
    }

    /* renamed from: b */
    public static C44581b m204631b(Context context) {
        C44581b bVar = new C44581b(C44534d.m78716c(new ContextThemeWrapper(context, true != m204633d(context) ? 2132150720 : 2132150704)), 2132150987);
        C0388i iVar = bVar.f1347a;
        iVar.f1322c = R.drawable.gs_warning_vd_theme_20;
        iVar.f1333n = false;
        return bVar;
    }

    /* renamed from: c */
    public static C45276c m204632c(Context context) {
        C45276c cVar = new C45276c(context);
        cVar.f118283d = R.style.AssistantOnboardingButtonPrimary;
        cVar.f118282c = 5;
        return cVar;
    }

    /* renamed from: d */
    public static boolean m204633d(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) != 32) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16844176, R.attr.assistant_lightTheme});
            boolean z = obtainStyledAttributes.getBoolean(0, true) && obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
            if (z) {
                return false;
            }
        }
        return true;
    }
}
