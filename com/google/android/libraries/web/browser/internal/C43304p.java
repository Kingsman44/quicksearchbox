package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43375t;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3408h.p3414b.C43798l;
import com.google.android.libraries.web.p3408h.p3414b.C43803q;
import com.google.android.libraries.web.p3408h.p3414b.C43804r;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.browser.internal.p */
/* compiled from: PG */
public final class C43304p extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C43323b f113144a;

    /* renamed from: b */
    final /* synthetic */ C43308t f113145b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f113146c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43304p(C43323b bVar, C43308t tVar, C60870cx cxVar) {
        super(1);
        this.f113144a = bVar;
        this.f113145b = tVar;
        this.f113146c = cxVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C43904a aVar = (C43904a) obj;
        C69664n.m101061g(aVar, "window");
        C43891f d = aVar.mo46411d(C43331ag.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        C43331ag agVar = (C43331ag) ((C43945v) d);
        C43323b bVar = this.f113144a;
        agVar.f113187c.f113196a = true;
        C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
        C43366k kVar = C43366k.BROWSER_INITIATED_NEW_PAGE;
        iVar.copyOnWrite();
        C43367l lVar = (C43367l) iVar.instance;
        lVar.f113299e = kVar.f113292i;
        lVar.f113295a |= 8;
        iVar.copyOnWrite();
        C43367l lVar2 = (C43367l) iVar.instance;
        lVar2.f113295a |= 32;
        lVar2.f113301g = true;
        iVar.copyOnWrite();
        C43367l lVar3 = (C43367l) iVar.instance;
        bVar.getClass();
        lVar3.f113300f = bVar;
        lVar3.f113295a |= 16;
        C43367l lVar4 = (C43367l) iVar.build();
        C43375t tVar = (C43375t) agVar.mo46439a().toBuilder();
        tVar.copyOnWrite();
        C43376u uVar = (C43376u) tVar.instance;
        lVar4.getClass();
        uVar.f113335h = lVar4;
        uVar.f113328a |= 64;
        agVar.mo46452n((C43376u) tVar.build());
        agVar.mo46455q(lVar4);
        if (this.f113145b.f113157g) {
            C43891f d2 = aVar.mo46411d(C43804r.class);
            C69664n.m101060f(d2, "getPlugin(T::class.java)");
            C60870cx cxVar = this.f113146c;
            C43366k kVar2 = C43366k.BROWSER_INITIATED_NEW_PAGE;
            C69664n.m101061g(kVar2, "triggerType");
            ((C43804r) ((C43945v) d2)).mo46827k(cxVar, C43798l.f114202a, new C43803q(kVar2));
        }
        return C69788q.f186170a;
    }
}
