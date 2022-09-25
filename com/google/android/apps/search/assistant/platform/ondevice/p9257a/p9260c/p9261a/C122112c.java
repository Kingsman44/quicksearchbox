package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9261a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122119d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C122112c implements Function {

    /* renamed from: a */
    public final /* synthetic */ Supplier f338765a;

    /* renamed from: b */
    public final /* synthetic */ C122119d f338766b;

    public /* synthetic */ C122112c(Supplier supplier, C122119d dVar) {
        this.f338765a = supplier;
        this.f338766b = dVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Supplier supplier = this.f338765a;
        C122119d dVar = this.f338766b;
        C122099h hVar = (C122099h) obj;
        Objects.requireNonNull(dVar);
        C122111b bVar = new C122111b(dVar);
        return C60922j.m93044g((C60870cx) supplier.get(), C47810es.m84963c(bVar), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
