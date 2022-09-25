package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ox */
/* compiled from: PG */
public final class C7187ox implements C7208pr {

    /* renamed from: a */
    private final C7171oh f23415a;

    /* renamed from: b */
    private final aed f23416b = new aed(new byte[10]);

    /* renamed from: c */
    private int f23417c = 0;

    /* renamed from: d */
    private int f23418d;

    /* renamed from: e */
    private aes f23419e;

    /* renamed from: f */
    private boolean f23420f;

    /* renamed from: g */
    private boolean f23421g;

    /* renamed from: h */
    private boolean f23422h;

    /* renamed from: i */
    private int f23423i;

    /* renamed from: j */
    private int f23424j;

    /* renamed from: k */
    private boolean f23425k;

    /* renamed from: l */
    private long f23426l;

    public C7187ox(C7171oh ohVar) {
        this.f23415a = ohVar;
    }

    /* renamed from: d */
    private final void m21429d(int i) {
        this.f23417c = i;
        this.f23418d = 0;
    }

    /* renamed from: e */
    private final boolean m21430e(aee aee, byte[] bArr, int i) {
        int min = Math.min(aee.mo14550d(), i - this.f23418d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            aee.mo14557k(min);
        } else {
            aee.mo14559m(bArr, this.f23418d, min);
        }
        int i2 = this.f23418d + min;
        this.f23418d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo16257a(aes aes, C7056ka kaVar, C7207pq pqVar) {
        this.f23419e = aes;
        this.f23415a.mo16216b(kaVar, pqVar);
    }

    /* renamed from: b */
    public final void mo16258b() {
        this.f23417c = 0;
        this.f23418d = 0;
        this.f23422h = false;
        this.f23415a.mo16215a();
    }

    /* renamed from: c */
    public final void mo16259c(aee aee, int i) {
        aee aee2 = aee;
        ary.m19466s(this.f23419e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.f23417c;
            if (!(i4 == 0 || i4 == 1)) {
                if (i4 != 2) {
                    int i5 = this.f23424j;
                    if (i5 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i5);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f23415a.mo16219e();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m21429d(1);
        }
        int i6 = i;
        while (aee.mo14550d() > 0) {
            int i7 = this.f23417c;
            if (i7 != 0) {
                int i8 = 0;
                if (i7 != 1) {
                    if (i7 != i3) {
                        int d = aee.mo14550d();
                        int i9 = this.f23424j;
                        if (i9 != i2) {
                            i8 = d - i9;
                        }
                        if (i8 > 0) {
                            d -= i8;
                            aee2.mo14552f(aee.mo14553g() + d);
                        }
                        this.f23415a.mo16218d(aee2);
                        int i10 = this.f23424j;
                        if (i10 != i2) {
                            int i11 = i10 - d;
                            this.f23424j = i11;
                            if (i11 == 0) {
                                this.f23415a.mo16219e();
                                m21429d(1);
                            }
                        }
                    } else {
                        if (m21430e(aee2, this.f23416b.f20421a, Math.min(10, this.f23423i)) && m21430e(aee2, (byte[]) null, this.f23423i)) {
                            this.f23416b.mo14528e(0);
                            long j = -9223372036854775807L;
                            this.f23426l = -9223372036854775807L;
                            if (this.f23420f) {
                                this.f23416b.mo14530g(4);
                                int i12 = this.f23416b.mo14532i(3);
                                this.f23416b.mo14530g(1);
                                int i13 = this.f23416b.mo14532i(15);
                                this.f23416b.mo14530g(1);
                                long i14 = ((long) (i13 << 15)) | (((long) i12) << 30) | ((long) this.f23416b.mo14532i(15));
                                this.f23416b.mo14530g(1);
                                if (!this.f23422h && this.f23421g) {
                                    this.f23416b.mo14530g(4);
                                    int i15 = this.f23416b.mo14532i(3);
                                    this.f23416b.mo14530g(1);
                                    int i16 = this.f23416b.mo14532i(15);
                                    this.f23416b.mo14530g(1);
                                    int i17 = this.f23416b.mo14532i(15);
                                    this.f23416b.mo14530g(1);
                                    this.f23419e.mo14602f((((long) i15) << 30) | ((long) (i16 << 15)) | ((long) i17));
                                    this.f23422h = true;
                                }
                                j = this.f23419e.mo14602f(i14);
                                this.f23426l = j;
                            }
                            i6 |= true != this.f23425k ? 0 : 4;
                            this.f23415a.mo16217c(j, i6);
                            m21429d(3);
                            i2 = -1;
                        }
                    }
                } else if (m21430e(aee2, this.f23416b.f20421a, 9)) {
                    int i18 = 0;
                    this.f23416b.mo14528e(0);
                    int i19 = this.f23416b.mo14532i(24);
                    if (i19 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(i19);
                        Log.w("PesReader", sb2.toString());
                        i2 = -1;
                        this.f23424j = -1;
                    } else {
                        this.f23416b.mo14530g(8);
                        int i20 = this.f23416b.mo14532i(16);
                        this.f23416b.mo14530g(5);
                        this.f23425k = this.f23416b.mo14531h();
                        this.f23416b.mo14530g(2);
                        this.f23420f = this.f23416b.mo14531h();
                        this.f23421g = this.f23416b.mo14531h();
                        this.f23416b.mo14530g(6);
                        int i21 = this.f23416b.mo14532i(8);
                        this.f23423i = i21;
                        if (i20 == 0) {
                            this.f23424j = -1;
                        } else {
                            int i22 = (i20 - 3) - i21;
                            this.f23424j = i22;
                            if (i22 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i22);
                                Log.w("PesReader", sb3.toString());
                                i2 = -1;
                                this.f23424j = -1;
                                i18 = 2;
                            }
                        }
                        i2 = -1;
                        i18 = 2;
                    }
                    m21429d(i18);
                } else {
                    i2 = -1;
                }
            } else {
                aee2.mo14557k(aee.mo14550d());
            }
            i3 = 2;
        }
    }
}
