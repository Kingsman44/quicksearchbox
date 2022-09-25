package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80296ar;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80297as;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80298at;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.l */
/* compiled from: PG */
public final /* synthetic */ class C77354l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80399l f213322a;

    public /* synthetic */ C77354l(C80399l lVar) {
        this.f213322a = lVar;
    }

    public final void accept(Object obj) {
        C80399l lVar = this.f213322a;
        int i = C77355m.f213323a;
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        C80296ar arVar = (C80296ar) C80298at.f220368b.createBuilder();
        arVar.copyOnWrite();
        ((C80298at) arVar.instance).f220370a = ((C80297as) obj).getNumber();
        aoVar.copyOnWrite();
        C80295aq aqVar = (C80295aq) aoVar.instance;
        C80298at atVar = (C80298at) arVar.build();
        atVar.getClass();
        aqVar.f220360b = atVar;
        aqVar.f220359a = 17;
        C81442m.m129555q(lVar, aoVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
