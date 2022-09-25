package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.browser.internal.g */
/* compiled from: PG */
public final class C43295g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60845bz f113110a;

    /* renamed from: b */
    final /* synthetic */ C43308t f113111b;

    public C43295g(C60845bz bzVar, C43308t tVar) {
        this.f113110a = bzVar;
        this.f113111b = tVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        if (C19559g.m37305d(Thread.currentThread())) {
            this.f113110a.mo17910gl(th);
            return;
        }
        C43293e eVar = new C43293e(this.f113110a, th);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(eVar), this.f113111b.f113153c), "Failed to deliver failure", new Object[0]);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        if (C19559g.m37305d(Thread.currentThread())) {
            this.f113110a.mo17911gm(obj);
            return;
        }
        C43294f fVar = new C43294f(this.f113110a, obj);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(fVar), this.f113111b.f113153c), "Failed to deliver success", new Object[0]);
    }
}
