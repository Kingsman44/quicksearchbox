package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C75766ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C75770ag f210259a;

    /* renamed from: b */
    public final /* synthetic */ Optional f210260b;

    public /* synthetic */ C75766ac(C75770ag agVar, Optional optional) {
        this.f210259a = agVar;
        this.f210260b = optional;
    }

    public final void accept(Object obj) {
        C75770ag agVar = this.f210259a;
        ((C75786o) obj).mo71890e(agVar, agVar.f210269g, (C75891l) this.f210260b.get());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
