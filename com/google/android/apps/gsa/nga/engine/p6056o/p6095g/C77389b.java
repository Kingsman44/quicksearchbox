package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80381k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.b */
/* compiled from: PG */
public final /* synthetic */ class C77389b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80371a f213407a;

    public /* synthetic */ C77389b(C80371a aVar) {
        this.f213407a = aVar;
    }

    public final void accept(Object obj) {
        C80371a aVar = this.f213407a;
        C80381k kVar = (C80381k) obj;
        aVar.copyOnWrite();
        C80386p pVar = C80386p.f220578g;
        kVar.getClass();
        ((C80386p) aVar.instance).f220584e = kVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
