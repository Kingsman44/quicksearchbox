package com.google.android.apps.gsa.staticplugins.opa.ambient.p8261f;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106521b;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.f.b */
/* compiled from: PG */
public final /* synthetic */ class C107037b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107039d f298067a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f298068b;

    public /* synthetic */ C107037b(C107039d dVar, MessageLite messageLite) {
        this.f298067a = dVar;
        this.f298068b = messageLite;
    }

    public final void accept(Object obj) {
        C106521b bVar = (C106521b) obj;
        C80905at.m128763g(bVar.mo95563a(), new C107038c(this.f298067a, (MessageLite) bVar.mo95569b().mo95559d().cast(this.f298068b)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
