package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.c */
/* compiled from: PG */
final class C144218c implements Callable {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f390643a;

    /* renamed from: b */
    final /* synthetic */ String f390644b;

    /* renamed from: c */
    final /* synthetic */ Long f390645c;

    public C144218c(SharedPreferences sharedPreferences, String str, Long l) {
        this.f390643a = sharedPreferences;
        this.f390644b = str;
        this.f390645c = l;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Long.valueOf(this.f390643a.getLong(this.f390644b, this.f390645c.longValue()));
    }
}
