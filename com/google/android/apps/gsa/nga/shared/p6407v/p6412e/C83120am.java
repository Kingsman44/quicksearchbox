package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80439s;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80441u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80442v;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.am */
/* compiled from: PG */
public final /* synthetic */ class C83120am implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80439s f226731a;

    public /* synthetic */ C83120am(C80439s sVar) {
        this.f226731a = sVar;
    }

    public final void accept(Object obj) {
        C80439s sVar = this.f226731a;
        sVar.copyOnWrite();
        C80442v vVar = (C80442v) sVar.instance;
        C80442v vVar2 = C80442v.f220789e;
        vVar.f220794d = ((C80441u) obj).f220788d;
        vVar.f220791a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
