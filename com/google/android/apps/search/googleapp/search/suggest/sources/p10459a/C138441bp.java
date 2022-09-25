package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.C64383m;
import com.google.protos.p4948ba.C64384n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bp */
/* compiled from: PG */
public final /* synthetic */ class C138441bp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376571a;

    public /* synthetic */ C138441bp(C138445bt btVar) {
        this.f376571a = btVar;
    }

    public final C60870cx apply(Object obj) {
        C138445bt btVar = this.f376571a;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            for (C138030av avVar : ((C138678v) optional.get()).f377199c) {
                if (new C62963cj(avVar.f375542e, C138030av.f375535f).containsAll(C138445bt.f376579b)) {
                    C54228aq aqVar = avVar.f375543g;
                    if (aqVar == null) {
                        aqVar = C54228aq.f142328w;
                    }
                    C54216ae aeVar = aqVar.f142334f;
                    if (aeVar == null) {
                        aeVar = C54216ae.f142285C;
                    }
                    C64384n nVar = aeVar.f142313x;
                    if (nVar == null) {
                        nVar = C64384n.f174622b;
                    }
                    C64383m a = C64383m.m96397a(nVar.f174624a);
                    if (a == null) {
                        a = C64383m.CATEGORY_UNSPECIFIED;
                    }
                    if (a == C64383m.SIGNED_OUT_PQ_BASED) {
                        C60870cx a2 = btVar.f376585h.mo114052a();
                        C60870cx b = btVar.f376585h.mo114053b();
                        C47633f a3 = C47636i.m84746e(a2, b).mo51518a(C47810es.m84978r(new C138427bb(a2, b, optional)), btVar.f376583f);
                        C138428bc bcVar = C138428bc.f376548a;
                        return C60846c.m92878g(a3, Exception.class, C47810es.m84963c(bcVar), btVar.f376583f);
                    }
                }
            }
        }
        return C60856cj.m92900i(optional);
    }
}
