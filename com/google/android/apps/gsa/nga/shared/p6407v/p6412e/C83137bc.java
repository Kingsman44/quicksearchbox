package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80433m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80438r;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bc */
/* compiled from: PG */
public final /* synthetic */ class C83137bc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80433m f226747a;

    public /* synthetic */ C83137bc(C80433m mVar) {
        this.f226747a = mVar;
    }

    public final void accept(Object obj) {
        C80433m mVar = this.f226747a;
        mVar.copyOnWrite();
        C80434n nVar = (C80434n) mVar.instance;
        C80434n nVar2 = C80434n.f220756h;
        nVar.f220763f = ((C80438r) obj).f220782f;
        nVar.f220758a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
