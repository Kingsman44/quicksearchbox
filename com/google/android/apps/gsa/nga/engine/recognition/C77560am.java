package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82958gt;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82960gv;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82961gw;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.am */
/* compiled from: PG */
public final /* synthetic */ class C77560am implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82958gt f213701a;

    public /* synthetic */ C77560am(C82958gt gtVar) {
        this.f213701a = gtVar;
    }

    public final void accept(Object obj) {
        C82958gt gtVar = this.f213701a;
        gtVar.copyOnWrite();
        C82961gw gwVar = (C82961gw) gtVar.instance;
        C82961gw gwVar2 = C82961gw.f226336e;
        gwVar.f226340c = ((C82960gv) obj).f226335f;
        gwVar.f226338a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
