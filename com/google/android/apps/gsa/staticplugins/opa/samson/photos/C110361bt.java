package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.SharedPreferences;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bt */
/* compiled from: PG */
public final class C110361bt {

    /* renamed from: a */
    public final C68214a f307591a;

    public C110361bt(C68214a aVar) {
        this.f307591a = aVar;
    }

    /* renamed from: b */
    public static String m183755b(String str) {
        return "opa_pf_amb_pc_".concat(String.valueOf(str));
    }

    /* renamed from: c */
    public static String m183756c(String str) {
        return "opa_pfca_".concat(String.valueOf(str));
    }

    /* renamed from: d */
    public static String m183757d(String str, String str2) {
        return "opa_pf_enabled_" + str + "_" + str2;
    }

    /* renamed from: e */
    public static String m183758e(String str, String str2) {
        return "opa_pfoa_" + str + "_" + str2;
    }

    /* renamed from: a */
    public final int mo98588a(String str) {
        return ((SharedPreferences) this.f307591a.mo27525b()).getInt(m183755b(str), 0);
    }

    /* renamed from: f */
    public final void mo98589f(String str, String str2, boolean z) {
        if (!mo98591h(str, str2)) {
            ((SharedPreferences) this.f307591a.mo27525b()).edit().putBoolean(m183758e(str, str2), z).apply();
        }
    }

    /* renamed from: g */
    public final void mo98590g(String str, String str2, boolean z) {
        ((SharedPreferences) this.f307591a.mo27525b()).edit().putBoolean(m183757d(str, str2), z).apply();
    }

    /* renamed from: h */
    public final boolean mo98591h(String str, String str2) {
        return ((SharedPreferences) this.f307591a.mo27525b()).getBoolean(m183758e(str, str2), false);
    }

    /* renamed from: i */
    public final boolean mo98592i(String str, String str2) {
        return ((SharedPreferences) this.f307591a.mo27525b()).contains(m183758e(str, str2));
    }

    /* renamed from: j */
    public final boolean mo98593j(String str, String str2) {
        return !((SharedPreferences) this.f307591a.mo27525b()).getBoolean(m183757d(str, str2), true);
    }

    /* renamed from: k */
    public final boolean mo98594k(String str, String str2) {
        return ((SharedPreferences) this.f307591a.mo27525b()).getBoolean(m183757d(str, str2), false);
    }
}
