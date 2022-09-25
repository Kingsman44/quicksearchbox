package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.w */
/* compiled from: PG */
public final /* synthetic */ class C80927w implements Function {

    /* renamed from: a */
    public final /* synthetic */ Executor f221899a;

    public /* synthetic */ C80927w(Executor executor) {
        this.f221899a = executor;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Executor executor = this.f221899a;
        C80886aa aaVar = (C80886aa) obj;
        Objects.requireNonNull(aaVar);
        return C60922j.m93044g((C60870cx) aaVar.f221840b.mo74715a(), C47810es.m84963c(new C80924t(aaVar)), executor);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
