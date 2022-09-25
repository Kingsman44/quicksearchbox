package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;

/* renamed from: com.google.android.gms.analytics.internal.av */
/* compiled from: PG */
public final class C142725av {

    /* renamed from: a */
    public final long f387307a;

    /* renamed from: b */
    final /* synthetic */ C142726aw f387308b;

    /* renamed from: c */
    private final String f387309c;

    public C142725av(C142726aw awVar, long j) {
        this.f387308b = awVar;
        C143919bh.m233969l("monitoring");
        C143919bh.m233959b(j > 0);
        this.f387309c = "monitoring";
        this.f387307a = j;
    }

    /* renamed from: e */
    private final String m231589e() {
        return this.f387309c.concat(":start");
    }

    /* renamed from: a */
    public final long mo117519a() {
        return this.f387308b.f387310a.getLong(m231589e(), 0);
    }

    /* renamed from: b */
    public final String mo117520b() {
        return this.f387309c.concat(":count");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo117521c() {
        return this.f387309c.concat(":value");
    }

    /* renamed from: d */
    public final void mo117522d() {
        C144006f fVar = this.f387308b.f387328e.f387340h;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f387308b.f387310a.edit();
        edit.remove(mo117520b());
        edit.remove(mo117521c());
        edit.putLong(m231589e(), currentTimeMillis);
        edit.commit();
    }
}
