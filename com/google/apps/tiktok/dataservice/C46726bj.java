package com.google.apps.tiktok.dataservice;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.dataservice.bj */
/* compiled from: PG */
public final class C46726bj implements C46689ag {

    /* renamed from: a */
    public final Object f122046a;

    /* renamed from: b */
    final /* synthetic */ C46728bl f122047b;

    /* renamed from: c */
    private final C46689ag f122048c;

    /* renamed from: d */
    private final Object f122049d;

    public C46726bj(C46728bl blVar, Object obj, C46689ag agVar) {
        this.f122047b = blVar;
        this.f122046a = obj;
        this.f122048c = agVar;
        this.f122049d = agVar.mo18088c();
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return this.f122048c.mo18086a();
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        SettableFuture settableFuture;
        C60870cx cxVar;
        synchronized (this.f122047b.f122052a) {
            C46727bk bkVar = (C46727bk) this.f122047b.f122053b.get(this.f122046a);
            if (bkVar == null) {
                SettableFuture settableFuture2 = new SettableFuture();
                C46727bk bkVar2 = new C46727bk(settableFuture2);
                bkVar2.f122051b = 1;
                this.f122047b.f122053b.put(this.f122046a, bkVar2);
                settableFuture = settableFuture2;
                bkVar = bkVar2;
            } else {
                bkVar.f122051b++;
                settableFuture = null;
            }
            cxVar = bkVar.f122050a;
        }
        if (settableFuture != null) {
            C46689ag agVar = this.f122048c;
            Objects.requireNonNull(agVar);
            settableFuture.mo57358p(C60856cj.m92905n(C47810es.m84965e(new C46724bh(agVar)), C60826bg.f164896a));
        }
        C60826bg bgVar = C60826bg.f164896a;
        C60870cx j = C60856cj.m92901j(cxVar);
        j.mo4106b(C47810es.m84977q(new C46725bi(this)), bgVar);
        return j;
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return this.f122049d;
    }
}
