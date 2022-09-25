package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52477te;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.z */
/* compiled from: PG */
public final /* synthetic */ class C11202z implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C11202z f36618a = new C11202z();

    private /* synthetic */ C11202z() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52477te teVar = (C52477te) obj;
        if (teVar.f137751b == 6) {
            return Optional.m71637of((C52397qf) teVar.f137752c);
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
