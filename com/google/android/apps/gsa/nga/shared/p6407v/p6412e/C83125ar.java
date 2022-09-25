package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80435o;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80436p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80442v;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.ar */
/* compiled from: PG */
public final /* synthetic */ class C83125ar implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80435o f226736a;

    public /* synthetic */ C83125ar(C80435o oVar) {
        this.f226736a = oVar;
    }

    public final void accept(Object obj) {
        C80435o oVar = this.f226736a;
        C80442v vVar = (C80442v) obj;
        oVar.copyOnWrite();
        C80436p pVar = (C80436p) oVar.instance;
        C80436p pVar2 = C80436p.f220766g;
        vVar.getClass();
        pVar.f220772e = vVar;
        pVar.f220768a |= 16;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
