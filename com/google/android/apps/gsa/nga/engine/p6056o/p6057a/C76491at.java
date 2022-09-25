package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82837cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.at */
/* compiled from: PG */
public final /* synthetic */ class C76491at implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82837cg f211691a;

    public /* synthetic */ C76491at(C82837cg cgVar) {
        this.f211691a = cgVar;
    }

    public final void accept(Object obj) {
        C82837cg cgVar = this.f211691a;
        cgVar.copyOnWrite();
        C82838ch chVar = (C82838ch) cgVar.instance;
        C82838ch chVar2 = C82838ch.f225874h;
        chVar.f225879d = ((C82831ca) obj).f225800aL;
        chVar.f225876a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
