package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C59656bj;
import com.google.common.p4552o.aac;
import com.google.common.p4552o.adm;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.lens.view.af.bl */
/* compiled from: PG */
public final class C25067bl implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C25068bm f68314a;

    public C25067bl(C25068bm bmVar) {
        this.f68314a = bmVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C25068bm.f68315a.mo56226d()).mo56382g(th)).mo56372aa(49663)).mo56386p("Could not log LensStartupMetadata");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C59656bj bjVar = (C59656bj) obj;
        C37215b bVar = this.f68314a.f68318d;
        C37258g gVar = C37194a.f98641t;
        C62940bt btVar = C59898bg.f161867w;
        C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
        aac aac = bjVar.f159970b;
        if (aac == null) {
            aac = aac.f158079h;
        }
        afVar.copyOnWrite();
        C59898bg bgVar = (C59898bg) afVar.instance;
        aac.getClass();
        bgVar.f161874f = aac;
        bgVar.f161869a |= 16;
        adm adm = bjVar.f159971c;
        if (adm == null) {
            adm = adm.f158382e;
        }
        afVar.copyOnWrite();
        C59898bg bgVar2 = (C59898bg) afVar.instance;
        adm.getClass();
        bgVar2.f161873e = adm;
        bgVar2.f161869a |= 8;
        bVar.mo19974a(gVar.mo40812e(btVar, (C59898bg) afVar.build()));
    }
}
