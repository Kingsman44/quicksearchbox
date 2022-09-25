package com.google.android.apps.gsa.staticplugins.opa.greeting;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.o */
/* compiled from: PG */
public final /* synthetic */ class C109118o implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C109100ar f303874a;

    public /* synthetic */ C109118o(C109100ar arVar) {
        this.f303874a = arVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f303874a.f303792y;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("ShowFreSuggestion", new C109114k(runnable));
    }
}
