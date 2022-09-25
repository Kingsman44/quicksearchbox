package com.google.android.apps.search.googleapp.search.p10422l.p10423a;

import com.google.android.apps.search.googleapp.search.p10410f.C137436l;
import com.google.android.apps.search.googleapp.search.p10410f.C137440p;
import com.google.android.apps.search.googleapp.search.p10410f.C137441q;
import com.google.android.apps.search.googleapp.search.p10410f.C137444t;
import com.google.android.libraries.silk.p3205a.p3221j.C41724a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4305j.C56714b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4305j.C56716d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.l.a.b */
/* compiled from: PG */
public final class C137550b implements C41724a {

    /* renamed from: a */
    private static final C56848d f374105a;

    /* renamed from: b */
    private final C137440p f374106b;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "invalid_product_specific_data";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        dVar2.f151671a |= 2;
        dVar2.f151673c = "A PSD is missing the key or the value.";
        C62942bv build = cVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…value.\")\n        .build()");
        f374105a = (C56848d) build;
    }

    public C137550b(C137440p pVar) {
        this.f374106b = pVar;
    }

    /* renamed from: a */
    public final C60870cx mo42468a(C56716d dVar) {
        C69664n.m101061g(dVar, "request");
        C137440p pVar = this.f374106b;
        C137436l lVar = C137436l.SILK;
        C69664n.m101061g(dVar, "request");
        String str = dVar.f151384a;
        C69664n.m101060f(str, "request.context");
        List b = C69540x.m100944b(new C137444t("Silk Feedback Context", str, false));
        C62971cq<C56714b> cqVar = dVar.f151385b;
        C69664n.m101060f(cqVar, "request.productSpecificDataList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C56714b bVar : cqVar) {
            int i = bVar.f151378a;
            if ((i & 1) == 0 || (i & 2) == 0) {
                throw new C41742a(f374105a);
            }
            String str2 = bVar.f151379b;
            C69664n.m101060f(str2, "it.key");
            String str3 = bVar.f151380c;
            C69664n.m101060f(str3, "it.value");
            arrayList.add(new C137444t(str2, str3, bVar.f151381d));
        }
        pVar.mo113730c(new C137441q(lVar, C69540x.m100831M(b, arrayList)));
        return C60866ct.f164955a;
    }
}
