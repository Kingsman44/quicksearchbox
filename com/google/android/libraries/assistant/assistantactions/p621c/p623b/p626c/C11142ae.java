package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.ae */
/* compiled from: PG */
public final /* synthetic */ class C11142ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C11139ab f36510a;

    public /* synthetic */ C11142ae(C11139ab abVar) {
        this.f36510a = abVar;
    }

    public final void accept(Object obj) {
        C11139ab abVar = this.f36510a;
        C50947as asVar = (C50947as) obj;
        int i = C11160aw.f36531a;
        Optional optional = abVar.f36505c;
        Objects.requireNonNull(asVar);
        optional.ifPresent(new C11145ah(asVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
