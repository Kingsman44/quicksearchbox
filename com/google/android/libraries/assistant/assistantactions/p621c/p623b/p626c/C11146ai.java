package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3921j.C52397qf;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.ai */
/* compiled from: PG */
public final /* synthetic */ class C11146ai implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50947as f36514a;

    public /* synthetic */ C11146ai(C50947as asVar) {
        this.f36514a = asVar;
    }

    public final void accept(Object obj) {
        C50947as asVar = this.f36514a;
        C52397qf qfVar = (C52397qf) obj;
        asVar.copyOnWrite();
        C50954az azVar = (C50954az) asVar.instance;
        C50954az azVar2 = C50954az.f132639n;
        qfVar.getClass();
        azVar.f132643c = qfVar;
        azVar.f132642b = 6;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
