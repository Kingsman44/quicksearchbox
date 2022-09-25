package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80439s;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80442v;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.ah */
/* compiled from: PG */
public final /* synthetic */ class C83115ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80439s f226726a;

    public /* synthetic */ C83115ah(C80439s sVar) {
        this.f226726a = sVar;
    }

    public final void accept(Object obj) {
        C80439s sVar = this.f226726a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        sVar.copyOnWrite();
        C80442v vVar = (C80442v) sVar.instance;
        C80442v vVar2 = C80442v.f220789e;
        vVar.f220791a |= 1;
        vVar.f220792b = booleanValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
