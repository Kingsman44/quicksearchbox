package com.google.android.libraries.home.coreui.p1953c;

import android.content.Context;
import android.util.TypedValue;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.c.a */
/* compiled from: PG */
public final class C23636a {
    /* renamed from: a */
    public static final int m44118a(Context context, int i) {
        C69664n.m101061g(context, "<this>");
        C69664n.m101061g(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        return 0;
    }
}
