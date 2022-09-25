package com.google.android.apps.gsa.staticplugins.p7666ci.p7667a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.a.g */
/* compiled from: PG */
public final /* synthetic */ class C97752g implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C97759n f272933a;

    public /* synthetic */ C97752g(C97759n nVar) {
        this.f272933a = nVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f272933a.f272951b;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("#shouldStartClientSync()", new C97746a(runnable));
    }
}
