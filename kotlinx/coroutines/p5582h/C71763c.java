package kotlinx.coroutines.p5582h;

import com.google.android.setupcompat.p3549a.C45240c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71601bb;
import kotlinx.coroutines.p5579e.C71705am;
import kotlinx.coroutines.p5579e.C71708ap;
import kotlinx.p5572a.C71339b;
import kotlinx.p5572a.C71341d;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.h.c */
/* compiled from: PG */
public final class C71763c implements Executor, Closeable {

    /* renamed from: a */
    public static final C71708ap f191261a = new C71708ap("NOT_IN_STACK");

    /* renamed from: b */
    public final int f191262b;

    /* renamed from: c */
    public final int f191263c;

    /* renamed from: d */
    public final long f191264d;

    /* renamed from: e */
    public final String f191265e = "DefaultDispatcher";

    /* renamed from: f */
    public final C71766f f191266f;

    /* renamed from: g */
    public final C71766f f191267g;

    /* renamed from: h */
    public final C71341d f191268h;

    /* renamed from: i */
    public final C71705am f191269i;

    /* renamed from: j */
    public final C71341d f191270j;

    /* renamed from: k */
    public final C71339b f191271k;

    /* renamed from: d */
    public static /* synthetic */ void m104959d(C71763c cVar, Runnable runnable, boolean z, int i) {
        cVar.mo62998c(runnable, (i & 2) != 0 ? C71771k.f191284e : null, z & ((i & 4) == 0));
    }

    /* renamed from: e */
    public static final void m104960e(C71768h hVar) {
        C69664n.m101061g(hVar, "task");
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    /* renamed from: g */
    private final int m104961g() {
        synchronized (this.f191269i) {
            if (this.f191271k.mo62669a()) {
                return -1;
            }
            long j = this.f191270j.f190530c;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f191262b) {
                return 0;
            }
            if (i >= this.f191263c) {
                return 0;
            }
            int i3 = ((int) (this.f191270j.f190530c & 2097151)) + 1;
            if (this.f191269i.mo62965a(i3) == null) {
                C71761a aVar = new C71761a(this, i3);
                this.f191269i.mo62966b(i3, aVar);
                if (i3 == ((int) (2097151 & C71341d.f190528a.incrementAndGet(this.f191270j)))) {
                    aVar.start();
                    return i2 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* renamed from: h */
    private final C71761a m104962h() {
        Thread currentThread = Thread.currentThread();
        C71761a aVar = currentThread instanceof C71761a ? (C71761a) currentThread : null;
        if (aVar == null || !C69664n.m101066l(aVar.f191251e, this)) {
            return null;
        }
        return aVar;
    }

    /* renamed from: i */
    private final boolean m104963i(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f191262b) {
            int g = m104961g();
            if (g == 1) {
                if (this.f191262b > 1) {
                    m104961g();
                }
            } else if (g <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final boolean m104964j() {
        C71761a aVar;
        do {
            C71341d dVar = this.f191268h;
            while (true) {
                long j = dVar.f190530c;
                aVar = (C71761a) this.f191269i.mo62965a((int) (2097151 & j));
                if (aVar != null) {
                    long j2 = (2097152 + j) & -2097152;
                    int k = m104965k(aVar);
                    if (k >= 0 && this.f191268h.mo62674a(j, j2 | ((long) k))) {
                        aVar.nextParkedWorker = f191261a;
                        break;
                    }
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar == null) {
                return false;
            }
        } while (!aVar.f191249c.mo62672a(-1, 0));
        LockSupport.unpark(aVar);
        return true;
    }

    /* renamed from: k */
    private static final int m104965k(C71761a aVar) {
        int i;
        do {
            Object obj = aVar.nextParkedWorker;
            if (obj == f191261a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            aVar = (C71761a) obj;
            i = aVar.indexInArray;
        } while (i == 0);
        return i;
    }

    /* renamed from: a */
    public final void mo62996a(C71761a aVar, int i, int i2) {
        C69664n.m101061g(aVar, "worker");
        C71341d dVar = this.f191268h;
        while (true) {
            long j = dVar.f190530c;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m104965k(aVar) : i2;
            }
            if (i3 >= 0 && this.f191268h.mo62674a(j, j2 | ((long) i3))) {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo62997b() {
        if (!m104964j() && !m104963i(this.f191270j.f190530c)) {
            m104964j();
        }
    }

    /* renamed from: c */
    public final void mo62998c(Runnable runnable, C71769i iVar, boolean z) {
        C71768h hVar;
        C71768h hVar2;
        boolean z2;
        C69664n.m101061g(runnable, "block");
        C69664n.m101061g(iVar, "taskContext");
        C69664n.m101061g(runnable, "block");
        C69664n.m101061g(iVar, "taskContext");
        long j = C71771k.f191280a;
        long nanoTime = System.nanoTime();
        if (runnable instanceof C71768h) {
            hVar = (C71768h) runnable;
            hVar.f191276g = nanoTime;
            hVar.f191277h = iVar;
        } else {
            hVar = new C71770j(runnable, nanoTime, iVar);
        }
        C71761a h = m104962h();
        boolean z3 = true;
        if (h == null || h.f191248b == C71762b.TERMINATED || (hVar.f191277h.f191278a == 0 && h.f191248b == C71762b.BLOCKING)) {
            hVar2 = hVar;
        } else {
            h.f191250d = true;
            hVar2 = h.f191247a.mo63011c(hVar, z);
        }
        if (hVar2 != null) {
            if (hVar2.f191277h.f191278a == 1) {
                z2 = this.f191267g.mo62956d(hVar2);
            } else {
                z2 = this.f191266f.mo62956d(hVar2);
            }
            if (!z2) {
                throw new RejectedExecutionException(this.f191265e.concat(" was terminated"));
            }
        }
        if (!z || h == null) {
            z3 = false;
        }
        if (hVar.f191277h.f191278a != 0) {
            long addAndGet = C71341d.f190528a.addAndGet(this.f191270j, 2097152);
            if (!z3 && !m104964j() && !m104963i(addAndGet)) {
                m104964j();
            }
        } else if (!z3) {
            mo62997b();
        }
    }

    public final void close() {
        mo63001f();
    }

    public final void execute(Runnable runnable) {
        C69664n.m101061g(runnable, "command");
        m104959d(this, runnable, false, 6);
    }

    /* renamed from: f */
    public final void mo63001f() {
        int i;
        C71768h hVar;
        if (this.f191271k.mo62670b()) {
            C71761a h = m104962h();
            synchronized (this.f191269i) {
                i = (int) (this.f191270j.f190530c & 2097151);
            }
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    Object a = this.f191269i.mo62965a(i2);
                    C69664n.m101058d(a);
                    C71761a aVar = (C71761a) a;
                    if (aVar != h) {
                        while (aVar.isAlive()) {
                            LockSupport.unpark(aVar);
                            aVar.join(10000);
                        }
                        C71762b bVar = aVar.f191248b;
                        boolean z = C71600ba.f191036a;
                        C71773m mVar = aVar.f191247a;
                        C71766f fVar = this.f191267g;
                        C69664n.m101061g(fVar, "globalQueue");
                        C71768h hVar2 = (C71768h) mVar.f191288b.mo62676a((Object) null);
                        if (hVar2 != null) {
                            fVar.mo62956d(hVar2);
                        }
                        while (true) {
                            C71768h e = mVar.mo63013e();
                            if (e == null) {
                                break;
                            }
                            fVar.mo62956d(e);
                        }
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f191267g.mo62955c();
            this.f191266f.mo62955c();
            while (true) {
                if (h != null) {
                    hVar = h.mo62992b(true);
                    if (hVar != null) {
                        continue;
                        m104960e(hVar);
                    }
                }
                hVar = (C71768h) this.f191266f.mo62954b();
                if (hVar == null && (hVar = (C71768h) this.f191267g.mo62954b()) == null) {
                    break;
                }
                m104960e(hVar);
            }
            if (h != null) {
                h.mo62994d(C71762b.TERMINATED);
            }
            boolean z2 = C71600ba.f191036a;
            this.f191268h.f190530c = 0;
            this.f191270j.f190530c = 0;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.f191269i.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C71761a aVar = (C71761a) this.f191269i.mo62965a(i6);
            if (aVar != null) {
                C71773m mVar = aVar.f191247a;
                int a = mVar.f191288b.f190532a != null ? mVar.mo63009a() + 1 : mVar.mo63009a();
                C71762b bVar = aVar.f191248b;
                C71762b bVar2 = C71762b.CPU_ACQUIRED;
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    i++;
                    arrayList.add(a + C45240c.f118157a);
                } else if (ordinal == 1) {
                    i2++;
                    arrayList.add(a + "b");
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (a > 0) {
                        arrayList.add(a + "d");
                    }
                } else if (ordinal == 4) {
                    i5++;
                }
            }
        }
        long j = this.f191270j.f190530c;
        String str = this.f191265e;
        String b = C71601bb.m104527b(this);
        int i7 = this.f191262b;
        int i8 = this.f191263c;
        int a2 = this.f191266f.mo62953a();
        int a3 = this.f191267g.mo62953a();
        int i9 = this.f191262b;
        return str + "@" + b + "[Pool Size {core = " + i7 + ", max = " + i8 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + a2 + ", global blocking queue size = " + a3 + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (i9 - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public C71763c(int i, int i2, long j) {
        this.f191262b = i;
        this.f191263c = i2;
        this.f191264d = j;
        if (i <= 0) {
            throw new IllegalArgumentException("Core pool size " + i + " should be at least 1");
        } else if (i2 < i) {
            throw new IllegalArgumentException("Max pool size " + i2 + " should be greater than or equals to core pool size " + i);
        } else if (i2 > 2097150) {
            throw new IllegalArgumentException("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150");
        } else if (j > 0) {
            this.f191266f = new C71766f();
            this.f191267g = new C71766f();
            this.f191268h = new C71341d(0, C71343f.f190534a);
            this.f191269i = new C71705am(i + 1);
            this.f191270j = new C71341d(((long) i) << 42, C71343f.f190534a);
            this.f191271k = new C71339b(false, C71343f.f190534a);
        } else {
            throw new IllegalArgumentException("Idle worker keep alive time " + j + " must be positive");
        }
    }
}
