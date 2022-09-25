package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50779cc;
import com.google.assistant.p3886c.C50780cd;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57019k;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.s */
/* compiled from: PG */
public final class C117415s extends C117414r {
    public C117415s(C91189au auVar, Context context, C86124t tVar, C21370a aVar, C68214a aVar2) {
        super(auVar, context, tVar, aVar, aVar2);
    }

    /* renamed from: i */
    private final boolean m195123i() {
        return this.f325921b.mo79746e(C90017bw.f247969be);
    }

    /* renamed from: a */
    public final long mo103291a(C57017i iVar) {
        return iVar.f152213h + iVar.f152214i;
    }

    /* renamed from: b */
    public final C50794cr mo103282b() {
        return C50794cr.SPORTS;
    }

    /* renamed from: e */
    public final boolean mo103285e(Object obj) {
        C57019k kVar;
        if (!super.mo103285e(obj)) {
            return false;
        }
        C57017i iVar = (C57017i) obj;
        if (iVar.f152207b != 3 || !this.f325921b.mo79746e(C90014bt.f247656lK)) {
            return false;
        }
        if (iVar.f152207b == 3) {
            kVar = (C57019k) iVar.f152208c;
        } else {
            kVar = C57019k.f152221j;
        }
        return !kVar.f152231i.equals("/m/09xp_");
    }

    /* renamed from: f */
    public final Optional mo103293f(C57017i iVar) {
        return Optional.empty();
    }

    /* renamed from: g */
    public final Optional mo103294g(C57017i iVar) {
        C57019k kVar;
        if (iVar.f152207b == 3) {
            kVar = (C57019k) iVar.f152208c;
        } else {
            kVar = C57019k.f152221j;
        }
        String str = kVar.f152224b;
        if (str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(Uri.parse(str));
    }

    /* renamed from: h */
    public final Optional mo103295h(C57017i iVar) {
        C57019k kVar;
        C50812di diVar = (C50812di) C50813dj.f132278a.createBuilder();
        C62940bt btVar = C50780cd.f132146d;
        C50779cc ccVar = (C50779cc) C50780cd.f132145c.createBuilder();
        if (iVar.f152207b == 3) {
            kVar = (C57019k) iVar.f152208c;
        } else {
            kVar = C57019k.f152221j;
        }
        ccVar.copyOnWrite();
        C50780cd cdVar = (C50780cd) ccVar.instance;
        kVar.getClass();
        cdVar.f132149b = kVar;
        cdVar.f132148a |= 1;
        diVar.mo58885m(btVar, (C50780cd) ccVar.build());
        C50813dj djVar = (C50813dj) diVar.build();
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String str = m195123i() ? iVar.f152215j : iVar.f152210e;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        C50722g gVar = C50722g.UNSPECIFIED;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar.f131998e;
        hVar2.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        C50723h hVar3 = (C50723h) aVar.build();
        hVar3.getClass();
        czVar.f132239b = hVar3;
        czVar.f132238a |= 1;
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        String str2 = m195123i() ? iVar.f152216k : iVar.f152211f;
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        str2.getClass();
        hVar4.f132001a |= 1;
        hVar4.f132002b = str2;
        C50722g gVar2 = C50722g.UNSPECIFIED;
        aVar2.copyOnWrite();
        C50723h hVar5 = (C50723h) aVar2.instance;
        hVar5.f132003c = gVar2.f131998e;
        hVar5.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar2 = (C50802cz) cyVar.instance;
        C50723h hVar6 = (C50723h) aVar2.build();
        hVar6.getClass();
        czVar2.f132241d = hVar6;
        czVar2.f132238a |= 4;
        C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
        String str3 = m195123i() ? iVar.f152217l : iVar.f152210e;
        aVar3.copyOnWrite();
        C50723h hVar7 = (C50723h) aVar3.instance;
        str3.getClass();
        hVar7.f132001a |= 1;
        hVar7.f132002b = str3;
        C50722g gVar3 = C50722g.UNSPECIFIED;
        aVar3.copyOnWrite();
        C50723h hVar8 = (C50723h) aVar3.instance;
        hVar8.f132003c = gVar3.f131998e;
        hVar8.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar3 = (C50802cz) cyVar.instance;
        C50723h hVar9 = (C50723h) aVar3.build();
        hVar9.getClass();
        czVar3.f132240c = hVar9;
        czVar3.f132238a |= 2;
        C50716a aVar4 = (C50716a) C50723h.f131999e.createBuilder();
        String str4 = m195123i() ? iVar.f152218m : iVar.f152211f;
        aVar4.copyOnWrite();
        C50723h hVar10 = (C50723h) aVar4.instance;
        str4.getClass();
        hVar10.f132001a |= 1;
        hVar10.f132002b = str4;
        C50722g gVar4 = C50722g.UNSPECIFIED;
        aVar4.copyOnWrite();
        C50723h hVar11 = (C50723h) aVar4.instance;
        hVar11.f132003c = gVar4.f131998e;
        hVar11.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar4 = (C50802cz) cyVar.instance;
        C50723h hVar12 = (C50723h) aVar4.build();
        hVar12.getClass();
        czVar4.f132242e = hVar12;
        czVar4.f132238a |= 8;
        C50802cz czVar5 = (C50802cz) cyVar.build();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        czVar5.getClass();
        doVar.f132309f = czVar5;
        doVar.f132304a |= 16;
        long j = iVar.f152214i;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        doVar2.f132304a |= 16384;
        doVar2.f132319p = j;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        djVar.getClass();
        doVar3.f132329z = djVar;
        doVar3.f132304a |= 33554432;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        doVar4.f132304a |= 524288;
        doVar4.f132324u = true;
        return Optional.m71637of((C50818do) cnVar.build());
    }
}
