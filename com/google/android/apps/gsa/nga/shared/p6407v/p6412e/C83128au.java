package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80433m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.au */
/* compiled from: PG */
public final /* synthetic */ class C83128au implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80433m f226739a;

    public /* synthetic */ C83128au(C80433m mVar) {
        this.f226739a = mVar;
    }

    public final void accept(Object obj) {
        C80433m mVar = this.f226739a;
        C80413ae aeVar = (C80413ae) obj;
        mVar.copyOnWrite();
        C80434n nVar = (C80434n) mVar.instance;
        C80434n nVar2 = C80434n.f220756h;
        aeVar.getClass();
        nVar.f220759b = aeVar;
        nVar.f220758a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
