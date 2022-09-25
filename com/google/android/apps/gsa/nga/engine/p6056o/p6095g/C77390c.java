package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80382l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80383m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80426f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.c */
/* compiled from: PG */
public final /* synthetic */ class C77390c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80382l f213408a;

    public /* synthetic */ C77390c(C80382l lVar) {
        this.f213408a = lVar;
    }

    public final void accept(Object obj) {
        C80382l lVar = this.f213408a;
        C80426f fVar = (C80426f) obj;
        lVar.copyOnWrite();
        C80383m mVar = C80383m.f220568e;
        fVar.getClass();
        ((C80383m) lVar.instance).f220572c = fVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
