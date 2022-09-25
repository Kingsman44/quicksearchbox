package com.google.apps.tiktok.p3643g;

import android.content.Intent;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.g.i */
/* compiled from: PG */
public final /* synthetic */ class C47093i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C47098n f122692a;

    /* renamed from: b */
    public final /* synthetic */ Intent f122693b;

    /* renamed from: c */
    public final /* synthetic */ C47100p f122694c;

    public /* synthetic */ C47093i(C47098n nVar, Intent intent, C47100p pVar) {
        this.f122692a = nVar;
        this.f122693b = intent;
        this.f122694c = pVar;
    }

    public final C60870cx apply(Object obj) {
        C47098n nVar = this.f122692a;
        C60870cx a = nVar.mo50159a(obj).mo50157a(this.f122693b, this.f122694c);
        C58838bb.m90866a(a, "onReceive must return a ListenableFuture.");
        return a;
    }
}
