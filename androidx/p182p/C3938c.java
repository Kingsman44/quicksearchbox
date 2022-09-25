package androidx.p182p;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.C4054i;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.c */
/* compiled from: PG */
public final class C3938c {

    /* renamed from: a */
    public C4054i f12598a;

    /* renamed from: b */
    public Runnable f12599b;

    /* renamed from: c */
    public final Object f12600c = new Object();

    /* renamed from: d */
    public final long f12601d;

    /* renamed from: e */
    public final Executor f12602e;

    /* renamed from: f */
    public int f12603f;

    /* renamed from: g */
    public final long f12604g;

    /* renamed from: h */
    public C4049d f12605h;

    /* renamed from: i */
    public boolean f12606i;

    /* renamed from: j */
    public final Runnable f12607j;

    /* renamed from: k */
    private final Handler f12608k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    private final Runnable f12609l;

    public C3938c(long j, TimeUnit timeUnit, Executor executor) {
        this.f12601d = timeUnit.toMillis(j);
        this.f12602e = executor;
        this.f12604g = SystemClock.uptimeMillis();
        this.f12609l = new C3912a(this);
        this.f12607j = new C3936b(this);
    }

    /* renamed from: a */
    public final C4049d mo8221a() {
        synchronized (this.f12600c) {
            this.f12608k.removeCallbacks(this.f12609l);
            this.f12603f++;
            if (!this.f12606i) {
                C4049d dVar = this.f12605h;
                if (dVar != null && dVar.mo8252k()) {
                    return dVar;
                }
                C4054i iVar = this.f12598a;
                if (iVar == null) {
                    C69664n.m101065k("delegateOpenHelper");
                    iVar = null;
                }
                C4049d a = iVar.mo8208a();
                C69664n.m101060f(a, "delegateOpenHelper.writableDatabase");
                this.f12605h = a;
                return a;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    /* renamed from: b */
    public final Object mo8222b(C69626l lVar) {
        try {
            return lVar.mo5761a(mo8221a());
        } finally {
            mo8224d();
        }
    }

    /* renamed from: c */
    public final void mo8223c() {
        synchronized (this.f12600c) {
            this.f12606i = true;
            C4049d dVar = this.f12605h;
            if (dVar != null) {
                dVar.close();
            }
            this.f12605h = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8224d() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12600c
            monitor-enter(r0)
            int r1 = r5.f12603f     // Catch:{ all -> 0x0026 }
            if (r1 <= 0) goto L_0x001e
            int r1 = r1 + -1
            r5.f12603f = r1     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x001c
            androidx.q.a.d r1 = r5.f12605h     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)
            return
        L_0x0013:
            android.os.Handler r1 = r5.f12608k     // Catch:{ all -> 0x0026 }
            java.lang.Runnable r2 = r5.f12609l     // Catch:{ all -> 0x0026 }
            long r3 = r5.f12601d     // Catch:{ all -> 0x0026 }
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0026 }
        L_0x001c:
            monitor-exit(r0)
            return
        L_0x001e:
            java.lang.String r1 = "ref count is 0 or lower but we're supposed to decrement"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0026 }
            r2.<init>(r1)     // Catch:{ all -> 0x0026 }
            throw r2     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p182p.C3938c.mo8224d():void");
    }
}
