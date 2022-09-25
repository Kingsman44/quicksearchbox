package com.google.android.gms.clearcut;

import androidx.p060c.C0981k;
import androidx.p060c.C0985o;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.android.gms.clearcut.o */
/* compiled from: PG */
public class C143662o {

    /* renamed from: a */
    public final String f389492a;

    /* renamed from: b */
    C0985o f389493b;

    /* renamed from: c */
    final /* synthetic */ C143673z f389494c;

    /* renamed from: d */
    private final Object f389495d;

    /* renamed from: e */
    private int f389496e;

    /* renamed from: f */
    private int f389497f;

    protected C143662o(C143673z zVar, C143662o oVar) {
        this(zVar, oVar.f389492a);
        synchronized (oVar.f389495d) {
            this.f389496e = oVar.f389496e;
            C0985o oVar2 = this.f389493b;
            this.f389493b = oVar.f389493b;
            oVar.f389493b = oVar2;
            oVar.f389496e = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        return r5;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m233386b(long r7, long r9, int r11) {
        /*
            r6 = this;
            java.lang.String r0 = "exceeded sample count in "
            java.lang.Object r1 = r6.f389495d
            monitor-enter(r1)
            androidx.c.o r2 = r6.f389493b     // Catch:{ all -> 0x0068 }
            java.lang.Object r2 = r2.mo3726e(r11)     // Catch:{ all -> 0x0068 }
            androidx.c.k r2 = (androidx.p060c.C0981k) r2     // Catch:{ all -> 0x0068 }
            if (r2 != 0) goto L_0x001b
            androidx.c.k r2 = new androidx.c.k     // Catch:{ all -> 0x0068 }
            r3 = 10
            r2.<init>(r3)     // Catch:{ all -> 0x0068 }
            androidx.c.o r3 = r6.f389493b     // Catch:{ all -> 0x0068 }
            r3.mo3730i(r11, r2)     // Catch:{ all -> 0x0068 }
        L_0x001b:
            int r11 = r6.f389496e     // Catch:{ all -> 0x0068 }
            com.google.android.gms.clearcut.z r3 = r6.f389494c     // Catch:{ all -> 0x0068 }
            int r4 = r3.f389508f     // Catch:{ all -> 0x0068 }
            r5 = 0
            if (r11 < r4) goto L_0x003f
            boolean r3 = r3.f389510h     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x003f
            if (r11 != r4) goto L_0x003d
            java.lang.String r7 = r6.f389492a     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r8.<init>(r0)     // Catch:{ all -> 0x0068 }
            r8.append(r7)     // Catch:{ all -> 0x0068 }
            java.lang.String r7 = "Counters"
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0068 }
            android.util.Log.i(r7, r8)     // Catch:{ all -> 0x0068 }
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x0068 }
            return r5
        L_0x003f:
            r0 = 1
            int r11 = r11 + r0
            r6.f389496e = r11     // Catch:{ all -> 0x0068 }
            java.lang.Object r11 = r2.mo3678e(r7)     // Catch:{ all -> 0x0068 }
            long[] r11 = (long[]) r11     // Catch:{ all -> 0x0068 }
            if (r11 != 0) goto L_0x0054
            long[] r11 = new long[r0]     // Catch:{ all -> 0x0068 }
            r3 = 0
            r11[r5] = r3     // Catch:{ all -> 0x0068 }
            r2.mo3682i(r7, r11)     // Catch:{ all -> 0x0068 }
        L_0x0054:
            r7 = r11[r5]     // Catch:{ all -> 0x0068 }
            long r7 = r7 + r9
            r11[r5] = r7     // Catch:{ all -> 0x0068 }
            com.google.android.gms.clearcut.z r7 = r6.f389494c     // Catch:{ all -> 0x0068 }
            boolean r7 = r7.f389510h     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0066
            int r7 = r6.f389496e     // Catch:{ all -> 0x0068 }
            int r8 = r6.f389497f     // Catch:{ all -> 0x0068 }
            if (r7 < r8) goto L_0x0066
            r5 = 1
        L_0x0066:
            monitor-exit(r1)     // Catch:{ all -> 0x0068 }
            return r5
        L_0x0068:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0068 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.clearcut.C143662o.m233386b(long, long, int):boolean");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo119005a(long j, long j2, C143667t tVar) {
        Integer num;
        boolean z;
        Integer num2;
        if (tVar == null) {
            tVar = C143673z.f389504c;
        }
        this.f389494c.f389509g.readLock().lock();
        try {
            if (tVar == C143673z.f389505d) {
                num = this.f389494c.f389517o;
            } else {
                num = (Integer) this.f389494c.f389516n.get(tVar);
            }
            boolean z2 = false;
            if (num == null) {
                z = false;
                z2 = true;
            } else {
                z = m233386b(j, j2, num.intValue());
            }
            if (z2) {
                ReentrantReadWriteLock.WriteLock writeLock = this.f389494c.f389509g.writeLock();
                writeLock.lock();
                try {
                    if (tVar == C143673z.f389505d) {
                        C143673z zVar = this.f389494c;
                        zVar.f389517o = zVar.mo119023g(zVar.f389515m);
                        num2 = this.f389494c.f389517o;
                    } else {
                        num2 = this.f389494c.mo119023g(tVar);
                    }
                    this.f389494c.f389509g.readLock().lock();
                    writeLock.unlock();
                    ReentrantReadWriteLock.ReadLock readLock = this.f389494c.f389509g.readLock();
                    boolean b = m233386b(j, j2, num2.intValue());
                    readLock.unlock();
                    z = b;
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
            if (z) {
                this.f389494c.mo119021e().mo119022f();
            }
            if (this.f389494c.f389511i > 0 && this.f389494c.f389512j == null) {
                this.f389494c.mo119024h();
            }
        } finally {
            this.f389494c.f389509g.readLock().unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractCounter(");
        sb.append(this.f389492a);
        sb.append(")[");
        synchronized (this.f389495d) {
            for (int i = 0; i < this.f389493b.mo3725d(); i++) {
                C0981k kVar = (C0981k) this.f389493b.mo3727f(i);
                sb.append(this.f389493b.mo3723c(i));
                sb.append(" -> [");
                for (int i2 = 0; i2 < kVar.mo3675c(); i2++) {
                    sb.append(kVar.mo3677d(i2));
                    sb.append(" = ");
                    sb.append(((long[]) kVar.mo3680g(i2))[0]);
                    sb.append(", ");
                }
                sb.append("], ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected C143662o(C143673z zVar, String str) {
        this.f389494c = zVar;
        this.f389495d = new Object();
        this.f389493b = new C0985o(10);
        this.f389497f = zVar.f389508f;
        if (!zVar.f389514l.containsKey(str)) {
            this.f389492a = str;
            return;
        }
        throw new IllegalStateException("counter/histogram already exists: ".concat(String.valueOf(str)));
    }
}
