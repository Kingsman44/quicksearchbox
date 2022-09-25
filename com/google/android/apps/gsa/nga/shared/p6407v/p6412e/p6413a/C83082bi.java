package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82984hs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C83082bi implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82984hs f226692a;

    public /* synthetic */ C83082bi(C82984hs hsVar) {
        this.f226692a = hsVar;
    }

    public final void accept(Object obj) {
        C82984hs hsVar = this.f226692a;
        C80401n nVar = (C80401n) obj;
        hsVar.copyOnWrite();
        C82988hw hwVar = (C82988hw) hsVar.instance;
        C82988hw hwVar2 = C82988hw.f226443y;
        nVar.getClass();
        hwVar.f226470x = nVar;
        hwVar.f226448b |= 512;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
