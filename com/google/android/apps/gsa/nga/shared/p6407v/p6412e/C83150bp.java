package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82860dc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82861dd;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bp */
/* compiled from: PG */
public final /* synthetic */ class C83150bp implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82860dc f226761a;

    public /* synthetic */ C83150bp(C82860dc dcVar) {
        this.f226761a = dcVar;
    }

    public final void accept(Object obj) {
        C82860dc dcVar = this.f226761a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        dcVar.copyOnWrite();
        C82861dd ddVar = (C82861dd) dcVar.instance;
        C82861dd ddVar2 = C82861dd.f225934g;
        ddVar.f225936a |= 2;
        ddVar.f225938c = booleanValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
