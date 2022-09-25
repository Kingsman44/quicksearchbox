package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82860dc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82861dd;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bn */
/* compiled from: PG */
public final /* synthetic */ class C83148bn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82860dc f226759a;

    public /* synthetic */ C83148bn(C82860dc dcVar) {
        this.f226759a = dcVar;
    }

    public final void accept(Object obj) {
        C82860dc dcVar = this.f226759a;
        String str = (String) obj;
        dcVar.copyOnWrite();
        C82861dd ddVar = (C82861dd) dcVar.instance;
        C82861dd ddVar2 = C82861dd.f225934g;
        str.getClass();
        ddVar.f225936a |= 1;
        ddVar.f225937b = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
