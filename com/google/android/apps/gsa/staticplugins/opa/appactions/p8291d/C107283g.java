package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import com.google.assistant.p3861at.C49860br;
import com.google.assistant.p3861at.C49863bu;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.g */
/* compiled from: PG */
public final /* synthetic */ class C107283g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49860br f298592a;

    public /* synthetic */ C107283g(C49860br brVar) {
        this.f298592a = brVar;
    }

    public final void accept(Object obj) {
        C49860br brVar = this.f298592a;
        C51058ev evVar = (C51058ev) obj;
        brVar.copyOnWrite();
        C49863bu buVar = (C49863bu) brVar.instance;
        C49863bu buVar2 = C49863bu.f129572f;
        evVar.getClass();
        buVar.f129578e = evVar;
        buVar.f129574a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
