package androidx.media3.extractor.p172k;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3380d;
import androidx.media3.extractor.C3387e;

/* renamed from: androidx.media3.extractor.k.d */
/* compiled from: PG */
public final class C3551d implements C3557j {

    /* renamed from: a */
    private final C2603ab f11130a;

    /* renamed from: b */
    private final C2604ac f11131b;

    /* renamed from: c */
    private final String f11132c;

    /* renamed from: d */
    private String f11133d;

    /* renamed from: e */
    private C3368bf f11134e;

    /* renamed from: f */
    private int f11135f;

    /* renamed from: g */
    private int f11136g;

    /* renamed from: h */
    private boolean f11137h;

    /* renamed from: i */
    private long f11138i;

    /* renamed from: j */
    private C2680x f11139j;

    /* renamed from: k */
    private int f11140k;

    /* renamed from: l */
    private long f11141l;

    public C3551d() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo7466a(C2604ac acVar) {
        int g;
        byte b;
        C2601a.m6829a(this.f11134e);
        while (true) {
            int i = acVar.f7236c - acVar.f7235b;
            if (i > 0) {
                int i2 = this.f11135f;
                if (i2 == 0) {
                    while (true) {
                        if (acVar.f7236c - acVar.f7235b <= 0) {
                            break;
                        } else if (!this.f11137h) {
                            this.f11137h = acVar.mo6139g() == 172;
                        } else {
                            g = acVar.mo6139g();
                            this.f11137h = g == 172;
                            b = 64;
                            if (g == 64) {
                                break;
                            } else if (g == 65) {
                                g = 65;
                                break;
                            }
                        }
                    }
                    this.f11135f = 1;
                    byte[] bArr = this.f11131b.f7234a;
                    bArr[0] = -84;
                    if (g == 65) {
                        b = 65;
                    }
                    bArr[1] = b;
                    this.f11136g = 2;
                } else if (i2 != 1) {
                    int min = Math.min(i, this.f11140k - this.f11136g);
                    this.f11134e.mo6851c(acVar, min);
                    int i3 = this.f11136g + min;
                    this.f11136g = i3;
                    int i4 = this.f11140k;
                    if (i3 == i4) {
                        long j = this.f11141l;
                        if (j != -9223372036854775807L) {
                            this.f11134e.mo6852d(j, 1, i4, 0, (C3367be) null);
                            this.f11141l += this.f11138i;
                        }
                        this.f11135f = 0;
                    }
                } else {
                    byte[] bArr2 = this.f11131b.f7234a;
                    int min2 = Math.min(i, 16 - this.f11136g);
                    acVar.mo6155w(bArr2, this.f11136g, min2);
                    int i5 = this.f11136g + min2;
                    this.f11136g = i5;
                    if (i5 == 16) {
                        this.f11130a.mo6124i(0);
                        C3380d a = C3387e.m9794a(this.f11130a);
                        C2680x xVar = this.f11139j;
                        if (xVar == null || xVar.f7477A != 2 || a.f10223a != xVar.f7478B || !"audio/ac4".equals(xVar.f7496n)) {
                            C2679w wVar = new C2679w();
                            wVar.f7449a = this.f11133d;
                            wVar.f7459k = "audio/ac4";
                            wVar.f7472x = 2;
                            wVar.f7473y = a.f10223a;
                            wVar.f7451c = this.f11132c;
                            C2680x xVar2 = new C2680x(wVar);
                            this.f11139j = xVar2;
                            this.f11134e.mo6850b(xVar2);
                        }
                        this.f11140k = a.f10224b;
                        this.f11138i = (((long) a.f10225c) * 1000000) / ((long) this.f11139j.f7478B);
                        this.f11131b.mo6131A(0);
                        this.f11134e.mo6851c(this.f11131b, 16);
                        this.f11135f = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11133d = arVar.f11109b;
        arVar.mo7463b();
        this.f11134e = adVar.mo6987eZ(arVar.f11108a, 1);
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f11141l = j;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11135f = 0;
        this.f11136g = 0;
        this.f11137h = false;
        this.f11141l = -9223372036854775807L;
    }

    public C3551d(String str) {
        C2603ab abVar = new C2603ab(new byte[16], 16);
        this.f11130a = abVar;
        this.f11131b = new C2604ac(abVar.f7230a);
        this.f11135f = 0;
        this.f11136g = 0;
        this.f11137h = false;
        this.f11141l = -9223372036854775807L;
        this.f11132c = str;
    }
}
