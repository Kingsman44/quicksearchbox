package com.google.apps.tiktok.tracing.contrib.p3700b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60800ah;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60816ax;
import com.google.common.util.concurrent.C60817ay;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.tracing.contrib.b.c */
/* compiled from: PG */
public final class C47630c {

    /* renamed from: a */
    public final C60817ay f123559a;

    public C47630c(C60817ay ayVar) {
        this.f123559a = ayVar;
    }

    /* renamed from: a */
    public static C47630c m84724a(C60803ak akVar, Executor executor) {
        return new C47630c(new C60817ay(C47810es.m84969i(akVar), executor));
    }

    /* renamed from: b */
    public static C47630c m84725b(C60800ah ahVar, Executor executor) {
        return new C47630c(new C60817ay(C47810es.m84967g(ahVar), executor));
    }

    /* renamed from: c */
    public final C47630c mo51505c(C60804al alVar, Executor executor) {
        return new C47630c(this.f123559a.mo57272e(C47810es.m84970j(alVar), executor));
    }

    /* renamed from: d */
    public final C47630c mo51506d(C60801ai aiVar, Executor executor) {
        return new C47630c(this.f123559a.mo57273f(C47810es.m84968h(aiVar), executor));
    }

    /* renamed from: e */
    public final C47633f mo51507e() {
        return C47633f.m84733g(this.f123559a.mo57275g());
    }

    /* renamed from: f */
    public final void mo51508f(C60816ax axVar, Executor executor) {
        this.f123559a.mo57280m(C47810es.m84973m(axVar), executor);
    }

    /* renamed from: g */
    public final void mo51509g() {
        this.f123559a.mo57281n(false);
    }

    public final String toString() {
        String obj = this.f123559a.toString();
        return "PropagatedClosingFuture[" + obj + "]";
    }
}
