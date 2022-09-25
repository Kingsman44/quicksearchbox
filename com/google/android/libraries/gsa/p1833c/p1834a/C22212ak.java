package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.c.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C22212ak implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22214am f61321a;

    public /* synthetic */ C22212ak(C22214am amVar) {
        this.f61321a = amVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f61321a.f61325c;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("Cronet UrlRequest.Callback", new C22213al(runnable));
    }
}
