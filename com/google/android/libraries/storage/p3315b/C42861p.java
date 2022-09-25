package com.google.android.libraries.storage.p3315b;

import android.util.Log;

/* renamed from: com.google.android.libraries.storage.b.p */
/* compiled from: PG */
abstract class C42861p implements C42825ak {

    /* renamed from: d */
    final /* synthetic */ C42862q f112161d;

    public C42861p(C42862q qVar) {
        this.f112161d = qVar;
    }

    /* renamed from: c */
    public final void mo45910c() {
        Log.v("ASQLDB", C42847bf.m75693f(this.f112161d.f112162a.rawQuery("EXPLAIN QUERY PLAN ".concat(String.valueOf(mo45909b())), (String[]) null)));
    }
}
