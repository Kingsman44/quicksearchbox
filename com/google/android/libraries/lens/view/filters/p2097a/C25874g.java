package com.google.android.libraries.lens.view.filters.p2097a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25985i;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.lens.p4707j.C62457cg;
import com.google.lens.p4707j.C62471cu;
import com.google.lens.p4707j.C62484dg;
import com.google.lens.p4707j.C62485dh;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56258bl;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56259bm;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56260bn;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.lens.view.filters.a.g */
/* compiled from: PG */
public final class C25874g implements C25985i {

    /* renamed from: a */
    public final C25989d f70307a;

    /* renamed from: b */
    public C25865ao f70308b;

    public C25874g(C25989d dVar, C27232l lVar) {
        C62457cg cgVar;
        this.f70307a = dVar;
        C62471cu v = lVar.mo32717v();
        if (v.f168678a == 4) {
            cgVar = (C62457cg) v.f168679b;
        } else {
            cgVar = C62457cg.f168651c;
        }
        if ((cgVar.f168653a & 1) != 0) {
            C62485dh dhVar = cgVar.f168654b;
            dhVar = dhVar == null ? C62485dh.f168693e : dhVar;
            this.f70308b = new C25850a(dhVar.f168696b, dhVar.f168697c, BuildConfig.FLAVOR, 0.0f);
        }
    }

    /* renamed from: a */
    public final C56278ce mo31042a() {
        C56259bm bmVar = (C56259bm) C56260bn.f149946c.createBuilder();
        C25865ao aoVar = this.f70308b;
        if (aoVar != null) {
            C62484dg dgVar = (C62484dg) C62485dh.f168693e.createBuilder();
            String d = aoVar.mo31012d();
            dgVar.copyOnWrite();
            C62485dh dhVar = (C62485dh) dgVar.instance;
            d.getClass();
            dhVar.f168695a |= 1;
            dhVar.f168696b = d;
            String c = aoVar.mo31011c();
            dgVar.copyOnWrite();
            C62485dh dhVar2 = (C62485dh) dgVar.instance;
            c.getClass();
            dhVar2.f168695a |= 2;
            dhVar2.f168697c = c;
            dgVar.copyOnWrite();
            C62485dh dhVar3 = (C62485dh) dgVar.instance;
            C62971cq cqVar = dhVar3.f168698d;
            if (!cqVar.mo58948c()) {
                dhVar3.f168698d = C62942bv.mutableCopy(cqVar);
            }
            dhVar3.f168698d.add("restaurant");
            C62485dh dhVar4 = (C62485dh) dgVar.build();
            bmVar.copyOnWrite();
            C56260bn bnVar = (C56260bn) bmVar.instance;
            dhVar4.getClass();
            bnVar.f149949b = dhVar4;
            bnVar.f149948a |= 1;
        }
        C56258bl blVar = (C56258bl) C56278ce.f149986e.createBuilder();
        C56306df dfVar = C56306df.DINING;
        blVar.copyOnWrite();
        C56278ce ceVar = (C56278ce) blVar.instance;
        ceVar.f149991d = dfVar.f150068m;
        ceVar.f149988a |= 1;
        C56260bn bnVar2 = (C56260bn) bmVar.build();
        blVar.copyOnWrite();
        C56278ce ceVar2 = (C56278ce) blVar.instance;
        bnVar2.getClass();
        ceVar2.f149990c = bnVar2;
        ceVar2.f149989b = 5;
        return (C56278ce) blVar.build();
    }
}
