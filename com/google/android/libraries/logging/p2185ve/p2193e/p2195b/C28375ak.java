package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.logging.ve.e.b.ak */
/* compiled from: PG */
public final class C28375ak {
    /* renamed from: a */
    public static C28353e m53059a(long j) {
        C62940bt btVar = C28376al.f77110b;
        C28364a aVar = (C28364a) C28381b.f77118c.createBuilder();
        aVar.copyOnWrite();
        C28381b bVar = (C28381b) aVar.instance;
        bVar.f77120a |= 1;
        bVar.f77121b = j;
        return new C28353e(btVar, (C28381b) aVar.build());
    }

    /* renamed from: b */
    public static C28423g m53060b(C62957cd cdVar) {
        C62940bt btVar = C28384e.f77126a;
        C28382c cVar = (C28382c) C28383d.f77122c.createBuilder();
        int i = ((C59743a) cdVar).f161421ts;
        cVar.copyOnWrite();
        C28383d dVar = (C28383d) cVar.instance;
        dVar.f77124a |= 1;
        dVar.f77125b = i;
        return new C28423g(btVar, (C28383d) cVar.build());
    }

    /* renamed from: c */
    public static C28423g m53061c(int i) {
        C62940bt btVar = C28377am.f77113a;
        C28391l lVar = (C28391l) C28392m.f77141c.createBuilder();
        lVar.copyOnWrite();
        C28392m mVar = (C28392m) lVar.instance;
        mVar.f77143a |= 1;
        mVar.f77144b = i;
        return new C28423g(btVar, (C28392m) lVar.build());
    }

    /* renamed from: d */
    public static C28427h m53062d(C60214n nVar) {
        boolean z = false;
        C58838bb.m90868c((nVar.f162916a & 2048) != 0);
        C60218r rVar = nVar.f162921f;
        if (rVar == null) {
            rVar = C60218r.f162925d;
        }
        if ((rVar.f162927a & 2) != 0) {
            z = true;
        }
        C58838bb.m90868c(!z);
        return new C28427h((C60213m) nVar.toBuilder());
    }

    /* renamed from: e */
    public static C28441k m53063e(int i) {
        C62940bt btVar = C28376al.f77112d;
        C28393n nVar = (C28393n) C28394o.f77145c.createBuilder();
        nVar.copyOnWrite();
        C28394o oVar = (C28394o) nVar.instance;
        oVar.f77147a |= 1;
        oVar.f77148b = i;
        return new C28441k(btVar, (C28394o) nVar.build());
    }
}
