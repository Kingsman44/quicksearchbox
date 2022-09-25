package androidx.camera.core.p069a.p070a.p072b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.a.a.b.f */
/* compiled from: PG */
public class C1257f implements C60870cx {

    /* renamed from: a */
    private final C60870cx f3658a;

    /* renamed from: b */
    C2164c f3659b;

    public C1257f() {
        this.f3658a = C2169h.m6027a(new C1256e(this));
    }

    /* renamed from: a */
    public static C1257f m3422a(C60870cx cxVar) {
        return cxVar instanceof C1257f ? (C1257f) cxVar : new C1257f(cxVar);
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f3658a.mo4106b(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4107c(Throwable th) {
        C2164c cVar = this.f3659b;
        if (cVar != null) {
            cVar.mo5439d(th);
        }
    }

    public boolean cancel(boolean z) {
        return this.f3658a.cancel(z);
    }

    public Object get() {
        return this.f3658a.get();
    }

    public final boolean isCancelled() {
        return this.f3658a.isCancelled();
    }

    public final boolean isDone() {
        return this.f3658a.isDone();
    }

    public C1257f(C60870cx cxVar) {
        cxVar.getClass();
        this.f3658a = cxVar;
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.f3658a.get(j, timeUnit);
    }
}
