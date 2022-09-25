package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.content.SharedPreferences;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.f */
/* compiled from: PG */
public final class C110095f {

    /* renamed from: a */
    public final C68214a f306748a;

    public C110095f(C68214a aVar) {
        this.f306748a = aVar;
    }

    /* renamed from: a */
    public static String m183352a(String str, String str2) {
        return "opa_dc_enabled_" + str + "_" + str2;
    }

    /* renamed from: b */
    public final void mo98372b(String str, String str2, boolean z) {
        ((SharedPreferences) this.f306748a.mo27525b()).edit().putBoolean(m183352a(str, str2), z).apply();
    }
}
