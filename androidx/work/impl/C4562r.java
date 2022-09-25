package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C4380ad;
import androidx.work.C4409e;
import androidx.work.impl.foreground.C4542a;
import androidx.work.impl.foreground.C4545d;
import androidx.work.impl.p207b.C4486au;
import androidx.work.impl.p207b.C4509r;
import androidx.work.impl.utils.p209a.C4568b;
import androidx.work.impl.utils.p210b.C4595b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.work.impl.r */
/* compiled from: PG */
public final class C4562r implements C4539d, C4542a {

    /* renamed from: a */
    public static final String f14397a = C4380ad.m12561i("Processor");

    /* renamed from: b */
    public PowerManager.WakeLock f14398b;

    /* renamed from: c */
    public final Context f14399c;

    /* renamed from: d */
    public final WorkDatabase f14400d;

    /* renamed from: e */
    public final Map f14401e = new HashMap();

    /* renamed from: f */
    public final Map f14402f = new HashMap();

    /* renamed from: g */
    public final Map f14403g;

    /* renamed from: h */
    public final Set f14404h;

    /* renamed from: i */
    public final Object f14405i;

    /* renamed from: j */
    private final C4409e f14406j;

    /* renamed from: k */
    private final List f14407k;

    /* renamed from: l */
    private final List f14408l;

    /* renamed from: m */
    private final C4595b f14409m;

    public C4562r(Context context, C4409e eVar, C4595b bVar, WorkDatabase workDatabase, List list) {
        this.f14399c = context;
        this.f14406j = eVar;
        this.f14409m = bVar;
        this.f14400d = workDatabase;
        this.f14407k = list;
        this.f14404h = new HashSet();
        this.f14408l = new ArrayList();
        this.f14398b = null;
        this.f14405i = new Object();
        this.f14403g = new HashMap();
    }

    /* renamed from: e */
    public static boolean m12939e(String str, C4463ar arVar) {
        if (arVar != null) {
            arVar.f14190h = true;
            arVar.mo9403c();
            arVar.f14189g.cancel(true);
            if (arVar.f14186d == null || !(arVar.f14189g.f14444d instanceof C4568b)) {
                C4380ad.m12560h().mo9309a(C4463ar.f14183a, "WorkSpec " + arVar.f14185c + " is already done. Not interrupting.");
            } else {
                arVar.f14186d.mo9308fA();
            }
            C4380ad.m12560h().mo9309a(f14397a, "WorkerWrapper interrupted for ".concat(String.valueOf(str)));
            return true;
        }
        C4380ad.m12560h().mo9309a(f14397a, "WorkerWrapper could not be found for ".concat(String.valueOf(str)));
        return false;
    }

    /* renamed from: h */
    private final void m12940h(C4509r rVar) {
        this.f14409m.f14488c.execute(new C4560p(this, rVar));
    }

    /* renamed from: a */
    public final void mo9473a(C4509r rVar, boolean z) {
        synchronized (this.f14405i) {
            C4463ar arVar = (C4463ar) this.f14402f.get(rVar.f14269a);
            if (arVar != null && rVar.equals(C4486au.m12791a(arVar.f14185c))) {
                this.f14402f.remove(rVar.f14269a);
            }
            C4380ad h = C4380ad.m12560h();
            String str = f14397a;
            h.mo9309a(str, getClass().getSimpleName() + " " + rVar.f14269a + " executed; reschedule = " + z);
            for (C4539d a : this.f14408l) {
                a.mo9473a(rVar, z);
            }
        }
    }

    /* renamed from: b */
    public final void mo9514b(C4539d dVar) {
        synchronized (this.f14405i) {
            this.f14408l.add(dVar);
        }
    }

    /* renamed from: c */
    public final void mo9515c(C4539d dVar) {
        synchronized (this.f14405i) {
            this.f14408l.remove(dVar);
        }
    }

    /* renamed from: d */
    public final void mo9516d() {
        synchronized (this.f14405i) {
            if (this.f14401e.isEmpty()) {
                try {
                    this.f14399c.startService(C4545d.m12922d(this.f14399c));
                } catch (Throwable th) {
                    C4380ad.m12560h().mo9312d(f14397a, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f14398b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f14398b = null;
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo9517f(String str) {
        boolean z;
        synchronized (this.f14405i) {
            z = true;
            if (!this.f14402f.containsKey(str)) {
                if (!this.f14401e.containsKey(str)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
        return false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9518g(androidx.work.impl.C4620v r13) {
        /*
            r12 = this;
            java.lang.String r0 = "Work "
            androidx.work.impl.b.r r1 = r13.f14519a
            java.lang.String r2 = r1.f14269a
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            androidx.work.impl.WorkDatabase r3 = r12.f14400d
            androidx.work.impl.o r4 = new androidx.work.impl.o
            r4.<init>(r12, r10, r2)
            java.lang.Object r3 = r3.mo8169M(r4)
            r9 = r3
            androidx.work.impl.b.ae r9 = (androidx.work.impl.p207b.C4470ae) r9
            r3 = 0
            if (r9 != 0) goto L_0x003d
            androidx.work.ad r13 = androidx.work.C4380ad.m12560h()
            java.lang.String r0 = f14397a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Didn't find WorkSpec for id "
            r2.<init>(r4)
            java.lang.String r4 = "Didn't find WorkSpec for id "
            r2.append(r1)
            java.lang.String r2 = r1.toString()
            java.lang.String r2 = r4.concat(r2)
            r13.mo9314f(r0, r2)
            r12.m12940h(r1)
            return r3
        L_0x003d:
            java.lang.Object r11 = r12.f14405i
            monitor-enter(r11)
            boolean r4 = r12.mo9517f(r2)     // Catch:{ all -> 0x00f7 }
            if (r4 == 0) goto L_0x0083
            java.util.Map r4 = r12.f14403g     // Catch:{ all -> 0x00f7 }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ all -> 0x00f7 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x00f7 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x00f7 }
            java.lang.Object r4 = r4.next()     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.v r4 = (androidx.work.impl.C4620v) r4     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.b.r r4 = r4.f14519a     // Catch:{ all -> 0x00f7 }
            int r4 = r4.f14270b     // Catch:{ all -> 0x00f7 }
            int r5 = r1.f14270b     // Catch:{ all -> 0x00f7 }
            if (r4 != r5) goto L_0x007e
            r2.add(r13)     // Catch:{ all -> 0x00f7 }
            androidx.work.ad r13 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = f14397a     // Catch:{ all -> 0x00f7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r4.<init>(r0)     // Catch:{ all -> 0x00f7 }
            r4.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = " is already enqueued for processing"
            r4.append(r0)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00f7 }
            r13.mo9309a(r2, r0)     // Catch:{ all -> 0x00f7 }
            goto L_0x0081
        L_0x007e:
            r12.m12940h(r1)     // Catch:{ all -> 0x00f7 }
        L_0x0081:
            monitor-exit(r11)     // Catch:{ all -> 0x00f7 }
            return r3
        L_0x0083:
            int r0 = r9.f14236u     // Catch:{ all -> 0x00f7 }
            int r4 = r1.f14270b     // Catch:{ all -> 0x00f7 }
            if (r0 == r4) goto L_0x008e
            r12.m12940h(r1)     // Catch:{ all -> 0x00f7 }
            monitor-exit(r11)     // Catch:{ all -> 0x00f7 }
            return r3
        L_0x008e:
            androidx.work.impl.aq r0 = new androidx.work.impl.aq     // Catch:{ all -> 0x00f7 }
            android.content.Context r4 = r12.f14399c     // Catch:{ all -> 0x00f7 }
            androidx.work.e r5 = r12.f14406j     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.utils.b.b r6 = r12.f14409m     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.WorkDatabase r8 = r12.f14400d     // Catch:{ all -> 0x00f7 }
            r3 = r0
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00f7 }
            java.util.List r3 = r12.f14407k     // Catch:{ all -> 0x00f7 }
            r0.f14180f = r3     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.ar r3 = new androidx.work.impl.ar     // Catch:{ all -> 0x00f7 }
            r3.<init>(r0)     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.utils.a.m r0 = r3.f14188f     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.q r4 = new androidx.work.impl.q     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.b.r r5 = r13.f14519a     // Catch:{ all -> 0x00f7 }
            r4.<init>(r12, r5, r0)     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.utils.b.b r5 = r12.f14409m     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.Executor r5 = r5.f14488c     // Catch:{ all -> 0x00f7 }
            r0.mo4106b(r4, r5)     // Catch:{ all -> 0x00f7 }
            java.util.Map r0 = r12.f14402f     // Catch:{ all -> 0x00f7 }
            r0.put(r2, r3)     // Catch:{ all -> 0x00f7 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            r0.add(r13)     // Catch:{ all -> 0x00f7 }
            java.util.Map r13 = r12.f14403g     // Catch:{ all -> 0x00f7 }
            r13.put(r2, r0)     // Catch:{ all -> 0x00f7 }
            monitor-exit(r11)     // Catch:{ all -> 0x00f7 }
            androidx.work.impl.utils.b.b r13 = r12.f14409m
            androidx.work.impl.utils.v r13 = r13.f14486a
            r13.execute(r3)
            androidx.work.ad r13 = androidx.work.C4380ad.m12560h()
            java.lang.String r0 = f14397a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r12.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = ": processing "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r13.mo9309a(r0, r1)
            r13 = 1
            return r13
        L_0x00f7:
            r13 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00f7 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C4562r.mo9518g(androidx.work.impl.v):boolean");
    }
}
