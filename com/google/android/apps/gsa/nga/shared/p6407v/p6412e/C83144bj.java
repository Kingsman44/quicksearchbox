package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80414af;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80417ai;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bj */
/* compiled from: PG */
public final /* synthetic */ class C83144bj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80414af f226754a;

    public /* synthetic */ C83144bj(C80414af afVar) {
        this.f226754a = afVar;
    }

    public final void accept(Object obj) {
        C80414af afVar = this.f226754a;
        C61752n nVar = (C61752n) obj;
        afVar.copyOnWrite();
        C80417ai aiVar = (C80417ai) afVar.instance;
        C80417ai aiVar2 = C80417ai.f220707g;
        nVar.getClass();
        aiVar.f220711c = nVar;
        aiVar.f220709a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
