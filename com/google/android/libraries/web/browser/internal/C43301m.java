package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.p3408h.C43774a;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Consumer;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.browser.internal.m */
/* compiled from: PG */
final class C43301m extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C43257h f113134a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43301m(C43257h hVar) {
        super(1);
        this.f113134a = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C43774a aVar = (C43774a) obj;
        C69664n.m101061g(aVar, "page");
        C58528ij<Consumer> e = this.f113134a.mo46354e();
        C69664n.m101060f(e, "loadUrlParams.navigatedPageConsumers()");
        for (Consumer accept : e) {
            accept.accept(aVar);
        }
        return C69788q.f186170a;
    }
}
