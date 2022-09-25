package com.google.android.libraries.p10923ac.p10925b.p10945l;

import com.google.common.p4552o.p4566l.C60160by;
import com.google.common.p4552o.p4566l.C60161bz;
import com.google.common.p4552o.p4566l.C60163ca;
import com.google.common.p4552o.p4566l.C60164cb;
import com.google.common.p4552o.p4566l.C60172cj;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64097o;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.b.l.j */
/* compiled from: PG */
public final class C147176j {
    /* renamed from: a */
    public static C60161bz m240000a(C64098p pVar) {
        C63979ap apVar;
        C64097o oVar = C64097o.TRIVIAL_BIGTABLE;
        int ordinal = C64097o.m96355a(pVar.f173294a).ordinal();
        if (ordinal == 0) {
            return C60161bz.f162749c;
        }
        if (ordinal == 1) {
            if (pVar.f173294a == 2) {
                apVar = (C63979ap) pVar.f173295b;
            } else {
                apVar = C63979ap.f173026e;
            }
            C60160by byVar = (C60160by) C60161bz.f162749c.createBuilder();
            C60163ca caVar = (C60163ca) C60164cb.f162753e.createBuilder();
            int i = apVar.f173030c;
            caVar.copyOnWrite();
            C60164cb cbVar = (C60164cb) caVar.instance;
            cbVar.f162755a = 2 | cbVar.f162755a;
            cbVar.f162757c = i;
            int i2 = apVar.f173029b;
            caVar.copyOnWrite();
            C60164cb cbVar2 = (C60164cb) caVar.instance;
            cbVar2.f162755a |= 1;
            cbVar2.f162756b = i2;
            C63978ao a = C63978ao.m96329a(apVar.f173031d);
            if (a == null) {
                a = C63978ao.UNKNOWN;
            }
            int i3 = a.f173025e;
            caVar.copyOnWrite();
            C60164cb cbVar3 = (C60164cb) caVar.instance;
            cbVar3.f162755a |= 4;
            cbVar3.f162758d = i3;
            byVar.copyOnWrite();
            C60161bz bzVar = (C60161bz) byVar.instance;
            C60164cb cbVar4 = (C60164cb) caVar.build();
            cbVar4.getClass();
            bzVar.f162752b = cbVar4;
            bzVar.f162751a = 1;
            return (C60161bz) byVar.build();
        } else if (ordinal == 2) {
            C60160by byVar2 = (C60160by) C60161bz.f162749c.createBuilder();
            C60172cj cjVar = C60172cj.f162770a;
            byVar2.copyOnWrite();
            C60161bz bzVar2 = (C60161bz) byVar2.instance;
            cjVar.getClass();
            bzVar2.f162752b = cjVar;
            bzVar2.f162751a = 2;
            return (C60161bz) byVar2.build();
        } else if (ordinal != 3) {
            return C60161bz.f162749c;
        } else {
            return C60161bz.f162749c;
        }
    }
}
