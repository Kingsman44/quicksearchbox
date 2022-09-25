package android.support.p033v7.p040e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: android.support.v7.e.k */
/* compiled from: PG */
public final class C0429k {

    /* renamed from: a */
    private static final Comparator f1437a = new C0421c();

    /* renamed from: a */
    public static C0424f m1383a(C0422d dVar, boolean z) {
        C0427i iVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        C0428j jVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C0427i iVar2;
        C0423e eVar;
        int i;
        int i2;
        C0428j jVar2;
        C0428j jVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0422d dVar2 = dVar;
        int b = dVar.mo1380b();
        int a = dVar.mo1379a();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new C0427i(b, a));
        int i10 = b + a;
        int i11 = 1;
        int i12 = (i10 + 1) / 2;
        int i13 = i12 + i12 + 1;
        int[] iArr = new int[i13];
        int i14 = i13 >> 1;
        int[] iArr2 = new int[i13];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            C0427i iVar3 = (C0427i) arrayList6.remove(arrayList6.size() - 1);
            int i15 = iVar3.f1429b;
            int i16 = iVar3.f1428a;
            int i17 = i15 - i16;
            if (i17 > 0 && (i = iVar3.f1431d - iVar3.f1430c) > 0) {
                int i18 = ((i17 + i) + i11) / 2;
                int i19 = i14 + 1;
                iArr[i19] = i16;
                iArr2[i19] = i15;
                int i20 = 0;
                while (true) {
                    if (i20 >= i18) {
                        break;
                    }
                    int abs = Math.abs((iVar3.f1429b - iVar3.f1428a) - (iVar3.f1431d - iVar3.f1430c)) % 2;
                    int i21 = (iVar3.f1429b - iVar3.f1428a) - (iVar3.f1431d - iVar3.f1430c);
                    int i22 = -i20;
                    int i23 = i22;
                    while (true) {
                        if (i23 > i20) {
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            i2 = i18;
                            jVar2 = null;
                            break;
                        }
                        if (i23 == i22 || (i23 != i20 && iArr[i23 + 1 + i14] > iArr[(i23 - 1) + i14])) {
                            i7 = iArr[i23 + 1 + i14];
                            i6 = i7;
                        } else {
                            i7 = iArr[(i23 - 1) + i14];
                            i6 = i7 + 1;
                        }
                        i2 = i18;
                        arrayList2 = arrayList6;
                        int i24 = (iVar3.f1430c + (i6 - iVar3.f1428a)) - i23;
                        if (i20 == 0 || i6 != i7) {
                            arrayList = arrayList7;
                            i8 = i24;
                        } else {
                            i8 = i24 - 1;
                            arrayList = arrayList7;
                        }
                        while (i6 < iVar3.f1429b && i24 < iVar3.f1431d && dVar2.mo1383e(i6, i24)) {
                            i6++;
                            i24++;
                        }
                        iArr[i23 + i14] = i6;
                        if (abs == 1) {
                            int i25 = i21 - i23;
                            i9 = abs;
                            if (i25 >= i22 + 1 && i25 <= i20 - 1 && iArr2[i25 + i14] <= i6) {
                                jVar2 = new C0428j();
                                jVar2.f1432a = i7;
                                jVar2.f1433b = i8;
                                jVar2.f1434c = i6;
                                jVar2.f1435d = i24;
                                jVar2.f1436e = false;
                                break;
                            }
                        } else {
                            i9 = abs;
                        }
                        i23 += 2;
                        i18 = i2;
                        arrayList6 = arrayList2;
                        arrayList7 = arrayList;
                        abs = i9;
                    }
                    if (jVar2 != null) {
                        jVar = jVar2;
                        iVar = iVar3;
                        i11 = 1;
                        break;
                    }
                    int i26 = (iVar3.f1429b - iVar3.f1428a) - (iVar3.f1431d - iVar3.f1430c);
                    int i27 = i26 % 2;
                    int i28 = i22;
                    while (true) {
                        if (i28 > i20) {
                            iVar = iVar3;
                            i11 = 1;
                            jVar3 = null;
                            break;
                        }
                        if (i28 == i22 || (i28 != i20 && iArr2[i28 + 1 + i14] < iArr2[(i28 - 1) + i14])) {
                            i4 = iArr2[i28 + 1 + i14];
                            i3 = i4;
                        } else {
                            i4 = iArr2[(i28 - 1) + i14];
                            i3 = i4 - 1;
                        }
                        int i29 = iVar3.f1431d - ((iVar3.f1429b - i3) - i28);
                        int i30 = (i20 == 0 || i3 != i4) ? i29 : i29 + 1;
                        while (true) {
                            if (i3 > iVar3.f1428a && i29 > iVar3.f1430c) {
                                int i31 = i3 - 1;
                                iVar = iVar3;
                                int i32 = i29 - 1;
                                if (!dVar2.mo1383e(i31, i32)) {
                                    break;
                                }
                                i3 = i31;
                                i29 = i32;
                                iVar3 = iVar;
                            } else {
                                iVar = iVar3;
                            }
                        }
                        iVar = iVar3;
                        iArr2[i28 + i14] = i3;
                        if (i27 == 0 && (i5 = i26 - i28) >= i22 && i5 <= i20 && iArr[i5 + i14] >= i3) {
                            jVar3 = new C0428j();
                            jVar3.f1432a = i3;
                            jVar3.f1433b = i29;
                            jVar3.f1434c = i4;
                            jVar3.f1435d = i30;
                            i11 = 1;
                            jVar3.f1436e = true;
                            break;
                        }
                        i28 += 2;
                        iVar3 = iVar;
                    }
                    if (jVar3 != null) {
                        jVar = jVar3;
                        break;
                    }
                    i20++;
                    i18 = i2;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList;
                    iVar3 = iVar;
                }
            }
            arrayList = arrayList7;
            arrayList2 = arrayList6;
            iVar = iVar3;
            jVar = null;
            if (jVar != null) {
                if (jVar.mo1402a() > 0) {
                    int i33 = jVar.f1435d;
                    int i34 = jVar.f1433b;
                    int i35 = i33 - i34;
                    int i36 = jVar.f1434c;
                    int i37 = jVar.f1432a;
                    int i38 = i36 - i37;
                    if (i35 == i38) {
                        eVar = new C0423e(i37, i34, i38);
                    } else if (jVar.f1436e) {
                        eVar = new C0423e(i37, i34, jVar.mo1402a());
                    } else {
                        eVar = i35 > i38 ? new C0423e(i37, i34 + 1, jVar.mo1402a()) : new C0423e(i37 + 1, i34, jVar.mo1402a());
                    }
                    arrayList5.add(eVar);
                }
                if (arrayList.isEmpty()) {
                    iVar2 = new C0427i();
                    arrayList4 = arrayList;
                } else {
                    arrayList4 = arrayList;
                    iVar2 = (C0427i) arrayList4.remove(arrayList.size() - 1);
                }
                C0427i iVar4 = iVar;
                iVar2.f1428a = iVar4.f1428a;
                iVar2.f1430c = iVar4.f1430c;
                iVar2.f1429b = jVar.f1432a;
                iVar2.f1431d = jVar.f1433b;
                arrayList3 = arrayList2;
                arrayList3.add(iVar2);
                int i39 = iVar4.f1429b;
                int i40 = iVar4.f1431d;
                iVar4.f1428a = jVar.f1434c;
                iVar4.f1430c = jVar.f1435d;
                arrayList3.add(iVar4);
            } else {
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                arrayList4.add(iVar);
            }
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
        }
        Collections.sort(arrayList5, f1437a);
        return new C0424f(dVar, arrayList5, iArr, iArr2, z);
    }
}
