package com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8574a;

import com.google.assistant.p3781ad.p3789d.p3791b.C48692b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48722d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.r.a.b */
/* compiled from: PG */
public final /* synthetic */ class C113223b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48692b f313560a;

    public /* synthetic */ C113223b(C48692b bVar) {
        this.f313560a = bVar;
    }

    public final void accept(Object obj) {
        C48692b bVar = this.f313560a;
        String str = (String) obj;
        bVar.copyOnWrite();
        C48722d dVar = (C48722d) bVar.instance;
        C48722d dVar2 = C48722d.f126069m;
        str.getClass();
        dVar.f126071a |= 256;
        dVar.f126082l = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
