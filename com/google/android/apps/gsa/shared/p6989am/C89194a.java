package com.google.android.apps.gsa.shared.p6989am;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.shared.am.a */
/* compiled from: PG */
public final class C89194a {

    /* renamed from: a */
    public final C58833ax f241817a;

    public C89194a(C58833ax axVar) {
        this.f241817a = axVar;
    }

    /* renamed from: a */
    public static int m145064a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        return (int) (((float) (((float) Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)) / f > 400.0f ? 264 : 216)) * f);
    }
}
