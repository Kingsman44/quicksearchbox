package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C128141o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C128141o f352530a = new C128141o();

    private /* synthetic */ C128141o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return Collection.EL.stream((C58485gu) C60856cj.m92909r((C60870cx) obj));
        } catch (ExecutionException unused) {
            return Stream.CC.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
