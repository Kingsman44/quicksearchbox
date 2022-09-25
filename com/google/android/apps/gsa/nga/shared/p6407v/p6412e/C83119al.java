package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82846cp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82847cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.al */
/* compiled from: PG */
public final /* synthetic */ class C83119al implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82846cp f226730a;

    public /* synthetic */ C83119al(C82846cp cpVar) {
        this.f226730a = cpVar;
    }

    public final void accept(Object obj) {
        C82846cp cpVar = this.f226730a;
        C80434n nVar = (C80434n) obj;
        cpVar.copyOnWrite();
        C82847cq cqVar = (C82847cq) cpVar.instance;
        C82847cq cqVar2 = C82847cq.f225903d;
        nVar.getClass();
        cqVar.f225906b = nVar;
        cqVar.f225905a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
