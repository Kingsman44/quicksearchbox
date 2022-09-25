package androidx.p104d.p105a;

import androidx.p104d.p105a.C2153a;
import com.google.common.util.concurrent.C60870cx;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.d.a.g */
/* compiled from: PG */
public final class C2168g implements C60870cx {

    /* renamed from: a */
    final WeakReference f6143a;

    /* renamed from: b */
    public final C2153a f6144b = new C2167f(this);

    public C2168g(C2164c cVar) {
        this.f6143a = new WeakReference(cVar);
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f6144b.mo4106b(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        C2164c cVar = (C2164c) this.f6143a.get();
        boolean cancel = this.f6144b.cancel(z);
        if (!cancel || cVar == null) {
            return cancel;
        }
        cVar.f6138a = null;
        cVar.f6139b = null;
        cVar.f6140c.mo5422f((Object) null);
        return true;
    }

    public final Object get() {
        return this.f6144b.get();
    }

    public final boolean isCancelled() {
        return this.f6144b.value instanceof C2153a.C2155b;
    }

    public final boolean isDone() {
        return this.f6144b.isDone();
    }

    public final String toString() {
        return this.f6144b.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f6144b.get(j, timeUnit);
    }
}
