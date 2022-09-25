package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protos.p5129p.p5131b.C65743aa;
import com.google.protos.p5129p.p5131b.C65744ab;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65807ck;
import com.google.protos.p5129p.p5131b.C65808cl;
import com.google.protos.p5129p.p5131b.C65819cw;
import com.google.protos.p5129p.p5131b.C65829df;
import com.google.protos.p5129p.p5131b.C65830dg;
import com.google.protos.p5129p.p5131b.C65853v;
import com.google.protos.p5129p.p5131b.C65854w;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.geller.f.an */
/* compiled from: PG */
public final /* synthetic */ class C21804an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60150a;

    /* renamed from: b */
    public final /* synthetic */ C21876z f60151b;

    /* renamed from: c */
    public final /* synthetic */ C21758b f60152c;

    /* renamed from: d */
    public final /* synthetic */ C65855x f60153d;

    /* renamed from: e */
    public final /* synthetic */ C65744ab f60154e;

    /* renamed from: f */
    public final /* synthetic */ Map f60155f;

    /* renamed from: g */
    public final /* synthetic */ Map f60156g;

    /* renamed from: h */
    public final /* synthetic */ Map f60157h;

    /* renamed from: i */
    public final /* synthetic */ int f60158i;

    public /* synthetic */ C21804an(C21826bi biVar, C21876z zVar, C21758b bVar, int i, C65855x xVar, C65744ab abVar, Map map, Map map2, Map map3) {
        this.f60150a = biVar;
        this.f60151b = zVar;
        this.f60152c = bVar;
        this.f60158i = i;
        this.f60153d = xVar;
        this.f60154e = abVar;
        this.f60155f = map;
        this.f60156g = map2;
        this.f60157h = map3;
    }

    public final C60870cx apply(Object obj) {
        C65819cw cwVar;
        C65819cw cwVar2;
        C65819cw cwVar3;
        C65819cw cwVar4;
        C21826bi biVar = this.f60150a;
        C21876z zVar = this.f60151b;
        C21758b bVar = this.f60152c;
        int i = this.f60158i;
        C65855x xVar = this.f60153d;
        C65744ab abVar = this.f60154e;
        Map map = this.f60155f;
        Map map2 = this.f60156g;
        Map map3 = this.f60157h;
        Map map4 = (Map) obj;
        biVar.f60220d.mo27219c(map4, biVar.f60233q, biVar.f60229m.mo56158a(TimeUnit.MILLISECONDS));
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = abVar.f178607a.iterator();
        while (it.hasNext()) {
            C65743aa aaVar = (C65743aa) it.next();
            C65753ak b = C65753ak.m96797b(aaVar.f178601c);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            if (map4.containsKey(b) && ((C21850cf) map4.get(b)).mo27152b().isEmpty()) {
                treeSet.add(b);
                Iterator it2 = it;
                Map map5 = map4;
                if (aaVar.f178599a == 2) {
                    cwVar = (C65819cw) aaVar.f178600b;
                } else {
                    cwVar = C65819cw.f178926i;
                }
                if ((cwVar.f178928a & 16) != 0) {
                    if (aaVar.f178599a == 2) {
                        cwVar4 = (C65819cw) aaVar.f178600b;
                    } else {
                        cwVar4 = C65819cw.f178926i;
                    }
                    arrayList.add(cwVar4.f178935h);
                }
                if (aaVar.f178599a == 2) {
                    cwVar2 = (C65819cw) aaVar.f178600b;
                } else {
                    cwVar2 = C65819cw.f178926i;
                }
                if (cwVar2.f178931d.isEmpty() || i == 3) {
                    it = it2;
                    map4 = map5;
                } else {
                    C65853v vVar = (C65853v) C65854w.f179011g.createBuilder();
                    vVar.copyOnWrite();
                    C65854w wVar = (C65854w) vVar.instance;
                    Map map6 = map3;
                    wVar.f179014b = b.f178757bE;
                    wVar.f179013a |= 1;
                    if (aaVar.f178599a == 2) {
                        cwVar3 = (C65819cw) aaVar.f178600b;
                    } else {
                        cwVar3 = C65819cw.f178926i;
                    }
                    String str = cwVar3.f178931d;
                    vVar.copyOnWrite();
                    C65854w wVar2 = (C65854w) vVar.instance;
                    str.getClass();
                    wVar2.f179013a |= 4;
                    wVar2.f179016d = str;
                    hashMap.put(b, (C65854w) vVar.build());
                    it = it2;
                    map4 = map5;
                    map3 = map6;
                }
            }
        }
        Map map7 = map4;
        Map map8 = map3;
        C65808cl clVar = xVar.f179025d;
        if (clVar == null) {
            clVar = C65808cl.f178897d;
        }
        C65807ck ckVar = (C65807ck) clVar.toBuilder();
        ckVar.mo58884l(C65830dg.f178958c);
        C62940bt btVar = C65830dg.f178958c;
        C65829df dfVar = (C65829df) C65830dg.f178957b.createBuilder();
        dfVar.mo59431a(arrayList);
        ckVar.mo58885m(btVar, (C65830dg) dfVar.build());
        return C60922j.m93045h(C60838bs.m92859i(C60922j.m93044g(C60838bs.m92859i(biVar.mo27128b(treeSet, bVar, i)), C47810es.m84963c(new C21799ai(biVar, treeSet, ckVar, i, hashMap, xVar, map7)), biVar.f60224h)), C47810es.m84966f(new C21816az(biVar, abVar, map, map2, map7, zVar, bVar, i, map8)), biVar.f60223g);
    }
}
