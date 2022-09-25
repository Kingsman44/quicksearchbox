package android.support.p033v7.p040e;

import android.support.p033v7.widget.C0640fb;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.e.f */
/* compiled from: PG */
public final class C0424f {

    /* renamed from: a */
    private final List f1418a;

    /* renamed from: b */
    private final int[] f1419b;

    /* renamed from: c */
    private final int[] f1420c;

    /* renamed from: d */
    private final C0422d f1421d;

    /* renamed from: e */
    private final int f1422e;

    /* renamed from: f */
    private final int f1423f;

    /* renamed from: g */
    private final boolean f1424g;

    public C0424f(C0422d dVar, List list, int[] iArr, int[] iArr2, boolean z) {
        int i;
        C0423e eVar;
        int i2;
        this.f1418a = list;
        this.f1419b = iArr;
        this.f1420c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f1421d = dVar;
        int b = dVar.mo1380b();
        this.f1422e = b;
        int a = dVar.mo1379a();
        this.f1423f = a;
        this.f1424g = z;
        C0423e eVar2 = list.isEmpty() ? null : (C0423e) list.get(0);
        if (!(eVar2 != null && eVar2.f1415a == 0 && eVar2.f1416b == 0)) {
            list.add(0, new C0423e(0, 0, 0));
        }
        list.add(new C0423e(b, a, 0));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0423e eVar3 = (C0423e) it.next();
            for (int i3 = 0; i3 < eVar3.f1417c; i3++) {
                int i4 = eVar3.f1415a + i3;
                int i5 = eVar3.f1416b + i3;
                int i6 = true != this.f1421d.mo1382d(i4, i5) ? 2 : 1;
                this.f1419b[i4] = (i5 << 4) | i6;
                this.f1420c[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f1424g) {
            int i7 = 0;
            for (C0423e eVar4 : this.f1418a) {
                while (true) {
                    i = eVar4.f1415a;
                    if (i7 >= i) {
                        break;
                    }
                    if (this.f1419b[i7] == 0) {
                        int size = this.f1418a.size();
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            if (i8 >= size) {
                                break;
                            }
                            eVar = (C0423e) this.f1418a.get(i8);
                            while (true) {
                                i2 = eVar.f1416b;
                                if (i9 >= i2) {
                                    break;
                                } else if (this.f1420c[i9] != 0 || !this.f1421d.mo1383e(i7, i9)) {
                                    i9++;
                                } else {
                                    int i10 = true != this.f1421d.mo1382d(i7, i9) ? 4 : 8;
                                    this.f1419b[i7] = (i9 << 4) | i10;
                                    this.f1420c[i9] = i10 | (i7 << 4);
                                }
                            }
                            i9 = eVar.f1417c + i2;
                            i8++;
                        }
                    }
                    i7++;
                }
                i7 = eVar4.f1417c + i;
            }
        }
    }

    /* renamed from: c */
    private static C0426h m1377c(Collection collection, int i, boolean z) {
        C0426h hVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                hVar = null;
                break;
            }
            hVar = (C0426h) it.next();
            if (hVar.f1425a == i && hVar.f1427c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C0426h hVar2 = (C0426h) it.next();
            if (z) {
                hVar2.f1426b--;
            } else {
                hVar2.f1426b++;
            }
        }
        return hVar;
    }

    /* renamed from: a */
    public final void mo1398a(C0430l lVar) {
        C0420b bVar;
        int i;
        if (lVar instanceof C0420b) {
            bVar = (C0420b) lVar;
        } else {
            bVar = new C0420b(lVar);
        }
        int i2 = this.f1422e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.f1422e;
        int i4 = this.f1423f;
        int size = this.f1418a.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0423e eVar = (C0423e) this.f1418a.get(size);
                int i5 = eVar.f1415a;
                int i6 = eVar.f1417c;
                int i7 = i5 + i6;
                int i8 = eVar.f1416b + i6;
                while (true) {
                    if (i3 <= i7) {
                        break;
                    }
                    i3--;
                    int i9 = this.f1419b[i3];
                    if ((i9 & 12) != 0) {
                        int i10 = i9 >> 4;
                        C0426h c = m1377c(arrayDeque, i10, false);
                        if (c != null) {
                            int i11 = (i2 - c.f1426b) - 1;
                            bVar.mo1394c(i3, i11);
                            if ((i9 & 4) != 0) {
                                bVar.mo1392a(i11, 1, this.f1421d.mo1381c(i3, i10));
                            }
                        } else {
                            arrayDeque.add(new C0426h(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        bVar.mo1395d(i3, 1);
                        i2--;
                    }
                }
                while (i4 > i8) {
                    i4--;
                    int i12 = this.f1420c[i4];
                    if ((i12 & 12) != 0) {
                        int i13 = i12 >> 4;
                        C0426h c2 = m1377c(arrayDeque, i13, true);
                        if (c2 == null) {
                            arrayDeque.add(new C0426h(i4, i2 - i3, false));
                        } else {
                            bVar.mo1394c((i2 - c2.f1426b) - 1, i3);
                            if ((i12 & 4) != 0) {
                                bVar.mo1392a(i3, 1, this.f1421d.mo1381c(i13, i4));
                            }
                        }
                    } else {
                        bVar.mo1393b(i3, 1);
                        i2++;
                    }
                }
                int i14 = eVar.f1415a;
                int i15 = eVar.f1416b;
                for (i = 0; i < eVar.f1417c; i++) {
                    if ((this.f1419b[i14] & 15) == 2) {
                        bVar.mo1392a(i14, 1, this.f1421d.mo1381c(i14, i15));
                    }
                    i14++;
                    i15++;
                }
                i3 = eVar.f1415a;
                i4 = eVar.f1416b;
            } else {
                bVar.mo1396e();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo1399b(C0640fb fbVar) {
        mo1398a(new C0419a(fbVar));
    }
}
