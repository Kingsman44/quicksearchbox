package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80512a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C83062ap implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80512a f226672a;

    public /* synthetic */ C83062ap(C80512a aVar) {
        this.f226672a = aVar;
    }

    public final void accept(Object obj) {
        C80512a aVar = this.f226672a;
        C61752n nVar = (C61752n) obj;
        aVar.copyOnWrite();
        C80513b bVar = C80513b.f221014e;
        nVar.getClass();
        ((C80513b) aVar.instance).f221016a = nVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
