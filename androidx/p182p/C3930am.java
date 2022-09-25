package androidx.p182p;

import androidx.p186q.p187a.C4055j;
import androidx.p186q.p187a.C4056k;
import androidx.p186q.p187a.p188a.C4045n;
import java.util.Iterator;
import java.util.TreeMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.am */
/* compiled from: PG */
public final class C3930am implements C4056k, C4055j {

    /* renamed from: a */
    public static final TreeMap f12576a = new TreeMap();

    /* renamed from: b */
    public volatile String f12577b;

    /* renamed from: c */
    public final long[] f12578c;

    /* renamed from: d */
    public final double[] f12579d;

    /* renamed from: e */
    public final String[] f12580e;

    /* renamed from: f */
    public final byte[][] f12581f;

    /* renamed from: g */
    public final int[] f12582g;

    /* renamed from: h */
    public int f12583h;

    /* renamed from: i */
    private final int f12584i;

    public C3930am(int i) {
        this.f12584i = i;
        int i2 = i + 1;
        this.f12582g = new int[i2];
        this.f12578c = new long[i2];
        this.f12579d = new double[i2];
        this.f12580e = new String[i2];
        this.f12581f = new byte[i2][];
    }

    /* renamed from: a */
    public final String mo8199a() {
        String str = this.f12577b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: b */
    public final void mo8200b(C4055j jVar) {
        int i = this.f12583h;
        if (i > 0) {
            int i2 = 1;
            while (true) {
                int i3 = this.f12582g[i2];
                if (i3 == 1) {
                    ((C4045n) jVar).f12930a.bindNull(i2);
                } else if (i3 == 2) {
                    ((C4045n) jVar).f12930a.bindLong(i2, this.f12578c[i2]);
                } else if (i3 == 3) {
                    ((C4045n) jVar).f12930a.bindDouble(i2, this.f12579d[i2]);
                } else if (i3 == 4) {
                    String str = this.f12580e[i2];
                    if (str != null) {
                        jVar.mo8206g(i2, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (i3 == 5) {
                    byte[] bArr = this.f12581f[i2];
                    if (bArr != null) {
                        jVar.mo8201c(i2, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8201c(int i, byte[] bArr) {
        throw null;
    }

    public final void close() {
    }

    /* renamed from: d */
    public final void mo8203d(int i, double d) {
        throw null;
    }

    /* renamed from: e */
    public final void mo8204e(int i, long j) {
        this.f12582g[i] = 2;
        this.f12578c[i] = j;
    }

    /* renamed from: f */
    public final void mo8205f(int i) {
        throw null;
    }

    /* renamed from: g */
    public final void mo8206g(int i, String str) {
        this.f12582g[i] = 4;
        this.f12580e[i] = str;
    }

    /* renamed from: h */
    public final void mo8207h() {
        TreeMap treeMap = f12576a;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f12584i), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                C69664n.m101060f(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
