package com.google.android.apps.search.googleapp.discover.p10195j;

import com.facebook.litho.C6411u;
import com.google.android.apps.search.googleapp.discover.p10166a.p10171c.C133987j;
import com.google.android.apps.search.googleapp.discover.p10175ab.p10176a.C134085c;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57167x;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57299d;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.s */
/* compiled from: PG */
public final class C134447s implements C21270bm {

    /* renamed from: a */
    public static final C59071e f366171a = C59071e.m91331h();

    /* renamed from: b */
    public final C134085c f366172b;

    /* renamed from: c */
    public final C21232ab f366173c;

    /* renamed from: d */
    private final C133987j f366174d;

    public C134447s(C133987j jVar, C134085c cVar, C21232ab abVar) {
        this.f366174d = jVar;
        this.f366172b = cVar;
        this.f366173c = abVar;
    }

    /* renamed from: a */
    public final C62917ay mo25837a() {
        C62940bt btVar = C57167x.f152616f;
        C69664n.m101060f(btVar, "discoverViewActionProperties");
        return btVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        C57167x xVar = (C57167x) obj;
        C69664n.m101061g(uVar, "context");
        C69664n.m101061g(zVar, "conversionContext");
        C69664n.m101061g(xVar, "loggingProperties");
        C69664n.m101061g(arVar, "elementBuilder");
        if (arVar instanceof C40081u) {
            if (xVar.f152619b) {
                C133987j jVar = this.f366174d;
                C57299d dVar = xVar.f152620c;
                if (dVar == null) {
                    dVar = C57299d.f152949a;
                }
                C69664n.m101060f(dVar, "loggingProperties.viewActionPayload");
                C134441m mVar = new C134441m(jVar, dVar);
                C40081u uVar2 = (C40081u) arVar;
                uVar2.mo25948v(mVar);
                uVar2.mo25940n(mVar);
            }
            if ((xVar.f152618a & 4) != 0) {
                ((C40081u) arVar).mo25940n(new C134442n(this, xVar));
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
        throw null;
    }
}
