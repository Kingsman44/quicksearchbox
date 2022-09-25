package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.browser.internal.q */
/* compiled from: PG */
public final class C43305q extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C43308t f113147a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f113148b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43305q(C43308t tVar, C60870cx cxVar) {
        super(1);
        this.f113147a = tVar;
        this.f113148b = cxVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C43257h hVar = (C43257h) obj;
        C69664n.m101061g(hVar, "loadUrlParams");
        this.f113147a.mo46406e(hVar, C43366k.BROWSER_INITIATED_NEW_PAGE, this.f113148b);
        return C69788q.f186170a;
    }
}
