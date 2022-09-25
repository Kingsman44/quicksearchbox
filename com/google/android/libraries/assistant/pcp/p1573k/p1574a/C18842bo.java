package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bo */
/* compiled from: PG */
public final /* synthetic */ class C18842bo implements Function {

    /* renamed from: a */
    public final /* synthetic */ ComponentName f53064a;

    public /* synthetic */ C18842bo(ComponentName componentName) {
        this.f53064a = componentName;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f53064a.equals((ComponentName) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
