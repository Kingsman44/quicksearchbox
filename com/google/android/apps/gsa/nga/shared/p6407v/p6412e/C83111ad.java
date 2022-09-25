package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80414af;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80416ah;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80417ai;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.ad */
/* compiled from: PG */
public final /* synthetic */ class C83111ad implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80414af f226722a;

    public /* synthetic */ C83111ad(C80414af afVar) {
        this.f226722a = afVar;
    }

    public final void accept(Object obj) {
        C80414af afVar = this.f226722a;
        C80416ah ahVar = (C80416ah) obj;
        afVar.copyOnWrite();
        C80417ai aiVar = (C80417ai) afVar.instance;
        C80417ai aiVar2 = C80417ai.f220707g;
        ahVar.getClass();
        aiVar.f220714f = ahVar;
        aiVar.f220709a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
