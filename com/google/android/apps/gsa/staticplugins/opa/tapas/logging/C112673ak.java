package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ak */
/* compiled from: PG */
public final /* synthetic */ class C112673ak implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C19087s f312294a;

    public /* synthetic */ C112673ak(C19087s sVar) {
        this.f312294a = sVar;
    }

    public final void accept(Object obj) {
        C19087s sVar = this.f312294a;
        String str = (String) obj;
        sVar.copyOnWrite();
        C19088t tVar = (C19088t) sVar.instance;
        C19088t tVar2 = C19088t.f53533p;
        str.getClass();
        tVar.f53535a |= 2;
        tVar.f53537c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
