package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import com.google.android.gms.analytics.C142764q;
import com.google.android.gms.common.util.C144006f;

/* renamed from: com.google.android.gms.analytics.internal.aw */
/* compiled from: PG */
public final class C142726aw extends C142737g {

    /* renamed from: a */
    public SharedPreferences f387310a;

    /* renamed from: b */
    public final C142725av f387311b;

    /* renamed from: c */
    private long f387312c;

    /* renamed from: d */
    private long f387313d = -1;

    protected C142726aw(C142740j jVar) {
        super(jVar);
        C142708ae aeVar = this.f387328e.f387336d;
        this.f387311b = new C142725av(this, ((Long) C142715al.f387251C.mo117506a()).longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
        this.f387310a = this.f387328e.f387334b.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    /* renamed from: b */
    public final long mo117523b() {
        C142764q.m231686b();
        mo117537k();
        long j = this.f387312c;
        if (j != 0) {
            return j;
        }
        long j2 = this.f387310a.getLong("first_run", 0);
        if (j2 != 0) {
            this.f387312c = j2;
            return j2;
        }
        C144006f fVar = this.f387328e.f387340h;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f387310a.edit();
        edit.putLong("first_run", currentTimeMillis);
        if (!edit.commit()) {
            super.mo117536i(5, "Failed to commit first run time", (Object) null, (Object) null, (Object) null);
        }
        this.f387312c = currentTimeMillis;
        return currentTimeMillis;
    }

    /* renamed from: c */
    public final long mo117524c() {
        C142764q.m231686b();
        mo117537k();
        long j = this.f387313d;
        if (j != -1) {
            return j;
        }
        long j2 = this.f387310a.getLong("last_dispatch", 0);
        this.f387313d = j2;
        return j2;
    }

    /* renamed from: d */
    public final void mo117525d() {
        C142764q.m231686b();
        mo117537k();
        C144006f fVar = this.f387328e.f387340h;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f387310a.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.f387313d = currentTimeMillis;
    }
}
