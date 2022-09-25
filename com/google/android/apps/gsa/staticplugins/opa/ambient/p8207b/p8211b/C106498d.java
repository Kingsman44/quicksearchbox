package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8211b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106517d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.b.d */
/* compiled from: PG */
public final /* synthetic */ class C106498d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106511q f297013a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f297014b;

    /* renamed from: c */
    public final /* synthetic */ long f297015c;

    public /* synthetic */ C106498d(C106511q qVar, MessageLite messageLite, long j) {
        this.f297013a = qVar;
        this.f297014b = messageLite;
        this.f297015c = j;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C106511q qVar = this.f297013a;
        C106517d dVar = (C106517d) obj;
        C60870cx c = dVar.mo95550c(this.f297014b, this.f297015c);
        C106506l lVar = new C106506l(qVar, dVar);
        C60870cx g = C60922j.m93044g(c, C47810es.m84963c(lVar), qVar.f297037c);
        C106507m mVar = new C106507m(qVar, dVar);
        return C60846c.m92878g(g, Throwable.class, C47810es.m84963c(mVar), qVar.f297037c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
