package com.google.android.apps.gsa.staticplugins.opa.samson.p8419b.p8420a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.b.a.b */
/* compiled from: PG */
public final class C110045b {

    /* renamed from: a */
    public final SharedPreferences f306609a;

    /* renamed from: b */
    public final C58881cr f306610b;

    /* renamed from: c */
    public WeakReference f306611c = new WeakReference((Object) null);

    public C110045b(SharedPreferences sharedPreferences, Context context) {
        this.f306609a = sharedPreferences;
        this.f306610b = C58886cw.m90973a(new C110044a(context));
    }

    /* renamed from: a */
    public final boolean mo98332a(String str) {
        return this.f306609a.getBoolean("key_prefix_am_chip_optin__".concat(String.valueOf(str)), true);
    }
}
