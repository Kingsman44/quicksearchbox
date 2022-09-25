package com.google.apps.tiktok.concurrent;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.apps.tiktok.concurrent.ad */
/* compiled from: PG */
public final /* synthetic */ class C46417ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46423aj f121472a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f121473b;

    /* renamed from: c */
    public final /* synthetic */ C46421ah f121474c;

    public /* synthetic */ C46417ad(C46423aj ajVar, SettableFuture settableFuture, C46421ah ahVar) {
        this.f121472a = ajVar;
        this.f121473b = settableFuture;
        this.f121474c = ahVar;
    }

    public final void run() {
        C46423aj ajVar = this.f121472a;
        SettableFuture settableFuture = this.f121473b;
        C46421ah ahVar = this.f121474c;
        try {
            ajVar.f121487d.mo57356n(C60856cj.m92909r(settableFuture));
            ahVar.mo57358p(ajVar.f121487d);
        } catch (Throwable unused) {
            ahVar.mo57358p(settableFuture);
        }
    }
}
