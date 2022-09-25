package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.unifiedime.C118588f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.f */
/* compiled from: PG */
public final /* synthetic */ class C125500f implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f346074a;

    /* renamed from: b */
    public final /* synthetic */ int f346075b;

    public /* synthetic */ C125500f(int i, int i2) {
        this.f346074a = i;
        this.f346075b = i2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C125503i.m205471a((C118588f) obj, this.f346074a, this.f346075b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
