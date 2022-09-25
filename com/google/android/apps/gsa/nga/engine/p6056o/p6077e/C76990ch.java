package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.p6044n.C76248a;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.engine.p6056o.C77422p;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82330be;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82396dq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82477gq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82478gr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82479gs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82919fh;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.ch */
/* compiled from: PG */
public final class C76990ch implements C77422p {

    /* renamed from: a */
    private final C58974d f212513a = C58974d.m91136j();

    /* renamed from: b */
    private final C83305i f212514b;

    /* renamed from: c */
    private final C22871g f212515c;

    public C76990ch(C83305i iVar, C22871g gVar) {
        this.f212514b = iVar;
        this.f212515c = gVar;
    }

    /* renamed from: c */
    public final void mo71390c(C76401e eVar) {
        C76248a aVar = (C76248a) eVar;
        C77426t tVar = aVar.f211268a;
        int ordinal = tVar.mo72525b().mo73746a().mo71153f().ordinal();
        int number = ((C80517f) tVar.mo72525b().mo73746a().mo71160m().orElse(C80517f.UNKNOWN)).getNumber();
        int number2 = ((C80515d) tVar.mo72525b().mo73747b().map(C76938bt.f212429a).orElse(C80515d.UNKNOWN)).getNumber();
        int a = C82919fh.m132428a(tVar.mo72527d().f225878c);
        if (a == 0) {
            a = 1;
        }
        boolean isPresent = C81442m.m129547i(tVar.mo72528e()).isPresent();
        int number3 = ((C80363t) C81442m.m129548j(tVar.mo72528e()).orElse(C80363t.UNKNOWN)).getNumber();
        C77146e eVar2 = new C77146e(aVar.f211270c, ordinal, number, number2, a - 1, !isPresent, number3);
        this.f212515c.mo28211k(tVar.mo72526c().mo73762a(), "[NGA] StreamzUnderstandingAndFulfillmentLogger.onIntentExecuted", new C76989cg(this.f212514b, this.f212513a));
        this.f212514b.mo75579d(new C82478gr("NGA_WINNING_SPEECH_RECOGNITION", eVar2.f212903b));
        if (eVar2.f212907f) {
            this.f212514b.mo75579d(new C82479gs("NGA_WINNING_UNDERSTANDING", eVar2.f212904c, eVar2.f212905d));
            this.f212514b.mo75579d(new C82396dq("NGA_ON_DEVICE_FULFILLMENT", eVar2.f212902a));
            this.f212514b.mo75579d(new C82477gq("NGA_WINNING_FULFILLER", eVar2.f212906e));
            return;
        }
        this.f212514b.mo75579d(new C82330be("NGA_CLOUD_REASON", eVar2.f212908g));
    }

    /* renamed from: d */
    public final /* synthetic */ void mo71391d(C76401e eVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo71392e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo71393f() {
    }
}
