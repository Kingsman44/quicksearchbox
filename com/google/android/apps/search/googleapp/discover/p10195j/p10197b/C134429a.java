package com.google.android.apps.search.googleapp.discover.p10195j.p10197b;

import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40018c;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40084x;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40085y;
import com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag;
import com.google.android.libraries.search.rendering.xuikit.p3130c.C40269ai;
import com.google.android.libraries.search.rendering.xuikit.p3130c.C40270aj;
import com.google.android.libraries.search.rendering.xuikit.p3130c.C40271ak;
import com.google.android.libraries.search.rendering.xuikit.p3130c.C40272al;
import com.google.android.libraries.search.rendering.xuikit.p3130c.C40274an;
import com.google.android.libraries.search.rendering.xuikit.p3130c.C40275ao;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57711j;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57716o;
import java.util.Iterator;
import java.util.Map;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.b.a */
/* compiled from: PG */
public final class C134429a {

    /* renamed from: a */
    private final C40272al f366143a;

    public C134429a(C40272al alVar) {
        this.f366143a = alVar;
    }

    /* renamed from: a */
    public final void mo111779a(Iterable iterable) {
        C60870cx cxVar;
        C69664n.m101061g(iterable, "resources");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C57711j jVar = (C57711j) it.next();
            C40272al alVar = this.f366143a;
            C69664n.m101061g(jVar, "resource");
            C57716o a = C57716o.m88524a(jVar.f154182a);
            if (a == null) {
                a = C57716o.RESOURCE_TYPE_UNSPECIFIED;
            }
            int ordinal = a.ordinal();
            boolean z = true;
            if (ordinal == 1) {
                C40085y yVar = alVar.f105785b;
                C40274an anVar = new C40274an(alVar.f105787d, new C40270aj(alVar, jVar, (C69577g) null));
                C60826bg bgVar = C60826bg.f164896a;
                C57716o a2 = C57716o.m88524a(jVar.f154182a);
                if (a2 == null) {
                    a2 = C57716o.RESOURCE_TYPE_UNSPECIFIED;
                }
                C58838bb.m90869d(a2 == C57716o.FONT, "Resource provided not of type FONT");
                synchronized (yVar.f105305c) {
                    C40084x xVar = (C40084x) yVar.f105305c.get(jVar);
                    if (xVar != null) {
                        if (C40085y.m69608a(jVar, xVar.mo42118a()) != 5) {
                            cxVar = xVar.mo42118a();
                            z = false;
                        }
                    }
                    C60870cx n = C60856cj.m92905n(anVar, bgVar);
                    Map map = yVar.f105305c;
                    int andIncrement = C40085y.f105303a.getAndIncrement();
                    map.put(jVar, new C40018c(n, "xuikit-dynamic-font-" + andIncrement));
                    cxVar = n;
                }
                if (!z) {
                    C69664n.m101060f(cxVar, "putResult.future");
                    Instant a3 = alVar.f105788e.mo57444a();
                    C69664n.m101060f(a3, "timeSource.now()");
                    if (cxVar.isDone()) {
                        alVar.mo42370c(C40267ag.MEMORY);
                    } else {
                        alVar.mo42370c(C40267ag.REUSED);
                        C40275ao.m69902a(cxVar, alVar.f105786c, new C40269ai(alVar, a3));
                    }
                }
            } else if (ordinal != 2) {
                C59052c cVar = (C59052c) C40272al.f105784a.mo56225c();
                C57716o a4 = C57716o.m88524a(jVar.f154182a);
                if (a4 == null) {
                    a4 = C57716o.RESOURCE_TYPE_UNSPECIFIED;
                }
                cVar.mo56379ah(new C59094n(53325));
                cVar.mo56389s("Unsupported resource type %s", a4);
            } else {
                Instant a5 = alVar.f105788e.mo57444a();
                C69664n.m101060f(a5, "timeSource.now()");
                alVar.mo42370c(C40267ag.IMAGE_LIBRARY);
                C40275ao.m69902a(C5528f.m14300b(C5528f.m14299a(alVar.f105789f.mo51286a().mo11867e().mo12448j(jVar.f154183b))), alVar.f105786c, new C40271ak(alVar, a5));
            }
        }
    }
}
