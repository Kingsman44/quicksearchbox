package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.v */
/* compiled from: PG */
public final /* synthetic */ class C130966v implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130890ac f358334a;

    public /* synthetic */ C130966v(C130890ac acVar) {
        this.f358334a = acVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130890ac acVar = this.f358334a;
        return C47633f.m84733g(((C130886a) obj).mo109859a()).mo51513e(ExecutionException.class, new C130965u(acVar), acVar.f358183b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
