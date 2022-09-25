package com.google.android.libraries.p10923ac.p10925b.p10945l;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146800g;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146803j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4895aw.p4902b.C64047dc;
import com.google.protos.p4895aw.p4902b.C64048dd;
import com.google.protos.p4895aw.p4902b.C64049de;
import com.google.protos.p4895aw.p4902b.C64050df;
import com.google.protos.p4895aw.p4902b.C64051dg;
import com.google.protos.p4895aw.p4902b.C64054dj;

/* renamed from: com.google.android.libraries.ac.b.l.p */
/* compiled from: PG */
public final class C147182p {
    /* renamed from: a */
    public static C64054dj m240013a(C146800g gVar) {
        int a = gVar.mo123647a();
        if (a == 1) {
            C64047dc dcVar = (C64047dc) C64054dj.f173187h.createBuilder();
            dcVar.copyOnWrite();
            C64054dj djVar = (C64054dj) dcVar.instance;
            djVar.f173190b = 1;
            djVar.f173189a = 1 | djVar.f173189a;
            return (C64054dj) dcVar.build();
        } else if (a != 2) {
            C64047dc dcVar2 = (C64047dc) C64054dj.f173187h.createBuilder();
            dcVar2.copyOnWrite();
            C64054dj djVar2 = (C64054dj) dcVar2.instance;
            djVar2.f173190b = 0;
            djVar2.f173189a = 1 | djVar2.f173189a;
            return (C64054dj) dcVar2.build();
        } else {
            C64047dc dcVar3 = (C64047dc) C64054dj.f173187h.createBuilder();
            dcVar3.copyOnWrite();
            C64054dj djVar3 = (C64054dj) dcVar3.instance;
            djVar3.f173190b = 2;
            djVar3.f173189a |= 1;
            dcVar3.mo59251a(m240015c(gVar.mo123648b(), false));
            dcVar3.mo59251a(m240015c(gVar.mo123649c(), true));
            dcVar3.mo59252b(m240015c(gVar.mo123650d(), false));
            dcVar3.mo59252b(m240015c(gVar.mo123651e(), true));
            if (gVar.mo123653f() != null) {
                int intValue = gVar.mo123653f().intValue();
                dcVar3.copyOnWrite();
                C64054dj djVar4 = (C64054dj) dcVar3.instance;
                djVar4.f173189a = 2 | djVar4.f173189a;
                djVar4.f173193e = intValue;
            }
            boolean g = gVar.mo123654g();
            dcVar3.copyOnWrite();
            C64054dj djVar5 = (C64054dj) dcVar3.instance;
            djVar5.f173189a |= 4;
            djVar5.f173194f = g;
            boolean h = gVar.mo123655h();
            dcVar3.copyOnWrite();
            C64054dj djVar6 = (C64054dj) dcVar3.instance;
            djVar6.f173189a |= 8;
            djVar6.f173195g = h;
            return (C64054dj) dcVar3.build();
        }
    }

    /* renamed from: b */
    public static boolean m240014b(C64054dj djVar) {
        return djVar.f173193e != -1;
    }

    /* renamed from: c */
    private static C64051dg m240015c(C146803j jVar, boolean z) {
        C64050df dfVar = (C64050df) C64051dg.f173180e.createBuilder();
        C64048dd ddVar = (C64048dd) C64049de.f173176c.createBuilder();
        ddVar.copyOnWrite();
        C64049de deVar = (C64049de) ddVar.instance;
        deVar.f173178a = 1;
        deVar.f173179b = Boolean.valueOf(z);
        dfVar.copyOnWrite();
        C64051dg dgVar = (C64051dg) dfVar.instance;
        C64049de deVar2 = (C64049de) ddVar.build();
        deVar2.getClass();
        C62971cq cqVar = dgVar.f173183b;
        if (!cqVar.mo58948c()) {
            dgVar.f173183b = C62942bv.mutableCopy(cqVar);
        }
        dgVar.f173183b.add(deVar2);
        boolean b = jVar.mo123668b();
        dfVar.copyOnWrite();
        C64051dg dgVar2 = (C64051dg) dfVar.instance;
        dgVar2.f173182a |= 1;
        dgVar2.f173184c = b;
        int a = jVar.mo123667a();
        dfVar.copyOnWrite();
        C64051dg dgVar3 = (C64051dg) dfVar.instance;
        dgVar3.f173182a |= 2;
        dgVar3.f173185d = a;
        return (C64051dg) dfVar.build();
    }
}
