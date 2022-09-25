package com.google.android.libraries.assistant.auto.tng.common.p933q;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.o */
/* compiled from: PG */
public final /* synthetic */ class C13331o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C60931s f41060a;

    /* renamed from: b */
    public final /* synthetic */ Executor f41061b;

    public /* synthetic */ C13331o(C60931s sVar, Executor executor) {
        this.f41060a = sVar;
        this.f41061b = executor;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60931s sVar = this.f41060a;
        return C60856cj.m92905n(C47810es.m84965e(new C13334r(sVar, obj)), this.f41061b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
