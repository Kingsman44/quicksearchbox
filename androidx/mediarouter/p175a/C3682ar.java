package androidx.mediarouter.p175a;

import java.util.concurrent.Executor;

/* renamed from: androidx.mediarouter.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C3682ar implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C3671ag f11846a;

    public /* synthetic */ C3682ar(C3671ag agVar) {
        this.f11846a = agVar;
    }

    public final void execute(Runnable runnable) {
        this.f11846a.post(runnable);
    }
}
