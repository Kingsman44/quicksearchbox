package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.p1818f.p1819a.C21789d;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.geller.portable.C21982i;
import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65819cw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.geller.f.ax */
/* compiled from: PG */
public final /* synthetic */ class C21814ax implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60179a;

    /* renamed from: b */
    public final /* synthetic */ Map f60180b;

    /* renamed from: c */
    public final /* synthetic */ Map f60181c;

    /* renamed from: d */
    public final /* synthetic */ Map f60182d;

    /* renamed from: e */
    public final /* synthetic */ Map f60183e;

    /* renamed from: f */
    public final /* synthetic */ Map f60184f;

    public /* synthetic */ C21814ax(C21826bi biVar, Map map, Map map2, Map map3, Map map4, Map map5) {
        this.f60179a = biVar;
        this.f60180b = map;
        this.f60181c = map2;
        this.f60182d = map3;
        this.f60183e = map4;
        this.f60184f = map5;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        List<C65768az> list;
        C21826bi biVar = this.f60179a;
        Map map = this.f60180b;
        Map map2 = this.f60181c;
        Map map3 = this.f60182d;
        Map map4 = this.f60183e;
        Map map5 = this.f60184f;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C65753ak akVar : map.keySet()) {
            try {
                C60856cj.m92909r((Future) map.get(akVar));
                hashSet.add(akVar);
                if (map2.containsKey(akVar)) {
                    Geller geller = biVar.f60219c;
                    C58838bb.m90884s(!geller.f60382d, "updateMetadata() not allowed if Geller is read-only");
                    C21982i iVar = new C21982i(geller, C21789d.m40905b(biVar.f60218b), (C65819cw) map2.get(akVar));
                    arrayList.add(C60856cj.m92904m(C47810es.m84978r(iVar), geller.f60380b));
                }
                C58480gp e = C58485gu.m89837e();
                if (map4.containsKey(akVar)) {
                    list = (List) map4.get(akVar);
                } else {
                    list = C58485gu.m89845m();
                }
                for (C65768az azVar : list) {
                    if ((azVar.f178795a & 4) != 0) {
                        e.mo55395g(azVar.f178798d);
                    }
                }
                C21855e eVar = new C21855e();
                eVar.mo27149c().mo55489i(e.mo55394f());
                map3.put(akVar, eVar.mo27147a());
            } catch (ExecutionException e2) {
                C21855e eVar2 = new C21855e();
                eVar2.mo27148b().mo55395g(new C21827bj("Failed to commit downloads to the corpora storage: ".concat(String.valueOf(e2.getMessage()))));
                map3.put(akVar, eVar2.mo27147a());
            }
        }
        C21942ah ahVar = biVar.f60220d;
        C21789d.m40905b(biVar.f60218b);
        ahVar.mo27220d(hashSet, map4);
        biVar.f60220d.mo27217a(hashSet, map5);
        return C60856cj.m92892a(arrayList).mo57335b(C47810es.m84965e(new C21824bg(map3)), biVar.f60224h);
    }
}
