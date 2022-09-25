package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.android.apps.gsa.nga.shared.p6344g.C81068b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.y */
/* compiled from: PG */
public final /* synthetic */ class C103899y implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C103899y f289212a = new C103899y();

    private /* synthetic */ C103899y() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        HashMap hashMap = new HashMap();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C29690f fVar = (C29690f) guVar.get(i);
            C29689e a = C29689e.m54781a(fVar.f80415f);
            if (a == null) {
                a = C29689e.UNSPECIFIED;
            }
            if (a == C29689e.DOWNLOADED) {
                ArrayList arrayList = (ArrayList) Optional.ofNullable((ArrayList) hashMap.get(fVar.f80411b)).orElseGet(C103887m.f289200a);
                arrayList.add(fVar);
                hashMap.put(fVar.f80411b, arrayList);
            }
        }
        C58495hd hdVar = (C58495hd) Collection.EL.stream(hashMap.entrySet()).collect(C58370cn.m89403c(C103894t.f289207a, C103895u.f289208a, C103896v.f289209a));
        C58526ih ihVar = new C58526ih();
        HashSet hashSet = new HashSet();
        C58800sl lA = hdVar.entrySet().iterator();
        while (lA.hasNext()) {
            C58528ij ijVar = (C58528ij) Collection.EL.stream((C58528ij) ((Map.Entry) lA.next()).getValue()).map(C103897w.f289210a).flatMap(C103898x.f289211a).collect(C58370cn.f155947b);
            ihVar.mo55489i(C58758qx.m90646d(hashSet, ijVar));
            hashSet.addAll(ijVar);
        }
        C58528ij f = ihVar.mo55486f();
        HashMap hashMap2 = new HashMap();
        C103820a aVar = (C103820a) C103878d.f289178d.createBuilder();
        ArrayList arrayList2 = new ArrayList();
        C58800sl lA2 = hdVar.entrySet().iterator();
        while (lA2.hasNext()) {
            Map.Entry entry = (Map.Entry) lA2.next();
            Stream flatMap = Collection.EL.stream((C58528ij) entry.getValue()).flatMap(C103821aa.f289071a);
            C103900z zVar = C103900z.f289213a;
            C58495hd hdVar2 = (C58495hd) flatMap.filter(new C81068b(new ConcurrentHashMap())).collect(C58370cn.m89403c(C103900z.f289213a, C103888n.f289201a, C103889o.f289202a));
            long sum = Collection.EL.stream(hdVar2.values()).mapToLong(C103822ab.f289072a).sum();
            long sum2 = Collection.EL.stream(hdVar2.entrySet()).filter(new C103890p(f)).mapToLong(C103891q.f289204a).sum();
            C58528ij ijVar2 = (C58528ij) Collection.EL.stream((C58528ij) entry.getValue()).map(C103892r.f289205a).collect(C58370cn.f155947b);
            hashMap2.putAll(hdVar2);
            C103847b bVar = (C103847b) C103874c.f289153f.createBuilder();
            String str = (String) entry.getKey();
            bVar.copyOnWrite();
            C103874c cVar = (C103874c) bVar.instance;
            str.getClass();
            cVar.f289155a |= 1;
            cVar.f289156b = str;
            bVar.copyOnWrite();
            C103874c cVar2 = (C103874c) bVar.instance;
            cVar2.f289155a |= 2;
            cVar2.f289158d = sum;
            bVar.copyOnWrite();
            C103874c cVar3 = (C103874c) bVar.instance;
            cVar3.f289155a |= 4;
            cVar3.f289159e = sum2;
            bVar.copyOnWrite();
            C103874c cVar4 = (C103874c) bVar.instance;
            C62964ck ckVar = cVar4.f289157c;
            if (!ckVar.mo58948c()) {
                cVar4.f289157c = C62942bv.mutableCopy(ckVar);
            }
            C62947c.addAll((Iterable) ijVar2, (List) cVar4.f289157c);
            arrayList2.add((C103874c) bVar.build());
        }
        Collections.sort(arrayList2, Comparator.EL.reversed(C103893s.f289206a));
        aVar.copyOnWrite();
        C103878d dVar = (C103878d) aVar.instance;
        C62971cq cqVar = dVar.f289182c;
        if (!cqVar.mo58948c()) {
            dVar.f289182c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList2, (List) dVar.f289182c);
        long sum3 = Collection.EL.stream(hashMap2.values()).mapToLong(C103822ab.f289072a).sum();
        aVar.copyOnWrite();
        C103878d dVar2 = (C103878d) aVar.instance;
        dVar2.f289180a |= 1;
        dVar2.f289181b = sum3;
        return (C103878d) aVar.build();
    }
}
