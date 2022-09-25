package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.assistant.soda.p1605d.C19273k;
import com.google.android.libraries.search.p3055n.C39662cp;
import com.google.android.libraries.search.p3055n.C39664cr;
import com.google.android.libraries.search.p3055n.p3056a.C39241a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C66917eg;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.b.b.bk */
/* compiled from: PG */
final class C39317bk implements C19347o {

    /* renamed from: a */
    final /* synthetic */ C70862aj f103558a;

    /* renamed from: b */
    final /* synthetic */ C39318bl f103559b;

    public C39317bk(C39318bl blVar, C70862aj ajVar) {
        this.f103559b = blVar;
        this.f103558a = ajVar;
    }

    /* renamed from: t */
    public final void mo23782t(C67087ko koVar) {
        C39318bl blVar = this.f103559b;
        if (!blVar.f103562c) {
            if ((koVar.f182368a & C89885b.HTTP_VALUE) != 0 && blVar.f103563d.f103571h.isPresent()) {
                C19273k kVar = (C19273k) this.f103559b.f103563d.f103571h.get();
                C66917eg egVar = koVar.f182379l;
                if (egVar == null) {
                    egVar = C66917eg.f181904d;
                }
                kVar.mo24436a(egVar);
            }
            int i = koVar.f182368a;
            if ((i & 32) == 0 && (i & C89885b.HTTP_VALUE) == 0) {
                C58976aa aaVar = C58975e.f156826a;
            }
            if (this.f103559b.f103563d.f103572i.isPresent() && ((C39241a) this.f103559b.f103563d.f103572i.get()).mo41746e()) {
                C39319bm bmVar = this.f103559b.f103563d;
                C60870cx cxVar = bmVar.f103574k;
                C39316bj bjVar = new C39316bj(this, koVar);
                bmVar.f103574k = C60922j.m93045h(cxVar, C47810es.m84966f(bjVar), bmVar.f103566c);
                C46459k.m82829b(this.f103559b.f103563d.f103574k, "Failed to push SodaEvent to ArtModelService!", new Object[0]);
            }
            this.f103559b.f103563d.mo41773f(this.f103558a, koVar);
            return;
        }
        C59104x d = C39319bm.f103564a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
        ((C59052c) ((C59052c) d).mo56372aa(53443)).mo56386p("SodaEvent dropped due to gRPC disconnected");
    }

    /* renamed from: u */
    public final /* synthetic */ void mo23783u() {
    }

    /* renamed from: v */
    public final void mo23784v(C19243af afVar) {
        C39280aa aaVar = this.f103559b.f103561b;
        if (aaVar.f103491v != 3) {
            C59052c cVar = (C59052c) ((C59052c) C39280aa.f103467a.mo56226d()).mo56372aa(53440);
            int i = aaVar.f103491v;
            String a = C39351z.m68756a(i);
            if (i != 0) {
                cVar.mo56389s("onAsrStopped called at unexpected time. The expected state is STOPPING but the actual state is %s.", a);
            } else {
                throw null;
            }
        }
        ((C59052c) ((C59052c) C39280aa.f103467a.mo56224b()).mo56372aa(53439)).mo56386p("Soda has stopped and is in the idle state again.");
        aaVar.mo41766n(1);
        C59104x b = C39319bm.f103564a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
        ((C59052c) ((C59052c) b).mo56372aa(53444)).mo56389s("Sending SodaStopReason %s back to client ", afVar.name());
        C39318bl blVar = this.f103559b;
        if (blVar.f103562c) {
            C59104x d = C39319bm.f103564a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
            ((C59052c) ((C59052c) d).mo56372aa(53445)).mo56386p("SodaStopReason dropped due to gRPC disconnected");
            return;
        }
        if (blVar.f103563d.f103572i.isPresent() && ((C39241a) this.f103559b.f103563d.f103572i.get()).mo41746e()) {
            C39319bm bmVar = this.f103559b.f103563d;
            C60870cx cxVar = bmVar.f103574k;
            C39315bi biVar = new C39315bi(this);
            bmVar.f103574k = C60922j.m93045h(cxVar, C47810es.m84966f(biVar), bmVar.f103566c);
            C46459k.m82829b(this.f103559b.f103563d.f103574k, "Failed to disconnect from ArtModelService!", new Object[0]);
        }
        C39319bm bmVar2 = this.f103559b.f103563d;
        C70862aj ajVar = this.f103558a;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C62940bt btVar = C39664cr.f104411d;
        C39662cp cpVar = (C39662cp) C39664cr.f104410c.createBuilder();
        int i2 = 2;
        if (afVar.ordinal() != 2) {
            i2 = 1;
        }
        cpVar.copyOnWrite();
        C39664cr crVar = (C39664cr) cpVar.instance;
        crVar.f104414b = i2 - 1;
        crVar.f104413a = 1 | crVar.f104413a;
        knVar.mo58885m(btVar, (C39664cr) cpVar.build());
        bmVar2.mo41773f(ajVar, (C67087ko) knVar.build());
    }
}
