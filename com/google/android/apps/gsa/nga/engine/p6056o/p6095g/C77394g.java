package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.g */
/* compiled from: PG */
public final /* synthetic */ class C77394g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80371a f213411a;

    public /* synthetic */ C77394g(C80371a aVar) {
        this.f213411a = aVar;
    }

    public final void accept(Object obj) {
        C80371a aVar = this.f213411a;
        C80377g gVar = (C80377g) obj;
        aVar.copyOnWrite();
        C80386p pVar = C80386p.f220578g;
        gVar.getClass();
        ((C80386p) aVar.instance).f220583d = gVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
