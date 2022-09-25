package com.google.android.libraries.web.contrib.errorpage;

import com.google.android.libraries.web.contrib.errorpage.C43531s;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.common.base.C58838bb;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.n */
/* compiled from: PG */
public final /* synthetic */ class C43526n implements C69626l {

    /* renamed from: a */
    public final /* synthetic */ C43529q f113652a;

    /* renamed from: b */
    public final /* synthetic */ C43507a f113653b;

    public /* synthetic */ C43526n(C43529q qVar, C43507a aVar) {
        this.f113652a = qVar;
        this.f113653b = aVar;
    }

    /* renamed from: a */
    public final Object mo5761a(Object obj) {
        C43529q qVar = this.f113652a;
        C43512b a = this.f113653b.mo46576a((Throwable) obj);
        C43531s.C43532a aVar = qVar.f113659d.f113667g;
        C58838bb.m90866a(aVar, "ErrorPageMixin#register was not called.");
        aVar.mo46593d(a);
        return C69788q.f186170a;
    }
}
