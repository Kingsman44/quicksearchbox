package com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.c.d */
/* compiled from: PG */
public final /* synthetic */ class C115961d implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C115962e f321531a;

    public /* synthetic */ C115961d(C115962e eVar) {
        this.f321531a = eVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f321531a.f321532a.f321535c;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("biometricPromptExecutor", new C115960c(runnable));
    }
}
