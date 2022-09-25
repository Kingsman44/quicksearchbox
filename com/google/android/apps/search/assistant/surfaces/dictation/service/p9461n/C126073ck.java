package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Arrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ck */
/* compiled from: PG */
public final /* synthetic */ class C126073ck implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347444a;

    public /* synthetic */ C126073ck(C126081cs csVar) {
        this.f347444a = csVar;
    }

    public final void run() {
        C60870cx cxVar;
        C126081cs csVar = this.f347444a;
        ((C59052c) ((C59052c) C126081cs.f347463a.mo56224b()).mo56372aa(36809)).mo56386p("#onKeyboardShown [SD]");
        csVar.f347474l.mo107359c();
        csVar.f347474l.mo107361e(csVar.f347469g.mo107338c().mo107329d());
        C126114dy dyVar = csVar.f347474l;
        C126038bc bcVar = csVar.f347470h;
        C125931t a = bcVar.f347357c.mo107202a();
        C60870cx d = C126309ar.m206525d(Arrays.asList(new C60870cx[]{bcVar.f347366l.mo107386d(), bcVar.f347365k.mo107385c(), bcVar.f347365k.mo107386d(), bcVar.f347367m.mo107386d(), bcVar.f347370p.mo107386d()}));
        if (!a.mo107192k()) {
            cxVar = C126309ar.m206527f(d, Optional.empty());
        } else {
            C125959aq aqVar = new C125959aq(a);
            C60870cx h = C60922j.m93045h(d, C47810es.m84966f(aqVar), bcVar.f347360f);
            C125960ar arVar = new C125960ar(bcVar);
            cxVar = C60922j.m93045h(h, C47810es.m84966f(arVar), bcVar.f347360f);
        }
        dyVar.mo107358b(cxVar);
    }
}
