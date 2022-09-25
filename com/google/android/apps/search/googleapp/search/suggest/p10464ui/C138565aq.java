package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138580e;
import com.google.android.apps.search.lens.p10547a.C139917b;
import com.google.android.apps.search.lens.p10547a.C139918c;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4552o.aod;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62455ce;
import com.google.lens.p4707j.C62461ck;
import com.google.lens.p4707j.C62470ct;
import com.google.lens.p4707j.C62471cu;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.aq */
/* compiled from: PG */
final class C138565aq implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376892a;

    public C138565aq(C138558am amVar) {
        this.f376892a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138558am amVar = this.f376892a;
        C138030av avVar = ((C138580e) bVar).f376910a;
        amVar.f376868i.mo114119i(avVar);
        amVar.f376873n.mo114102a(amVar.f376868i.mo114113b(amVar.f376854A.mo114315d(), aod.CLICKED_SUGGESTION));
        amVar.f376864e.mo114047c(amVar.f376868i.mo114115d(Optional.empty()), aod.CLICKED_SUGGESTION);
        C139917b bVar2 = (C139917b) C139918c.f380355d.createBuilder();
        C62433bj bjVar = C62433bj.SUGGEST_RESULT;
        bVar2.copyOnWrite();
        C139918c cVar = (C139918c) bVar2.instance;
        cVar.f380358b = bjVar.f168594ao;
        cVar.f380357a |= 1;
        if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_LENS_EDU)) {
            C62455ce ceVar = (C62455ce) C62471cu.f168676c.createBuilder();
            C62461ck ckVar = C62461ck.f168659a;
            ceVar.copyOnWrite();
            C62471cu cuVar = (C62471cu) ceVar.instance;
            ckVar.getClass();
            cuVar.f168679b = ckVar;
            cuVar.f168678a = 7;
            bVar2.copyOnWrite();
            C139918c cVar2 = (C139918c) bVar2.instance;
            C62471cu cuVar2 = (C62471cu) ceVar.build();
            cuVar2.getClass();
            cVar2.f380359c = cuVar2;
            cVar2.f380357a |= 2;
        } else if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_LENS_TRANSLATE)) {
            C62455ce ceVar2 = (C62455ce) C62471cu.f168676c.createBuilder();
            C62470ct ctVar = C62470ct.f168670e;
            ceVar2.copyOnWrite();
            C62471cu cuVar3 = (C62471cu) ceVar2.instance;
            ctVar.getClass();
            cuVar3.f168679b = ctVar;
            cuVar3.f168678a = 2;
            bVar2.copyOnWrite();
            C139918c cVar3 = (C139918c) bVar2.instance;
            C62471cu cuVar4 = (C62471cu) ceVar2.build();
            cuVar4.getClass();
            cVar3.f380359c = cuVar4;
            cVar3.f380357a |= 2;
        }
        amVar.f376883x.mo41490e((C139918c) bVar2.build());
        return C47392e.f123116b;
    }
}
