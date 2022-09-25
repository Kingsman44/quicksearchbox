package com.google.android.apps.gsa.staticplugins.opa.worker.p8610e;

import com.google.assistant.p3897e.p3912f.C51207b;
import com.google.protos.p4985f.p4986a.C64696f;
import com.google.protos.p4985f.p4986a.C64698h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.e.e */
/* compiled from: PG */
public final /* synthetic */ class C114287e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64696f f316915a;

    public /* synthetic */ C114287e(C64696f fVar) {
        this.f316915a = fVar;
    }

    public final void accept(Object obj) {
        C64696f fVar = this.f316915a;
        C51207b bVar = (C51207b) obj;
        fVar.copyOnWrite();
        C64698h hVar = (C64698h) fVar.instance;
        C64698h hVar2 = C64698h.f175368o;
        bVar.getClass();
        hVar.f175377h = bVar;
        hVar.f175370a |= 128;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
