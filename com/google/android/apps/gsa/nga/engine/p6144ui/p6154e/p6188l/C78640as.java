package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.engine.p5978b.p5989g.C75289x;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d.C78161l;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.as */
/* compiled from: PG */
public final /* synthetic */ class C78640as implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78641at f216534a;

    public /* synthetic */ C78640as(C78641at atVar) {
        this.f216534a = atVar;
    }

    public final void accept(Object obj) {
        C78641at atVar = this.f216534a;
        C75289x xVar = (C75289x) obj;
        atVar.f216535a.mo73197a(xVar.mo71643b());
        C78161l lVar = atVar.f216536b;
        C83349aj.m132647b(lVar.f215216b, lVar.f215215a, Optional.m71637of(xVar), "transcription");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
