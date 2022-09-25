package androidx.work;

import androidx.work.impl.utils.p209a.C4568b;
import androidx.work.impl.utils.p209a.C4579m;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C71643cp;

/* renamed from: androidx.work.w */
/* compiled from: PG */
public final class C4642w implements C60870cx {

    /* renamed from: a */
    public final C4579m f14564a;

    /* renamed from: b */
    private final C71643cp f14565b;

    public C4642w(C71643cp cpVar, C4579m mVar) {
        this.f14565b = cpVar;
        this.f14564a = mVar;
        cpVar.mo62873s(new C4641v(this));
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f14564a.mo4106b(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f14564a.cancel(z);
    }

    public final Object get() {
        return this.f14564a.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f14564a.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f14564a.f14444d instanceof C4568b;
    }

    public final boolean isDone() {
        return this.f14564a.isDone();
    }
}
