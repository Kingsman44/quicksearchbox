package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.br */
/* compiled from: PG */
public final /* synthetic */ class C77046br implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C77140u f212655a;

    /* renamed from: b */
    public final /* synthetic */ C82835ce f212656b;

    public /* synthetic */ C77046br(C77140u uVar, C82835ce ceVar) {
        this.f212655a = uVar;
        this.f212656b = ceVar;
    }

    public final void accept(Object obj) {
        C77140u uVar = this.f212655a;
        ((C83216f) obj).mo76648a(uVar.mo72412h(), this.f212656b, C83044e.f226656a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
