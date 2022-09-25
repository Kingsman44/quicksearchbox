package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82860dc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82861dd;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bv */
/* compiled from: PG */
public final /* synthetic */ class C83156bv implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82860dc f226767a;

    public /* synthetic */ C83156bv(C82860dc dcVar) {
        this.f226767a = dcVar;
    }

    public final void accept(Object obj) {
        C82860dc dcVar = this.f226767a;
        C80513b bVar = (C80513b) obj;
        dcVar.copyOnWrite();
        C82861dd ddVar = (C82861dd) dcVar.instance;
        C82861dd ddVar2 = C82861dd.f225934g;
        bVar.getClass();
        ddVar.f225939d = bVar;
        ddVar.f225936a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
