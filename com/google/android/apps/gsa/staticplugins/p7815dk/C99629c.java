package com.google.android.apps.gsa.staticplugins.p7815dk;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.dk.c */
/* compiled from: PG */
public final /* synthetic */ class C99629c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f278793a;

    /* renamed from: b */
    public final /* synthetic */ C99639m f278794b;

    public /* synthetic */ C99629c(C99639m mVar, SettableFuture settableFuture) {
        this.f278794b = mVar;
        this.f278793a = settableFuture;
    }

    public final void run() {
        C99639m mVar = this.f278794b;
        SettableFuture settableFuture = this.f278793a;
        mVar.mo91529a();
        settableFuture.cancel(true);
    }
}
