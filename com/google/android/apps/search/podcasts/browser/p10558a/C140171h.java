package com.google.android.apps.search.podcasts.browser.p10558a;

import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.h */
/* compiled from: PG */
final class C140171h extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140175l f380842a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140171h(C140175l lVar) {
        super(1);
        this.f380842a = lVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C69664n.m101061g(axVar, "it");
        C140175l lVar = this.f380842a;
        Duration ofHours = Duration.ofHours(1);
        C69664n.m101060f(ofHours, "ofHours(1L)");
        if (!lVar.mo115486d(axVar, ofHours)) {
            return C60856cj.m92900i(new Object());
        }
        C60870cx c = this.f380842a.f380846b.mo115830c();
        C69664n.m101059e(c, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<kotlin.Any>");
        return c;
    }
}
