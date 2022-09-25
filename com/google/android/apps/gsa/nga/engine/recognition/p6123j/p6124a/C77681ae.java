package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C77681ae implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C77687ak f213966a;

    public /* synthetic */ C77681ae(C77687ak akVar) {
        this.f213966a = akVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f213966a.f213980h;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] StartHotwordRecognizer", new C77684ah(runnable));
    }
}
