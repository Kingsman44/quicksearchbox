package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.C3329ad;

/* renamed from: androidx.media3.extractor.k.z */
/* compiled from: PG */
public final class C3573z implements C3546as {

    /* renamed from: a */
    private final C3557j f11366a;

    /* renamed from: b */
    private final C2603ab f11367b = new C2603ab(new byte[10], 10);

    /* renamed from: c */
    private int f11368c = 0;

    /* renamed from: d */
    private int f11369d;

    /* renamed from: e */
    private C2609ah f11370e;

    /* renamed from: f */
    private boolean f11371f;

    /* renamed from: g */
    private boolean f11372g;

    /* renamed from: h */
    private boolean f11373h;

    /* renamed from: i */
    private int f11374i;

    /* renamed from: j */
    private int f11375j;

    /* renamed from: k */
    private boolean f11376k;

    public C3573z(C3557j jVar) {
        this.f11366a = jVar;
    }

    /* renamed from: d */
    private final void m10340d(int i) {
        this.f11368c = i;
        this.f11369d = 0;
    }

    /* renamed from: e */
    private final boolean m10341e(C2604ac acVar, byte[] bArr, int i) {
        int min = Math.min(acVar.f7236c - acVar.f7235b, i - this.f11369d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            acVar.mo6131A(acVar.f7235b + min);
        } else {
            acVar.mo6155w(bArr, this.f11369d, min);
        }
        int i2 = this.f11369d + min;
        this.f11369d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo7456a(C2604ac acVar, int i) {
        int i2;
        long j;
        C2604ac acVar2 = acVar;
        C2601a.m6829a(this.f11370e);
        int i3 = -1;
        int i4 = 2;
        if ((i & 1) != 0) {
            int i5 = this.f11368c;
            if (!(i5 == 0 || i5 == 1)) {
                if (i5 != 2) {
                    int i6 = this.f11375j;
                    if (i6 != -1) {
                        C2633u.m7050e("PesReader", "Unexpected start indicator: expected " + i6 + " more bytes");
                    }
                    this.f11366a.mo7468c();
                } else {
                    C2633u.m7050e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m10340d(1);
        }
        int i7 = i;
        while (true) {
            int i8 = acVar2.f7236c;
            int i9 = acVar2.f7235b;
            int i10 = i8 - i9;
            if (i10 > 0) {
                int i11 = this.f11368c;
                if (i11 != 0) {
                    int i12 = 0;
                    if (i11 != 1) {
                        if (i11 != i4) {
                            int i13 = this.f11375j;
                            if (i13 != i3) {
                                i12 = i10 - i13;
                            }
                            if (i12 > 0) {
                                i10 -= i12;
                                acVar2.mo6158z(i9 + i10);
                            }
                            this.f11366a.mo7466a(acVar2);
                            int i14 = this.f11375j;
                            if (i14 != i3) {
                                int i15 = i14 - i10;
                                this.f11375j = i15;
                                if (i15 == 0) {
                                    this.f11366a.mo7468c();
                                    m10340d(1);
                                }
                            }
                        } else {
                            if (m10341e(acVar2, this.f11367b.f7230a, Math.min(10, this.f11374i)) && m10341e(acVar2, (byte[]) null, this.f11374i)) {
                                this.f11367b.mo6124i(0);
                                if (this.f11371f) {
                                    this.f11367b.mo6126k(4);
                                    int d = this.f11367b.mo6119d(3);
                                    this.f11367b.mo6126k(1);
                                    int d2 = this.f11367b.mo6119d(15);
                                    this.f11367b.mo6126k(1);
                                    long d3 = ((long) (d2 << 15)) | (((long) d) << 30) | ((long) this.f11367b.mo6119d(15));
                                    this.f11367b.mo6126k(1);
                                    if (!this.f11373h && this.f11372g) {
                                        this.f11367b.mo6126k(4);
                                        int d4 = this.f11367b.mo6119d(3);
                                        this.f11367b.mo6126k(1);
                                        int d5 = this.f11367b.mo6119d(15);
                                        this.f11367b.mo6126k(1);
                                        int d6 = this.f11367b.mo6119d(15);
                                        this.f11367b.mo6126k(1);
                                        this.f11370e.mo6180b((((long) d4) << 30) | ((long) (d5 << 15)) | ((long) d6));
                                        this.f11373h = true;
                                    }
                                    j = this.f11370e.mo6180b(d3);
                                } else {
                                    j = -9223372036854775807L;
                                }
                                i7 |= true != this.f11376k ? 0 : 4;
                                this.f11366a.mo7469d(j, i7);
                                m10340d(3);
                                i3 = -1;
                            }
                        }
                    } else if (m10341e(acVar2, this.f11367b.f7230a, 9)) {
                        this.f11367b.mo6124i(0);
                        int d7 = this.f11367b.mo6119d(24);
                        if (d7 != 1) {
                            C2633u.m7050e("PesReader", "Unexpected start code prefix: " + d7);
                            i3 = -1;
                            this.f11375j = -1;
                            i2 = 0;
                        } else {
                            this.f11367b.mo6126k(8);
                            int d8 = this.f11367b.mo6119d(16);
                            this.f11367b.mo6126k(5);
                            this.f11376k = this.f11367b.mo6128m();
                            this.f11367b.mo6126k(2);
                            this.f11371f = this.f11367b.mo6128m();
                            this.f11372g = this.f11367b.mo6128m();
                            this.f11367b.mo6126k(6);
                            int d9 = this.f11367b.mo6119d(8);
                            this.f11374i = d9;
                            if (d8 == 0) {
                                this.f11375j = -1;
                            } else {
                                int i16 = (d8 - 3) - d9;
                                this.f11375j = i16;
                                if (i16 < 0) {
                                    C2633u.m7050e("PesReader", "Found negative packet payload size: " + i16);
                                    i3 = -1;
                                    this.f11375j = -1;
                                    i2 = 2;
                                }
                            }
                            i3 = -1;
                            i2 = 2;
                        }
                        m10340d(i2);
                    } else {
                        i3 = -1;
                    }
                } else {
                    acVar2.mo6131A(i9 + i10);
                }
                i4 = 2;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo7457b(C2609ah ahVar, C3329ad adVar, C3545ar arVar) {
        this.f11370e = ahVar;
        this.f11366a.mo7467b(adVar, arVar);
    }

    /* renamed from: c */
    public final void mo7458c() {
        this.f11368c = 0;
        this.f11369d = 0;
        this.f11373h = false;
        this.f11366a.mo7470e();
    }
}
