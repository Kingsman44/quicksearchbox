package com.google.android.libraries.geller.portable;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.portable.p1821a.C21905ax;
import com.google.android.libraries.geller.portable.p1821a.C21907az;
import com.google.android.libraries.geller.portable.p1821a.C21910bb;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65813cq;
import com.google.protos.p5129p.p5131b.C65854w;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.geller.portable.ae */
/* compiled from: PG */
public final class C21939ae implements C21942ah {

    /* renamed from: a */
    private final C21907az f60536a;

    public C21939ae(C21907az azVar) {
        this.f60536a = azVar;
    }

    /* renamed from: h */
    private static void m41066h(Map map, C65753ak akVar, int i) {
        if (!map.containsKey(akVar)) {
            map.put(akVar, 0L);
        }
        map.put(akVar, Long.valueOf(((Long) map.get(akVar)).longValue() + ((long) i)));
    }

    /* renamed from: a */
    public final void mo27217a(Set set, Map map) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C65753ak akVar = (C65753ak) it.next();
            List<C65768az> m = map.containsKey(akVar) ? (List) map.get(akVar) : C58485gu.m89845m();
            if (!m.isEmpty()) {
                C21907az azVar = this.f60536a;
                String name = akVar.name();
                int size = m.size();
                C21910bb bbVar = (C21910bb) azVar;
                ((C19569f) bbVar.f60483a.f60471z.mo6453a()).mo24824b((double) size, bbVar.f60484b, bbVar.f60485c, name);
                int i = 0;
                for (C65768az serializedSize : m) {
                    i += serializedSize.getSerializedSize();
                }
                C21907az azVar2 = this.f60536a;
                String name2 = akVar.name();
                C21910bb bbVar2 = (C21910bb) azVar2;
                ((C19569f) bbVar2.f60483a.f60442P.mo6453a()).mo24824b((double) i, bbVar2.f60484b, bbVar2.f60485c, name2);
            }
        }
    }

    /* renamed from: b */
    public final void mo27218b(Map map, int i) {
        for (Map.Entry entry : map.entrySet()) {
            C21907az azVar = this.f60536a;
            String name = ((C65753ak) entry.getKey()).name();
            boolean isEmpty = ((C21850cf) entry.getValue()).mo27152b().isEmpty();
            C21910bb bbVar = (C21910bb) azVar;
            C21905ax axVar = bbVar.f60483a;
            ((C19569f) axVar.f60432F.mo6453a()).mo24824b((double) i, bbVar.f60484b, bbVar.f60485c, name, Boolean.valueOf(isEmpty));
        }
    }

    /* renamed from: c */
    public final void mo27219c(Map map, int i, long j) {
        for (Map.Entry entry : map.entrySet()) {
            C21907az azVar = this.f60536a;
            ((C19569f) ((C21910bb) azVar).f60483a.f60431E.mo6453a()).mo24824b((double) j, ((C65753ak) entry.getKey()).name(), Boolean.valueOf(((C21850cf) entry.getValue()).mo27152b().isEmpty()), Integer.valueOf(i));
        }
    }

    /* renamed from: d */
    public final void mo27220d(Set set, Map map) {
        Map map2 = map;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C65753ak akVar = (C65753ak) it.next();
            List<C65768az> m = map2.containsKey(akVar) ? (List) map2.get(akVar) : C58485gu.m89845m();
            if (!m.isEmpty()) {
                C21907az azVar = this.f60536a;
                String name = akVar.name();
                for (C65768az b : m) {
                    C21910bb bbVar = (C21910bb) azVar;
                    ((C19569f) bbVar.f60483a.f60466u.mo6453a()).mo24824b((double) bbVar.mo27215b(b), bbVar.f60484b, bbVar.f60485c, name);
                }
                C21907az azVar2 = this.f60536a;
                String name2 = akVar.name();
                int size = m.size();
                C21910bb bbVar2 = (C21910bb) azVar2;
                ((C19569f) bbVar2.f60483a.f60467v.mo6453a()).mo24824b((double) size, bbVar2.f60484b, bbVar2.f60485c, name2);
                int i = 0;
                for (C65768az serializedSize : m) {
                    i += serializedSize.getSerializedSize();
                }
                C21907az azVar3 = this.f60536a;
                String name3 = akVar.name();
                C21910bb bbVar3 = (C21910bb) azVar3;
                ((C19569f) bbVar3.f60483a.f60441O.mo6453a()).mo24824b((double) i, bbVar3.f60484b, bbVar3.f60485c, name3);
            }
            C21907az azVar4 = this.f60536a;
            String name4 = akVar.name();
            C21910bb bbVar4 = (C21910bb) azVar4;
            ((C19567d) bbVar4.f60483a.f60428B.mo6453a()).mo24822a(1, bbVar4.f60484b, bbVar4.f60485c, name4);
        }
    }

    /* renamed from: e */
    public final void mo27221e(Map map, C65855x xVar) {
        Map map2 = map;
        for (C65753ak akVar : map.keySet()) {
            C21907az azVar = this.f60536a;
            String name = akVar.name();
            boolean g = ((Status) map2.get(akVar)).mo61679g();
            C21910bb bbVar = (C21910bb) azVar;
            ((C19567d) bbVar.f60483a.f60427A.mo6453a()).mo24822a(1, bbVar.f60484b, bbVar.f60485c, name, Boolean.valueOf(g));
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        Iterator it = xVar.f179023b.iterator();
        while (it.hasNext()) {
            C65854w wVar = (C65854w) it.next();
            C65753ak b = C65753ak.m96797b(wVar.f179014b);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            boolean z = map2.containsKey(b) && ((Status) map2.get(b)).mo61679g();
            C21907az azVar2 = this.f60536a;
            String name2 = b.name();
            Iterator it2 = wVar.f179017e.iterator();
            while (it2.hasNext()) {
                C21910bb bbVar2 = (C21910bb) azVar2;
                ((C19569f) bbVar2.f60483a.f60465t.mo6453a()).mo24824b((double) bbVar2.mo27215b((C65768az) it2.next()), bbVar2.f60484b, bbVar2.f60485c, name2, Boolean.valueOf(z));
                Map map3 = map;
                it2 = it2;
                it = it;
            }
            Iterator it3 = it;
            C21907az azVar3 = this.f60536a;
            String name3 = b.name();
            Iterator it4 = wVar.f179018f.iterator();
            while (it4.hasNext()) {
                C21910bb bbVar3 = (C21910bb) azVar3;
                Iterator it5 = it4;
                ((C19569f) bbVar3.f60483a.f60468w.mo6453a()).mo24824b((double) bbVar3.mo27215b((C65768az) it4.next()), bbVar3.f60484b, bbVar3.f60485c, name3, Boolean.valueOf(z));
                it4 = it5;
                azVar3 = azVar3;
            }
            m41066h(hashMap, b, wVar.f179017e.size());
            m41066h(hashMap2, b, wVar.f179018f.size());
            int i = 0;
            for (C65768az serializedSize : wVar.f179017e) {
                i += serializedSize.getSerializedSize();
            }
            m41066h(hashMap3, b, i);
            int i2 = 0;
            for (C65768az serializedSize2 : wVar.f179018f) {
                i2 += serializedSize2.getSerializedSize();
            }
            m41066h(hashMap4, b, i2);
            map2 = map;
            it = it3;
        }
        for (C65753ak akVar2 : hashMap.keySet()) {
            C21907az azVar4 = this.f60536a;
            String name4 = akVar2.name();
            long longValue = ((Long) hashMap.get(akVar2)).longValue();
            C21910bb bbVar4 = (C21910bb) azVar4;
            ((C19569f) bbVar4.f60483a.f60469x.mo6453a()).mo24824b((double) longValue, bbVar4.f60484b, bbVar4.f60485c, name4);
            C21907az azVar5 = this.f60536a;
            String name5 = akVar2.name();
            long longValue2 = ((Long) hashMap3.get(akVar2)).longValue();
            C21910bb bbVar5 = (C21910bb) azVar5;
            ((C19569f) bbVar5.f60483a.f60443Q.mo6453a()).mo24824b((double) longValue2, bbVar5.f60484b, bbVar5.f60485c, name5);
        }
        for (C65753ak akVar3 : hashMap2.keySet()) {
            C21907az azVar6 = this.f60536a;
            String name6 = akVar3.name();
            long longValue3 = ((Long) hashMap2.get(akVar3)).longValue();
            C21910bb bbVar6 = (C21910bb) azVar6;
            ((C19569f) bbVar6.f60483a.f60470y.mo6453a()).mo24824b((double) longValue3, bbVar6.f60484b, bbVar6.f60485c, name6);
            C21907az azVar7 = this.f60536a;
            String name7 = akVar3.name();
            long longValue4 = ((Long) hashMap4.get(akVar3)).longValue();
            C21910bb bbVar7 = (C21910bb) azVar7;
            ((C19569f) bbVar7.f60483a.f60444R.mo6453a()).mo24824b((double) longValue4, bbVar7.f60484b, bbVar7.f60485c, name7);
        }
    }

    /* renamed from: f */
    public final void mo27222f(Set set, Status.Code code, long j, C65813cq cqVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C21907az azVar = this.f60536a;
            String name = ((C65753ak) it.next()).name();
            boolean equals = code.equals(Status.Code.OK);
            String name2 = cqVar.name();
            C21910bb bbVar = (C21910bb) azVar;
            C21905ax axVar = bbVar.f60483a;
            double d = (double) j;
            String str = bbVar.f60484b;
            String str2 = bbVar.f60485c;
            Boolean valueOf = Boolean.valueOf(equals);
            ((C19569f) axVar.f60429C.mo6453a()).mo24824b(d, str, str2, name, valueOf);
            ((C19569f) bbVar.f60483a.f60430D.mo6453a()).mo24824b(d, name, valueOf, name2);
        }
    }

    /* renamed from: g */
    public final void mo27223g() {
    }
}
