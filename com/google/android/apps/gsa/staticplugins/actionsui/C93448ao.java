package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.res.TypedArray;
import android.text.TextUtils;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.ao */
/* compiled from: PG */
public final class C93448ao {

    /* renamed from: a */
    public static TypedArray f260825a;

    /* renamed from: b */
    public static int f260826b;

    /* renamed from: c */
    public static int f260827c;

    /* renamed from: a */
    public static final int m153828a(String str) {
        if (TextUtils.isEmpty(str)) {
            return f260827c;
        }
        return f260825a.getColor(Math.abs(str.hashCode()) % f260826b, f260827c);
    }
}
