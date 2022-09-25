package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.android.libraries.p10923ac.p10925b.p10945l.C147177k;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64014bx;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64076ee;
import com.google.protos.p4895aw.p4902b.C64077ef;
import com.google.protos.p4895aw.p4902b.C64078eg;
import com.google.protos.p4895aw.p4902b.C64079eh;
import com.google.protos.p4895aw.p4902b.C64080ei;
import com.google.protos.p4895aw.p4902b.C64081ej;
import com.google.protos.p4895aw.p4902b.C64082ek;
import com.google.protos.p4895aw.p4902b.C64087ep;
import com.google.protos.p4895aw.p4902b.C64089g;
import com.google.protos.p4895aw.p4902b.C64091i;
import com.google.protos.p4895aw.p4902b.C64093k;
import com.google.protos.p4895aw.p4902b.C64098p;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.ac.b.e.b.aa */
/* compiled from: PG */
public final class C146859aa {
    /* renamed from: a */
    public static C60870cx m239353a(C64014bx bxVar, C64093k kVar, C64098p pVar, C64057dm dmVar, C58485gu guVar, C58485gu guVar2, C147177k kVar2, C58881cr crVar) {
        long j;
        C64091i iVar;
        Long l;
        if (guVar2.isEmpty()) {
            kVar2.mo124001e(0);
            kVar2.mo124002f(0, 0);
            C64082ek ekVar = (C64082ek) C64087ep.f173258e.createBuilder();
            ekVar.copyOnWrite();
            C64087ep epVar = (C64087ep) ekVar.instance;
            dmVar.getClass();
            epVar.f173261b = dmVar;
            epVar.f173260a |= 1;
            return C60856cj.m92900i((C64087ep) ekVar.build());
        }
        C64076ee eeVar = (C64076ee) C64081ej.f173236h.createBuilder();
        eeVar.copyOnWrite();
        C64081ej ejVar = (C64081ej) eeVar.instance;
        pVar.getClass();
        ejVar.f173239b = pVar;
        ejVar.f173238a |= 1;
        eeVar.copyOnWrite();
        C64081ej ejVar2 = (C64081ej) eeVar.instance;
        dmVar.getClass();
        ejVar2.f173241d = dmVar;
        ejVar2.f173238a |= 2;
        eeVar.mo59253a(guVar2);
        C64077ef efVar = (C64077ef) C64078eg.f173228c.createBuilder();
        efVar.copyOnWrite();
        C64078eg egVar = (C64078eg) efVar.instance;
        egVar.f173230a |= 1;
        egVar.f173231b = true;
        eeVar.copyOnWrite();
        C64081ej ejVar3 = (C64081ej) eeVar.instance;
        C64078eg egVar2 = (C64078eg) efVar.build();
        egVar2.getClass();
        ejVar3.f173243f = egVar2;
        ejVar3.f173238a |= 4;
        if (C147266a.m240134e()) {
            Iterator it = kVar.f173282a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iVar = C64091i.f173270i;
                    break;
                }
                iVar = (C64091i) it.next();
                C64098p pVar2 = iVar.f173275d;
                if (pVar2 == null) {
                    pVar2 = C64098p.f173292c;
                }
                if (pVar.equals(pVar2)) {
                    break;
                }
            }
            if (!(!iVar.f173279h || (l = (Long) crVar.mo6453a()) == null || l.longValue() == 0)) {
                C64079eh ehVar = (C64079eh) C64080ei.f173232c.createBuilder();
                long longValue = l.longValue();
                ehVar.copyOnWrite();
                C64080ei eiVar = (C64080ei) ehVar.instance;
                eiVar.f173234a = 1;
                eiVar.f173235b = Long.valueOf(longValue);
                C64080ei eiVar2 = (C64080ei) ehVar.build();
                eeVar.copyOnWrite();
                C64081ej ejVar4 = (C64081ej) eeVar.instance;
                eiVar2.getClass();
                ejVar4.f173244g = eiVar2;
                ejVar4.f173238a |= 16;
            }
        }
        C64081ej ejVar5 = (C64081ej) eeVar.build();
        long serializedSize = (long) ejVar5.getSerializedSize();
        if (guVar != guVar2) {
            j = serializedSize;
            for (int i = 0; i < guVar2.size(); i++) {
                C64089g gVar = (C64089g) guVar.get(i);
                C64089g gVar2 = (C64089g) guVar2.get(i);
                if (gVar2.f173267b == 6) {
                    j = (j - ((long) gVar2.getSerializedSize())) + ((long) gVar.getSerializedSize());
                }
            }
        } else {
            j = serializedSize;
        }
        kVar2.mo124001e((long) ejVar5.f173240c.size());
        kVar2.mo124002f(serializedSize, j);
        return bxVar.mo59249c(ejVar5);
    }
}
