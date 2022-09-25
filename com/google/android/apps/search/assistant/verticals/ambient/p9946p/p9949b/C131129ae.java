package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.assistant.p4016z.C53691ap;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53700ay;
import com.google.assistant.p4016z.C53738w;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59127at;
import com.google.common.p4535g.C59133az;
import com.google.common.p4535g.C59136bb;
import com.google.common.p4535g.C59143bi;
import com.google.common.p4535g.C59203do;
import com.google.common.p4535g.C59211e;
import com.google.common.p4535g.C59218l;
import com.google.common.p4535g.C59222p;
import com.google.common.p4543n.p4551g.C59443c;
import com.google.p381aj.p385b.C8262a;
import com.google.p4479cg.C58079k;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.ae */
/* compiled from: PG */
public final class C131129ae {

    /* renamed from: a */
    public static final C59071e f358624a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.p.b.ae");

    /* renamed from: a */
    public static C59136bb m213652a(C53692aq aqVar) {
        C53700ay ayVar = aqVar.f140945g;
        if (ayVar == null) {
            ayVar = C53700ay.f140964d;
        }
        C58079k kVar = ayVar.f140966a;
        if (kVar == null) {
            kVar = C58079k.f155250c;
        }
        double d = kVar.f155252a;
        C53700ay ayVar2 = aqVar.f140945g;
        if (ayVar2 == null) {
            ayVar2 = C53700ay.f140964d;
        }
        C58079k kVar2 = ayVar2.f140966a;
        if (kVar2 == null) {
            kVar2 = C58079k.f155250c;
        }
        return C59127at.m91610b(d, kVar2.f155253b).mo56453d();
    }

    /* renamed from: b */
    public static C59443c m213653b(C53692aq aqVar, C53738w wVar, C130883x xVar) {
        C53692aq aqVar2 = aqVar;
        C53738w wVar2 = wVar;
        C58079k kVar = wVar2.f141082b;
        if (kVar == null) {
            kVar = C58079k.f155250c;
        }
        double d = kVar.f155252a;
        C58079k kVar2 = wVar2.f141082b;
        if (kVar2 == null) {
            kVar2 = C58079k.f155250c;
        }
        C59136bb d2 = C59127at.m91610b(d, kVar2.f155253b).mo56453d();
        C53700ay ayVar = aqVar2.f140945g;
        if (ayVar == null) {
            ayVar = C53700ay.f140964d;
        }
        Stream map = Collection.EL.stream(ayVar.f140967b).map(C131152x.f358664a).filter(C131153y.f358665a).map(C131154z.f358666a);
        C53700ay ayVar2 = aqVar2.f140945g;
        if (ayVar2 == null) {
            ayVar2 = C53700ay.f140964d;
        }
        if (!ayVar2.f140968c) {
            C59136bb a = m213652a(aqVar);
            C59218l lVar = new C59218l(new C59443c(xVar.mo109852h().doubleValue()).mo56958a() / 6371010.0d);
            C59136bb g = C59222p.m91901g(a);
            C59211e b = C59211e.m91844b(C59136bb.m91671n(C59136bb.m91668k(g, a)), g, a);
            ArrayList arrayList = new ArrayList();
            double cos = Math.cos(lVar.f157299c);
            double sin = Math.sin(lVar.f157299c);
            for (int i = 0; i < 50; i++) {
                double d3 = (double) i;
                Double.isNaN(d3);
                double d4 = d3 * 0.12566370614359174d;
                arrayList.add(C59136bb.m91671n(C59222p.m91900f(b, new C59136bb(Math.cos(d4) * sin, sin * Math.sin(d4), cos))));
            }
            map = map.map(new C131125aa(new C59143bi(new C59133az((List) arrayList))));
        }
        Optional min = map.map(new C131126ab(d2)).map(C131127ac.f358622a).min(C131128ad.f358623a);
        C59443c a2 = C8262a.m22968a(new C59218l(d2.mo56496a(m213652a(aqVar))));
        C53691ap apVar = C53691ap.UNSPECIFIED;
        C53691ap a3 = C53691ap.m86884a(aqVar2.f140943e);
        if (a3 == null) {
            a3 = C53691ap.UNSPECIFIED;
        }
        int ordinal = a3.ordinal();
        return (C59443c) min.orElse(ordinal != 4 ? ordinal != 5 ? new C59443c(Math.max(C59203do.f157270a, a2.mo56958a() - xVar.mo109851g().doubleValue())) : new C59443c(Math.max(C59203do.f157270a, a2.mo56958a() - xVar.mo109854i().doubleValue())) : new C59443c(Math.max(C59203do.f157270a, a2.mo56958a() - xVar.mo109847d().doubleValue())));
    }
}
