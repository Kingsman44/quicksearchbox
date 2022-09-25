package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80391d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.az */
/* compiled from: PG */
public final /* synthetic */ class C83072az implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80399l f226682a;

    public /* synthetic */ C83072az(C80399l lVar) {
        this.f226682a = lVar;
    }

    public final void accept(Object obj) {
        C80399l lVar = this.f226682a;
        C80391d dVar = (C80391d) obj;
        lVar.copyOnWrite();
        C80401n nVar = C80401n.f220656k;
        dVar.getClass();
        ((C80401n) lVar.instance).f220662e = dVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
