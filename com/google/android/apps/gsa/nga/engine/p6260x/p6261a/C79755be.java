package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aen;
import com.google.common.p4552o.ahg;
import com.google.p4500cm.p4518d.C58191h;
import com.google.p4500cm.p4518d.C58192i;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.be */
/* compiled from: PG */
public final /* synthetic */ class C79755be implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C79783cf f218681a;

    /* renamed from: b */
    public final /* synthetic */ C19088t f218682b;

    public /* synthetic */ C79755be(C79783cf cfVar, C19088t tVar) {
        this.f218681a = cfVar;
        this.f218682b = tVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C79783cf cfVar = this.f218681a;
        C19088t tVar = this.f218682b;
        C58191h hVar = (C58191h) ((C58192i) obj).toBuilder();
        if (cfVar.f218743f.mo85405j(C90126fx.f251600lq)) {
            hVar.copyOnWrite();
            C58192i iVar = (C58192i) hVar.instance;
            tVar.getClass();
            iVar.f155611g = tVar;
            iVar.f155605a |= 2048;
        } else {
            C60555uf ufVar = ((C58192i) hVar.instance).f155607c;
            if (ufVar == null) {
                ufVar = C60555uf.f164065cO;
            }
            C60548tz tzVar = (C60548tz) ufVar.toBuilder();
            C60555uf ufVar2 = ((C58192i) hVar.instance).f155607c;
            if (ufVar2 == null) {
                ufVar2 = C60555uf.f164065cO;
            }
            ahg ahg = ufVar2.f164238cp;
            if (ahg == null) {
                ahg = ahg.f158704D;
            }
            aen aen = (aen) ahg.toBuilder();
            C63088z byteString = tVar.toByteString();
            aen.copyOnWrite();
            ahg ahg2 = (ahg) aen.instance;
            byteString.getClass();
            ahg2.f158712a |= 2;
            ahg2.f158714c = byteString;
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            ahg ahg3 = (ahg) aen.build();
            ahg3.getClass();
            ufVar3.f164238cp = ahg3;
            ufVar3.f164255j |= 64;
            hVar.copyOnWrite();
            C58192i iVar2 = (C58192i) hVar.instance;
            C60555uf ufVar4 = (C60555uf) tzVar.build();
            ufVar4.getClass();
            iVar2.f155607c = ufVar4;
            iVar2.f155605a |= 4;
        }
        C60555uf ufVar5 = ((C58192i) hVar.instance).f155607c;
        if (ufVar5 == null) {
            ufVar5 = C60555uf.f164065cO;
        }
        C60548tz tzVar2 = (C60548tz) ufVar5.toBuilder();
        C48420g b = cfVar.f218753p.mo75573b();
        tzVar2.copyOnWrite();
        C60555uf ufVar6 = (C60555uf) tzVar2.instance;
        b.getClass();
        ufVar6.f164237co = b;
        ufVar6.f164255j |= 32;
        hVar.copyOnWrite();
        C58192i iVar3 = (C58192i) hVar.instance;
        C60555uf ufVar7 = (C60555uf) tzVar2.build();
        ufVar7.getClass();
        iVar3.f155607c = ufVar7;
        iVar3.f155605a |= 4;
        return (C58192i) hVar.build();
    }
}
