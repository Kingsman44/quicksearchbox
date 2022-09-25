package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.ai */
/* compiled from: PG */
public final /* synthetic */ class C95718ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C95724ao f267973a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f267974b;

    public /* synthetic */ C95718ai(C95724ao aoVar, Runnable runnable) {
        this.f267973a = aoVar;
        this.f267974b = runnable;
    }

    public final Object call() {
        C95724ao aoVar = this.f267973a;
        Runnable runnable = this.f267974b;
        C22871g gVar = aoVar.f267991i;
        Objects.requireNonNull(runnable);
        return gVar.mo28207g("external-voice-service", new C95713ad(runnable));
    }
}
