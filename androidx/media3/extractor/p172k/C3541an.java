package androidx.media3.extractor.p172k;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.C3363ba;
import androidx.media3.extractor.C3627q;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.k.an */
/* compiled from: PG */
public final class C3541an implements C3326aa {

    /* renamed from: a */
    public final int f11084a;

    /* renamed from: b */
    public final List f11085b;

    /* renamed from: c */
    public final C3544aq f11086c;

    /* renamed from: d */
    public final SparseArray f11087d;

    /* renamed from: e */
    public final SparseBooleanArray f11088e;

    /* renamed from: f */
    public final SparseBooleanArray f11089f;

    /* renamed from: g */
    public C3329ad f11090g;

    /* renamed from: h */
    public int f11091h;

    /* renamed from: i */
    public boolean f11092i;

    /* renamed from: j */
    public C3546as f11093j;

    /* renamed from: k */
    public int f11094k;

    /* renamed from: l */
    private final C2604ac f11095l;

    /* renamed from: m */
    private final SparseIntArray f11096m;

    /* renamed from: n */
    private final C3538ak f11097n;

    /* renamed from: o */
    private C3537aj f11098o;

    /* renamed from: p */
    private boolean f11099p;

    /* renamed from: q */
    private boolean f11100q;

    /* renamed from: r */
    private int f11101r;

    public C3541an() {
        this((byte[]) null);
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        C3537aj ajVar;
        C2601a.m6832d(this.f11084a != 2);
        int size = this.f11085b.size();
        for (int i = 0; i < size; i++) {
            C2609ah ahVar = (C2609ah) this.f11085b.get(i);
            if (ahVar.mo6183e() != -9223372036854775807L) {
                long c = ahVar.mo6181c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            ahVar.mo6184h(j2);
        }
        if (!(j2 == 0 || (ajVar = this.f11098o) == null)) {
            ajVar.mo7488b(j2);
        }
        this.f11095l.mo6156x(0);
        this.f11096m.clear();
        for (int i2 = 0; i2 < this.f11087d.size(); i2++) {
            ((C3546as) this.f11087d.valueAt(i2)).mo7458c();
        }
        this.f11101r = 0;
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        byte[] bArr = this.f11095l.f7234a;
        C3627q qVar = (C3627q) abVar;
        qVar.mo7320o(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (bArr[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            qVar.mo7639q(i);
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f11090g = adVar;
    }

    public C3541an(byte[] bArr) {
        this(1, new C2609ah(0), new C3554g((byte[]) null));
    }

    public C3541an(int i, C2609ah ahVar, C3544aq aqVar) {
        this.f11086c = aqVar;
        this.f11084a = i;
        this.f11085b = Collections.singletonList(ahVar);
        this.f11095l = new C2604ac(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f11088e = sparseBooleanArray;
        this.f11089f = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f11087d = sparseArray;
        this.f11096m = new SparseIntArray();
        this.f11097n = new C3538ak();
        this.f11090g = C3329ad.f10053E;
        this.f11094k = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f11087d.put(sparseArray2.keyAt(i2), (C3546as) sparseArray2.valueAt(i2));
        }
        this.f11087d.put(0, new C3534ag(new C3539al(this)));
        this.f11093j = null;
    }

    /* renamed from: a */
    public final int mo7152a(C3327ab abVar, C3350ay ayVar) {
        boolean z;
        C3327ab abVar2;
        boolean z2;
        long j;
        C3327ab abVar3 = abVar;
        C3350ay ayVar2 = ayVar;
        C3627q qVar = (C3627q) abVar3;
        long j2 = qVar.f11565b;
        if (this.f11092i) {
            long j3 = -9223372036854775807L;
            if (!(j2 == -1 || this.f11084a == 2)) {
                C3538ak akVar = this.f11097n;
                if (!akVar.f11071c) {
                    int i = this.f11094k;
                    if (i <= 0) {
                        akVar.mo7460a(abVar3);
                    } else if (!akVar.f11073e) {
                        int min = (int) Math.min(112800, j2);
                        long j4 = j2 - ((long) min);
                        if (qVar.f11566c != j4) {
                            ayVar2.f10122a = j4;
                            return 1;
                        }
                        akVar.f11070b.mo6156x(min);
                        qVar.f11568e = 0;
                        qVar.mo7320o(akVar.f11070b.f7234a, 0, min, false);
                        C2604ac acVar = akVar.f11070b;
                        int i2 = acVar.f7235b;
                        int i3 = acVar.f7236c;
                        int i4 = i3 - 188;
                        while (true) {
                            if (i4 < i2) {
                                break;
                            }
                            byte[] bArr = acVar.f7234a;
                            int i5 = -4;
                            int i6 = 0;
                            while (true) {
                                if (i5 > 4) {
                                    break;
                                }
                                int i7 = (i5 * 188) + i4;
                                if (i7 < i2 || i7 >= i3 || bArr[i7] != 71) {
                                    i6 = 0;
                                } else {
                                    i6++;
                                    if (i6 == 5) {
                                        long b = C3547at.m10227b(acVar, i4, i);
                                        if (b != -9223372036854775807L) {
                                            j3 = b;
                                            break;
                                        }
                                    }
                                }
                                i5++;
                            }
                            i4--;
                        }
                        akVar.f11075g = j3;
                        akVar.f11073e = true;
                    } else if (akVar.f11075g == -9223372036854775807L) {
                        akVar.mo7460a(abVar3);
                    } else if (!akVar.f11072d) {
                        int min2 = (int) Math.min(112800, j2);
                        if (qVar.f11566c != 0) {
                            ayVar2.f10122a = 0;
                            return 1;
                        }
                        akVar.f11070b.mo6156x(min2);
                        qVar.f11568e = 0;
                        qVar.mo7320o(akVar.f11070b.f7234a, 0, min2, false);
                        C2604ac acVar2 = akVar.f11070b;
                        int i8 = acVar2.f7235b;
                        int i9 = acVar2.f7236c;
                        while (true) {
                            if (i8 >= i9) {
                                break;
                            }
                            if (acVar2.f7234a[i8] == 71) {
                                long b2 = C3547at.m10227b(acVar2, i8, i);
                                if (b2 != -9223372036854775807L) {
                                    j3 = b2;
                                    break;
                                }
                            }
                            i8++;
                        }
                        akVar.f11074f = j3;
                        akVar.f11072d = true;
                    } else {
                        long j5 = akVar.f11074f;
                        if (j5 == -9223372036854775807L) {
                            akVar.mo7460a(abVar3);
                        } else {
                            long b3 = akVar.f11069a.mo6180b(akVar.f11075g) - akVar.f11069a.mo6180b(j5);
                            akVar.f11076h = b3;
                            if (b3 < 0) {
                                C2633u.m7050e("TsDurationReader", "Invalid duration: " + b3 + ". Using TIME_UNSET instead.");
                                akVar.f11076h = -9223372036854775807L;
                            }
                            akVar.mo7460a(abVar3);
                        }
                    }
                    return 0;
                }
            }
            if (!this.f11099p) {
                this.f11099p = true;
                C3538ak akVar2 = this.f11097n;
                long j6 = akVar2.f11076h;
                if (j6 != -9223372036854775807L) {
                    j = 0;
                    C3537aj ajVar = r4;
                    z = false;
                    C3537aj ajVar2 = new C3537aj(akVar2.f11069a, j6, j2, this.f11094k);
                    this.f11098o = ajVar;
                    this.f11090g.mo6989q(ajVar.f11419a);
                } else {
                    j = 0;
                    z = false;
                    this.f11090g.mo6989q(new C3363ba(-9223372036854775807L, 0));
                }
            } else {
                j = 0;
                z = false;
            }
            if (this.f11100q) {
                this.f11100q = z;
                mo7154d(j, j);
                if (qVar.f11566c != j) {
                    ayVar.f10122a = j;
                    return 1;
                }
            }
            C3350ay ayVar3 = ayVar;
            z2 = true;
            C3537aj ajVar3 = this.f11098o;
            if (ajVar3 != null && ajVar3.mo7489c()) {
                return ajVar3.mo7487a(abVar, ayVar3);
            }
            abVar2 = abVar;
        } else {
            abVar2 = abVar3;
            z2 = true;
            z = false;
        }
        C2604ac acVar3 = this.f11095l;
        byte[] bArr2 = acVar3.f7234a;
        int i10 = acVar3.f7235b;
        if (9400 - i10 < 188) {
            int i11 = acVar3.f7236c - i10;
            if (i11 > 0) {
                System.arraycopy(bArr2, i10, bArr2, z, i11);
            }
            this.f11095l.mo6157y(bArr2, i11);
        }
        while (true) {
            C2604ac acVar4 = this.f11095l;
            int i12 = acVar4.f7236c;
            int i13 = acVar4.f7235b;
            if (i12 - i13 < 188) {
                int a = abVar2.mo5879a(bArr2, i12, 9400 - i12);
                if (a == -1) {
                    return -1;
                }
                this.f11095l.mo6158z(i12 + a);
            } else {
                int a2 = C3547at.m10226a(acVar4.f7234a, i13, i12);
                this.f11095l.mo6131A(a2);
                int i14 = a2 + 188;
                C3546as asVar = null;
                if (i14 > i12) {
                    int i15 = this.f11101r + (a2 - i13);
                    this.f11101r = i15;
                    if (this.f11084a == 2 && i15 > 376) {
                        throw C2599az.m6819a("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
                    }
                } else {
                    this.f11101r = z;
                }
                C2604ac acVar5 = this.f11095l;
                int i16 = acVar5.f7236c;
                if (i14 > i16) {
                    return z;
                }
                int b4 = acVar5.mo6134b();
                if ((8388608 & b4) != 0) {
                    this.f11095l.mo6131A(i14);
                    return z;
                }
                int i17 = (4194304 & b4) != 0 ? 1 : 0;
                int i18 = (b4 >> 8) & 8191;
                int i19 = b4 & 32;
                if ((b4 & 16) != 0) {
                    asVar = (C3546as) this.f11087d.get(i18);
                }
                if (asVar == null) {
                    this.f11095l.mo6131A(i14);
                    return z;
                }
                if (this.f11084a != 2) {
                    int i20 = b4 & 15;
                    int i21 = this.f11096m.get(i18, i20 - 1);
                    this.f11096m.put(i18, i20);
                    if (i21 == i20) {
                        this.f11095l.mo6131A(i14);
                        return z;
                    } else if (i20 != ((i21 + (z2 ? 1 : 0)) & 15)) {
                        asVar.mo7458c();
                    }
                }
                if (i19 != 0) {
                    int g = this.f11095l.mo6139g();
                    i17 |= (this.f11095l.mo6139g() & 64) != 0 ? 2 : 0;
                    C2604ac acVar6 = this.f11095l;
                    acVar6.mo6131A(acVar6.f7235b + (g - 1));
                }
                boolean z3 = this.f11092i;
                if (this.f11084a == 2 || z3 || !this.f11089f.get(i18, z)) {
                    this.f11095l.mo6158z(i14);
                    asVar.mo7456a(this.f11095l, i17);
                    this.f11095l.mo6158z(i16);
                }
                if (this.f11084a != 2 && !z3 && this.f11092i && j2 != -1) {
                    this.f11100q = z2;
                }
                this.f11095l.mo6131A(i14);
                return z ? 1 : 0;
            }
        }
    }
}
