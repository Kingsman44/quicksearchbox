package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.p */
/* compiled from: PG */
public final /* synthetic */ class C83097p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82841ck f226706a;

    public /* synthetic */ C83097p(C82841ck ckVar) {
        this.f226706a = ckVar;
    }

    public final void accept(Object obj) {
        C82841ck ckVar = this.f226706a;
        C61752n nVar = (C61752n) obj;
        ckVar.copyOnWrite();
        C82843cm cmVar = C82843cm.f225889f;
        nVar.getClass();
        ((C82843cm) ckVar.instance).f225891a = nVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
