package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71414ao;
import kotlinx.coroutines.C71603bd;
import kotlinx.coroutines.C71606bg;
import kotlinx.coroutines.C71615bp;
import kotlinx.coroutines.C71807q;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.u */
/* compiled from: PG */
public final class C71739u extends C71414ao implements Runnable, C71606bg {

    /* renamed from: c */
    private final C71414ao f191217c;

    /* renamed from: d */
    private final int f191218d;

    /* renamed from: e */
    private final /* synthetic */ C71606bg f191219e = C71603bd.f191041a;

    /* renamed from: f */
    private final C71698af f191220f = new C71698af();

    /* renamed from: g */
    private final Object f191221g = new Object();
    private volatile int runningWorkers;

    public C71739u(C71414ao aoVar, int i) {
        this.f191217c = aoVar;
        this.f191218d = i;
    }

    /* renamed from: c */
    private final boolean m104900c(Runnable runnable) {
        this.f191220f.mo62956d(runnable);
        return this.runningWorkers >= this.f191218d;
    }

    /* renamed from: h */
    private final boolean m104901h() {
        synchronized (this.f191221g) {
            if (this.runningWorkers >= this.f191218d) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo62765a(long j, C71807q qVar) {
        this.f191219e.mo62765a(j, qVar);
    }

    /* renamed from: d */
    public final void mo62766d(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(runnable, "block");
        if (!m104900c(runnable) && m104901h()) {
            this.f191217c.mo62766d(this, this);
        }
    }

    /* renamed from: e */
    public final void mo62773e(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        if (!m104900c(runnable) && m104901h()) {
            this.f191217c.mo62773e(this, this);
        }
    }

    /* renamed from: g */
    public final C71615bp mo62769g(long j, Runnable runnable, C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        return this.f191219e.mo62769g(j, runnable, oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f191221g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f191220f.mo62953a() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            kotlinx.coroutines.e.af r2 = r4.f191220f
            java.lang.Object r2 = r2.mo62954b()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            h.c.p r3 = p5462h.p5466c.C69586p.f185991a
            kotlinx.coroutines.C71417ar.m104192b(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            kotlinx.coroutines.ao r2 = r4.f191217c
            boolean r2 = r2.mo62768f(r4)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.ao r0 = r4.f191217c
            r0.mo62766d(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f191221g
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0045 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0045 }
            kotlinx.coroutines.e.af r2 = r4.f191220f     // Catch:{ all -> 0x0045 }
            int r2 = r2.mo62953a()     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0045 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)
            goto L_0x0049
        L_0x0048:
            throw r0
        L_0x0049:
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5579e.C71739u.run():void");
    }
}
