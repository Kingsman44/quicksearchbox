package com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a;

import com.google.android.libraries.gcoreclient.p1809y.p1810a.C21742c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ac.d.a.a.a.f */
/* compiled from: PG */
public final class C147216f {
    /* renamed from: a */
    public static C60870cx m240072a(Executor executor, C21742c cVar) {
        SettableFuture settableFuture = new SettableFuture();
        Objects.requireNonNull(settableFuture);
        cVar.mo27083d(executor, new C147213c(settableFuture));
        Objects.requireNonNull(settableFuture);
        cVar.mo27081b(executor, new C147214d(settableFuture));
        return settableFuture;
    }
}
