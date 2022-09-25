package com.google.android.apps.gsa.smartspace.p7258b;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.akz;
import com.google.common.p4552o.ala;
import com.google.common.p4552o.alb;
import com.google.common.p4552o.alc;
import com.google.common.p4552o.ald;
import com.google.common.p4552o.alf;
import com.google.common.p4552o.alg;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.smartspace.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C92041ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92045ah f256600a;

    public /* synthetic */ C92041ad(C92045ah ahVar) {
        this.f256600a = ahVar;
    }

    public final Object apply(Object obj) {
        C92045ah ahVar = this.f256600a;
        for (ald ald : ((alg) obj).f159028a) {
            int i = ald.f159017b;
            Map map = ahVar.f256616k;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                Map map2 = (Map) ahVar.f256616k.get(valueOf);
                if (map2 != null) {
                    for (alc alc : ald.f159018c) {
                        alf a = alf.m92428a(alc.f159012b);
                        if (a == null) {
                            a = alf.UNSPECIFIED;
                        }
                        map2.put(a, Integer.valueOf((map2.containsKey(a) ? ((Integer) map2.get(a)).intValue() : 0) + alc.f159013c));
                    }
                }
            } else {
                EnumMap enumMap = new EnumMap(alf.class);
                for (alc alc2 : ald.f159018c) {
                    alf a2 = alf.m92428a(alc2.f159012b);
                    if (a2 == null) {
                        a2 = alf.UNSPECIFIED;
                    }
                    enumMap.put(a2, Integer.valueOf(alc2.f159013c));
                }
                ahVar.f256616k.put(Integer.valueOf(i), enumMap);
            }
        }
        akz akz = (akz) alg.f159026b.createBuilder();
        for (Map.Entry entry : ahVar.f256616k.entrySet()) {
            ala ala = (ala) ald.f159014d.createBuilder();
            int intValue = ((Integer) entry.getKey()).intValue();
            ala.copyOnWrite();
            ald ald2 = (ald) ala.instance;
            ald2.f159016a |= 1;
            ald2.f159017b = intValue;
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                alb alb = (alb) alc.f159009d.createBuilder();
                alb.copyOnWrite();
                alc alc3 = (alc) alb.instance;
                alc3.f159012b = ((alf) entry2.getKey()).f159025e;
                alc3.f159011a |= 1;
                int intValue2 = ((Integer) entry2.getValue()).intValue();
                alb.copyOnWrite();
                alc alc4 = (alc) alb.instance;
                alc4.f159011a |= 2;
                alc4.f159013c = intValue2;
                alc alc5 = (alc) alb.build();
                ala.copyOnWrite();
                ald ald3 = (ald) ala.instance;
                alc5.getClass();
                C62971cq cqVar = ald3.f159018c;
                if (!cqVar.mo58948c()) {
                    ald3.f159018c = C62942bv.mutableCopy(cqVar);
                }
                ald3.f159018c.add(alc5);
            }
            akz.copyOnWrite();
            alg alg = (alg) akz.instance;
            ald ald4 = (ald) ala.build();
            ald4.getClass();
            C62971cq cqVar2 = alg.f159028a;
            if (!cqVar2.mo58948c()) {
                alg.f159028a = C62942bv.mutableCopy(cqVar2);
            }
            alg.f159028a.add(ald4);
        }
        ahVar.f256616k.clear();
        ahVar.f256612g.mo46039a(new C92040ac((alg) akz.build()), ahVar.f256613h);
        return null;
    }
}
