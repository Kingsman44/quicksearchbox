package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C142764q;
import com.google.android.gms.common.util.C144006f;

/* renamed from: com.google.android.gms.analytics.internal.e */
/* compiled from: PG */
public final class C142735e extends C142737g {

    /* renamed from: a */
    public final C142755y f387327a;

    public C142735e(C142740j jVar) {
        super(jVar);
        this.f387327a = new C142755y(jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
        this.f387327a.mo117538l();
    }

    /* renamed from: b */
    public final long mo117530b(C142742l lVar) {
        mo117537k();
        C142764q.m231686b();
        long s = this.f387327a.mo117595s(lVar);
        if (s != 0) {
            return s;
        }
        this.f387327a.mo117588f(lVar);
        return 0;
    }

    /* renamed from: c */
    public final void mo117531c(C142718ao aoVar) {
        mo117537k();
        super.mo117536i(3, "Hit delivery requested", aoVar, (Object) null, (Object) null);
        this.f387328e.mo117542b().mo117603c(new C142733c(this, aoVar));
    }

    /* renamed from: d */
    public final void mo117532d(boolean z) {
        super.mo117536i(2, "Network connectivity status changed", Boolean.valueOf(z), (Object) null, (Object) null);
        this.f387328e.mo117542b().mo117603c(new C142730b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo117533e() {
        C142764q.m231686b();
        C142755y yVar = this.f387327a;
        C142764q.m231686b();
        C144006f fVar = yVar.f387328e.f387340h;
        yVar.f387380b = System.currentTimeMillis();
    }

    /* renamed from: f */
    public final void mo117534f() {
        super.mo117536i(2, "Radio powered up", (Object) null, (Object) null, (Object) null);
        mo117537k();
        Context context = this.f387328e.f387334b;
        if (!C142727ax.m231598a(context) || !C142728ay.m231599a(context)) {
            mo117537k();
            this.f387328e.mo117542b().mo117603c(new C142734d(this));
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
        context.startService(intent);
    }

    /* renamed from: g */
    public final void mo117535g() {
        mo117537k();
        C142764q.m231686b();
        this.f387327a.mo117590n();
    }
}
