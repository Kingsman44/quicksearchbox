package androidx.camera.core.p069a.p070a.p071a;

import android.os.Handler;
import androidx.p104d.p105a.C2153a;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.a.a.a.f */
/* compiled from: PG */
final class C1243f implements RunnableScheduledFuture {

    /* renamed from: a */
    final AtomicReference f3634a = new AtomicReference((Object) null);

    /* renamed from: b */
    private final long f3635b;

    /* renamed from: c */
    private final Callable f3636c;

    /* renamed from: d */
    private final C60870cx f3637d;

    public C1243f(Handler handler, long j, Callable callable) {
        this.f3635b = j;
        this.f3636c = callable;
        this.f3637d = C2169h.m6027a(new C1242e(this, handler, callable));
    }

    public final boolean cancel(boolean z) {
        return this.f3637d.cancel(z);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (getDelay(TimeUnit.MILLISECONDS) > ((Delayed) obj).getDelay(TimeUnit.MILLISECONDS) ? 1 : (getDelay(TimeUnit.MILLISECONDS) == ((Delayed) obj).getDelay(TimeUnit.MILLISECONDS) ? 0 : -1));
    }

    public final Object get() {
        return ((C2168g) this.f3637d).f6144b.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f3635b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public final boolean isCancelled() {
        return ((C2168g) this.f3637d).f6144b.value instanceof C2153a.C2155b;
    }

    public final boolean isDone() {
        return ((C2168g) this.f3637d).f6144b.isDone();
    }

    public final boolean isPeriodic() {
        return false;
    }

    public final void run() {
        C2164c cVar = (C2164c) this.f3634a.getAndSet((Object) null);
        if (cVar != null) {
            try {
                cVar.mo5437b(this.f3636c.call());
            } catch (Exception e) {
                cVar.mo5439d(e);
            }
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return ((C2168g) this.f3637d).f6144b.get(j, timeUnit);
    }
}
