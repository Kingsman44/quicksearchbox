package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80414af;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80417ai;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bh */
/* compiled from: PG */
public final /* synthetic */ class C83142bh implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80414af f226752a;

    public /* synthetic */ C83142bh(C80414af afVar) {
        this.f226752a = afVar;
    }

    public final void accept(Object obj) {
        C80414af afVar = this.f226752a;
        String str = (String) obj;
        afVar.copyOnWrite();
        C80417ai aiVar = (C80417ai) afVar.instance;
        C80417ai aiVar2 = C80417ai.f220707g;
        str.getClass();
        aiVar.f220709a |= 1;
        aiVar.f220710b = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
