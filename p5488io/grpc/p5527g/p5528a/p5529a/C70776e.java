package p5488io.grpc.p5527g.p5528a.p5529a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.PrivateKeyType;
import p5589m.C71830g;
import p5589m.C71831h;
import p5589m.C71832i;
import p5589m.C71835l;
import p5589m.C71841r;
import p5589m.C71847x;

/* renamed from: io.grpc.g.a.a.e */
/* compiled from: PG */
public final class C70776e {

    /* renamed from: a */
    public final List f188727a = new ArrayList();

    /* renamed from: b */
    public final C71830g f188728b;

    /* renamed from: c */
    public int f188729c;

    /* renamed from: d */
    public int f188730d;

    /* renamed from: e */
    C70775d[] f188731e;

    /* renamed from: f */
    int f188732f;

    /* renamed from: g */
    int f188733g;

    /* renamed from: h */
    int f188734h;

    public C70776e(C71847x xVar) {
        C70775d[] dVarArr = new C70775d[8];
        this.f188731e = dVarArr;
        this.f188732f = dVarArr.length - 1;
        this.f188733g = 0;
        this.f188734h = 0;
        this.f188729c = 4096;
        this.f188730d = 4096;
        this.f188728b = C71835l.m105189b(xVar);
    }

    /* renamed from: g */
    public static final boolean m103498g(int i) {
        if (i < 0) {
            return false;
        }
        int length = C70778g.f188741b.length;
        return i <= 60;
    }

    /* renamed from: h */
    private final int m103499h() {
        return this.f188728b.mo63062c() & 255;
    }

    /* renamed from: i */
    private final void m103500i() {
        Arrays.fill(this.f188731e, (Object) null);
        this.f188732f = this.f188731e.length - 1;
        this.f188733g = 0;
        this.f188734h = 0;
    }

    /* renamed from: j */
    private final void m103501j(int i) {
        int i2;
        if (i > 0) {
            int length = this.f188731e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f188732f;
                if (length < i2 || i <= 0) {
                    C70775d[] dVarArr = this.f188731e;
                    int i4 = i2 + 1;
                    System.arraycopy(dVarArr, i4, dVarArr, i4 + i3, this.f188733g);
                    this.f188732f += i3;
                } else {
                    int i5 = this.f188731e[length].f188726h;
                    i -= i5;
                    this.f188734h -= i5;
                    this.f188733g--;
                    i3++;
                    length--;
                }
            }
            C70775d[] dVarArr2 = this.f188731e;
            int i42 = i2 + 1;
            System.arraycopy(dVarArr2, i42, dVarArr2, i42 + i3, this.f188733g);
            this.f188732f += i3;
        }
    }

    /* renamed from: a */
    public final int mo62463a(int i) {
        return this.f188732f + 1 + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo62464b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int h = m103499h();
            if ((h & 128) == 0) {
                return i2 + (h << i4);
            }
            i2 += (h & 127) << i4;
            i4 += 7;
        }
    }

    /* renamed from: c */
    public final C71832i mo62465c(int i) {
        if (m103498g(i)) {
            return C70778g.f188741b[i].f188724f;
        }
        int length = C70778g.f188741b.length;
        int a = mo62463a(i - 61);
        if (a >= 0) {
            C70775d[] dVarArr = this.f188731e;
            if (a < dVarArr.length) {
                return dVarArr[a].f188724f;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C71832i mo62466d() {
        int h = m103499h();
        int b = mo62464b(h, 127);
        if ((h & 128) != 128) {
            return this.f188728b.mo63073j((long) b);
        }
        C70785n nVar = C70785n.f188765a;
        long j = (long) b;
        C71841r rVar = (C71841r) this.f188728b;
        rVar.mo63077n(j);
        byte[] r = rVar.f191371b.mo63081r(j);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C70784m mVar = nVar.f188768b;
        int i = 0;
        byte b2 = 0;
        for (byte b3 : r) {
            b2 = (b2 << 8) | (b3 & 255);
            i += 8;
            while (i >= 8) {
                int i2 = i - 8;
                mVar = mVar.f188762a[(b2 >>> i2) & PrivateKeyType.INVALID];
                if (mVar.f188762a == null) {
                    byteArrayOutputStream.write(mVar.f188763b);
                    i -= mVar.f188764c;
                    mVar = nVar.f188768b;
                } else {
                    i = i2;
                }
            }
        }
        while (i > 0) {
            C70784m mVar2 = mVar.f188762a[(b2 << (8 - i)) & PrivateKeyType.INVALID];
            if (mVar2.f188762a != null || mVar2.f188764c > i) {
                break;
            }
            byteArrayOutputStream.write(mVar2.f188763b);
            i -= mVar2.f188764c;
            mVar = nVar.f188768b;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C71832i iVar = C71832i.f191357a;
        return C71831h.m105171b(byteArray);
    }

    /* renamed from: e */
    public final void mo62467e() {
        int i = this.f188730d;
        int i2 = this.f188734h;
        if (i >= i2) {
            return;
        }
        if (i == 0) {
            m103500i();
        } else {
            m103501j(i2 - i);
        }
    }

    /* renamed from: f */
    public final void mo62468f(C70775d dVar) {
        this.f188727a.add(dVar);
        int i = dVar.f188726h;
        int i2 = this.f188730d;
        if (i > i2) {
            m103500i();
            return;
        }
        m103501j((this.f188734h + i) - i2);
        int i3 = this.f188733g;
        C70775d[] dVarArr = this.f188731e;
        int length = dVarArr.length;
        if (i3 + 1 > length) {
            C70775d[] dVarArr2 = new C70775d[(length + length)];
            System.arraycopy(dVarArr, 0, dVarArr2, length, length);
            this.f188732f = this.f188731e.length - 1;
            this.f188731e = dVarArr2;
        }
        int i4 = this.f188732f;
        this.f188732f = i4 - 1;
        this.f188731e[i4] = dVar;
        this.f188733g++;
        this.f188734h += i;
    }
}
