package androidx.media3.exoplayer.p145h;

import androidx.media3.common.C2652bn;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.C2897cz;
import androidx.media3.exoplayer.p150j.C3197ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: androidx.media3.exoplayer.h.bh */
/* compiled from: PG */
final class C3070bh implements C3034aq, C3033ap {

    /* renamed from: a */
    public final C3034aq[] f8918a;

    /* renamed from: b */
    private final IdentityHashMap f8919b;

    /* renamed from: c */
    private final ArrayList f8920c = new ArrayList();

    /* renamed from: d */
    private final HashMap f8921d = new HashMap();

    /* renamed from: e */
    private C3033ap f8922e;

    /* renamed from: f */
    private C3107cr f8923f;

    /* renamed from: g */
    private C3034aq[] f8924g;

    /* renamed from: h */
    private C3097ch f8925h;

    public C3070bh(long[] jArr, C3034aq... aqVarArr) {
        this.f8918a = aqVarArr;
        this.f8925h = new C3116k(new C3097ch[0]);
        this.f8919b = new IdentityHashMap();
        this.f8924g = new C3034aq[0];
        for (int i = 0; i < aqVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f8918a[i] = new C3068bf(aqVarArr[i], j);
            }
        }
    }

    /* renamed from: a */
    public final long mo6807a(long j, C2897cz czVar) {
        C3034aq[] aqVarArr = this.f8924g;
        return (aqVarArr.length > 0 ? aqVarArr[0] : this.f8918a[0]).mo6807a(j, czVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6617b(C3097ch chVar) {
        C3034aq aqVar = (C3034aq) chVar;
        C3033ap apVar = this.f8922e;
        apVar.getClass();
        apVar.mo6617b(this);
    }

    /* renamed from: c */
    public final long mo6808c() {
        return this.f8925h.mo6808c();
    }

    /* renamed from: d */
    public final long mo6809d() {
        return this.f8925h.mo6809d();
    }

    /* renamed from: e */
    public final long mo6810e() {
        long j = -9223372036854775807L;
        for (C3034aq aqVar : this.f8924g) {
            long e = aqVar.mo6810e();
            if (e != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    C3034aq[] aqVarArr = this.f8924g;
                    int length = aqVarArr.length;
                    int i = 0;
                    while (i < length) {
                        C3034aq aqVar2 = aqVarArr[i];
                        if (aqVar2 == aqVar) {
                            break;
                        } else if (aqVar2.mo6811f(e) == e) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = e;
                } else if (e != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || aqVar.mo6811f(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    /* renamed from: eY */
    public final void mo6620eY(C3034aq aqVar) {
        this.f8920c.remove(aqVar);
        if (this.f8920c.isEmpty()) {
            int i = 0;
            for (C3034aq h : this.f8918a) {
                i += h.mo6814h().f9109b;
            }
            C2652bn[] bnVarArr = new C2652bn[i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                C3034aq[] aqVarArr = this.f8918a;
                if (i2 < aqVarArr.length) {
                    C3107cr h2 = aqVarArr[i2].mo6814h();
                    int i4 = h2.f9109b;
                    int i5 = 0;
                    while (i5 < i4) {
                        C2652bn b = h2.mo7097b(i5);
                        C2652bn bnVar = new C2652bn(i2 + ":" + b.f7355b, b.f7357d);
                        this.f8921d.put(bnVar, b);
                        bnVarArr[i3] = bnVar;
                        i5++;
                        i3++;
                    }
                    i2++;
                } else {
                    this.f8923f = new C3107cr(bnVarArr);
                    C3033ap apVar = this.f8922e;
                    apVar.getClass();
                    apVar.mo6620eY(this);
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public final long mo6811f(long j) {
        long f = this.f8924g[0].mo6811f(j);
        int i = 1;
        while (true) {
            C3034aq[] aqVarArr = this.f8924g;
            if (i >= aqVarArr.length) {
                return f;
            }
            if (aqVarArr[i].mo6811f(f) == f) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* renamed from: fc */
    public final void mo6812fc(C3033ap apVar, long j) {
        this.f8922e = apVar;
        Collections.addAll(this.f8920c, this.f8918a);
        for (C3034aq fc : this.f8918a) {
            fc.mo6812fc(this, j);
        }
    }

    /* renamed from: g */
    public final long mo6813g(C3197ad[] adVarArr, boolean[] zArr, C3095cf[] cfVarArr, boolean[] zArr2, long j) {
        int length;
        Integer num;
        int i;
        C3197ad[] adVarArr2 = adVarArr;
        C3095cf[] cfVarArr2 = cfVarArr;
        int length2 = adVarArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = adVarArr2.length;
            num = 0;
            if (i2 >= length) {
                break;
            }
            C3095cf cfVar = cfVarArr2[i2];
            if (cfVar != null) {
                num = (Integer) this.f8919b.get(cfVar);
            }
            if (num == null) {
                i = -1;
            } else {
                i = num.intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            C3197ad adVar = adVarArr2[i2];
            if (adVar != null) {
                C2652bn bnVar = (C2652bn) this.f8921d.get(adVar.mo7035m());
                bnVar.getClass();
                int i3 = 0;
                while (true) {
                    C3034aq[] aqVarArr = this.f8918a;
                    if (i3 >= aqVarArr.length) {
                        break;
                    } else if (aqVarArr[i3].mo6814h().mo7096a(bnVar) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f8919b.clear();
        C3095cf[] cfVarArr3 = new C3095cf[length];
        C3095cf[] cfVarArr4 = new C3095cf[length];
        C3197ad[] adVarArr3 = new C3197ad[length];
        ArrayList arrayList = new ArrayList(this.f8918a.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f8918a.length) {
            for (int i5 = 0; i5 < adVarArr2.length; i5++) {
                cfVarArr4[i5] = iArr[i5] == i4 ? cfVarArr2[i5] : num;
                if (iArr2[i5] == i4) {
                    C3197ad adVar2 = adVarArr2[i5];
                    adVar2.getClass();
                    C2652bn bnVar2 = (C2652bn) this.f8921d.get(adVar2.mo7035m());
                    bnVar2.getClass();
                    adVarArr3[i5] = new C3067be(adVar2, bnVar2);
                } else {
                    adVarArr3[i5] = num;
                }
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            C3095cf[] cfVarArr5 = cfVarArr4;
            C3197ad[] adVarArr4 = adVarArr3;
            long g = this.f8918a[i4].mo6813g(adVarArr3, zArr, cfVarArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = g;
            } else if (g != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < adVarArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    C3095cf cfVar2 = cfVarArr5[i7];
                    cfVar2.getClass();
                    cfVarArr3[i7] = cfVar2;
                    this.f8919b.put(cfVar2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (cfVarArr5[i7] != null) {
                        z2 = false;
                    }
                    C2601a.m6832d(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f8918a[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            cfVarArr4 = cfVarArr5;
            adVarArr3 = adVarArr4;
            num = null;
        }
        System.arraycopy(cfVarArr3, 0, cfVarArr2, 0, length);
        C3034aq[] aqVarArr2 = (C3034aq[]) arrayList.toArray(new C3034aq[0]);
        this.f8924g = aqVarArr2;
        this.f8925h = new C3116k(aqVarArr2);
        return j2;
    }

    /* renamed from: h */
    public final C3107cr mo6814h() {
        C3107cr crVar = this.f8923f;
        crVar.getClass();
        return crVar;
    }

    /* renamed from: i */
    public final void mo6815i(long j, boolean z) {
        for (C3034aq i : this.f8924g) {
            i.mo6815i(j, z);
        }
    }

    /* renamed from: j */
    public final void mo6816j() {
        for (C3034aq j : this.f8918a) {
            j.mo6816j();
        }
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
        this.f8925h.mo6818m(j);
    }

    /* renamed from: n */
    public final boolean mo6819n(long j) {
        if (this.f8920c.isEmpty()) {
            return this.f8925h.mo6819n(j);
        }
        int size = this.f8920c.size();
        for (int i = 0; i < size; i++) {
            ((C3034aq) this.f8920c.get(i)).mo6819n(j);
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        return this.f8925h.mo6820o();
    }
}
