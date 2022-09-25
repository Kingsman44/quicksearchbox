package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.common.text.C24129e;
import com.google.android.libraries.lens.ondevice.p2037n.C24788au;
import com.google.android.libraries.lens.ondevice.p2037n.C24790aw;
import com.google.android.libraries.lens.ondevice.p2037n.C24794e;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24813x;
import com.google.android.libraries.lens.ondevice.p2037n.C24814y;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2069am.C25346v;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19653a;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19654b;
import com.google.common.base.C58833ax;
import com.google.lens.p4701g.C62348k;
import com.google.lens.p4701g.C62349l;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protos.p4752a.C63089a;
import com.google.protos.p4752a.C63090b;
import com.google.protos.p4752a.C63092d;
import com.google.protos.p4752a.C63093e;
import com.google.protos.p4752a.C63094f;
import com.google.protos.p4752a.C63095g;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.o */
/* compiled from: PG */
public final class C27898o {
    /* renamed from: a */
    public static C24795f m51954a(C26244b bVar) {
        C62349l lVar;
        boolean g = bVar.mo31462g(C26239a.ENABLE_ACCELERATED_EMBEDDING_INFERENCE);
        boolean g2 = bVar.mo31462g(C26239a.ENABLE_ACCELERATED_EMBEDDING_FP16_PRECISION);
        if (g) {
            C62348k kVar = (C62348k) C62349l.f168317c.createBuilder();
            C19653a aVar = (C19653a) C19654b.f54669d.createBuilder();
            C63092d dVar = (C63092d) C63093e.f170253c.createBuilder();
            dVar.copyOnWrite();
            C63093e eVar = (C63093e) dVar.instance;
            eVar.f170255a |= 512;
            eVar.f170256b = g2;
            C63093e eVar2 = (C63093e) dVar.build();
            C63089a aVar2 = (C63089a) C63090b.f170248c.createBuilder();
            C63094f fVar = (C63094f) C63095g.f170257d.createBuilder();
            fVar.copyOnWrite();
            C63095g gVar = (C63095g) fVar.instance;
            gVar.f170260b = 1;
            gVar.f170259a |= 1;
            fVar.copyOnWrite();
            C63095g gVar2 = (C63095g) fVar.instance;
            eVar2.getClass();
            gVar2.f170261c = eVar2;
            gVar2.f170259a |= 2;
            C63095g gVar3 = (C63095g) fVar.build();
            aVar2.copyOnWrite();
            C63090b bVar2 = (C63090b) aVar2.instance;
            gVar3.getClass();
            bVar2.f170251b = gVar3;
            bVar2.f170250a |= 2;
            C63090b bVar3 = (C63090b) aVar2.build();
            aVar.copyOnWrite();
            C19654b bVar4 = (C19654b) aVar.instance;
            bVar3.getClass();
            bVar4.f54673c = bVar3;
            bVar4.f54671a |= 256;
            kVar.copyOnWrite();
            C62349l lVar2 = (C62349l) kVar.instance;
            C19654b bVar5 = (C19654b) aVar.build();
            bVar5.getClass();
            lVar2.f168320b = bVar5;
            lVar2.f168319a |= 1;
            lVar = (C62349l) kVar.build();
        } else {
            lVar = C62349l.f168317c;
        }
        C24794e eVar3 = (C24794e) C24795f.f67747l.createBuilder();
        eVar3.copyOnWrite();
        C24795f fVar2 = (C24795f) eVar3.instance;
        lVar.getClass();
        fVar2.f67756h = lVar;
        fVar2.f67749a |= 64;
        return (C24795f) eVar3.build();
    }

    /* renamed from: b */
    public static C24813x m51955b(C58833ax axVar, C25346v vVar) {
        C24813x xVar = (C24813x) C24814y.f67826d.createBuilder();
        String str = (String) axVar.mo56109e("en");
        xVar.copyOnWrite();
        C24814y yVar = (C24814y) xVar.instance;
        str.getClass();
        yVar.f67828a |= 1;
        yVar.f67829b = str;
        C62971cq cqVar = vVar.f68996a;
        xVar.copyOnWrite();
        C24814y yVar2 = (C24814y) xVar.instance;
        C62971cq cqVar2 = yVar2.f67830c;
        if (!cqVar2.mo58948c()) {
            yVar2.f67830c = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) yVar2.f67830c);
        return xVar;
    }

    /* renamed from: c */
    public static C24788au m51956c(String str, String str2) {
        C24788au auVar = (C24788au) C24790aw.f67732g.createBuilder();
        String d = C24129e.m44830d(str);
        auVar.copyOnWrite();
        C24790aw awVar = (C24790aw) auVar.instance;
        d.getClass();
        awVar.f67734a |= 1;
        awVar.f67735b = d;
        if (!str2.equals("zh-TW")) {
            str2 = C24129e.m44830d(str2);
        }
        auVar.copyOnWrite();
        C24790aw awVar2 = (C24790aw) auVar.instance;
        str2.getClass();
        awVar2.f67734a |= 2;
        awVar2.f67736c = str2;
        return auVar;
    }

    /* renamed from: d */
    public static C24788au m51957d(String str, String str2, Map map, boolean z) {
        C24788au c = m51956c(str, str2);
        c.copyOnWrite();
        C24790aw awVar = (C24790aw) c.instance;
        C24790aw awVar2 = C24790aw.f67732g;
        C62995dn dnVar = awVar.f67737d;
        if (!dnVar.f170058b) {
            awVar.f67737d = dnVar.mo58980a();
        }
        awVar.f67737d.putAll(map);
        boolean equals = "auto".equals(str);
        c.copyOnWrite();
        C24790aw awVar3 = (C24790aw) c.instance;
        awVar3.f67734a |= 4;
        awVar3.f67738e = equals;
        c.copyOnWrite();
        C24790aw awVar4 = (C24790aw) c.instance;
        awVar4.f67734a |= 8;
        awVar4.f67739f = z;
        return c;
    }
}
