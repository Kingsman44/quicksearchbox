package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.av */
/* compiled from: PG */
public final /* synthetic */ class C11159av implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C11139ab f36530a;

    public /* synthetic */ C11159av(C11139ab abVar) {
        this.f36530a = abVar;
    }

    public final void accept(Object obj) {
        C11139ab abVar = this.f36530a;
        C50947as asVar = (C50947as) obj;
        int i = C11160aw.f36531a;
        Optional optional = abVar.f36504b;
        Objects.requireNonNull(asVar);
        optional.ifPresent(new C11150am(asVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
