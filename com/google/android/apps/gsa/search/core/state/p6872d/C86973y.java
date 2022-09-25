package com.google.android.apps.gsa.search.core.state.p6872d;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88442bm;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88444bo;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.y */
/* compiled from: PG */
public final class C86973y extends C86898ct {

    /* renamed from: a */
    private final C68214a f234912a;

    /* renamed from: b */
    private final C85005h f234913b;

    /* renamed from: c */
    private final C22871g f234914c;

    public C86973y(C68214a aVar, C68214a aVar2, C85005h hVar, C22871g gVar) {
        super(aVar, 27);
        this.f234912a = aVar2;
        this.f234913b = hVar;
        this.f234914c = gVar;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.EXTERNAL_VOICE_ASSIST};
    }

    /* renamed from: e */
    public final void mo80615e(Query query) {
        C88442bm bmVar = (C88442bm) C88443bn.f239106g.createBuilder();
        bmVar.copyOnWrite();
        C88443bn bnVar = (C88443bn) bmVar.instance;
        bnVar.f239108a |= 2;
        bnVar.f239110c = 3;
        amo amo = amo.ASSIST_ENTRY;
        bmVar.copyOnWrite();
        C88443bn bnVar2 = (C88443bn) bmVar.instance;
        bnVar2.f239112e = amo.f159234au;
        bnVar2.f239108a |= 8;
        String bn = query.mo84355bn();
        if (true == TextUtils.isEmpty(bn)) {
            bn = "and.gsa.widget.mic";
        }
        bmVar.copyOnWrite();
        C88443bn bnVar3 = (C88443bn) bmVar.instance;
        bn.getClass();
        bnVar3.f239108a = 1 | bnVar3.f239108a;
        bnVar3.f239109b = bn;
        boolean dO = query.mo84434dO();
        bmVar.copyOnWrite();
        C88443bn bnVar4 = (C88443bn) bmVar.instance;
        bnVar4.f239108a |= 16;
        bnVar4.f239113f = dO;
        C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
        baVar.mo58885m(C88444bo.f239114a, (C88443bn) bmVar.build());
        ((C86695q) this.f234912a.mo27525b()).mo80275j("search", (C88431bb) baVar.build());
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a == C87739bu.EXTERNAL_VOICE_ASSIST) {
            Query query = clientEventData.mo81913d(Query.class) ? (Query) clientEventData.mo81912b(Query.class) : null;
            new C90873ag(this.f234913b.mo78628l(query), this.f234914c, "Attempts to start OPA for voice search", new C86971w(this)).mo85223a(new C86972x(this, query));
        }
    }
}
