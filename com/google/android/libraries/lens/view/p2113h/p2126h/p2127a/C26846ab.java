package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60839bt;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.ab */
/* compiled from: PG */
public final class C26846ab extends C60839bt {

    /* renamed from: a */
    public static final C58974d f73148a = C58974d.m91135i("GlExecutor");

    /* renamed from: b */
    private static final RejectedExecutionHandler f73149b = new ThreadPoolExecutor.AbortPolicy();

    /* renamed from: c */
    private final ExecutorService f73150c = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C26882y(), new C26845aa(f73149b));

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f73150c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final ExecutorService mo29169i() {
        return this.f73150c;
    }
}
