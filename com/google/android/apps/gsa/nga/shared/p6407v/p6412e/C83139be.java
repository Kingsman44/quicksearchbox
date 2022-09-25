package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80436p;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82846cp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82847cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.be */
/* compiled from: PG */
public final /* synthetic */ class C83139be implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82846cp f226749a;

    public /* synthetic */ C83139be(C82846cp cpVar) {
        this.f226749a = cpVar;
    }

    public final void accept(Object obj) {
        C82846cp cpVar = this.f226749a;
        C80436p pVar = (C80436p) obj;
        cpVar.copyOnWrite();
        C82847cq cqVar = (C82847cq) cpVar.instance;
        C82847cq cqVar2 = C82847cq.f225903d;
        pVar.getClass();
        cqVar.f225907c = pVar;
        cqVar.f225905a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
