package com.google.android.apps.gsa.staticplugins.opa.worker.p8610e;

import com.google.assistant.p3897e.p3912f.C51222q;
import com.google.protos.p4985f.p4986a.C64696f;
import com.google.protos.p4985f.p4986a.C64698h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.e.d */
/* compiled from: PG */
public final /* synthetic */ class C114286d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64696f f316914a;

    public /* synthetic */ C114286d(C64696f fVar) {
        this.f316914a = fVar;
    }

    public final void accept(Object obj) {
        C64696f fVar = this.f316914a;
        C51222q qVar = (C51222q) obj;
        fVar.copyOnWrite();
        C64698h hVar = (C64698h) fVar.instance;
        C64698h hVar2 = C64698h.f175368o;
        qVar.getClass();
        hVar.f175376g = qVar;
        hVar.f175370a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
