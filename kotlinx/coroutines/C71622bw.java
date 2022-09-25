package kotlinx.coroutines;

import java.util.Arrays;
import kotlinx.coroutines.p5579e.C71716ax;
import kotlinx.coroutines.p5579e.C71717ay;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.bw */
/* compiled from: PG */
public abstract class C71622bw implements Runnable, Comparable, C71615bp, C71717ay {
    private volatile Object _heap;

    /* renamed from: a */
    private int f191060a = -1;

    /* renamed from: b */
    public long f191061b;

    public C71622bw(long j) {
        this.f191061b = j;
    }

    /* renamed from: b */
    public final int mo62853b() {
        return this.f191060a;
    }

    /* renamed from: c */
    public final synchronized int mo62854c(long j, C71623bx bxVar, C71624by byVar) {
        C69664n.m101061g(bxVar, "delayed");
        if (this._heap == C71628ca.f191071a) {
            return 2;
        }
        synchronized (bxVar) {
            C71622bw bwVar = (C71622bw) bxVar.mo62968a();
            if (byVar.f191065g.mo62669a()) {
                return 1;
            }
            if (bwVar == null) {
                bxVar.f191062a = j;
            } else {
                long j2 = bwVar.f191061b;
                if (j2 - j < 0) {
                    j = j2;
                }
                long j3 = bxVar.f191062a;
                if (j - j3 > 0) {
                    bxVar.f191062a = j;
                } else {
                    j = j3;
                }
            }
            if (this.f191061b - j < 0) {
                this.f191061b = j;
            }
            boolean z = C71600ba.f191036a;
            mo62857e(bxVar);
            C71717ay[] ayVarArr = bxVar.f191185b;
            if (ayVarArr == null) {
                ayVarArr = new C71717ay[4];
                bxVar.f191185b = ayVarArr;
            } else if (bxVar.f191186c.f190526b >= ayVarArr.length) {
                int i = bxVar.f191186c.f190526b;
                Object[] copyOf = Arrays.copyOf(ayVarArr, i + i);
                C69664n.m101060f(copyOf, "copyOf(this, newSize)");
                ayVarArr = (C71717ay[]) copyOf;
                bxVar.f191185b = ayVarArr;
            }
            int i2 = bxVar.f191186c.f190526b;
            bxVar.f191186c.f190526b = i2 + 1;
            ayVarArr[i2] = this;
            mo62858f(i2);
            bxVar.mo62970c(i2);
            return 0;
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C71622bw bwVar = (C71622bw) obj;
        C69664n.m101061g(bwVar, "other");
        long j = this.f191061b - bwVar.f191061b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    /* renamed from: d */
    public final C71716ax mo62856d() {
        Object obj = this._heap;
        if (obj instanceof C71716ax) {
            return (C71716ax) obj;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo62857e(C71716ax axVar) {
        if (this._heap != C71628ca.f191071a) {
            this._heap = axVar;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: f */
    public final void mo62858f(int i) {
        this.f191060a = i;
    }

    /* renamed from: lT */
    public final synchronized void mo62732lT() {
        Object obj = this._heap;
        if (obj != C71628ca.f191071a) {
            C71623bx bxVar = obj instanceof C71623bx ? (C71623bx) obj : null;
            if (bxVar != null) {
                synchronized (bxVar) {
                    if (mo62856d() != null) {
                        int b = mo62853b();
                        boolean z = C71600ba.f191036a;
                        bxVar.mo62969b(b);
                    }
                }
            }
            this._heap = C71628ca.f191071a;
        }
    }

    public String toString() {
        long j = this.f191061b;
        return "Delayed[nanos=" + j + "]";
    }
}
