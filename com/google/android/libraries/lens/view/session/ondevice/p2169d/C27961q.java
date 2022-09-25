package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59879ao;
import com.google.common.p4552o.p4563i.C59880ap;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54042cw;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.q */
/* compiled from: PG */
final class C27961q implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C27962r f76121a;

    public C27961q(C27962r rVar) {
        this.f76121a = rVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C62722b bVar = C62722b.UNKNOWN;
        if (th.getMessage() != null) {
            if (th.getMessage().startsWith("UNAVAILABLE")) {
                bVar = C62722b.UNAVAILABLE;
            } else if (th.getMessage().startsWith("RESOURCE_EXHAUSTED")) {
                bVar = C62722b.RESOURCE_EXHAUSTED;
            } else if (th.getMessage().startsWith("UNAUTHENTICATED")) {
                bVar = C62722b.UNAUTHENTICATED;
            }
        }
        this.f76121a.f76124a.mo19974a(C37194a.f98590cu.mo40815i(bVar));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37215b bVar = this.f76121a.f76124a;
        C37258g gVar = C37194a.f98590cu;
        C62940bt btVar = C59898bg.f161867w;
        C62910ar arVar = ((C54042cw) obj).f141799d;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
        C59879ao aoVar = (C59879ao) C59880ap.f161815c.createBuilder();
        aoVar.copyOnWrite();
        C59880ap apVar = (C59880ap) aoVar.instance;
        arVar.getClass();
        apVar.f161818b = arVar;
        apVar.f161817a |= 1;
        afVar.copyOnWrite();
        C59898bg bgVar = (C59898bg) afVar.instance;
        C59880ap apVar2 = (C59880ap) aoVar.build();
        apVar2.getClass();
        bgVar.f161888t = apVar2;
        bgVar.f161869a |= C89885b.HTTP_VALUE;
        C37252a e = gVar.mo40812e(btVar, (C59898bg) afVar.build());
        e.mo40781e(C62722b.OK);
        bVar.mo19974a(e);
    }
}
