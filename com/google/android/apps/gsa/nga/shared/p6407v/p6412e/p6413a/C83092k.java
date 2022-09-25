package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82837cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.k */
/* compiled from: PG */
public final /* synthetic */ class C83092k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82837cg f226701a;

    public /* synthetic */ C83092k(C82837cg cgVar) {
        this.f226701a = cgVar;
    }

    public final void accept(Object obj) {
        C82837cg cgVar = this.f226701a;
        C80388r rVar = (C80388r) obj;
        cgVar.copyOnWrite();
        C82838ch chVar = (C82838ch) cgVar.instance;
        C82838ch chVar2 = C82838ch.f225874h;
        rVar.getClass();
        chVar.f225880e = rVar;
        chVar.f225876a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
