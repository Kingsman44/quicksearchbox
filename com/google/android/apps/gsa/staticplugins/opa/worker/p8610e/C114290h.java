package com.google.android.apps.gsa.staticplugins.opa.worker.p8610e;

import com.google.assistant.p3897e.p3912f.C51222q;
import com.google.p4184bj.p4193c.p4200e.C55995c;
import com.google.p4184bj.p4193c.p4200e.C55996d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.e.h */
/* compiled from: PG */
public final /* synthetic */ class C114290h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C55995c f316918a;

    public /* synthetic */ C114290h(C55995c cVar) {
        this.f316918a = cVar;
    }

    public final void accept(Object obj) {
        C55995c cVar = this.f316918a;
        C51222q qVar = (C51222q) obj;
        cVar.copyOnWrite();
        C55996d dVar = (C55996d) cVar.instance;
        C55996d dVar2 = C55996d.f149115h;
        qVar.getClass();
        dVar.f149123g = qVar;
        dVar.f149117a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
