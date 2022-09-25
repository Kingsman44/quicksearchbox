package com.google.android.apps.gsa.nga.engine.warmactions.call;

import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.y */
/* compiled from: PG */
public final /* synthetic */ class C79538y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79503aa f218254a;

    public /* synthetic */ C79538y(C79503aa aaVar) {
        this.f218254a = aaVar;
    }

    public final void accept(Object obj) {
        ((C79497a) this.f218254a).f218197c = Optional.m71637of((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
