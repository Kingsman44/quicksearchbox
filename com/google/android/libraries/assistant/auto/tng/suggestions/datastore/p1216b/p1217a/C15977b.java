package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.p1217a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.C15986b;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C15977b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C15978c f47383a;

    public /* synthetic */ C15977b(C15978c cVar) {
        this.f47383a = cVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C15986b.m32805a(this.f47383a.f47386b, ((Integer) ((Map.Entry) obj).getValue()).intValue()).toString();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
