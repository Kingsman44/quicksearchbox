package com.google.android.apps.gsa.staticplugins.opa.worker.p8610e;

import com.google.protos.p4985f.p4986a.C64696f;
import com.google.protos.p4985f.p4986a.C64698h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.e.a */
/* compiled from: PG */
public final /* synthetic */ class C114283a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64696f f316911a;

    public /* synthetic */ C114283a(C64696f fVar) {
        this.f316911a = fVar;
    }

    public final void accept(Object obj) {
        C64696f fVar = this.f316911a;
        String str = (String) obj;
        fVar.copyOnWrite();
        C64698h hVar = (C64698h) fVar.instance;
        C64698h hVar2 = C64698h.f175368o;
        str.getClass();
        hVar.f175370a |= 8;
        hVar.f175374e = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
