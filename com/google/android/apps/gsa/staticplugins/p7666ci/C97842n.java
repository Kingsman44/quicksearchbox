package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.n */
/* compiled from: PG */
public final /* synthetic */ class C97842n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C97846r f273209a;

    public /* synthetic */ C97842n(C97846r rVar) {
        this.f273209a = rVar;
    }

    public final void accept(Object obj) {
        C97846r rVar = this.f273209a;
        String str = (String) obj;
        Instant a = rVar.f273226i.mo57444a();
        if (!rVar.f273230m.equals(Instant.EPOCH)) {
            C59104x b = C97846r.f273217a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
            ((C59052c) ((C59052c) b).mo56372aa(30237)).mo56354G("#logLocalCacheRefreshInterval(): currentTime %s, packageName %s", a, str);
            Object[] objArr = {str};
            ((C19569f) rVar.f273229l.f102883bN.mo6453a()).mo24824b((double) Duration.between(rVar.f273230m, a).toMillis(), objArr);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
