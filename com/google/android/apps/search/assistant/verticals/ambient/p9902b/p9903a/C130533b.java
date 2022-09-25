package com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9903a;

import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131279c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C130533b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130544m f357580a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f357581b;

    public /* synthetic */ C130533b(C130544m mVar, C58485gu guVar) {
        this.f357580a = mVar;
        this.f357581b = guVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130544m mVar = this.f357580a;
        C60870cx a = ((C131279c) obj).mo109735a(this.f357581b);
        C130537f fVar = new C130537f(mVar);
        return C60846c.m92878g(a, RuntimeException.class, C47810es.m84963c(fVar), mVar.f357598e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
