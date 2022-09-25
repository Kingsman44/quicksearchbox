package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C80892ag implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f221854a;

    /* renamed from: b */
    public final /* synthetic */ String f221855b = "[NGA] TactileContentResponse";

    public /* synthetic */ C80892ag(C22871g gVar) {
        this.f221854a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f221854a;
        String str = this.f221855b;
        Objects.requireNonNull(runnable);
        gVar.mo28212l(str, new C80897al(runnable));
    }
}
