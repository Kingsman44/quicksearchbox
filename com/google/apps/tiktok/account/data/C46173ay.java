package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.account.data.ay */
/* compiled from: PG */
final class C46173ay implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C46689ag f121099a;

    /* renamed from: b */
    final /* synthetic */ C46174az f121100b;

    public C46173ay(C46174az azVar, C46689ag agVar) {
        this.f121100b = azVar;
        this.f121099a = agVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return this.f121099a.mo18086a();
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C60870cx a = ((C46323r) this.f121099a).f121316a.mo50224a();
        C46172ax axVar = new C46172ax(this);
        C60856cj.m92911t(a, C47810es.m84974n(axVar), this.f121100b.f121102b);
        return a;
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
