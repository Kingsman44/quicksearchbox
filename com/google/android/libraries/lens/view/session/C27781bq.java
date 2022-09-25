package com.google.android.libraries.lens.view.session;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.session.bq */
/* compiled from: PG */
public final class C27781bq {

    /* renamed from: a */
    public static final C58974d f75786a = C58974d.m91135i("UserVisibleRegionManager");

    /* renamed from: b */
    public SettableFuture f75787b = new SettableFuture();

    /* renamed from: c */
    private final Executor f75788c;

    public C27781bq(Executor executor) {
        this.f75788c = executor;
    }

    /* renamed from: a */
    public final void mo33288a(C27780bp bpVar) {
        SettableFuture settableFuture = this.f75787b;
        C27779bo boVar = new C27779bo(bpVar);
        C60856cj.m92911t(settableFuture, C47810es.m84974n(boVar), this.f75788c);
    }
}
