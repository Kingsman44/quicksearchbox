package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.g */
/* compiled from: PG */
public final /* synthetic */ class C77709g implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C77710h f214048a;

    public /* synthetic */ C77709g(C77710h hVar) {
        this.f214048a = hVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f214048a.f214052d;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] S3Microphone.close", new C77706d(runnable));
    }
}
