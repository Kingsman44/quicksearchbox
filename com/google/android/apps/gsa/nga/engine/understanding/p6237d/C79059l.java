package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.nlp.p4735b.p4736a.p4738b.C62829k;
import com.google.nlp.p4735b.p4736a.p4738b.C62830l;
import com.google.nlp.p4735b.p4736a.p4738b.C62831m;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.l */
/* compiled from: PG */
public final /* synthetic */ class C79059l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79073z f217403a;

    public /* synthetic */ C79059l(C79073z zVar) {
        this.f217403a = zVar;
    }

    public final void accept(Object obj) {
        C79073z zVar = this.f217403a;
        C62831m mVar = (C62831m) obj;
        boolean z = true;
        if ((mVar.f169668a & 4) != 0) {
            C62829k kVar = mVar.f169671d;
            if (kVar == null) {
                kVar = C62829k.f169662b;
            }
            if (!zVar.mo73798b(kVar)) {
                z = false;
            }
        }
        Collection.EL.stream(mVar.f169670c).filter(new C79072y(zVar, z)).forEach(new C79060m(zVar, (C62830l) Map.EL.computeIfAbsent(zVar.f217422a, mVar.f169669b, new C79071x(mVar)), mVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
