package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80392e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.e */
/* compiled from: PG */
public final /* synthetic */ class C83086e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80392e f226696a;

    public /* synthetic */ C83086e(C80392e eVar) {
        this.f226696a = eVar;
    }

    public final void accept(Object obj) {
        C80392e eVar = this.f226696a;
        C80295aq aqVar = (C80295aq) obj;
        eVar.copyOnWrite();
        C80394g gVar = (C80394g) eVar.instance;
        C80394g gVar2 = C80394g.f220645c;
        aqVar.getClass();
        gVar.f220648b = aqVar;
        gVar.f220647a = 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
