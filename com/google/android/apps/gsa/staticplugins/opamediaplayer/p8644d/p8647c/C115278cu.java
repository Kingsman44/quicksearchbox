package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.cu */
/* compiled from: PG */
public final /* synthetic */ class C115278cu implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f319885a;

    /* renamed from: b */
    public final /* synthetic */ C60930r f319886b;

    public /* synthetic */ C115278cu(SettableFuture settableFuture, C60930r rVar) {
        this.f319885a = settableFuture;
        this.f319886b = rVar;
    }

    public final void run() {
        SettableFuture settableFuture = this.f319885a;
        try {
            settableFuture.mo57358p(this.f319886b.mo18058a());
        } catch (Exception e) {
            settableFuture.mo57357o(e);
        }
    }
}
