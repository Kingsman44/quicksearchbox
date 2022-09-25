package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11707d;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.j */
/* compiled from: PG */
public final /* synthetic */ class C11739j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C11740k f37792a;

    public /* synthetic */ C11739j(C11740k kVar) {
        this.f37792a = kVar;
    }

    public final void accept(Object obj) {
        C11707d dVar = (C11707d) obj;
        C70862aj ajVar = this.f37792a.f37793a;
        if (ajVar != null) {
            ajVar.mo20123c(dVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
