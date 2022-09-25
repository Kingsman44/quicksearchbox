package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a;

import com.google.android.libraries.p10985af.p10986a.p10989b.p10994b.C147490a;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a.p10997a.C147493a;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11000d.C147525a;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11000d.C147527c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.p4184bj.p4193c.p4197c.C55931ae;

/* renamed from: com.google.android.libraries.af.a.b.c.a.u */
/* compiled from: PG */
public final class C147517u implements C147500d {

    /* renamed from: a */
    public final Object f398139a = new Object();

    /* renamed from: b */
    public volatile C147516t f398140b;

    /* renamed from: c */
    public final C147493a f398141c;

    /* renamed from: d */
    public final C147527c f398142d;

    /* renamed from: e */
    private C60870cx f398143e = C60866ct.f164955a;

    /* renamed from: f */
    private final C60836bq f398144f;

    public C147517u(C147493a aVar, C147527c cVar, C147490a aVar2) {
        aVar.getClass();
        this.f398141c = aVar;
        this.f398142d = cVar;
        this.f398144f = aVar2.mo43947e() ? new C60836bq() : null;
    }

    /* renamed from: g */
    public static C60870cx m240501g(C60870cx cxVar) {
        C147510n nVar = C147510n.f398133a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(nVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C58833ax mo124266a() {
        return this.f398140b == null ? C58836b.f156633a : C58833ax.m90834k(((C147492a) this.f398140b).f398113a);
    }

    /* renamed from: b */
    public final C60870cx mo124267b() {
        if (!mo124273i()) {
            return C60856cj.m92900i(C55931ae.IN_MEMORY_CACHE);
        }
        synchronized (this.f398139a) {
            if (!mo124273i()) {
                C60870cx i = C60856cj.m92900i(C55931ae.IN_MEMORY_CACHE);
                return i;
            }
            C60870cx e = mo124270e(new C147509m(this));
            return e;
        }
    }

    /* renamed from: c */
    public final C60870cx mo124268c() {
        C60870cx e;
        synchronized (this.f398139a) {
            e = mo124270e(new C147515s(this));
        }
        return e;
    }

    /* renamed from: d */
    public final C60870cx mo124269d() {
        C60870cx b = mo124267b();
        C147508l lVar = new C147508l(this);
        return C60922j.m93044g(b, C47810es.m84963c(lVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo124270e(C60930r rVar) {
        C60836bq bqVar = this.f398144f;
        if (bqVar != null) {
            return bqVar.mo57305b(rVar, C60826bg.f164896a);
        }
        C60870cx b = C47638k.m84751b(this.f398143e).mo51521b(rVar, C60826bg.f164896a);
        this.f398143e = m240501g(b);
        return b;
    }

    /* renamed from: f */
    public final C60870cx mo124271f(C60870cx cxVar) {
        C147506j jVar = new C147506j(this);
        return C60922j.m93044g(cxVar, C47810es.m84963c(jVar), C60826bg.f164896a);
    }

    /* renamed from: h */
    public final C60870cx mo124272h(C147525a aVar) {
        C60870cx cxVar;
        C147527c cVar = this.f398142d;
        C147525a aVar2 = C147525a.FORCED_SYNC;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            cxVar = C147527c.m240532b(cVar.f398180a.mo119716a(cVar.mo124298a()));
        } else if (ordinal == 1) {
            cxVar = C147527c.m240532b(cVar.f398180a.mo119717b(cVar.mo124298a()));
        } else {
            throw new AssertionError(aVar);
        }
        return C47633f.m84733g(cxVar).mo51515h(C147513q.f398136a, C60826bg.f164896a).mo51516i(new C147514r(this), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final boolean mo124273i() {
        return this.f398140b == null;
    }
}
