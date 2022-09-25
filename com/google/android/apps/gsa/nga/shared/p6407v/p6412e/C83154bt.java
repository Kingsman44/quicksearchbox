package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82860dc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82861dd;
import com.google.common.p4552o.afy;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bt */
/* compiled from: PG */
public final /* synthetic */ class C83154bt implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82860dc f226765a;

    public /* synthetic */ C83154bt(C82860dc dcVar) {
        this.f226765a = dcVar;
    }

    public final void accept(Object obj) {
        C82860dc dcVar = this.f226765a;
        dcVar.copyOnWrite();
        C82861dd ddVar = (C82861dd) dcVar.instance;
        C82861dd ddVar2 = C82861dd.f225934g;
        ddVar.f225940e = ((afy) obj).f158593g;
        ddVar.f225936a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
