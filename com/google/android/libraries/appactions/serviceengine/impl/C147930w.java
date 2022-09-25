package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.android.libraries.appactions.serviceengine.api.C147877j;
import com.google.assistant.p3944g.p3948b.p3949a.C52952q;
import com.google.assistant.p3944g.p3948b.p3949a.C52953r;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.w */
/* compiled from: PG */
public final /* synthetic */ class C147930w implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C147906ao f399008a;

    /* renamed from: b */
    public final /* synthetic */ C147877j f399009b;

    public /* synthetic */ C147930w(C147906ao aoVar, C147877j jVar) {
        this.f399008a = aoVar;
        this.f399009b = jVar;
    }

    public final Object call() {
        C147906ao aoVar = this.f399008a;
        C147877j jVar = this.f399009b;
        C52952q qVar = (C52952q) C52953r.f138840b.createBuilder();
        Optional map = jVar.mo124537c().map(new C147896ae(aoVar));
        Objects.requireNonNull(qVar);
        map.ifPresent(new C147899ah(qVar));
        return (C52953r) qVar.build();
    }
}
