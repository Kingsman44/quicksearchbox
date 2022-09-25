package com.google.android.libraries.assistant.pcp.p1573k;

import android.content.ComponentName;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.k.o */
/* compiled from: PG */
public final /* synthetic */ class C18935o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18935o f53233a = new C18935o();

    private /* synthetic */ C18935o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (ComponentName) ((Optional) obj).get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
