package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146811h;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146814k;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146815l;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146819p;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146821r;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C63976am;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64009bs;
import com.google.protos.p4895aw.p4902b.C64010bt;
import com.google.protos.p4895aw.p4902b.C64040cw;
import com.google.protos.p4895aw.p4902b.C64042cy;
import com.google.protos.p4895aw.p4902b.C64043cz;
import com.google.protos.p4895aw.p4902b.C64065du;
import com.google.protos.p4895aw.p4902b.C64066dv;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64096n;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.b.e.ax */
/* compiled from: PG */
public final class C146854ax {
    /* renamed from: a */
    public static C146815l m239331a(C64010bt btVar) {
        C146814k b = C146815l.m239247b();
        for (C64043cz czVar : btVar.f173099a) {
            byte[] N = czVar.f173165b.mo59174N();
            int a = C64042cy.m96339a(czVar.f173166c);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalArgumentException("Unknown secondary id matching type ".concat(a != 1 ? a != 2 ? "PREFIX" : "EXACT" : "UNKNOWN"));
                }
                i = 2;
            }
            b.mo123709c(N, i);
        }
        return b.mo123677a();
    }

    /* renamed from: b */
    public static C146815l m239332b(C64095m mVar) {
        C64010bt btVar;
        C58838bb.m90868c(mVar.f173285a == 1);
        if (mVar.f173285a == 1) {
            btVar = (C64010bt) mVar.f173286b;
        } else {
            btVar = C64010bt.f173097b;
        }
        return m239331a(btVar);
    }

    /* renamed from: c */
    public static C146821r m239333c(C64066dv dvVar) {
        int i = dvVar.f173215a;
        Long l = null;
        Long valueOf = (i & 4) != 0 ? Long.valueOf(dvVar.f173218d) : null;
        if ((i & 2) != 0) {
            l = Long.valueOf(dvVar.f173217c);
        }
        return new C146811h(dvVar.f173216b, valueOf, l);
    }

    /* renamed from: d */
    public static C64098p m239334d(int i, int i2, C63978ao aoVar) {
        C64096n nVar = (C64096n) C64098p.f173292c.createBuilder();
        C63976am amVar = (C63976am) C63979ap.f173026e.createBuilder();
        amVar.copyOnWrite();
        C63979ap apVar = (C63979ap) amVar.instance;
        apVar.f173028a |= 1;
        apVar.f173029b = i;
        amVar.copyOnWrite();
        C63979ap apVar2 = (C63979ap) amVar.instance;
        apVar2.f173028a |= 2;
        apVar2.f173030c = i2;
        amVar.copyOnWrite();
        C63979ap apVar3 = (C63979ap) amVar.instance;
        apVar3.f173031d = aoVar.f173025e;
        apVar3.f173028a |= 4;
        C63979ap apVar4 = (C63979ap) amVar.build();
        nVar.copyOnWrite();
        C64098p pVar = (C64098p) nVar.instance;
        apVar4.getClass();
        pVar.f173295b = apVar4;
        pVar.f173294a = 2;
        return (C64098p) nVar.build();
    }

    /* renamed from: e */
    public static C64010bt m239335e(C146815l lVar) {
        int i;
        C64009bs bsVar = (C64009bs) C64010bt.f173097b.createBuilder();
        C58485gu a = lVar.mo123679a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C146819p pVar = (C146819p) a.get(i2);
            C64040cw cwVar = (C64040cw) C64043cz.f173162d.createBuilder();
            C63088z A = C63088z.m96139A(pVar.mo123695b());
            cwVar.copyOnWrite();
            C64043cz czVar = (C64043cz) cwVar.instance;
            czVar.f173164a |= 1;
            czVar.f173165b = A;
            int a2 = pVar.mo123694a();
            if (a2 == 1) {
                i = 2;
            } else if (a2 == 2) {
                i = 3;
            } else {
                throw new IllegalArgumentException("Unknown secondary id matching type " + a2);
            }
            cwVar.copyOnWrite();
            C64043cz czVar2 = (C64043cz) cwVar.instance;
            czVar2.f173166c = i - 1;
            czVar2.f173164a |= 2;
            bsVar.copyOnWrite();
            C64010bt btVar = (C64010bt) bsVar.instance;
            C64043cz czVar3 = (C64043cz) cwVar.build();
            czVar3.getClass();
            C62971cq cqVar = btVar.f173099a;
            if (!cqVar.mo58948c()) {
                btVar.f173099a = C62942bv.mutableCopy(cqVar);
            }
            btVar.f173099a.add(czVar3);
        }
        return (C64010bt) bsVar.build();
    }

    /* renamed from: f */
    public static C64066dv m239336f(C146821r rVar) {
        C64065du duVar = (C64065du) C64066dv.f173213e.createBuilder();
        int a = rVar.mo123699a();
        duVar.copyOnWrite();
        C64066dv dvVar = (C64066dv) duVar.instance;
        dvVar.f173215a |= 1;
        dvVar.f173216b = a;
        Long b = rVar.mo123700b();
        if (b != null) {
            long longValue = b.longValue();
            duVar.copyOnWrite();
            C64066dv dvVar2 = (C64066dv) duVar.instance;
            dvVar2.f173215a |= 2;
            dvVar2.f173217c = longValue;
        }
        Long c = rVar.mo123701c();
        if (c != null) {
            long longValue2 = c.longValue();
            duVar.copyOnWrite();
            C64066dv dvVar3 = (C64066dv) duVar.instance;
            dvVar3.f173215a |= 4;
            dvVar3.f173218d = longValue2;
        }
        return (C64066dv) duVar.build();
    }

    /* renamed from: g */
    public static String m239337g(C63088z zVar) {
        C59326i iVar = C59326i.f157519g;
        byte[] N = zVar.mo59174N();
        return iVar.mo56837l(N, N.length);
    }
}
