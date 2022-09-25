package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a;

import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132208h;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132209i;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58817ah;
import com.google.p427am.p432b.p433a.C8662bn;
import com.google.p427am.p432b.p433a.C8671bw;
import com.google.p427am.p432b.p433a.C8672bx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C132154n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132155o f360709a;

    public /* synthetic */ C132154n(C132155o oVar) {
        this.f360709a = oVar;
    }

    public final Object apply(Object obj) {
        C132155o oVar = this.f360709a;
        C132208h hVar = ((C132209i) obj).f360859e;
        if (hVar == null) {
            hVar = C132208h.f360848d;
        }
        C63042fg fgVar = hVar.f360851b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C8671bw bwVar = (C8671bw) C8672bx.f29984b.createBuilder();
        if ((hVar.f360850a & 2) != 0) {
            C8662bn bnVar = hVar.f360852c;
            if (bnVar == null) {
                bnVar = C8662bn.f29965e;
            }
            bwVar.copyOnWrite();
            bnVar.getClass();
            ((C8672bx) bwVar.instance).f29986a = bnVar;
        }
        if (oVar.f360710a.f360727e.mo57444a().isAfter(C62950b.m95474e(fgVar).plus(C132161u.f360722a))) {
            return C46688af.f121976a;
        }
        return C46688af.m83205b((C8672bx) bwVar.build(), C62950b.m95474e(fgVar).toEpochMilli());
    }
}
