package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C75765ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C75770ag f210257a;

    /* renamed from: b */
    public final /* synthetic */ Optional f210258b;

    public /* synthetic */ C75765ab(C75770ag agVar, Optional optional) {
        this.f210257a = agVar;
        this.f210258b = optional;
    }

    public final void accept(Object obj) {
        C75770ag agVar = this.f210257a;
        ((C75786o) obj).mo71890e(agVar, agVar.f210269g, (C75891l) this.f210258b.get());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
