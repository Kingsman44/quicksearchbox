package androidx.media3.extractor.p161h;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C2599az;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3339an;
import androidx.media3.extractor.C3347av;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.metadata.emsg.C3591c;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.media3.extractor.h.o */
/* compiled from: PG */
public final class C3428o implements C3326aa {

    /* renamed from: a */
    private static final byte[] f10509a = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: b */
    private static final C2680x f10510b;

    /* renamed from: A */
    private C3427n f10511A;

    /* renamed from: B */
    private int f10512B;

    /* renamed from: C */
    private int f10513C;

    /* renamed from: D */
    private int f10514D;

    /* renamed from: E */
    private boolean f10515E;

    /* renamed from: F */
    private C3329ad f10516F;

    /* renamed from: G */
    private C3368bf[] f10517G;

    /* renamed from: H */
    private C3368bf[] f10518H;

    /* renamed from: I */
    private boolean f10519I;

    /* renamed from: c */
    private final int f10520c;

    /* renamed from: d */
    private final List f10521d;

    /* renamed from: e */
    private final SparseArray f10522e;

    /* renamed from: f */
    private final C2604ac f10523f;

    /* renamed from: g */
    private final C2604ac f10524g;

    /* renamed from: h */
    private final C2604ac f10525h;

    /* renamed from: i */
    private final byte[] f10526i;

    /* renamed from: j */
    private final C2604ac f10527j;

    /* renamed from: k */
    private final C2609ah f10528k;

    /* renamed from: l */
    private final C3591c f10529l;

    /* renamed from: m */
    private final C2604ac f10530m;

    /* renamed from: n */
    private final ArrayDeque f10531n;

    /* renamed from: o */
    private final ArrayDeque f10532o;

    /* renamed from: p */
    private final C3368bf f10533p;

    /* renamed from: q */
    private int f10534q;

    /* renamed from: r */
    private int f10535r;

    /* renamed from: s */
    private long f10536s;

    /* renamed from: t */
    private int f10537t;

    /* renamed from: u */
    private C2604ac f10538u;

    /* renamed from: v */
    private long f10539v;

    /* renamed from: w */
    private int f10540w;

    /* renamed from: x */
    private long f10541x;

    /* renamed from: y */
    private long f10542y;

    /* renamed from: z */
    private long f10543z;

    static {
        C2679w wVar = new C2679w();
        wVar.f7459k = "application/x-emsg";
        f10510b = new C2680x(wVar);
    }

    public C3428o() {
        this((byte[]) null);
    }

    /* renamed from: f */
    private static DrmInitData m9927f(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C3415b bVar = (C3415b) list.get(i);
            if (bVar.f10463d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f10462a.f7234a;
                UUID a = C3434u.m9955a(bArr);
                if (a == null) {
                    C2633u.m7050e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(a, (String) null, MediaUtilities.MIME_TYPE, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData((String) null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    /* renamed from: g */
    private final void m9928g() {
        this.f10534q = 0;
        this.f10537t = 0;
    }

    /* renamed from: h */
    private static void m9929h(C2604ac acVar, int i, C3439z zVar) {
        acVar.mo6131A(i + 8);
        int b = acVar.mo6134b() & 16777215;
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int i2 = acVar.mo6141i();
            if (i2 == 0) {
                Arrays.fill(zVar.f10603l, 0, zVar.f10596e, false);
                return;
            }
            int i3 = zVar.f10596e;
            if (i2 == i3) {
                Arrays.fill(zVar.f10603l, 0, i2, z);
                zVar.mo7397a(acVar.f7236c - acVar.f7235b);
                C2604ac acVar2 = zVar.f10605n;
                acVar.mo6155w(acVar2.f7234a, 0, acVar2.f7236c);
                zVar.f10605n.mo6131A(0);
                zVar.f10606o = false;
                return;
            }
            throw C2599az.m6819a("Senc sample count " + i2 + " is different from fragment sample count" + i3, (Throwable) null);
        }
        throw C2599az.m6822d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: i */
    private final void m9930i(long j) {
        C3428o oVar;
        int i;
        int i2;
        C3413a aVar;
        SparseArray sparseArray;
        int i3;
        int i4;
        byte[] bArr;
        byte[] bArr2;
        int i5;
        boolean z;
        int i6;
        C3439z zVar;
        C3413a aVar2;
        byte[] bArr3;
        int i7;
        int i8;
        C3413a aVar3;
        int i9;
        List list;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C3424k kVar;
        C2604ac acVar;
        boolean z2;
        int i16;
        long j2;
        boolean z3;
        int i17;
        int i18;
        int i19;
        int i20;
        C3428o oVar2 = this;
        while (!oVar2.f10531n.isEmpty() && ((C3413a) oVar2.f10531n.peek()).f10451a == j) {
            C3413a aVar4 = (C3413a) oVar2.f10531n.pop();
            int i21 = aVar4.f10463d;
            int i22 = 12;
            int i23 = 8;
            if (i21 == 1836019574) {
                DrmInitData f = m9927f(aVar4.f10452b);
                C3413a a = aVar4.mo7379a(1836475768);
                a.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = a.f10452b.size();
                long j3 = -9223372036854775807L;
                int i24 = 0;
                while (i24 < size) {
                    C3415b bVar = (C3415b) a.f10452b.get(i24);
                    int i25 = bVar.f10463d;
                    if (i25 == 1953654136) {
                        C2604ac acVar2 = bVar.f10462a;
                        acVar2.mo6131A(i22);
                        Pair create = Pair.create(Integer.valueOf(acVar2.mo6134b()), new C3424k(acVar2.mo6134b() - 1, acVar2.mo6134b(), acVar2.mo6134b(), acVar2.mo6134b()));
                        sparseArray2.put(((Integer) create.first).intValue(), (C3424k) create.second);
                    } else if (i25 == 1835362404) {
                        C2604ac acVar3 = bVar.f10462a;
                        acVar3.mo6131A(8);
                        j3 = C3416c.m9893e(acVar3.mo6134b()) == 0 ? acVar3.mo6146n() : acVar3.mo6147o();
                    }
                    i24++;
                    i22 = 12;
                }
                List d = C3423j.m9908d(aVar4, new C3339an(), j3, f, false, new C3425l());
                int size2 = d.size();
                if (oVar2.f10522e.size() == 0) {
                    for (int i26 = 0; i26 < size2; i26++) {
                        C3414aa aaVar = (C3414aa) d.get(i26);
                        C3437x xVar = aaVar.f10454a;
                        oVar2.f10522e.put(xVar.f10576a, new C3427n(oVar2.f10516F.mo6987eZ(i26, xVar.f10577b), aaVar, m9932k(sparseArray2, xVar.f10576a)));
                        oVar2.f10542y = Math.max(oVar2.f10542y, xVar.f10580e);
                    }
                    oVar2.f10516F.mo6988fa();
                } else {
                    C2601a.m6832d(oVar2.f10522e.size() == size2);
                    for (int i27 = 0; i27 < size2; i27++) {
                        C3414aa aaVar2 = (C3414aa) d.get(i27);
                        C3437x xVar2 = aaVar2.f10454a;
                        ((C3427n) oVar2.f10522e.get(xVar2.f10576a)).mo7393d(aaVar2, m9932k(sparseArray2, xVar2.f10576a));
                    }
                }
            } else {
                if (i21 == 1836019558) {
                    SparseArray sparseArray3 = oVar2.f10522e;
                    int i28 = oVar2.f10520c;
                    byte[] bArr4 = oVar2.f10526i;
                    int size3 = aVar4.f10453c.size();
                    int i29 = 0;
                    while (i29 < size3) {
                        C3413a aVar5 = (C3413a) aVar4.f10453c.get(i29);
                        if (aVar5.f10463d == 1953653094) {
                            C3415b b = aVar5.mo7380b(1952868452);
                            b.getClass();
                            C2604ac acVar4 = b.f10462a;
                            acVar4.mo6131A(i23);
                            int b2 = acVar4.mo6134b() & 16777215;
                            C3427n nVar = (C3427n) sparseArray3.get(acVar4.mo6134b());
                            if (nVar == null) {
                                nVar = null;
                            } else {
                                if ((b2 & 1) != 0) {
                                    long o = acVar4.mo6147o();
                                    C3439z zVar2 = nVar.f10498b;
                                    zVar2.f10593b = o;
                                    zVar2.f10594c = o;
                                }
                                C3424k kVar2 = nVar.f10501e;
                                if ((b2 & 2) != 0) {
                                    i17 = acVar4.mo6134b() - 1;
                                } else {
                                    i17 = kVar2.f10490a;
                                }
                                if ((b2 & 8) != 0) {
                                    i18 = acVar4.mo6134b();
                                } else {
                                    i18 = kVar2.f10491b;
                                }
                                if ((b2 & 16) != 0) {
                                    i19 = acVar4.mo6134b();
                                } else {
                                    i19 = kVar2.f10492c;
                                }
                                if ((b2 & 32) != 0) {
                                    i20 = acVar4.mo6134b();
                                } else {
                                    i20 = kVar2.f10493d;
                                }
                                nVar.f10498b.f10592a = new C3424k(i17, i18, i19, i20);
                            }
                            if (nVar != null) {
                                C3439z zVar3 = nVar.f10498b;
                                long j4 = zVar3.f10607p;
                                boolean z4 = zVar3.f10608q;
                                nVar.mo7394e();
                                nVar.f10506j = true;
                                C3415b b3 = aVar5.mo7380b(1952867444);
                                if (b3 == null || (i28 & 2) != 0) {
                                    zVar3.f10607p = j4;
                                    zVar3.f10608q = z4;
                                } else {
                                    C2604ac acVar5 = b3.f10462a;
                                    acVar5.mo6131A(i23);
                                    zVar3.f10607p = C3416c.m9893e(acVar5.mo6134b()) == 1 ? acVar5.mo6147o() : acVar5.mo6146n();
                                    zVar3.f10608q = true;
                                }
                                List list2 = aVar5.f10452b;
                                int size4 = list2.size();
                                int i30 = 0;
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i30 >= size4) {
                                        break;
                                    }
                                    SparseArray sparseArray4 = sparseArray3;
                                    C3415b bVar2 = (C3415b) list2.get(i30);
                                    int i33 = size3;
                                    if (bVar2.f10463d == 1953658222) {
                                        C2604ac acVar6 = bVar2.f10462a;
                                        acVar6.mo6131A(12);
                                        int i34 = acVar6.mo6141i();
                                        if (i34 > 0) {
                                            i32 += i34;
                                            i31++;
                                        }
                                    }
                                    i30++;
                                    size3 = i33;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i3 = size3;
                                nVar.f10504h = 0;
                                nVar.f10503g = 0;
                                nVar.f10502f = 0;
                                C3439z zVar4 = nVar.f10498b;
                                zVar4.f10595d = i31;
                                zVar4.f10596e = i32;
                                if (zVar4.f10598g.length < i31) {
                                    zVar4.f10597f = new long[i31];
                                    zVar4.f10598g = new int[i31];
                                }
                                if (zVar4.f10599h.length < i32) {
                                    int i35 = (i32 * 125) / 100;
                                    zVar4.f10599h = new int[i35];
                                    zVar4.f10600i = new long[i35];
                                    zVar4.f10601j = new boolean[i35];
                                    zVar4.f10603l = new boolean[i35];
                                }
                                int i36 = 0;
                                int i37 = 0;
                                int i38 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i36 >= size4) {
                                        break;
                                    }
                                    C3415b bVar3 = (C3415b) list2.get(i36);
                                    if (bVar3.f10463d == i4) {
                                        C2604ac acVar7 = bVar3.f10462a;
                                        acVar7.mo6131A(8);
                                        int b4 = acVar7.mo6134b() & 16777215;
                                        list = list2;
                                        C3437x xVar3 = nVar.f10500d.f10454a;
                                        i9 = size4;
                                        C3439z zVar5 = nVar.f10498b;
                                        int i39 = i38 + 1;
                                        C3424k kVar3 = zVar5.f10592a;
                                        int i40 = C2612ak.f7249a;
                                        zVar5.f10598g[i38] = acVar7.mo6141i();
                                        long[] jArr = zVar5.f10597f;
                                        i8 = i36;
                                        aVar3 = aVar4;
                                        long j6 = zVar5.f10593b;
                                        jArr[i38] = j6;
                                        if ((b4 & 1) != 0) {
                                            i7 = i29;
                                            i10 = i37;
                                            jArr[i38] = j6 + ((long) acVar7.mo6134b());
                                        } else {
                                            i10 = i37;
                                            i7 = i29;
                                        }
                                        boolean z5 = (b4 & 4) != 0;
                                        int i41 = kVar3.f10493d;
                                        if (z5) {
                                            i41 = acVar7.mo6134b();
                                        }
                                        int i42 = b4 & 256;
                                        int i43 = b4 & 512;
                                        int i44 = b4 & 1024;
                                        int i45 = b4 & 2048;
                                        int i46 = i41;
                                        long[] jArr2 = xVar3.f10583h;
                                        if (jArr2 != null) {
                                            bArr3 = bArr4;
                                            aVar2 = aVar5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) C2612ak.m6927J(xVar3.f10584i))[0];
                                            }
                                        } else {
                                            bArr3 = bArr4;
                                            aVar2 = aVar5;
                                        }
                                        int[] iArr = zVar5.f10599h;
                                        long[] jArr3 = zVar5.f10600i;
                                        zVar = zVar3;
                                        boolean[] zArr = zVar5.f10601j;
                                        boolean z6 = xVar3.f10577b == 2 && (i28 & 1) != 0;
                                        int i47 = i10 + zVar5.f10598g[i38];
                                        i6 = i28;
                                        boolean z7 = z6;
                                        long j7 = xVar3.f10578c;
                                        long[] jArr4 = jArr3;
                                        long j8 = zVar5.f10607p;
                                        int i48 = i10;
                                        while (i48 < i47) {
                                            if (i42 != 0) {
                                                i11 = i42;
                                                i12 = acVar7.mo6134b();
                                            } else {
                                                i11 = i42;
                                                i12 = kVar3.f10491b;
                                            }
                                            m9931j(i12);
                                            if (i43 != 0) {
                                                i14 = acVar7.mo6134b();
                                                i13 = i43;
                                            } else {
                                                i13 = i43;
                                                i14 = kVar3.f10492c;
                                            }
                                            m9931j(i14);
                                            if (i44 != 0) {
                                                i15 = acVar7.mo6134b();
                                            } else {
                                                if (i48 == 0) {
                                                    if (z5) {
                                                        i15 = i46;
                                                        i48 = 0;
                                                    } else {
                                                        i48 = 0;
                                                    }
                                                }
                                                i15 = kVar3.f10493d;
                                            }
                                            if (i45 != 0) {
                                                z2 = z5;
                                                kVar = kVar3;
                                                acVar = acVar7;
                                                i16 = acVar7.mo6134b();
                                            } else {
                                                z2 = z5;
                                                kVar = kVar3;
                                                acVar = acVar7;
                                                i16 = 0;
                                            }
                                            long y = C2612ak.m7000y((((long) i16) + j8) - j5, 1000000, j7);
                                            jArr4[i48] = y;
                                            if (!zVar5.f10608q) {
                                                j2 = j7;
                                                jArr4[i48] = y + nVar.f10500d.f10461h;
                                            } else {
                                                j2 = j7;
                                            }
                                            iArr[i48] = i14;
                                            if (((i15 >> 16) & 1) == 0) {
                                                if (!z7) {
                                                    z3 = true;
                                                } else if (i48 == 0) {
                                                    z3 = true;
                                                    i48 = 0;
                                                }
                                                zArr[i48] = z3;
                                                j8 += (long) i12;
                                                i48++;
                                                j7 = j2;
                                                i42 = i11;
                                                i43 = i13;
                                                z5 = z2;
                                                acVar7 = acVar;
                                                kVar3 = kVar;
                                            }
                                            z3 = false;
                                            zArr[i48] = z3;
                                            j8 += (long) i12;
                                            i48++;
                                            j7 = j2;
                                            i42 = i11;
                                            i43 = i13;
                                            z5 = z2;
                                            acVar7 = acVar;
                                            kVar3 = kVar;
                                        }
                                        zVar5.f10607p = j8;
                                        i37 = i47;
                                        i38 = i39;
                                    } else {
                                        i8 = i36;
                                        aVar3 = aVar4;
                                        i6 = i28;
                                        zVar = zVar3;
                                        list = list2;
                                        bArr3 = bArr4;
                                        int i49 = i37;
                                        i7 = i29;
                                        i9 = size4;
                                        aVar2 = aVar5;
                                    }
                                    i36 = i8 + 1;
                                    list2 = list;
                                    size4 = i9;
                                    aVar4 = aVar3;
                                    i29 = i7;
                                    bArr4 = bArr3;
                                    aVar5 = aVar2;
                                    zVar3 = zVar;
                                    i28 = i6;
                                    i4 = 1953658222;
                                }
                                aVar = aVar4;
                                i = i28;
                                byte[] bArr5 = bArr4;
                                i2 = i29;
                                C3437x xVar4 = nVar.f10500d.f10454a;
                                C3439z zVar6 = zVar3;
                                C3424k kVar4 = zVar6.f10592a;
                                kVar4.getClass();
                                C3438y a2 = xVar4.mo7396a(kVar4.f10490a);
                                C3413a aVar6 = aVar5;
                                C3415b b5 = aVar6.mo7380b(1935763834);
                                if (b5 != null) {
                                    a2.getClass();
                                    C2604ac acVar8 = b5.f10462a;
                                    int i50 = a2.f10590d;
                                    acVar8.mo6131A(8);
                                    if ((acVar8.mo6134b() & 1) == 1) {
                                        acVar8.mo6131A(acVar8.f7235b + 8);
                                    }
                                    int g = acVar8.mo6139g();
                                    int i51 = acVar8.mo6141i();
                                    int i52 = zVar6.f10596e;
                                    if (i51 <= i52) {
                                        if (g == 0) {
                                            boolean[] zArr2 = zVar6.f10603l;
                                            i5 = 0;
                                            for (int i53 = 0; i53 < i51; i53++) {
                                                int g2 = acVar8.mo6139g();
                                                i5 += g2;
                                                zArr2[i53] = g2 > i50;
                                            }
                                            z = false;
                                        } else {
                                            boolean z8 = g > i50;
                                            i5 = g * i51;
                                            z = false;
                                            Arrays.fill(zVar6.f10603l, 0, i51, z8);
                                        }
                                        Arrays.fill(zVar6.f10603l, i51, zVar6.f10596e, z);
                                        if (i5 > 0) {
                                            zVar6.mo7397a(i5);
                                        }
                                    } else {
                                        throw C2599az.m6819a("Saiz sample count " + i51 + " is greater than fragment sample count" + i52, (Throwable) null);
                                    }
                                }
                                C3415b b6 = aVar6.mo7380b(1935763823);
                                if (b6 != null) {
                                    C2604ac acVar9 = b6.f10462a;
                                    acVar9.mo6131A(8);
                                    int b7 = acVar9.mo6134b();
                                    if ((b7 & 1) == 1) {
                                        acVar9.mo6131A(acVar9.f7235b + 8);
                                    }
                                    int i54 = acVar9.mo6141i();
                                    if (i54 == 1) {
                                        zVar6.f10594c += C3416c.m9893e(b7) == 0 ? acVar9.mo6146n() : acVar9.mo6147o();
                                    } else {
                                        throw C2599az.m6819a("Unexpected saio entry count: " + i54, (Throwable) null);
                                    }
                                }
                                C3415b b8 = aVar6.mo7380b(1936027235);
                                if (b8 != null) {
                                    m9929h(b8.f10462a, 0, zVar6);
                                }
                                String str = a2 != null ? a2.f10588b : null;
                                C2604ac acVar10 = null;
                                C2604ac acVar11 = null;
                                for (int i55 = 0; i55 < aVar6.f10452b.size(); i55++) {
                                    C3415b bVar4 = (C3415b) aVar6.f10452b.get(i55);
                                    C2604ac acVar12 = bVar4.f10462a;
                                    int i56 = bVar4.f10463d;
                                    if (i56 == 1935828848) {
                                        acVar12.mo6131A(12);
                                        if (acVar12.mo6134b() == 1936025959) {
                                            acVar10 = acVar12;
                                        }
                                    } else if (i56 == 1936158820) {
                                        acVar12.mo6131A(12);
                                        if (acVar12.mo6134b() == 1936025959) {
                                            acVar11 = acVar12;
                                        }
                                    }
                                }
                                if (acVar10 != null && acVar11 != null) {
                                    acVar10.mo6131A(8);
                                    int b9 = acVar10.mo6134b();
                                    acVar10.mo6131A(acVar10.f7235b + 4);
                                    if (C3416c.m9893e(b9) == 1) {
                                        acVar10.mo6131A(acVar10.f7235b + 4);
                                    }
                                    if (acVar10.mo6134b() == 1) {
                                        acVar11.mo6131A(8);
                                        int e = C3416c.m9893e(acVar11.mo6134b());
                                        acVar11.mo6131A(acVar11.f7235b + 4);
                                        if (e == 1) {
                                            if (acVar11.mo6146n() == 0) {
                                                throw C2599az.m6822d("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (e >= 2) {
                                            acVar11.mo6131A(acVar11.f7235b + 4);
                                        }
                                        if (acVar11.mo6146n() == 1) {
                                            acVar11.mo6131A(acVar11.f7235b + 1);
                                            int g3 = acVar11.mo6139g();
                                            int i57 = (g3 & 240) >> 4;
                                            int i58 = g3 & 15;
                                            if (acVar11.mo6139g() == 1) {
                                                int g4 = acVar11.mo6139g();
                                                byte[] bArr6 = new byte[16];
                                                acVar11.mo6155w(bArr6, 0, 16);
                                                if (g4 == 0) {
                                                    int g5 = acVar11.mo6139g();
                                                    bArr2 = new byte[g5];
                                                    acVar11.mo6155w(bArr2, 0, g5);
                                                } else {
                                                    bArr2 = null;
                                                }
                                                zVar6.f10602k = true;
                                                zVar6.f10604m = new C3438y(true, str, g4, bArr6, i57, i58, bArr2);
                                            }
                                        } else {
                                            throw C2599az.m6822d("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw C2599az.m6822d("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = aVar6.f10452b.size();
                                int i59 = 0;
                                while (i59 < size5) {
                                    C3415b bVar5 = (C3415b) aVar6.f10452b.get(i59);
                                    if (bVar5.f10463d == 1970628964) {
                                        C2604ac acVar13 = bVar5.f10462a;
                                        acVar13.mo6131A(8);
                                        bArr = bArr5;
                                        acVar13.mo6155w(bArr, 0, 16);
                                        if (Arrays.equals(bArr, f10509a)) {
                                            m9929h(acVar13, 16, zVar6);
                                        }
                                    } else {
                                        bArr = bArr5;
                                    }
                                    i59++;
                                    bArr5 = bArr;
                                }
                                bArr4 = bArr5;
                                i29 = i2 + 1;
                                i23 = 8;
                                size3 = i3;
                                sparseArray3 = sparseArray;
                                aVar4 = aVar;
                                i28 = i;
                            }
                        }
                        sparseArray = sparseArray3;
                        aVar = aVar4;
                        i = i28;
                        i3 = size3;
                        i2 = i29;
                        i29 = i2 + 1;
                        i23 = 8;
                        size3 = i3;
                        sparseArray3 = sparseArray;
                        aVar4 = aVar;
                        i28 = i;
                    }
                    DrmInitData f2 = m9927f(aVar4.f10452b);
                    oVar = this;
                    if (f2 != null) {
                        int size6 = oVar.f10522e.size();
                        for (int i60 = 0; i60 < size6; i60++) {
                            C3427n nVar2 = (C3427n) oVar.f10522e.valueAt(i60);
                            C3437x xVar5 = nVar2.f10500d.f10454a;
                            C3424k kVar5 = nVar2.f10498b.f10592a;
                            int i61 = C2612ak.f7249a;
                            C3438y a3 = xVar5.mo7396a(kVar5.f10490a);
                            DrmInitData a4 = f2.mo6048a(a3 != null ? a3.f10588b : null);
                            C2679w wVar = new C2679w(nVar2.f10500d.f10454a.f10581f);
                            wVar.f7462n = a4;
                            nVar2.f10497a.mo6850b(new C2680x(wVar));
                        }
                    }
                    if (oVar.f10541x != -9223372036854775807L) {
                        int size7 = oVar.f10522e.size();
                        for (int i62 = 0; i62 < size7; i62++) {
                            C3427n nVar3 = (C3427n) oVar.f10522e.valueAt(i62);
                            long j9 = oVar.f10541x;
                            int i63 = nVar3.f10502f;
                            while (true) {
                                C3439z zVar7 = nVar3.f10498b;
                                if (i63 >= zVar7.f10596e || zVar7.f10600i[i63] >= j9) {
                                } else {
                                    if (zVar7.f10601j[i63]) {
                                        nVar3.f10505i = i63;
                                    }
                                    i63++;
                                }
                            }
                        }
                        oVar.f10541x = -9223372036854775807L;
                    }
                } else {
                    oVar = oVar2;
                    C3413a aVar7 = aVar4;
                    if (!oVar.f10531n.isEmpty()) {
                        ((C3413a) oVar.f10531n.peek()).mo7381c(aVar7);
                    }
                }
                oVar2 = oVar;
            }
        }
        C3428o oVar3 = oVar2;
        m9928g();
    }

    /* renamed from: j */
    private static void m9931j(int i) {
        if (i < 0) {
            throw C2599az.m6819a("Unexpected negative value: " + i, (Throwable) null);
        }
    }

    /* renamed from: k */
    private static final C3424k m9932k(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (C3424k) sparseArray.valueAt(0);
        }
        C3424k kVar = (C3424k) sparseArray.get(i);
        kVar.getClass();
        return kVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: androidx.media3.extractor.h.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: androidx.media3.extractor.h.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r31, androidx.media3.extractor.C3350ay r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
        L_0x0004:
            int r2 = r0.f10534q
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r6 = 8
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0582
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x0341
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x02e7
            androidx.media3.extractor.h.n r2 = r0.f10511A
            if (r2 != 0) goto L_0x008f
            android.util.SparseArray r2 = r0.f10522e
            int r13 = r2.size()
            r14 = r3
            r3 = r7
            r4 = 0
        L_0x002c:
            if (r4 >= r13) goto L_0x005b
            java.lang.Object r16 = r2.valueAt(r4)
            r5 = r16
            androidx.media3.extractor.h.n r5 = (androidx.media3.extractor.p161h.C3427n) r5
            boolean r11 = r5.f10506j
            if (r11 != 0) goto L_0x0043
            int r11 = r5.f10502f
            androidx.media3.extractor.h.aa r9 = r5.f10500d
            int r9 = r9.f10455b
            if (r11 == r9) goto L_0x0057
            goto L_0x004c
        L_0x0043:
            int r9 = r5.f10504h
            androidx.media3.extractor.h.z r11 = r5.f10498b
            int r11 = r11.f10595d
            if (r9 != r11) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            long r18 = r5.mo7391b()
            int r9 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r9 >= 0) goto L_0x0057
            r3 = r5
            r14 = r18
        L_0x0057:
            int r4 = r4 + 1
            r5 = 2
            goto L_0x002c
        L_0x005b:
            if (r3 != 0) goto L_0x0076
            long r2 = r0.f10539v
            r4 = r1
            androidx.media3.extractor.q r4 = (androidx.media3.extractor.C3627q) r4
            long r5 = r4.f11566c
            long r2 = r2 - r5
            int r3 = (int) r2
            if (r3 < 0) goto L_0x006f
            r4.mo7639q(r3)
            r30.m9928g()
            goto L_0x0004
        L_0x006f:
            java.lang.String r1 = "Offset to end of mdat was negative."
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r7)
            throw r1
        L_0x0076:
            long r4 = r3.mo7391b()
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r13 = r2.f11566c
            long r4 = r4 - r13
            int r5 = (int) r4
            if (r5 >= 0) goto L_0x0089
            java.lang.String r4 = "Ignoring negative offset to sample data."
            androidx.media3.common.p136b.C2633u.m7050e(r10, r4)
            r5 = 0
        L_0x0089:
            r2.mo7639q(r5)
            r0.f10511A = r3
            r2 = r3
        L_0x008f:
            int r3 = r0.f10534q
            r4 = 6
            if (r3 != r12) goto L_0x0141
            boolean r3 = r2.f10506j
            if (r3 != 0) goto L_0x00a1
            androidx.media3.extractor.h.aa r3 = r2.f10500d
            int[] r3 = r3.f10457d
            int r5 = r2.f10502f
            r3 = r3[r5]
            goto L_0x00a9
        L_0x00a1:
            androidx.media3.extractor.h.z r3 = r2.f10498b
            int[] r3 = r3.f10599h
            int r5 = r2.f10502f
            r3 = r3[r5]
        L_0x00a9:
            r0.f10512B = r3
            int r5 = r2.f10502f
            int r9 = r2.f10505i
            if (r5 >= r9) goto L_0x00ee
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r1.mo7639q(r3)
            androidx.media3.extractor.h.y r1 = r2.mo7392c()
            if (r1 != 0) goto L_0x00bd
            goto L_0x00e1
        L_0x00bd:
            androidx.media3.extractor.h.z r3 = r2.f10498b
            androidx.media3.common.b.ac r3 = r3.f10605n
            int r1 = r1.f10590d
            if (r1 == 0) goto L_0x00cb
            int r5 = r3.f7235b
            int r5 = r5 + r1
            r3.mo6131A(r5)
        L_0x00cb:
            androidx.media3.extractor.h.z r1 = r2.f10498b
            int r5 = r2.f10502f
            boolean r1 = r1.mo7398b(r5)
            if (r1 == 0) goto L_0x00e1
            int r1 = r3.mo6142j()
            int r5 = r3.f7235b
            int r1 = r1 * 6
            int r5 = r5 + r1
            r3.mo6131A(r5)
        L_0x00e1:
            boolean r1 = r2.mo7395f()
            if (r1 != 0) goto L_0x00e9
            r0.f10511A = r7
        L_0x00e9:
            r0.f10534q = r12
        L_0x00eb:
            r1 = 0
            goto L_0x02e6
        L_0x00ee:
            androidx.media3.extractor.h.aa r5 = r2.f10500d
            androidx.media3.extractor.h.x r5 = r5.f10454a
            int r5 = r5.f10582g
            if (r5 != r8) goto L_0x0100
            int r3 = r3 + -8
            r0.f10512B = r3
            r3 = r1
            androidx.media3.extractor.q r3 = (androidx.media3.extractor.C3627q) r3
            r3.mo7639q(r6)
        L_0x0100:
            androidx.media3.extractor.h.aa r3 = r2.f10500d
            androidx.media3.extractor.h.x r3 = r3.f10454a
            androidx.media3.common.x r3 = r3.f10581f
            java.lang.String r3 = r3.f7496n
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x012e
            int r3 = r0.f10512B
            r5 = 7
            int r3 = r2.mo7390a(r3, r5)
            r0.f10513C = r3
            int r3 = r0.f10512B
            androidx.media3.common.b.ac r6 = r0.f10527j
            androidx.media3.extractor.C3387e.m9795b(r3, r6)
            androidx.media3.extractor.bf r3 = r2.f10497a
            androidx.media3.common.b.ac r6 = r0.f10527j
            r3.mo6851c(r6, r5)
            int r3 = r0.f10513C
            int r3 = r3 + r5
            r0.f10513C = r3
            r5 = 0
            goto L_0x0137
        L_0x012e:
            int r3 = r0.f10512B
            r5 = 0
            int r3 = r2.mo7390a(r3, r5)
            r0.f10513C = r3
        L_0x0137:
            int r6 = r0.f10512B
            int r6 = r6 + r3
            r0.f10512B = r6
            r3 = 4
            r0.f10534q = r3
            r0.f10514D = r5
        L_0x0141:
            androidx.media3.extractor.h.aa r3 = r2.f10500d
            androidx.media3.extractor.h.x r5 = r3.f10454a
            androidx.media3.extractor.bf r6 = r2.f10497a
            boolean r9 = r2.f10506j
            if (r9 != 0) goto L_0x0152
            long[] r3 = r3.f10459f
            int r9 = r2.f10502f
            r9 = r3[r9]
            goto L_0x015a
        L_0x0152:
            androidx.media3.extractor.h.z r3 = r2.f10498b
            int r9 = r2.f10502f
            long[] r3 = r3.f10600i
            r9 = r3[r9]
        L_0x015a:
            androidx.media3.common.b.ah r3 = r0.f10528k
            if (r3 == 0) goto L_0x0162
            long r9 = r3.mo6179a(r9)
        L_0x0162:
            int r3 = r5.f10585j
            if (r3 != 0) goto L_0x0178
        L_0x0166:
            int r3 = r0.f10513C
            int r4 = r0.f10512B
            if (r3 >= r4) goto L_0x0255
            int r4 = r4 - r3
            r11 = 0
            int r3 = r6.mo6849a(r1, r4, r11)
            int r4 = r0.f10513C
            int r4 = r4 + r3
            r0.f10513C = r4
            goto L_0x0166
        L_0x0178:
            r11 = 0
            androidx.media3.common.b.ac r13 = r0.f10524g
            byte[] r13 = r13.f7234a
            r13[r11] = r11
            r13[r8] = r11
            r14 = 2
            r13[r14] = r11
            int r11 = r3 + 1
            r14 = 4
            int r3 = 4 - r3
        L_0x0189:
            int r14 = r0.f10513C
            int r15 = r0.f10512B
            if (r14 >= r15) goto L_0x0255
            int r14 = r0.f10514D
            java.lang.String r15 = "video/hevc"
            if (r14 != 0) goto L_0x01fd
            r14 = r1
            androidx.media3.extractor.q r14 = (androidx.media3.extractor.C3627q) r14
            r12 = 0
            r14.mo7321p(r13, r3, r11, r12)
            androidx.media3.common.b.ac r14 = r0.f10524g
            r14.mo6131A(r12)
            androidx.media3.common.b.ac r14 = r0.f10524g
            int r14 = r14.mo6134b()
            if (r14 <= 0) goto L_0x01f6
            int r14 = r14 + -1
            r0.f10514D = r14
            androidx.media3.common.b.ac r14 = r0.f10523f
            r14.mo6131A(r12)
            androidx.media3.common.b.ac r12 = r0.f10523f
            r14 = 4
            r6.mo6851c(r12, r14)
            androidx.media3.common.b.ac r12 = r0.f10524g
            r6.mo6851c(r12, r8)
            androidx.media3.extractor.bf[] r12 = r0.f10518H
            int r12 = r12.length
            if (r12 <= 0) goto L_0x01e7
            androidx.media3.common.x r12 = r5.f10581f
            java.lang.String r12 = r12.f7496n
            byte r18 = r13[r14]
            byte[] r14 = androidx.media3.extractor.C3347av.f10114a
            java.lang.String r14 = "video/avc"
            boolean r14 = r14.equals(r12)
            if (r14 == 0) goto L_0x01d9
            r14 = r18 & 31
            if (r14 == r4) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            r12 = 1
            goto L_0x01e8
        L_0x01d9:
            boolean r12 = r15.equals(r12)
            if (r12 == 0) goto L_0x01e7
            r12 = r18 & 126(0x7e, float:1.77E-43)
            int r12 = r12 >> r8
            r14 = 39
            if (r12 != r14) goto L_0x01e7
            goto L_0x01d7
        L_0x01e7:
            r12 = 0
        L_0x01e8:
            r0.f10515E = r12
            int r12 = r0.f10513C
            int r12 = r12 + 5
            r0.f10513C = r12
            int r12 = r0.f10512B
            int r12 = r12 + r3
            r0.f10512B = r12
            goto L_0x0252
        L_0x01f6:
            java.lang.String r1 = "Invalid NAL length"
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r7)
            throw r1
        L_0x01fd:
            boolean r12 = r0.f10515E
            if (r12 == 0) goto L_0x0240
            androidx.media3.common.b.ac r12 = r0.f10525h
            r12.mo6156x(r14)
            androidx.media3.common.b.ac r12 = r0.f10525h
            byte[] r12 = r12.f7234a
            int r14 = r0.f10514D
            r4 = r1
            androidx.media3.extractor.q r4 = (androidx.media3.extractor.C3627q) r4
            r8 = 0
            r4.mo7321p(r12, r8, r14, r8)
            androidx.media3.common.b.ac r4 = r0.f10525h
            int r8 = r0.f10514D
            r6.mo6851c(r4, r8)
            int r4 = r0.f10514D
            androidx.media3.common.b.ac r8 = r0.f10525h
            byte[] r12 = r8.f7234a
            int r8 = r8.f7236c
            int r8 = androidx.media3.extractor.C3347av.m9693b(r12, r8)
            androidx.media3.common.b.ac r12 = r0.f10525h
            androidx.media3.common.x r14 = r5.f10581f
            java.lang.String r14 = r14.f7496n
            boolean r14 = r15.equals(r14)
            r12.mo6131A(r14)
            androidx.media3.common.b.ac r12 = r0.f10525h
            r12.mo6158z(r8)
            androidx.media3.common.b.ac r8 = r0.f10525h
            androidx.media3.extractor.bf[] r12 = r0.f10518H
            androidx.media3.extractor.C3624n.m10438a(r9, r8, r12)
            goto L_0x0246
        L_0x0240:
            r4 = 0
            int r8 = r6.mo6849a(r1, r14, r4)
            r4 = r8
        L_0x0246:
            int r8 = r0.f10513C
            int r8 = r8 + r4
            r0.f10513C = r8
            int r8 = r0.f10514D
            int r8 = r8 - r4
            r0.f10514D = r8
            r4 = 6
            r8 = 1
        L_0x0252:
            r12 = 3
            goto L_0x0189
        L_0x0255:
            boolean r1 = r2.f10506j
            if (r1 != 0) goto L_0x0262
            androidx.media3.extractor.h.aa r1 = r2.f10500d
            int[] r1 = r1.f10460g
            int r3 = r2.f10502f
            r8 = r1[r3]
            goto L_0x026f
        L_0x0262:
            androidx.media3.extractor.h.z r1 = r2.f10498b
            boolean[] r1 = r1.f10601j
            int r3 = r2.f10502f
            boolean r1 = r1[r3]
            if (r1 == 0) goto L_0x026e
            r8 = 1
            goto L_0x026f
        L_0x026e:
            r8 = 0
        L_0x026f:
            androidx.media3.extractor.h.y r1 = r2.mo7392c()
            if (r1 == 0) goto L_0x027b
            r1 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r8
            r21 = r1
            goto L_0x027d
        L_0x027b:
            r21 = r8
        L_0x027d:
            androidx.media3.extractor.h.y r1 = r2.mo7392c()
            if (r1 == 0) goto L_0x0288
            androidx.media3.extractor.be r1 = r1.f10589c
            r24 = r1
            goto L_0x028a
        L_0x0288:
            r24 = r7
        L_0x028a:
            int r1 = r0.f10512B
            r23 = 0
            r18 = r6
            r19 = r9
            r22 = r1
            r18.mo6852d(r19, r21, r22, r23, r24)
        L_0x0297:
            java.util.ArrayDeque r1 = r0.f10532o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x02d9
            java.util.ArrayDeque r1 = r0.f10532o
            java.lang.Object r1 = r1.removeFirst()
            androidx.media3.extractor.h.m r1 = (androidx.media3.extractor.p161h.C3426m) r1
            int r3 = r0.f10540w
            int r4 = r1.f10496c
            int r3 = r3 - r4
            r0.f10540w = r3
            long r3 = r1.f10494a
            boolean r5 = r1.f10495b
            if (r5 == 0) goto L_0x02b5
            long r3 = r3 + r9
        L_0x02b5:
            androidx.media3.common.b.ah r5 = r0.f10528k
            if (r5 == 0) goto L_0x02bd
            long r3 = r5.mo6179a(r3)
        L_0x02bd:
            androidx.media3.extractor.bf[] r5 = r0.f10517G
            int r6 = r5.length
            r8 = 0
        L_0x02c1:
            if (r8 >= r6) goto L_0x0297
            r18 = r5[r8]
            r21 = 1
            int r11 = r1.f10496c
            int r12 = r0.f10540w
            r24 = 0
            r19 = r3
            r22 = r11
            r23 = r12
            r18.mo6852d(r19, r21, r22, r23, r24)
            int r8 = r8 + 1
            goto L_0x02c1
        L_0x02d9:
            boolean r1 = r2.mo7395f()
            if (r1 != 0) goto L_0x02e1
            r0.f10511A = r7
        L_0x02e1:
            r1 = 3
            r0.f10534q = r1
            goto L_0x00eb
        L_0x02e6:
            return r1
        L_0x02e7:
            android.util.SparseArray r2 = r0.f10522e
            int r2 = r2.size()
            r6 = r7
            r5 = 0
        L_0x02ef:
            if (r5 >= r2) goto L_0x0312
            android.util.SparseArray r8 = r0.f10522e
            java.lang.Object r8 = r8.valueAt(r5)
            androidx.media3.extractor.h.n r8 = (androidx.media3.extractor.p161h.C3427n) r8
            androidx.media3.extractor.h.z r8 = r8.f10498b
            boolean r9 = r8.f10606o
            if (r9 == 0) goto L_0x030f
            long r8 = r8.f10594c
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x030f
            android.util.SparseArray r3 = r0.f10522e
            java.lang.Object r3 = r3.valueAt(r5)
            r6 = r3
            androidx.media3.extractor.h.n r6 = (androidx.media3.extractor.p161h.C3427n) r6
            r3 = r8
        L_0x030f:
            int r5 = r5 + 1
            goto L_0x02ef
        L_0x0312:
            if (r6 != 0) goto L_0x0319
            r2 = 3
            r0.f10534q = r2
            goto L_0x0004
        L_0x0319:
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r8 = r2.f11566c
            long r3 = r3 - r8
            int r4 = (int) r3
            if (r4 < 0) goto L_0x033a
            r2.mo7639q(r4)
            androidx.media3.extractor.h.z r3 = r6.f10498b
            androidx.media3.common.b.ac r4 = r3.f10605n
            byte[] r5 = r4.f7234a
            int r4 = r4.f7236c
            r6 = 0
            r2.mo7321p(r5, r6, r4, r6)
            androidx.media3.common.b.ac r2 = r3.f10605n
            r2.mo6131A(r6)
            r3.f10606o = r6
            goto L_0x0004
        L_0x033a:
            java.lang.String r1 = "Offset to encryption data was negative."
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r7)
            throw r1
        L_0x0341:
            long r8 = r0.f10536s
            int r2 = (int) r8
            int r5 = r0.f10537t
            int r2 = r2 - r5
            androidx.media3.common.b.ac r5 = r0.f10538u
            if (r5 == 0) goto L_0x0572
            byte[] r8 = r5.f7234a
            r9 = r1
            androidx.media3.extractor.q r9 = (androidx.media3.extractor.C3627q) r9
            r11 = 0
            r9.mo7321p(r8, r6, r2, r11)
            androidx.media3.extractor.h.b r2 = new androidx.media3.extractor.h.b
            int r8 = r0.f10535r
            r2.<init>(r8, r5)
            long r8 = r9.f11566c
            java.util.ArrayDeque r5 = r0.f10531n
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0372
            java.util.ArrayDeque r3 = r0.f10531n
            java.lang.Object r3 = r3.peek()
            androidx.media3.extractor.h.a r3 = (androidx.media3.extractor.p161h.C3413a) r3
            r3.mo7382d(r2)
            goto L_0x0578
        L_0x0372:
            int r5 = r2.f10463d
            if (r5 != r4) goto L_0x0441
            androidx.media3.common.b.ac r2 = r2.f10462a
            r2.mo6131A(r6)
            int r3 = r2.mo6134b()
            int r4 = r2.f7235b
            r5 = 4
            int r4 = r4 + r5
            r2.mo6131A(r4)
            long r4 = r2.mo6146n()
            int r3 = androidx.media3.extractor.p161h.C3416c.m9893e(r3)
            if (r3 != 0) goto L_0x0399
            long r10 = r2.mo6146n()
            long r12 = r2.mo6146n()
            goto L_0x03a1
        L_0x0399:
            long r10 = r2.mo6147o()
            long r12 = r2.mo6147o()
        L_0x03a1:
            long r8 = r8 + r12
            r20 = r10
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r20
            r14 = r4
            long r22 = androidx.media3.common.p136b.C2612ak.m7000y(r10, r12, r14)
            int r3 = r2.f7235b
            r6 = 2
            int r3 = r3 + r6
            r2.mo6131A(r3)
            int r3 = r2.mo6142j()
            int[] r6 = new int[r3]
            long[] r14 = new long[r3]
            long[] r15 = new long[r3]
            long[] r12 = new long[r3]
            r10 = r22
            r13 = 0
        L_0x03c4:
            if (r13 >= r3) goto L_0x0419
            int r17 = r2.mo6134b()
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r18 = r17 & r18
            if (r18 != 0) goto L_0x0411
            long r24 = r2.mo6146n()
            r18 = 2147483647(0x7fffffff, float:NaN)
            r17 = r17 & r18
            r6[r13] = r17
            r14[r13] = r8
            r12[r13] = r10
            long r20 = r20 + r24
            r17 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r20
            r7 = r12
            r25 = r13
            r12 = r17
            r32 = r3
            r3 = r14
            r1 = r15
            r14 = r4
            long r10 = androidx.media3.common.p136b.C2612ak.m7000y(r10, r12, r14)
            r12 = r7[r25]
            long r12 = r10 - r12
            r1[r25] = r12
            int r12 = r2.f7235b
            r13 = 4
            int r12 = r12 + r13
            r2.mo6131A(r12)
            r12 = r6[r25]
            long r14 = (long) r12
            long r8 = r8 + r14
            int r12 = r25 + 1
            r15 = r1
            r14 = r3
            r13 = r12
            r1 = r31
            r3 = r32
            r12 = r7
            r7 = 0
            goto L_0x03c4
        L_0x0411:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x0419:
            r7 = r12
            r3 = r14
            r1 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r22)
            androidx.media3.extractor.o r4 = new androidx.media3.extractor.o
            r4.<init>(r6, r3, r1, r7)
            android.util.Pair r1 = android.util.Pair.create(r2, r4)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f10543z = r2
            androidx.media3.extractor.ad r2 = r0.f10516F
            java.lang.Object r1 = r1.second
            androidx.media3.extractor.bb r1 = (androidx.media3.extractor.C3364bb) r1
            r2.mo6989q(r1)
            r1 = 1
            r0.f10519I = r1
            goto L_0x056f
        L_0x0441:
            if (r5 != r3) goto L_0x056f
            androidx.media3.common.b.ac r1 = r2.f10462a
            androidx.media3.extractor.bf[] r2 = r0.f10517G
            int r2 = r2.length
            if (r2 == 0) goto L_0x056f
            r1.mo6131A(r6)
            int r2 = r1.mo6134b()
            int r2 = androidx.media3.extractor.p161h.C3416c.m9893e(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x04a8
            r5 = 1
            if (r2 == r5) goto L_0x0472
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r10, r1)
            goto L_0x056f
        L_0x0472:
            long r5 = r1.mo6146n()
            long r11 = r1.mo6147o()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r5
            long r7 = androidx.media3.common.p136b.C2612ak.m7000y(r11, r13, r15)
            long r11 = r1.mo6146n()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = androidx.media3.common.p136b.C2612ak.m7000y(r11, r13, r15)
            long r9 = r1.mo6146n()
            java.lang.String r2 = r1.mo6132B()
            r2.getClass()
            java.lang.String r11 = r1.mo6132B()
            r11.getClass()
            r23 = r2
            r14 = r3
            r25 = r5
            r27 = r9
            r24 = r11
            goto L_0x04eb
        L_0x04a8:
            java.lang.String r2 = r1.mo6132B()
            r2.getClass()
            java.lang.String r11 = r1.mo6132B()
            r11.getClass()
            long r12 = r1.mo6146n()
            long r5 = r1.mo6146n()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r12
            long r14 = androidx.media3.common.p136b.C2612ak.m7000y(r5, r7, r9)
            long r5 = r0.f10543z
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x04d0
            long r5 = r5 + r14
            r20 = r5
            goto L_0x04d2
        L_0x04d0:
            r20 = r3
        L_0x04d2:
            long r5 = r1.mo6146n()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = r12
            long r5 = androidx.media3.common.p136b.C2612ak.m7000y(r5, r7, r9)
            long r9 = r1.mo6146n()
            r23 = r2
            r25 = r5
            r27 = r9
            r24 = r11
            r7 = r20
        L_0x04eb:
            int r2 = r1.f7236c
            int r5 = r1.f7235b
            int r2 = r2 - r5
            byte[] r5 = new byte[r2]
            r6 = 0
            r1.mo6155w(r5, r6, r2)
            androidx.media3.extractor.metadata.emsg.EventMessage r1 = new androidx.media3.extractor.metadata.emsg.EventMessage
            r22 = r1
            r29 = r5
            r22.<init>(r23, r24, r25, r27, r29)
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            androidx.media3.extractor.metadata.emsg.c r5 = r0.f10529l
            byte[] r1 = r5.mo7505a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.f7236c
            int r5 = r2.f7235b
            int r1 = r1 - r5
            androidx.media3.extractor.bf[] r5 = r0.f10517G
            int r6 = r5.length
            r9 = 0
        L_0x0513:
            if (r9 >= r6) goto L_0x0521
            r10 = r5[r9]
            r11 = 0
            r2.mo6131A(r11)
            r10.mo6851c(r2, r1)
            int r9 = r9 + 1
            goto L_0x0513
        L_0x0521:
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0536
            java.util.ArrayDeque r2 = r0.f10532o
            androidx.media3.extractor.h.m r3 = new androidx.media3.extractor.h.m
            r4 = 1
            r3.<init>(r14, r4, r1)
            r2.addLast(r3)
            int r2 = r0.f10540w
            int r2 = r2 + r1
            r0.f10540w = r2
            goto L_0x056f
        L_0x0536:
            java.util.ArrayDeque r2 = r0.f10532o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x054f
            java.util.ArrayDeque r2 = r0.f10532o
            androidx.media3.extractor.h.m r3 = new androidx.media3.extractor.h.m
            r4 = 0
            r3.<init>(r7, r4, r1)
            r2.addLast(r3)
            int r2 = r0.f10540w
            int r2 = r2 + r1
            r0.f10540w = r2
            goto L_0x056f
        L_0x054f:
            androidx.media3.common.b.ah r2 = r0.f10528k
            if (r2 == 0) goto L_0x0557
            long r7 = r2.mo6179a(r7)
        L_0x0557:
            androidx.media3.extractor.bf[] r2 = r0.f10517G
            int r3 = r2.length
            r9 = 0
        L_0x055b:
            if (r9 >= r3) goto L_0x056f
            r20 = r2[r9]
            r23 = 1
            r25 = 0
            r26 = 0
            r21 = r7
            r24 = r1
            r20.mo6852d(r21, r23, r24, r25, r26)
            int r9 = r9 + 1
            goto L_0x055b
        L_0x056f:
            r1 = r31
            goto L_0x0578
        L_0x0572:
            r3 = r1
            androidx.media3.extractor.q r3 = (androidx.media3.extractor.C3627q) r3
            r3.mo7639q(r2)
        L_0x0578:
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r2 = r2.f11566c
            r0.m9930i(r2)
            goto L_0x0004
        L_0x0582:
            int r2 = r0.f10537t
            if (r2 != 0) goto L_0x05ab
            androidx.media3.common.b.ac r2 = r0.f10530m
            byte[] r2 = r2.f7234a
            r5 = 1
            r7 = 0
            boolean r2 = r1.mo7321p(r2, r7, r6, r5)
            if (r2 != 0) goto L_0x0594
            r1 = -1
            return r1
        L_0x0594:
            r0.f10537t = r6
            androidx.media3.common.b.ac r2 = r0.f10530m
            r2.mo6131A(r7)
            androidx.media3.common.b.ac r2 = r0.f10530m
            long r7 = r2.mo6146n()
            r0.f10536s = r7
            androidx.media3.common.b.ac r2 = r0.f10530m
            int r2 = r2.mo6134b()
            r0.f10535r = r2
        L_0x05ab:
            long r7 = r0.f10536s
            r9 = 1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x05cc
            androidx.media3.common.b.ac r2 = r0.f10530m
            byte[] r2 = r2.f7234a
            r5 = r1
            androidx.media3.extractor.q r5 = (androidx.media3.extractor.C3627q) r5
            r7 = 0
            r5.mo7321p(r2, r6, r6, r7)
            int r2 = r0.f10537t
            int r2 = r2 + r6
            r0.f10537t = r2
            androidx.media3.common.b.ac r2 = r0.f10530m
            long r7 = r2.mo6147o()
            r0.f10536s = r7
            goto L_0x05fe
        L_0x05cc:
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x05fe
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r7 = r2.f11565b
            r9 = -1
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x05f1
            java.util.ArrayDeque r5 = r0.f10531n
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x05f0
            java.util.ArrayDeque r5 = r0.f10531n
            java.lang.Object r5 = r5.peek()
            androidx.media3.extractor.h.a r5 = (androidx.media3.extractor.p161h.C3413a) r5
            long r7 = r5.f10451a
            goto L_0x05f1
        L_0x05f0:
            r7 = r9
        L_0x05f1:
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x05fe
            long r9 = r2.f11566c
            long r7 = r7 - r9
            int r2 = r0.f10537t
            long r9 = (long) r2
            long r7 = r7 + r9
            r0.f10536s = r7
        L_0x05fe:
            long r7 = r0.f10536s
            int r2 = r0.f10537t
            long r9 = (long) r2
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x077a
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r7 = r2.f11566c
            long r7 = r7 - r9
            int r5 = r0.f10535r
            r9 = 1835295092(0x6d646174, float:4.4175247E27)
            r10 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r5 == r10) goto L_0x0619
            if (r5 != r9) goto L_0x062c
        L_0x0619:
            boolean r5 = r0.f10519I
            if (r5 != 0) goto L_0x062c
            androidx.media3.extractor.ad r5 = r0.f10516F
            androidx.media3.extractor.ba r11 = new androidx.media3.extractor.ba
            long r12 = r0.f10542y
            r11.<init>(r12, r7)
            r5.mo6989q(r11)
            r5 = 1
            r0.f10519I = r5
        L_0x062c:
            int r5 = r0.f10535r
            if (r5 != r10) goto L_0x064a
            android.util.SparseArray r5 = r0.f10522e
            int r5 = r5.size()
            r11 = 0
        L_0x0637:
            if (r11 >= r5) goto L_0x064a
            android.util.SparseArray r12 = r0.f10522e
            java.lang.Object r12 = r12.valueAt(r11)
            androidx.media3.extractor.h.n r12 = (androidx.media3.extractor.p161h.C3427n) r12
            androidx.media3.extractor.h.z r12 = r12.f10498b
            r12.f10594c = r7
            r12.f10593b = r7
            int r11 = r11 + 1
            goto L_0x0637
        L_0x064a:
            int r5 = r0.f10535r
            if (r5 != r9) goto L_0x065b
            r9 = 0
            r0.f10511A = r9
            long r2 = r0.f10536s
            long r7 = r7 + r2
            r0.f10539v = r7
            r2 = 2
            r0.f10534q = r2
            goto L_0x0004
        L_0x065b:
            r7 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r5 == r7) goto L_0x0755
            r7 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r7) goto L_0x0755
            r7 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r7) goto L_0x0755
            r7 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r7) goto L_0x0755
            r7 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r7) goto L_0x0755
            if (r5 == r10) goto L_0x0755
            r7 = 1953653094(0x74726166, float:7.6813435E31)
            if (r5 == r7) goto L_0x0755
            r7 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r5 == r7) goto L_0x0755
            r7 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 != r7) goto L_0x0687
            goto L_0x0755
        L_0x0687:
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r5 == r2) goto L_0x0726
            r2 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r2) goto L_0x0726
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r2) goto L_0x0726
            if (r5 == r4) goto L_0x0726
            r2 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r2) goto L_0x0726
            r2 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r2) goto L_0x0726
            r2 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1952867444(0x74666474, float:7.3014264E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1952868452(0x74666864, float:7.301914E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1953654136(0x74726578, float:7.6818474E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1953658222(0x7472756e, float:7.683823E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1886614376(0x70737368, float:3.013775E29)
            if (r5 == r2) goto L_0x0726
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1970628964(0x75756964, float:3.1109627E32)
            if (r5 == r2) goto L_0x0726
            r2 = 1935828848(0x73626770, float:1.7937577E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 == r2) goto L_0x0726
            r2 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r2) goto L_0x0726
            r2 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r5 == r2) goto L_0x0726
            if (r5 != r3) goto L_0x0711
            goto L_0x0726
        L_0x0711:
            long r2 = r0.f10536s
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x071f
            r2 = 0
            r0.f10538u = r2
            r2 = 1
            r0.f10534q = r2
            goto L_0x0004
        L_0x071f:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6822d(r1)
            throw r1
        L_0x0726:
            int r2 = r0.f10537t
            if (r2 != r6) goto L_0x074e
            long r2 = r0.f10536s
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0747
            androidx.media3.common.b.ac r4 = new androidx.media3.common.b.ac
            int r3 = (int) r2
            r4.<init>((int) r3)
            androidx.media3.common.b.ac r2 = r0.f10530m
            byte[] r2 = r2.f7234a
            byte[] r3 = r4.f7234a
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r3, r5, r6)
            r0.f10538u = r4
            r2 = 1
            r0.f10534q = r2
            goto L_0x0004
        L_0x0747:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6822d(r1)
            throw r1
        L_0x074e:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6822d(r1)
            throw r1
        L_0x0755:
            long r2 = r2.f11566c
            long r6 = r0.f10536s
            long r2 = r2 + r6
            r6 = -8
            long r2 = r2 + r6
            java.util.ArrayDeque r4 = r0.f10531n
            androidx.media3.extractor.h.a r6 = new androidx.media3.extractor.h.a
            r6.<init>(r5, r2)
            r4.push(r6)
            long r4 = r0.f10536s
            int r6 = r0.f10537t
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0775
            r0.m9930i(r2)
            goto L_0x0004
        L_0x0775:
            r30.m9928g()
            goto L_0x0004
        L_0x077a:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6822d(r1)
            goto L_0x0782
        L_0x0781:
            throw r1
        L_0x0782:
            goto L_0x0781
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p161h.C3428o.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        int size = this.f10522e.size();
        for (int i = 0; i < size; i++) {
            ((C3427n) this.f10522e.valueAt(i)).mo7394e();
        }
        this.f10532o.clear();
        this.f10540w = 0;
        this.f10541x = j2;
        this.f10531n.clear();
        m9928g();
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        return C3436w.m9957a(abVar, true);
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        int i;
        this.f10516F = adVar;
        m9928g();
        C3368bf[] bfVarArr = new C3368bf[2];
        this.f10517G = bfVarArr;
        C3368bf bfVar = this.f10533p;
        int i2 = 0;
        if (bfVar != null) {
            bfVarArr[0] = bfVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f10520c & 4) != 0) {
            bfVarArr[i] = this.f10516F.mo6987eZ(100, 5);
            i3 = 101;
            i++;
        }
        C3368bf[] bfVarArr2 = (C3368bf[]) C2612ak.m6965ao(this.f10517G, i);
        this.f10517G = bfVarArr2;
        for (C3368bf b : bfVarArr2) {
            b.mo6850b(f10510b);
        }
        this.f10518H = new C3368bf[this.f10521d.size()];
        while (i2 < this.f10518H.length) {
            C3368bf eZ = this.f10516F.mo6987eZ(i3, 3);
            eZ.mo6850b((C2680x) this.f10521d.get(i2));
            this.f10518H[i2] = eZ;
            i2++;
            i3++;
        }
    }

    public C3428o(byte[] bArr) {
        this(0, (C2609ah) null, Collections.emptyList(), (C3368bf) null);
    }

    public C3428o(int i, C2609ah ahVar, List list, C3368bf bfVar) {
        this.f10520c = i;
        this.f10528k = ahVar;
        this.f10521d = Collections.unmodifiableList(list);
        this.f10533p = bfVar;
        this.f10529l = new C3591c();
        this.f10530m = new C2604ac(16);
        this.f10523f = new C2604ac(C3347av.f10114a);
        this.f10524g = new C2604ac(5);
        this.f10525h = new C2604ac();
        byte[] bArr = new byte[16];
        this.f10526i = bArr;
        this.f10527j = new C2604ac(bArr);
        this.f10531n = new ArrayDeque();
        this.f10532o = new ArrayDeque();
        this.f10522e = new SparseArray();
        this.f10542y = -9223372036854775807L;
        this.f10541x = -9223372036854775807L;
        this.f10543z = -9223372036854775807L;
        this.f10516F = C3329ad.f10053E;
        this.f10517G = new C3368bf[0];
        this.f10518H = new C3368bf[0];
    }
}
