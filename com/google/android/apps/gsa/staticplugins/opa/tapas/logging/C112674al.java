package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.p4140ba.p4147b.p4148a.p4149a.C54937b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.al */
/* compiled from: PG */
public final /* synthetic */ class C112674al implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C19087s f312295a;

    public /* synthetic */ C112674al(C19087s sVar) {
        this.f312295a = sVar;
    }

    public final void accept(Object obj) {
        C19087s sVar = this.f312295a;
        C54937b bVar = (C54937b) obj;
        sVar.copyOnWrite();
        C19088t tVar = (C19088t) sVar.instance;
        C19088t tVar2 = C19088t.f53533p;
        bVar.getClass();
        tVar.f53539e = bVar;
        tVar.f53535a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
