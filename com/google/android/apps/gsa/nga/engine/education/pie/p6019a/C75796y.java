package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import com.google.android.apps.gsa.p8883x.C118826c;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.y */
/* compiled from: PG */
public final /* synthetic */ class C75796y implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C75770ag f210355a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f210356b;

    public /* synthetic */ C75796y(C75770ag agVar, Consumer consumer) {
        this.f210355a = agVar;
        this.f210356b = consumer;
    }

    public final Object call() {
        C75770ag agVar = this.f210355a;
        Consumer consumer = this.f210356b;
        synchronized (agVar.f210268f) {
            Collection.EL.stream(agVar.f210268f).forEach(consumer);
        }
        return C118826c.f331422a;
    }
}
