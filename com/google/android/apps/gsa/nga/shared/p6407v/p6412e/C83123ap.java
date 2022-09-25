package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80435o;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80436p;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.ap */
/* compiled from: PG */
public final /* synthetic */ class C83123ap implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80435o f226734a;

    public /* synthetic */ C83123ap(C80435o oVar) {
        this.f226734a = oVar;
    }

    public final void accept(Object obj) {
        C80435o oVar = this.f226734a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        oVar.copyOnWrite();
        C80436p pVar = (C80436p) oVar.instance;
        C80436p pVar2 = C80436p.f220766g;
        pVar.f220768a |= 64;
        pVar.f220773f = booleanValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
