package androidx.work.impl.utils.p210b;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.b.a */
/* compiled from: PG */
final class C4594a implements Executor {

    /* renamed from: a */
    final /* synthetic */ C4595b f14485a;

    public C4594a(C4595b bVar) {
        this.f14485a = bVar;
    }

    public final void execute(Runnable runnable) {
        this.f14485a.f14487b.post(runnable);
    }
}
