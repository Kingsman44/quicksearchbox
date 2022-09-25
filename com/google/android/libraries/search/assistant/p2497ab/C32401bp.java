package com.google.android.libraries.search.assistant.p2497ab;

import com.google.apps.tiktok.experiments.C46897i;
import com.google.common.base.C58817ah;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p4986a.C64644a;
import com.google.protos.p4985f.p4986a.C64652af;
import com.google.protos.p4985f.p4986a.C64653ag;
import com.google.protos.p4985f.p4986a.C64673b;
import com.google.protos.p4985f.p4986a.C64688bo;
import com.google.protos.p4985f.p4986a.C64689bp;
import com.google.protos.p4985f.p4986a.C64691br;
import com.google.protos.p4985f.p4986a.C64692bs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.ab.bp */
/* compiled from: PG */
public final /* synthetic */ class C32401bp implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C32407bv f86851a;

    public /* synthetic */ C32401bp(C32407bv bvVar) {
        this.f86851a = bvVar;
    }

    public final Object apply(Object obj) {
        C64673b bVar;
        int i;
        C32407bv bvVar = this.f86851a;
        C32376ar arVar = (C32376ar) obj;
        if (!arVar.isInitialized()) {
            return C64692bs.f175353d;
        }
        C62971cq<C32371am> cqVar = arVar.f86798a;
        C62971cq<C32371am> cqVar2 = arVar.f86799b;
        C62971cq<C32371am> cqVar3 = arVar.f86800c;
        HashMap hashMap = new HashMap();
        for (C32371am amVar : cqVar) {
            hashMap.put(amVar.f86783b, Double.valueOf(amVar.f86786e));
        }
        HashMap hashMap2 = new HashMap();
        for (C32371am amVar2 : cqVar2) {
            hashMap2.put(amVar2.f86783b, Double.valueOf(amVar2.f86787f));
        }
        ArrayList arrayList = new ArrayList();
        for (C32371am amVar3 : cqVar3) {
            if (amVar3.f86788g > ((C46897i) bvVar.f86860d.f184849a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45371308").mo50902a()) {
                String str = amVar3.f86783b;
                Double valueOf = Double.valueOf(C59203do.f157270a);
                double doubleValue = ((Double) Map.EL.getOrDefault(hashMap, str, valueOf)).doubleValue();
                double doubleValue2 = ((Double) Map.EL.getOrDefault(hashMap2, str, valueOf)).doubleValue();
                C64652af afVar = (C64652af) C64653ag.f175248e.createBuilder();
                afVar.copyOnWrite();
                C64653ag agVar = (C64653ag) afVar.instance;
                agVar.f175251b = 1;
                agVar.f175250a |= 1;
                afVar.copyOnWrite();
                C64653ag agVar2 = (C64653ag) afVar.instance;
                agVar2.f175250a |= 2;
                agVar2.f175252c = doubleValue;
                C64652af afVar2 = (C64652af) C64653ag.f175248e.createBuilder();
                afVar2.copyOnWrite();
                C64653ag agVar3 = (C64653ag) afVar2.instance;
                agVar3.f175251b = 2;
                agVar3.f175250a |= 1;
                afVar2.copyOnWrite();
                C64653ag agVar4 = (C64653ag) afVar2.instance;
                agVar4.f175250a |= 2;
                agVar4.f175252c = doubleValue2;
                C64652af afVar3 = (C64652af) C64653ag.f175248e.createBuilder();
                afVar3.copyOnWrite();
                C64653ag agVar5 = (C64653ag) afVar3.instance;
                agVar5.f175251b = 3;
                agVar5.f175250a |= 1;
                double d = amVar3.f86788g;
                afVar3.copyOnWrite();
                C64653ag agVar6 = (C64653ag) afVar3.instance;
                agVar6.f175250a |= 2;
                agVar6.f175252c = d;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add((C64653ag) afVar.build());
                arrayList2.add((C64653ag) afVar2.build());
                arrayList2.add((C64653ag) afVar3.build());
                C64688bo boVar = (C64688bo) C64689bp.f175345f.createBuilder();
                long parseLong = Long.parseLong(str);
                boVar.copyOnWrite();
                C64689bp bpVar = (C64689bp) boVar.instance;
                bpVar.f175347a |= 2;
                bpVar.f175349c = parseLong;
                String str2 = amVar3.f86784c;
                boVar.copyOnWrite();
                C64689bp bpVar2 = (C64689bp) boVar.instance;
                str2.getClass();
                bpVar2.f175347a |= 1;
                bpVar2.f175348b = str2;
                boVar.copyOnWrite();
                C64689bp bpVar3 = (C64689bp) boVar.instance;
                bpVar3.mo59293a();
                C62947c.addAll((Iterable) arrayList2, (List) bpVar3.f175350d);
                if ((amVar3.f86782a & 64) != 0) {
                    C64644a aVar = (C64644a) C64673b.f175301d.createBuilder();
                    C32361ac acVar = amVar3.f86789h;
                    if (acVar == null) {
                        acVar = C32361ac.f86752d;
                    }
                    boolean z = acVar.f86755b;
                    aVar.copyOnWrite();
                    C64673b bVar2 = (C64673b) aVar.instance;
                    bVar2.f175303a |= 1;
                    bVar2.f175304b = z;
                    C32361ac acVar2 = amVar3.f86789h;
                    if (acVar2 == null) {
                        acVar2 = C32361ac.f86752d;
                    }
                    int a = C32363ae.m60173a(acVar2.f86756c);
                    if (a == 0) {
                        a = 1;
                    }
                    switch (a - 1) {
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 6;
                            break;
                        case 6:
                            i = 7;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                    aVar.copyOnWrite();
                    C64673b bVar3 = (C64673b) aVar.instance;
                    bVar3.f175305c = i - 1;
                    bVar3.f175303a |= 2;
                    bVar = (C64673b) aVar.build();
                } else {
                    bVar = C64673b.f175301d;
                }
                boVar.copyOnWrite();
                C64689bp bpVar4 = (C64689bp) boVar.instance;
                bVar.getClass();
                bpVar4.mo59294b();
                bpVar4.f175351e.add(bVar);
                arrayList.add((C64689bp) boVar.build());
            }
        }
        C64691br brVar = (C64691br) C64692bs.f175353d.createBuilder();
        brVar.copyOnWrite();
        C64692bs bsVar = (C64692bs) brVar.instance;
        bsVar.mo59295a();
        C62947c.addAll((Iterable) arrayList, (List) bsVar.f175356b);
        return (C64692bs) brVar.build();
    }
}
