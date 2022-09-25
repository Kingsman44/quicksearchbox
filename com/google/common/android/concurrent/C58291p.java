package com.google.common.android.concurrent;

import android.support.p031v4.app.FragmentManager;

/* renamed from: com.google.common.android.concurrent.p */
/* compiled from: PG */
public final /* synthetic */ class C58291p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C58295t f155839a;

    /* renamed from: b */
    public final /* synthetic */ ParcelableFuture f155840b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f155841c;

    public /* synthetic */ C58291p(C58295t tVar, ParcelableFuture parcelableFuture, Runnable runnable) {
        this.f155839a = tVar;
        this.f155840b = parcelableFuture;
        this.f155841c = runnable;
    }

    public final void run() {
        C58295t tVar = this.f155839a;
        ParcelableFuture parcelableFuture = this.f155840b;
        Runnable runnable = this.f155841c;
        FragmentManager fragmentManager = tVar.f155849c;
        if (fragmentManager == null) {
            return;
        }
        if (fragmentManager.mo461ab()) {
            tVar.f155851e = true;
        } else if (!fragmentManager.f659z && tVar.f155848b.remove(parcelableFuture)) {
            runnable.run();
        }
    }
}
