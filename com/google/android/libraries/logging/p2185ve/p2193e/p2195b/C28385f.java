package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.libraries.logging.p2185ve.p2192d.C28348a;
import com.google.android.libraries.logging.p2185ve.p2192d.C28350c;
import com.google.android.libraries.logging.p2185ve.p2192d.C28351d;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60412pg;
import com.google.common.p4552o.C60449ql;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62940bt;
import java.util.Collections;

/* renamed from: com.google.android.libraries.logging.ve.e.b.f */
/* compiled from: PG */
final class C28385f {
    /* renamed from: a */
    public static final void m53064a(int i, boolean z, C60320od odVar, aqp[] aqpArr, C60449ql qlVar, C28351d dVar) {
        aqp aqp = aqpArr[i];
        if (aqp.mo58882j(C60412pg.f163487a)) {
            z = true;
        } else if (z) {
            C62940bt btVar = C60412pg.f163487a;
            aqs aqs = (aqs) aqp.instance;
            aqp.mo58885m(btVar, Long.valueOf((((long) aqs.f159783b) << 32) | (((long) aqs.f159784c) & 4294967295L)));
        }
        for (Integer intValue : Collections.unmodifiableList(((aqs) aqp.instance).f159785d)) {
            m53064a(intValue.intValue(), z, odVar, aqpArr, qlVar, dVar);
        }
    }

    /* renamed from: b */
    public static final void m53065b(C60218r rVar, C28350c cVar, C28351d dVar, C60320od odVar) {
        if (dVar.f77070b.size() == 1) {
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            C60321oe oeVar2 = C60321oe.f163224i;
            rVar.getClass();
            oeVar.f163229d = rVar;
            oeVar.f163226a |= 2;
            return;
        }
        C60214n nVar = C28348a.m53028a(cVar).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        C60218r rVar2 = nVar.f162921f;
        if (rVar2 == null) {
            rVar2 = C60218r.f162925d;
        }
        odVar.copyOnWrite();
        C60321oe oeVar3 = (C60321oe) odVar.instance;
        C60321oe oeVar4 = C60321oe.f163224i;
        rVar2.getClass();
        oeVar3.f163229d = rVar2;
        oeVar3.f163226a |= 2;
    }
}
