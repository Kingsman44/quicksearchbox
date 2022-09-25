package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3921j.C52393qb;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.am */
/* compiled from: PG */
public final /* synthetic */ class C11150am implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50947as f36518a;

    public /* synthetic */ C11150am(C50947as asVar) {
        this.f36518a = asVar;
    }

    public final void accept(Object obj) {
        C50947as asVar = this.f36518a;
        C52393qb qbVar = (C52393qb) obj;
        asVar.copyOnWrite();
        C50954az azVar = (C50954az) asVar.instance;
        C50954az azVar2 = C50954az.f132639n;
        qbVar.getClass();
        azVar.f132643c = qbVar;
        azVar.f132642b = 3;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
