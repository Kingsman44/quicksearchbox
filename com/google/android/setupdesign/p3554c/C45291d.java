package com.google.android.setupdesign.p3554c;

import android.text.Spannable;

/* renamed from: com.google.android.setupdesign.c.d */
/* compiled from: PG */
public final class C45291d {
    /* renamed from: a */
    public static void m80722a(Spannable spannable, Object obj, Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        for (Object span : objArr) {
            spannable.setSpan(span, spanStart, spanEnd, 0);
        }
    }
}
