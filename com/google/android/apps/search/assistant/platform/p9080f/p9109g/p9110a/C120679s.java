package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33459m;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import p3186j$.util.function.Consumer;
import p5535j.p5536a.p5545c.p5548c.C71143c;
import p5535j.p5536a.p5545c.p5548c.C71151e;
import p5535j.p5536a.p5545c.p5548c.C71152f;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.s */
/* compiled from: PG */
public final /* synthetic */ class C120679s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C120682v f335647a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f335648b;

    public /* synthetic */ C120679s(C120682v vVar, C60870cx cxVar) {
        this.f335647a = vVar;
        this.f335648b = cxVar;
    }

    public final void accept(Object obj) {
        C120682v vVar = this.f335647a;
        C33461o oVar = (C33461o) obj;
        this.f335648b.cancel(false);
        int a = oVar.mo38842a();
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            if (!oVar.mo38855c().mo38864b()) {
                vVar.f335654d.f335622b.mo19974a(C37176a.f96924bp);
            }
            vVar.f335654d.mo104870a(C62722b.OK);
        } else if (i == 1) {
            C120661b bVar = vVar.f335654d;
            Throwable a2 = oVar.mo38851b().mo38859a();
            C34834b bVar2 = C34830d.m63595b(a2).f92362c;
            if (bVar2 == null) {
                bVar2 = C34834b.f92401c;
            }
            C34819a b = C34819a.m63579b(bVar2);
            if (C34830d.m63596c(b)) {
                C59104x d = C120661b.f335620a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ConvEng.Interaction");
                C59052c cVar = (C59052c) ((C59052c) d).mo56382g(a2);
                cVar.mo56378ag(C38505d.f101864b, 184058178);
                ((C59052c) cVar.mo56372aa(35550)).mo56352E("Utterance failed with low quality classification, code: %s:%s", b.mo39522e(), b.mo39520a());
            }
            C37215b bVar3 = bVar.f335622b;
            C37252a a3 = C37176a.f96815M.mo40803a(b.mo39520a(), b.mo39522e());
            C62940bt btVar = C71152f.f189814g;
            C71143c cVar2 = (C71143c) C71152f.f189813f.createBuilder();
            cVar2.copyOnWrite();
            C71152f fVar = (C71152f) cVar2.instance;
            fVar.f189820e = ((C71151e) bVar.f335623c.get()).f189812g;
            fVar.f189816a |= 8;
            ((C37253b) a3).mo40792p(btVar, (C71152f) cVar2.build());
            bVar3.mo19974a(a3);
        } else if (i != 2) {
            int a4 = oVar.mo38842a();
            String a5 = C33459m.m62032a(a4);
            if (a4 != 0) {
                throw new AssertionError(a5);
            }
            throw null;
        } else {
            vVar.f335654d.mo104870a(C62722b.CANCELLED);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
