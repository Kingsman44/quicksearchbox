package com.google.android.gms.common.p10782e;

import android.content.Context;

/* renamed from: com.google.android.gms.common.e.c */
/* compiled from: PG */
public final class C143873c {

    /* renamed from: a */
    public static final C143873c f389983a = new C143873c();

    /* renamed from: b */
    private C143872b f389984b = null;

    /* renamed from: a */
    public final synchronized C143872b mo119351a(Context context) {
        if (this.f389984b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f389984b = new C143872b(context);
        }
        return this.f389984b;
    }
}
