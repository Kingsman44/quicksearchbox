package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.engine.understanding.C78980ag;
import com.google.android.apps.gsa.nga.engine.understanding.C79008c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.u */
/* compiled from: PG */
public final /* synthetic */ class C79038u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78980ag f217351a;

    public /* synthetic */ C79038u(C78980ag agVar) {
        this.f217351a = agVar;
    }

    public final void accept(Object obj) {
        ((C79008c) this.f217351a).f217295a = Optional.m71637of((C80513b) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
