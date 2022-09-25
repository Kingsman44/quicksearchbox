package com.google.android.libraries.onegoogle.owners.p2386a;

import com.google.android.gms.common.api.C143708aa;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143854z;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.o */
/* compiled from: PG */
public final class C30956o {
    /* renamed from: a */
    public static C60870cx m57769a(C143854z zVar, C58817ah ahVar, Executor executor) {
        SettableFuture settableFuture = new SettableFuture();
        zVar.mo117322g(new C30952k(settableFuture, executor, ahVar), TimeUnit.SECONDS);
        settableFuture.mo4106b(C47810es.m84977q(new C30953l(settableFuture, zVar)), C60826bg.f164896a);
        return settableFuture;
    }

    /* renamed from: b */
    public static void m57770b(C143711ad adVar) {
        if (adVar instanceof C143708aa) {
            ((C143708aa) adVar).mo119102b();
        }
    }
}
