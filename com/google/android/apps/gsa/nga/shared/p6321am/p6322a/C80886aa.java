package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Collector;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.aa */
/* compiled from: PG */
public final class C80886aa {

    /* renamed from: a */
    public final Executor f221839a;

    /* renamed from: b */
    public final C80930z f221840b;

    /* renamed from: c */
    private final C58485gu f221841c;

    public C80886aa(C80930z zVar, C58485gu guVar, Executor executor) {
        this.f221839a = executor;
        this.f221840b = zVar;
        this.f221841c = guVar;
    }

    /* renamed from: a */
    public static C80886aa m128739a(C58485gu guVar, Executor executor) {
        return new C80886aa(new C80921q(guVar, executor), C58485gu.m89845m(), executor);
    }

    /* renamed from: e */
    public static C80886aa m128740e(C60870cx cxVar, Executor executor) {
        return new C80886aa(new C80915k(cxVar, executor), C58485gu.m89845m(), executor);
    }

    /* renamed from: h */
    private final C80886aa m128741h(Function function) {
        C80930z zVar = this.f221840b;
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(this.f221841c);
        e.mo55395g(function);
        return new C80886aa(zVar, e.mo55394f(), this.f221839a);
    }

    /* renamed from: b */
    public final C80886aa mo74702b(Predicate predicate) {
        return m128741h(new C80914j(predicate));
    }

    /* renamed from: c */
    public final C80886aa mo74703c(int i) {
        return m128741h(new C80920p(i));
    }

    /* renamed from: d */
    public final C80886aa mo74704d(Function function) {
        return new C80886aa(new C80929y(this, new C80922r(function)), C58485gu.m89845m(), this.f221839a);
    }

    /* renamed from: f */
    public final C60870cx mo74705f(Collector collector) {
        C80916l lVar = new C80916l(this, new C80919o(collector));
        return C60922j.m93044g((C60870cx) this.f221840b.mo74715a(), C47810es.m84963c(lVar), this.f221839a);
    }

    /* renamed from: g */
    public final Stream mo74706g(Stream stream) {
        C58485gu guVar = this.f221841c;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            stream = (Stream) ((Function) guVar.get(i2)).apply(stream);
        }
        return stream;
    }
}
