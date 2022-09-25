package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.p5913am.p5922i.C74924q;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.aw */
/* compiled from: PG */
public final /* synthetic */ class C79667aw implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79690bs f218489a;

    public /* synthetic */ C79667aw(C79690bs bsVar) {
        this.f218489a = bsVar;
    }

    public final void accept(Object obj) {
        String.format("Executed query: '%s'", new Object[]{this.f218489a.mo74199g()});
        ((C74924q) obj).mo71304a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
