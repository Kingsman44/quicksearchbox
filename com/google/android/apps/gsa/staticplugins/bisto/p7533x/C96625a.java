package com.google.android.apps.gsa.staticplugins.bisto.p7533x;

import android.content.SharedPreferences;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.x.a */
/* compiled from: PG */
public final class C96625a {

    /* renamed from: a */
    public final SharedPreferences f270314a;

    /* renamed from: b */
    public final SharedPreferences.Editor f270315b;

    public C96625a(SharedPreferences sharedPreferences) {
        this.f270314a = sharedPreferences;
        this.f270315b = sharedPreferences.edit();
    }

    /* renamed from: a */
    public final void mo90284a() {
        this.f270315b.apply();
    }

    /* renamed from: b */
    public final void mo90285b(String str, int i) {
        this.f270315b.putInt(C96629e.m160121c("TaperingHelper", str), i);
    }

    /* renamed from: c */
    public final void mo90286c(String str, String str2, long j) {
        this.f270315b.putLong(C96629e.m160121c(str, str2), j);
    }
}
