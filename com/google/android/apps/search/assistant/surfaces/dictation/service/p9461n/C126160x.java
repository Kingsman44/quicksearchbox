package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126320ba;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.x */
/* compiled from: PG */
public final class C126160x {

    /* renamed from: a */
    public final C63124b f347630a;

    /* renamed from: b */
    public final long f347631b;

    /* renamed from: c */
    public final long f347632c;

    /* renamed from: d */
    private final boolean f347633d;

    /* renamed from: e */
    private final C42876ab f347634e;

    /* renamed from: f */
    private final AtomicBoolean f347635f = new AtomicBoolean(false);

    /* renamed from: g */
    private final AtomicBoolean f347636g = new AtomicBoolean(false);

    /* renamed from: h */
    private final C126320ba f347637h;

    public C126160x(C63124b bVar, long j, long j2, boolean z, C42876ab abVar, C126320ba baVar) {
        this.f347630a = bVar;
        this.f347631b = j;
        this.f347632c = j2;
        this.f347633d = z;
        this.f347634e = abVar;
        this.f347637h = baVar;
    }

    /* renamed from: a */
    public final C60870cx mo107383a() {
        if (this.f347635f.getAndSet(false)) {
            return mo107388f(C126159w.f347629a);
        }
        return C60866ct.f164955a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo107384b() {
        if (this.f347636g.getAndSet(true)) {
            return C60866ct.f164955a;
        }
        return mo107388f(C126156t.f347626a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C60870cx mo107385c() {
        this.f347635f.set(false);
        return mo107388f(C126158v.f347628a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C60870cx mo107386d() {
        this.f347636g.set(false);
        return mo107383a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C60870cx mo107387e() {
        if (!this.f347637h.mo107530a()) {
            return C60856cj.m92900i(false);
        }
        if (this.f347633d && this.f347636g.get()) {
            return C60856cj.m92900i(false);
        }
        mo107389g();
        C63124b bVar = this.f347630a;
        C60870cx d = this.f347634e.mo46042d();
        C126155s sVar = new C126155s(bVar);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(sVar), C60826bg.f164896a);
        C126157u uVar = new C126157u(this);
        return C60922j.m93044g(g, C47810es.m84963c(uVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo107388f(C58817ah ahVar) {
        return this.f347634e.mo46039a(new C126154r(this, ahVar), C60826bg.f164896a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo107389g() {
        this.f347635f.set(true);
    }
}
