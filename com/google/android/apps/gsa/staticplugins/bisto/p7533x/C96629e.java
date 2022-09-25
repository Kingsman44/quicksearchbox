package com.google.android.apps.gsa.staticplugins.bisto.p7533x;

import android.content.SharedPreferences;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.x.e */
/* compiled from: PG */
public class C96629e {

    /* renamed from: a */
    private final SharedPreferences f270317a;

    public C96629e(SharedPreferences sharedPreferences) {
        this.f270317a = sharedPreferences;
    }

    /* renamed from: c */
    public static String m160121c(String str, String str2) {
        return str + "." + str2;
    }

    /* renamed from: a */
    public final long mo90289a(String str, String str2, long j) {
        return this.f270317a.getLong(m160121c(str, str2), j);
    }

    /* renamed from: b */
    public final C96625a mo90290b() {
        return new C96625a(this.f270317a);
    }

    /* renamed from: d */
    public final void mo90291d(String str, String str2, long j) {
        C96625a b = mo90290b();
        b.mo90286c(str, str2, j);
        b.mo90284a();
    }

    /* renamed from: e */
    public final void mo90292e(String str) {
        C96625a b = mo90290b();
        for (String next : b.f270314a.getAll().keySet()) {
            if (next.startsWith(str)) {
                b.f270315b.remove(next);
            }
        }
        b.mo90284a();
    }

    /* renamed from: f */
    public final void mo90293f(String str, boolean z) {
        C96625a b = mo90290b();
        b.f270315b.putBoolean(m160121c("prefs", str), z);
        b.mo90284a();
    }

    /* renamed from: g */
    public final void mo90294g(String str, String str2) {
        C96625a b = mo90290b();
        b.f270315b.putString(m160121c("prefs", str), str2);
        b.mo90284a();
    }

    /* renamed from: h */
    public final boolean mo90295h(String str) {
        return this.f270317a.getBoolean(m160121c("prefs", str), false);
    }

    /* renamed from: i */
    public final int mo90296i(String str) {
        return this.f270317a.getInt(m160121c("TaperingHelper", str), 0);
    }

    /* renamed from: j */
    public final String mo90297j(String str, String str2) {
        return this.f270317a.getString(m160121c("prefs", str), str2);
    }
}
