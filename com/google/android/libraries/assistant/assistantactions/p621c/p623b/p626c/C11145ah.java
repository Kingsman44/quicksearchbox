package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3921j.C52403ql;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.ah */
/* compiled from: PG */
public final /* synthetic */ class C11145ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50947as f36513a;

    public /* synthetic */ C11145ah(C50947as asVar) {
        this.f36513a = asVar;
    }

    public final void accept(Object obj) {
        C50947as asVar = this.f36513a;
        C52403ql qlVar = (C52403ql) obj;
        asVar.copyOnWrite();
        C50954az azVar = (C50954az) asVar.instance;
        C50954az azVar2 = C50954az.f132639n;
        qlVar.getClass();
        azVar.f132643c = qlVar;
        azVar.f132642b = 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
