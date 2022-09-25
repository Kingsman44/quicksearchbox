package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.d */
/* compiled from: PG */
final class C144219d implements Callable {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f390646a;

    /* renamed from: b */
    final /* synthetic */ String f390647b;

    /* renamed from: c */
    final /* synthetic */ String f390648c;

    public C144219d(SharedPreferences sharedPreferences, String str, String str2) {
        this.f390646a = sharedPreferences;
        this.f390647b = str;
        this.f390648c = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f390646a.getString(this.f390647b, this.f390648c);
    }
}
