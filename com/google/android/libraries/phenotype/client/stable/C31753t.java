package com.google.android.libraries.phenotype.client.stable;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.clearcut.C143632i;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.phenotype.C145717aa;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.libraries.phenotype.client.C31655ak;
import com.google.common.base.C58817ah;
import com.google.common.base.C58835az;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58759qy;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.phenotype.client.stable.t */
/* compiled from: PG */
public final class C31753t extends C31745l {

    /* renamed from: a */
    public static final /* synthetic */ int f85344a = 0;

    /* renamed from: b */
    private static final AtomicBoolean f85345b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final C31655ak f85346c = C31655ak.m58992c();

    /* renamed from: d */
    private static final C31655ak f85347d = C31655ak.m58992c();

    /* renamed from: e */
    private static final C31655ak f85348e = C31655ak.m58992c();

    /* renamed from: f */
    private static final C31655ak f85349f = C31655ak.m58992c();

    /* renamed from: g */
    private static final C143632i f85350g = C31748o.f85339a;

    /* renamed from: j */
    public static void m59085j(C143657j jVar, C58881cr crVar, C58817ah ahVar) {
        ExperimentTokens experimentTokens;
        Iterator it;
        byte[][] bArr;
        byte[][] bArr2;
        Iterator it2;
        int[] iArr;
        int[] iArr2;
        byte[][] bArr3;
        byte[] bArr4;
        byte[][] bArr5;
        int[] iArr3;
        int[] iArr4;
        Set<C31746m> set;
        C143657j jVar2 = jVar;
        ArrayList<ExperimentTokens> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        if (!jVar2.f389471m.isEmpty() && (set = (Set) crVar.mo6453a()) != null) {
            for (C31746m mVar : set) {
                arrayList.add(mVar.f85337a);
                hashSet.add(mVar.f85338b);
            }
        }
        ArrayList<String> arrayList2 = jVar2.f389465g;
        if (arrayList2 != null) {
            for (String str : arrayList2) {
                C31746m mVar2 = (C31746m) ahVar.apply(str);
                if (mVar2 != null) {
                    arrayList.add(mVar2.f85337a);
                    hashSet.add(str);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            int i = 0;
            if (arrayList.size() == 1) {
                experimentTokens = (ExperimentTokens) arrayList.get(0);
            } else {
                if (!arrayList.isEmpty()) {
                    String str2 = ((ExperimentTokens) arrayList.get(0)).f393993f;
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!C145717aa.m236984a(str2, ((ExperimentTokens) it3.next()).f393993f)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                String str3 = !arrayList.isEmpty() ? ((ExperimentTokens) arrayList.get(0)).f393993f : BuildConfig.FLAVOR;
                String str4 = str3;
                byte[][] a = ExperimentTokens.m236914a(arrayList, ExperimentTokens.f393989b);
                byte[][] a2 = ExperimentTokens.m236914a(arrayList, ExperimentTokens.f393990c);
                byte[][] a3 = ExperimentTokens.m236914a(arrayList, ExperimentTokens.f393991d);
                byte[][] a4 = ExperimentTokens.m236914a(arrayList, ExperimentTokens.f393992e);
                int i2 = 0;
                for (ExperimentTokens experimentTokens2 : arrayList) {
                    if (!(experimentTokens2 == null || (iArr4 = experimentTokens2.f393999l) == null)) {
                        i2 += iArr4.length;
                    }
                }
                int[] iArr5 = new int[i2];
                int i3 = 0;
                for (ExperimentTokens experimentTokens3 : arrayList) {
                    if (!(experimentTokens3 == null || (iArr3 = experimentTokens3.f393999l) == null)) {
                        int length = iArr3.length;
                        int i4 = 0;
                        while (i4 < length) {
                            iArr5[i3] = iArr3[i4];
                            i4++;
                            i3++;
                        }
                    }
                }
                int i5 = 0;
                for (ExperimentTokens experimentTokens4 : arrayList) {
                    if (!(experimentTokens4 == null || experimentTokens4.f393994g == null)) {
                        i5++;
                    }
                    if (!(experimentTokens4 == null || (bArr5 = experimentTokens4.f394000m) == null)) {
                        i5 += bArr5.length;
                    }
                }
                byte[][] bArr6 = new byte[i5][];
                int i6 = 0;
                for (ExperimentTokens experimentTokens5 : arrayList) {
                    if (!(experimentTokens5 == null || (bArr4 = experimentTokens5.f393994g) == null)) {
                        bArr6[i6] = bArr4;
                        i6++;
                    }
                    if (!(experimentTokens5 == null || (bArr3 = experimentTokens5.f394000m) == null)) {
                        int length2 = bArr3.length;
                        while (i < length2) {
                            bArr6[i6] = bArr3[i];
                            i++;
                            i6++;
                        }
                    }
                    i = 0;
                }
                int i7 = 0;
                for (ExperimentTokens experimentTokens6 : arrayList) {
                    if (!(experimentTokens6 == null || (iArr2 = experimentTokens6.f394001n) == null)) {
                        i7 += iArr2.length;
                    }
                }
                int[] iArr6 = new int[i7];
                Iterator it4 = arrayList.iterator();
                int i8 = 0;
                while (it4.hasNext()) {
                    ExperimentTokens experimentTokens7 = (ExperimentTokens) it4.next();
                    if (experimentTokens7 == null || (iArr = experimentTokens7.f394001n) == null) {
                        it2 = it4;
                    } else {
                        int length3 = iArr.length;
                        it2 = it4;
                        int i9 = 0;
                        while (i9 < length3) {
                            iArr6[i8] = iArr[i9];
                            i9++;
                            i8++;
                        }
                    }
                    it4 = it2;
                }
                int i10 = 0;
                for (ExperimentTokens experimentTokens8 : arrayList) {
                    if (!(experimentTokens8 == null || (bArr2 = experimentTokens8.f394002o) == null)) {
                        i10 += bArr2.length;
                    }
                }
                byte[][] bArr7 = new byte[i10][];
                Iterator it5 = arrayList.iterator();
                int i11 = 0;
                while (it5.hasNext()) {
                    ExperimentTokens experimentTokens9 = (ExperimentTokens) it5.next();
                    if (experimentTokens9 == null || (bArr = experimentTokens9.f394002o) == null) {
                        it = it5;
                    } else {
                        int length4 = bArr.length;
                        it = it5;
                        int i12 = 0;
                        while (i12 < length4) {
                            bArr7[i11] = bArr[i12];
                            i12++;
                            i11++;
                        }
                    }
                    it5 = it;
                }
                experimentTokens = new ExperimentTokens(str4, (byte[]) null, a, a2, a3, a4, iArr5, bArr6, iArr6, bArr7);
            }
            if (!jVar2.f389459a.mo119002k()) {
                if (jVar2.f389469k == null) {
                    jVar2.f389469k = new HashSet();
                }
                jVar2.f389469k.addAll(hashSet);
                if (jVar2.f389459a.mo119002k()) {
                    throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
                } else if (experimentTokens != null) {
                    if (jVar2.f389467i == null) {
                        jVar2.f389467i = new ArrayList();
                    }
                    jVar2.f389467i.add(experimentTokens);
                }
            } else {
                throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
            }
        }
    }

    /* renamed from: k */
    private static final void m59086k(C31746m mVar, Object obj, C31655ak akVar, boolean z) {
        Set<C31746m> set = (Set) ((ConcurrentHashMap) akVar.f85157a).putIfAbsent(obj, new C58759qy(mVar));
        if (set != null) {
            C58526ih ihVar = new C58526ih();
            if (z) {
                HashSet hashSet = new HashSet();
                for (C31746m mVar2 : set) {
                    if (!mVar2.f85338b.equals(mVar.f85338b)) {
                        hashSet.add(mVar2);
                    }
                }
                ihVar.mo55489i(hashSet);
            } else {
                ihVar.mo55489i(set);
            }
            ihVar.mo55373c(mVar);
            akVar.put(obj, ihVar.mo55486f());
        }
    }

    /* renamed from: l */
    private static final void m59087l(C63088z zVar, Set set, String str, String str2, boolean z, boolean z2) {
        String str3 = str;
        String str4 = str2;
        boolean z3 = z2;
        if (!set.isEmpty() && !f85345b.getAndSet(true)) {
            C143658k.f389479f.add(0, f85350g);
        }
        byte[] N = zVar.mo59174N();
        byte[][] bArr = ExperimentTokens.f393988a;
        C31746m mVar = new C31746m(new ExperimentTokens(str, N, bArr, bArr, bArr, bArr, (int[]) null, (byte[][]) null, (int[]) null, (byte[][]) null), str4);
        if (z) {
            f85346c.put(new C58835az(str4, str3), mVar);
        } else {
            f85347d.put(str4, mVar);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (z) {
                m59086k(mVar, new C58835az(str5, str3), f85348e, z3);
            } else {
                m59086k(mVar, str5, f85349f, z3);
            }
        }
    }

    /* renamed from: a */
    public final C31746m mo37354a(String str) {
        return (C31746m) f85347d.get(str);
    }

    /* renamed from: b */
    public final C31746m mo37355b(String str, String str2) {
        return (C31746m) f85346c.get(new C58835az(str, str2));
    }

    /* renamed from: c */
    public final Set mo37356c(String str) {
        return (Set) f85349f.get(str);
    }

    /* renamed from: d */
    public final Set mo37357d(String str, String str2) {
        return (Set) f85348e.get(new C58835az(str, str2));
    }

    /* renamed from: e */
    public final void mo37358e(C63088z zVar, Set set, String str) {
        m59087l(zVar, set, BuildConfig.FLAVOR, str, false, false);
    }

    /* renamed from: f */
    public final void mo37359f(C63088z zVar, Set set, String str, String str2) {
        m59087l(zVar, set, str, str2, true, true);
    }

    /* renamed from: g */
    public final void mo37360g(C63088z zVar, Set set, String str) {
        m59087l(zVar, set, BuildConfig.FLAVOR, str, false, true);
    }
}
