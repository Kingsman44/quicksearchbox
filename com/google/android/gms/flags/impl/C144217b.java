package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.b */
/* compiled from: PG */
final class C144217b implements Callable {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f390640a;

    /* renamed from: b */
    final /* synthetic */ String f390641b;

    /* renamed from: c */
    final /* synthetic */ Integer f390642c;

    public C144217b(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f390640a = sharedPreferences;
        this.f390641b = str;
        this.f390642c = num;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Integer.valueOf(this.f390640a.getInt(this.f390641b, this.f390642c.intValue()));
    }
}
