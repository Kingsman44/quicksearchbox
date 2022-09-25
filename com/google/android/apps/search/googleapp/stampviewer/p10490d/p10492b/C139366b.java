package com.google.android.apps.search.googleapp.stampviewer.p10490d.p10492b;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53894f;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53895g;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53898j;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53899k;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53901m;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.d.b.b */
/* compiled from: PG */
public final /* synthetic */ class C139366b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C139376l f378981a;

    /* renamed from: b */
    public final /* synthetic */ String f378982b;

    public /* synthetic */ C139366b(C139376l lVar, String str) {
        this.f378981a = lVar;
        this.f378982b = str;
    }

    public final C60870cx apply(Object obj) {
        C139376l lVar = this.f378981a;
        String str = this.f378982b;
        C57340w wVar = (C57340w) obj;
        C53894f fVar = lVar.f378998c;
        C53898j jVar = (C53898j) C53899k.f141430c.createBuilder();
        jVar.copyOnWrite();
        wVar.getClass();
        ((C53899k) jVar.instance).f141432a = wVar;
        jVar.mo54044a(str);
        C53899k kVar = (C53899k) jVar.build();
        C70888j jVar2 = fVar.f189039a;
        C70338di diVar = C53895g.f141426b;
        if (diVar == null) {
            synchronized (C53895g.class) {
                diVar = C53895g.f141426b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.discover.discofeed.reactions.v1.DiscoverReactions", "ListReactions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53899k.f141430c);
                    d.f187486b = C70850d.m103697c(C53901m.f141434b);
                    diVar = d.mo62040a();
                    C53895g.f141426b = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar2.mo39510a(diVar, fVar.f189040b), kVar);
    }
}
