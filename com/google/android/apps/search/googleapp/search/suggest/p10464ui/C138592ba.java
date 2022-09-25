package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138125g;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138587l;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138588m;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.aov;
import com.google.common.p4552o.apd;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4932ax.p4933a.C64269i;
import java.util.Collections;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.ba */
/* compiled from: PG */
final class C138592ba implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376929a;

    public C138592ba(C138558am amVar) {
        this.f376929a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138588m mVar = (C138588m) bVar;
        C138558am amVar = this.f376929a;
        C138030av avVar = mVar.f376924a;
        C138068y yVar = amVar.f376868i;
        C64269i iVar = mVar.f376925b;
        for (int i = 0; i < yVar.f375648d.size(); i++) {
            if (((C138030av) yVar.f375648d.get(i)).equals(avVar)) {
                C54228aq aqVar = avVar.f375543g;
                if (aqVar == null) {
                    aqVar = C54228aq.f142328w;
                }
                C54216ae aeVar = aqVar.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                C62971cq cqVar = aeVar.f142288B;
                int i2 = 0;
                while (true) {
                    if (i2 >= cqVar.size()) {
                        break;
                    } else if (((C64269i) cqVar.get(i2)).equals(iVar)) {
                        amt amt = yVar.f375647c;
                        aov a = C138068y.m224388a(avVar, i, i2);
                        amt.copyOnWrite();
                        apd apd = (apd) amt.instance;
                        apd apd2 = apd.f159555aA;
                        a.getClass();
                        apd.f159619k = a;
                        apd.f159583a |= 4096;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        apd b = amVar.f376868i.mo114113b(amVar.f376854A.mo114315d(), aod.ENHANCEMENT);
        amVar.mo114330h(avVar, b);
        String str = mVar.f376925b.f173767c;
        C69664n.m101060f(str, "enhancement.query");
        C138030av avVar2 = mVar.f376924a;
        C138125g gVar = (C138125g) C138127i.f375805b.createBuilder();
        gVar.mo114159a(Collections.unmodifiableMap(mVar.f376925b.f173768d));
        C62942bv build = gVar.build();
        C69664n.m101060f(build, "newBuilder()\n      .putA…ParamsMap)\n      .build()");
        return C47392e.m84229a(new C138587l(str, avVar2, (C138127i) build).mo114369a(b));
    }
}
