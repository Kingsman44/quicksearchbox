package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.al */
/* compiled from: PG */
public final /* synthetic */ class C11149al implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50947as f36517a;

    public /* synthetic */ C11149al(C50947as asVar) {
        this.f36517a = asVar;
    }

    public final void accept(Object obj) {
        C50947as asVar = this.f36517a;
        String str = (String) obj;
        asVar.copyOnWrite();
        C50954az azVar = (C50954az) asVar.instance;
        C50954az azVar2 = C50954az.f132639n;
        str.getClass();
        azVar.f132641a |= 2;
        azVar.f132645e = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
