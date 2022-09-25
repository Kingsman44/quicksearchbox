package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.account.data.r */
/* compiled from: PG */
public final class C46323r implements C46689ag {

    /* renamed from: a */
    public final C46155ag f121316a;

    /* renamed from: b */
    private final C46325t f121317b;

    public C46323r(C46325t tVar, C46155ag agVar) {
        this.f121317b = tVar;
        this.f121316a = agVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C60870cx d = this.f121316a.f121069c.mo46042d();
        C60870cx f = this.f121317b.mo50286f();
        return new C46463o(new C60817ay(C60856cj.m92895d(d, f).mo57334a(C47810es.m84978r(new C46322q(d, f)), C60826bg.f164896a)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return this.f121316a.mo50224a();
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
