package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.android.libraries.geller.p1817e.C21778c;
import com.google.android.libraries.geller.p1817e.C21779d;
import com.google.android.libraries.geller.p1817e.C21780e;
import com.google.android.libraries.geller.p1817e.C21782g;
import com.google.android.libraries.geller.p1818f.p1819a.C21789d;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63070h;
import com.google.protos.p5129p.p5131b.C65743aa;
import com.google.protos.p5129p.p5131b.C65744ab;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65775bf;
import com.google.protos.p5129p.p5131b.C65819cw;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.libraries.geller.f.am */
/* compiled from: PG */
public final /* synthetic */ class C21803am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60142a;

    /* renamed from: b */
    public final /* synthetic */ Map f60143b;

    /* renamed from: c */
    public final /* synthetic */ C65855x f60144c;

    /* renamed from: d */
    public final /* synthetic */ C21876z f60145d;

    /* renamed from: e */
    public final /* synthetic */ C21758b f60146e;

    /* renamed from: f */
    public final /* synthetic */ Map f60147f;

    /* renamed from: g */
    public final /* synthetic */ Map f60148g;

    /* renamed from: h */
    public final /* synthetic */ int f60149h;

    public /* synthetic */ C21803am(C21826bi biVar, Map map, C65855x xVar, C21876z zVar, C21758b bVar, int i, Map map2, Map map3) {
        this.f60142a = biVar;
        this.f60143b = map;
        this.f60144c = xVar;
        this.f60145d = zVar;
        this.f60146e = bVar;
        this.f60149h = i;
        this.f60147f = map2;
        this.f60148g = map3;
    }

    public final C60870cx apply(Object obj) {
        int i;
        C65819cw cwVar;
        Map map;
        C21826bi biVar = this.f60142a;
        Map map2 = this.f60143b;
        C65855x xVar = this.f60144c;
        C21876z zVar = this.f60145d;
        C21758b bVar = this.f60146e;
        int i2 = this.f60149h;
        Map map3 = this.f60147f;
        Map map4 = this.f60148g;
        C65744ab abVar = (C65744ab) obj;
        Iterator it = abVar.f178607a.iterator();
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            C65743aa aaVar = (C65743aa) it.next();
            C65753ak b = C65753ak.m96797b(aaVar.f178601c);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            if (GellerDatabase.f60556c.contains(b.name()) && aaVar.f178599a == 2) {
                map2.put(b, (C65819cw) aaVar.f178600b);
            }
        }
        ArrayList arrayList = new ArrayList(abVar.f178607a.size());
        Iterator it2 = abVar.f178607a.iterator();
        while (it2.hasNext()) {
            C65743aa aaVar2 = (C65743aa) it2.next();
            C65753ak b2 = C65753ak.m96797b(aaVar2.f178601c);
            if (b2 == null) {
                b2 = C65753ak.UNKNOWN;
            }
            if (!b2.name().startsWith("ENCRYPTED_")) {
                arrayList.add(C60856cj.m92900i(aaVar2));
            } else {
                int i3 = aaVar2.f178599a;
                if (i3 == 1) {
                    arrayList.add(C60856cj.m92900i(aaVar2));
                } else {
                    if (i3 == i) {
                        cwVar = (C65819cw) aaVar2.f178600b;
                    } else {
                        cwVar = C65819cw.f178926i;
                    }
                    C65819cw cwVar2 = cwVar;
                    C21782g gVar = (C21782g) ((C58847bk) biVar.f60232p).f156646a;
                    C62971cq cqVar = cwVar2.f178932e;
                    C21789d.m40905b(biVar.f60218b);
                    Iterator it3 = it2;
                    ArrayList arrayList2 = new ArrayList(cqVar.size());
                    Iterator it4 = cqVar.iterator();
                    while (it4.hasNext()) {
                        C65768az azVar = (C65768az) it4.next();
                        Iterator it5 = it4;
                        C63070h hVar = azVar.f178799e;
                        if (hVar == null) {
                            hVar = C63070h.f170215c;
                        }
                        Map map5 = map2;
                        if (!hVar.f170217a.equals("type.googleapis.com/geller.oneplatform.GellerE2eeElement")) {
                            ((C59052c) ((C59052c) C21782g.f60090a.mo56225c()).mo56372aa(47972)).mo56386p("Trying to decrypt Element with unexpected data type url, skipping element.");
                            it4 = it5;
                            map2 = map5;
                        } else {
                            try {
                                C63070h hVar2 = azVar.f178799e;
                                if (hVar2 == null) {
                                    hVar2 = C63070h.f170215c;
                                }
                                map = map4;
                                try {
                                    C65775bf bfVar = (C65775bf) C62942bv.parseFrom((C62942bv) C65775bf.f178813d, hVar2.f170218b, C62921ba.m95368a());
                                    C21778c cVar = gVar.f60092c;
                                    int i4 = bfVar.f178817c;
                                    arrayList2.add(C60922j.m93044g(cVar.mo27114b(), C47810es.m84963c(new C21779d(bfVar, azVar)), gVar.f60093d));
                                } catch (Exception e) {
                                    e = e;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                map = map4;
                                ((C59052c) ((C59052c) ((C59052c) C21782g.f60090a.mo56225c()).mo56382g(e)).mo56372aa(47971)).mo56386p("Unexpected error when trying to parse encrypted element, skipping element.");
                                it4 = it5;
                                map2 = map5;
                                map4 = map;
                            }
                            it4 = it5;
                            map2 = map5;
                            map4 = map;
                        }
                    }
                    Map map6 = map4;
                    Map map7 = map2;
                    arrayList.add(C60922j.m93044g(C60922j.m93044g(C60856cj.m92896e(arrayList2), C47810es.m84963c(C21780e.f60088a), gVar.f60093d), C47810es.m84963c(new C21825bh(aaVar2, cwVar2)), biVar.f60223g));
                    it2 = it3;
                    i = 2;
                }
            }
        }
        Map map8 = map4;
        Map map9 = map2;
        return C60922j.m93045h(C60838bs.m92859i(C60922j.m93045h(C60922j.m93044g(C60856cj.m92896e(arrayList), C47810es.m84963c(C21798ah.f60129a), biVar.f60223g), C47810es.m84966f(new C21797ag(biVar, xVar)), biVar.f60223g)), C47810es.m84966f(new C21804an(biVar, zVar, bVar, i2, xVar, abVar, map3, map4, map2)), biVar.f60224h);
    }
}
