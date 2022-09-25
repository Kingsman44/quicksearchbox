package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.ab.e */
/* compiled from: PG */
public final /* synthetic */ class C32410e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f86867a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f86868b;

    /* renamed from: c */
    public final /* synthetic */ C32374ap f86869c;

    /* renamed from: d */
    public final /* synthetic */ List f86870d;

    public /* synthetic */ C32410e(C60870cx cxVar, C60870cx cxVar2, C32374ap apVar, List list) {
        this.f86867a = cxVar;
        this.f86868b = cxVar2;
        this.f86869c = apVar;
        this.f86870d = list;
    }

    public final Object call() {
        double d;
        C60870cx cxVar = this.f86867a;
        C60870cx cxVar2 = this.f86868b;
        C32374ap apVar = this.f86869c;
        List list = this.f86870d;
        C62971cq<C32367ai> cqVar = C32359aa.m60169b(cxVar).f86778a;
        C62971cq<C32367ai> cqVar2 = C32359aa.m60169b(cxVar2).f86779b;
        Map unmodifiableMap = Collections.unmodifiableMap(apVar.f86794b);
        HashMap hashMap = new HashMap();
        for (C32367ai aiVar : cqVar) {
            String str = aiVar.f86770b;
            C32398bm bmVar = aiVar.f86772d;
            if (bmVar == null) {
                bmVar = C32398bm.f86831r;
            }
            hashMap.put(str, bmVar);
        }
        for (C32367ai aiVar2 : cqVar2) {
            String str2 = aiVar2.f86770b;
            C32398bm bmVar2 = aiVar2.f86772d;
            if (bmVar2 == null) {
                bmVar2 = C32398bm.f86831r;
            }
            C32397bl blVar = (C32397bl) ((C32398bm) Map.EL.getOrDefault(hashMap, str2, C32398bm.f86831r)).toBuilder();
            double d2 = ((C32398bm) blVar.instance).f86841i;
            double d3 = bmVar2.f86841i;
            blVar.copyOnWrite();
            C32398bm bmVar3 = (C32398bm) blVar.instance;
            bmVar3.f86833a |= 128;
            bmVar3.f86841i = d2 + d3;
            double d4 = bmVar3.f86842j;
            double d5 = bmVar2.f86842j;
            blVar.copyOnWrite();
            C32398bm bmVar4 = (C32398bm) blVar.instance;
            bmVar4.f86833a |= 256;
            bmVar4.f86842j = d4 + d5;
            hashMap.put(str2, (C32398bm) blVar.build());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hashMap.values());
        C58485gu F = C58485gu.m89836F(new C32358a(), arrayList);
        int i = ((C58724pq) F).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C32398bm bmVar5 = (C32398bm) F.get(i2);
            String str3 = bmVar5.f86844l;
            double d6 = bmVar5.f86841i;
            double d7 = bmVar5.f86842j;
            boolean z = bmVar5.f86843k;
            long min = (long) Math.min((int) (d6 * 1000.0d), 4194303);
            long min2 = (((min + min) | (z ? 1 : 0)) << 22) | ((long) Math.min((int) (1000.0d * d7), 4194303));
            if (min2 <= 1) {
                d = C59203do.f157270a;
            } else {
                d = Math.log((double) min2);
            }
            C32365ag agVar = (C32365ag) Map.EL.getOrDefault(unmodifiableMap, str3, C32365ag.f86758h);
            C32370al alVar = (C32370al) C32371am.f86780i.createBuilder();
            String str4 = agVar.f86762c;
            alVar.copyOnWrite();
            C32371am amVar = (C32371am) alVar.instance;
            str4.getClass();
            amVar.f86782a |= 2;
            amVar.f86784c = str4;
            alVar.copyOnWrite();
            C32371am amVar2 = (C32371am) alVar.instance;
            str3.getClass();
            amVar2.f86782a |= 1;
            amVar2.f86783b = str3;
            alVar.copyOnWrite();
            C32371am amVar3 = (C32371am) alVar.instance;
            amVar3.f86782a |= 4;
            amVar3.f86785d = d;
            alVar.copyOnWrite();
            C32371am amVar4 = (C32371am) alVar.instance;
            amVar4.f86782a |= 32;
            amVar4.f86788g = d;
            C32361ac a = C32359aa.m60168a(agVar, apVar.f86795c);
            alVar.copyOnWrite();
            C32371am amVar5 = (C32371am) alVar.instance;
            a.getClass();
            amVar5.f86789h = a;
            amVar5.f86782a |= 64;
            list.add((C32371am) alVar.build());
        }
        List list2 = (List) Collection.EL.stream(cqVar).map(C32414i.f86874a).collect(Collectors.toCollection(C32429x.f86893a));
        List list3 = (List) Collection.EL.stream(cqVar2).map(C32415j.f86875a).collect(Collectors.toCollection(C32429x.f86893a));
        C32375aq aqVar = (C32375aq) C32376ar.f86796d.createBuilder();
        aqVar.copyOnWrite();
        C32376ar arVar = (C32376ar) aqVar.instance;
        C62971cq cqVar3 = arVar.f86800c;
        if (!cqVar3.mo58948c()) {
            arVar.f86800c = C62942bv.mutableCopy(cqVar3);
        }
        C62947c.addAll((Iterable) list, (List) arVar.f86800c);
        aqVar.copyOnWrite();
        C32376ar arVar2 = (C32376ar) aqVar.instance;
        C62971cq cqVar4 = arVar2.f86798a;
        if (!cqVar4.mo58948c()) {
            arVar2.f86798a = C62942bv.mutableCopy(cqVar4);
        }
        C62947c.addAll((Iterable) list2, (List) arVar2.f86798a);
        aqVar.copyOnWrite();
        C32376ar arVar3 = (C32376ar) aqVar.instance;
        C62971cq cqVar5 = arVar3.f86799b;
        if (!cqVar5.mo58948c()) {
            arVar3.f86799b = C62942bv.mutableCopy(cqVar5);
        }
        C62947c.addAll((Iterable) list3, (List) arVar3.f86799b);
        return (C32376ar) aqVar.build();
    }
}
