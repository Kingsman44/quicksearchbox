package kotlinx.coroutines.p5578d;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60917ed;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C71643cp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.d.b */
/* compiled from: PG */
final class C71656b implements C60870cx {

    /* renamed from: a */
    public final SettableFuture f191105a = new SettableFuture();

    /* renamed from: b */
    private final C71643cp f191106b;

    /* renamed from: c */
    private boolean f191107c;

    public C71656b(C71643cp cpVar) {
        C69664n.m101061g(cpVar, "jobToCancel");
        this.f191106b = cpVar;
    }

    /* renamed from: c */
    private static final void m104664c(Object obj) {
        if (obj instanceof C71655a) {
            throw new CancellationException().initCause(((C71655a) obj).f191104a);
        }
    }

    /* renamed from: a */
    public final void mo62892a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        if (th instanceof CancellationException) {
            this.f191105a.mo57356n(new C71655a((CancellationException) th));
        } else if (this.f191105a.mo57357o(th)) {
            this.f191107c = true;
        }
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        C69664n.m101061g(runnable, "listener");
        C69664n.m101061g(executor, "executor");
        this.f191105a.mo4106b(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        if (!this.f191105a.cancel(z)) {
            return false;
        }
        this.f191106b.mo62723u((CancellationException) null);
        return true;
    }

    public final Object get() {
        Object obj = this.f191105a.get();
        m104664c(obj);
        return obj;
    }

    public final boolean isCancelled() {
        if (this.f191105a.value instanceof C60873d.C60875b) {
            return true;
        }
        if (!this.f191105a.isDone() || this.f191107c) {
            return false;
        }
        try {
            if (C60917ed.m93034a(this.f191105a) instanceof C71655a) {
                return true;
            }
            return false;
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.f191107c = true;
        }
    }

    public final boolean isDone() {
        return this.f191105a.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f191105a.isDone()) {
            try {
                Object a = C60917ed.m93034a(this.f191105a);
                if (a instanceof C71655a) {
                    CancellationException cancellationException = ((C71655a) a).f191104a;
                    sb.append("CANCELLED, cause=[" + cancellationException + "]");
                } else {
                    sb.append("SUCCESS, result=[" + a + "]");
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                sb.append("FAILURE, cause=[" + cause + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            SettableFuture settableFuture = this.f191105a;
            sb.append("PENDING, delegate=[" + settableFuture + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        C69664n.m101061g(timeUnit, "unit");
        Object obj = this.f191105a.get(j, timeUnit);
        m104664c(obj);
        return obj;
    }
}
