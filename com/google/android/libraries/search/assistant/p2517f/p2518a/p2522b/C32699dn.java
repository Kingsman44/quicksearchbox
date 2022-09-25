package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.apps.gsa.binaries.satin.app.amu;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32845cm;
import com.google.common.p4522b.C58479go;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;
import p5462h.p5463a.C69514bd;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.dn */
/* compiled from: PG */
public final class C32699dn extends C32845cm {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f87637a = C59071e.m91331h();

    /* renamed from: b */
    private final C32716ed f87638b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32699dn(Set set, Set set2, amu amu, C69585o oVar) {
        super(oVar);
        C69664n.m101061g(set, "deviceContextProviders");
        C69664n.m101061g(set2, "userContextProviders");
        C69664n.m101061g(amu, "sessionImplFactory");
        C69664n.m101061g(oVar, "lightweightContext");
        Set e = C69514bd.m100891e(set, set2);
        C32716ed a = amu.a(C32717ee.m60644a("RootParent"), new C32698dm((C69577g) null), C58479go.m89814f(e), 200000);
        C59052c cVar = (C59052c) f87637a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Context.Source");
        C69664n.m101060f(cVar, "logger\n      .atInfo()");
        C59052c a2 = C32692dg.m60595a(cVar, a.f87687d);
        int size = e.size();
        a2.mo56379ah(new C59094n(50593));
        a2.mo56387q("Created Root Parent Session with %s deviceProviders", size);
        this.f87638b = a;
    }

    /* renamed from: b */
    public final Object mo38260b() {
        return this.f87638b.mo38265b();
    }
}
