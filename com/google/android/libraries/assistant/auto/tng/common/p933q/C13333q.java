package com.google.android.libraries.assistant.auto.tng.common.p933q;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.q */
/* compiled from: PG */
public final /* synthetic */ class C13333q implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f41064a;

    /* renamed from: b */
    public final /* synthetic */ Executor f41065b;

    public /* synthetic */ C13333q(Function function, Executor executor) {
        this.f41064a = function;
        this.f41065b = executor;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Function function = this.f41064a;
        return C60856cj.m92904m(C47810es.m84978r(new C13332p(function, obj)), this.f41065b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
