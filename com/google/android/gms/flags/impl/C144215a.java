package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.a */
/* compiled from: PG */
final class C144215a implements Callable {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f390637a;

    /* renamed from: b */
    final /* synthetic */ String f390638b;

    /* renamed from: c */
    final /* synthetic */ Boolean f390639c;

    public C144215a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f390637a = sharedPreferences;
        this.f390638b = str;
        this.f390639c = bool;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f390637a.getBoolean(this.f390638b, this.f390639c.booleanValue()));
    }
}
