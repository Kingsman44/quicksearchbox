package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.c.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C22204ac implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22205ad f61289a;

    public /* synthetic */ C22204ac(C22205ad adVar) {
        this.f61289a = adVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f61289a.f61290a.f61296d;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("NetworkQuality", new C22203ab(runnable));
    }
}
