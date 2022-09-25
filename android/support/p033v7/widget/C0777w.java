package android.support.p033v7.widget;

import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1972g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.w */
/* compiled from: PG */
final class C0777w {

    /* renamed from: a */
    final ArrayList f2672a = new ArrayList();

    /* renamed from: b */
    final ArrayList f2673b = new ArrayList();

    /* renamed from: c */
    final C0623el f2674c;

    /* renamed from: d */
    public int f2675d = 0;

    /* renamed from: e */
    final C0639fa f2676e;

    /* renamed from: f */
    private final C1971f f2677f = new C1972g(30);

    public C0777w(C0639fa faVar) {
        this.f2676e = faVar;
        this.f2674c = new C0623el(this);
    }

    /* renamed from: l */
    private final int m2586l(int i, int i2) {
        int size = this.f2673b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0776v vVar = (C0776v) this.f2673b.get(size);
            int i3 = vVar.f2668a;
            if (i3 == 8) {
                int i4 = vVar.f2669b;
                int i5 = vVar.f2671d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            vVar.f2669b = i4 + 1;
                            vVar.f2671d = i5 + 1;
                        } else if (i2 == 2) {
                            vVar.f2669b = i4 - 1;
                            vVar.f2671d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        vVar.f2671d = i5 + 1;
                    } else if (i2 == 2) {
                        vVar.f2671d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        vVar.f2669b = i4 + 1;
                    } else if (i2 == 2) {
                        vVar.f2669b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = vVar.f2669b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= vVar.f2671d;
                    } else if (i3 == 2) {
                        i += vVar.f2671d;
                    }
                } else if (i2 == 1) {
                    vVar.f2669b = i8 + 1;
                } else if (i2 == 2) {
                    vVar.f2669b = i8 - 1;
                }
            }
        }
        int size2 = this.f2673b.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            C0776v vVar2 = (C0776v) this.f2673b.get(size2);
            if (vVar2.f2668a == 8) {
                int i9 = vVar2.f2671d;
                if (i9 == vVar2.f2669b || i9 < 0) {
                    this.f2673b.remove(size2);
                    mo3290g(vVar2);
                }
            } else if (vVar2.f2671d <= 0) {
                this.f2673b.remove(size2);
                mo3290g(vVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r9 == (r0 + 1)) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r9 == r0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r11 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m2587m(android.support.p033v7.widget.C0776v r13) {
        /*
            r12 = this;
            int r0 = r13.f2668a
            r1 = 1
            if (r0 == r1) goto L_0x0086
            r2 = 8
            if (r0 == r2) goto L_0x0086
            int r2 = r13.f2669b
            int r0 = r12.m2586l(r2, r0)
            int r2 = r13.f2669b
            int r3 = r13.f2668a
            r4 = 2
            r5 = 0
            r6 = 4
            if (r3 == r4) goto L_0x0034
            if (r3 != r6) goto L_0x001c
            r3 = 1
            goto L_0x0035
        L_0x001c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "op should be remove or update."
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r13 = r2.concat(r13)
            r0.<init>(r13)
            throw r0
        L_0x0034:
            r3 = 0
        L_0x0035:
            r7 = 1
            r8 = 1
        L_0x0037:
            int r9 = r13.f2671d
            if (r7 >= r9) goto L_0x0072
            int r9 = r13.f2669b
            int r10 = r3 * r7
            int r9 = r9 + r10
            int r10 = r13.f2668a
            int r9 = r12.m2586l(r9, r10)
            int r10 = r13.f2668a
            if (r10 == r4) goto L_0x0052
            if (r10 == r6) goto L_0x004d
            goto L_0x005c
        L_0x004d:
            int r11 = r0 + 1
            if (r9 != r11) goto L_0x0056
            goto L_0x0054
        L_0x0052:
            if (r9 != r0) goto L_0x0056
        L_0x0054:
            r11 = 1
            goto L_0x0057
        L_0x0056:
            r11 = 0
        L_0x0057:
            if (r11 == 0) goto L_0x005c
            int r8 = r8 + 1
            goto L_0x006f
        L_0x005c:
            java.lang.Object r11 = r13.f2670c
            android.support.v7.widget.v r0 = r12.mo3285b(r10, r0, r8, r11)
            r12.mo3288e(r0, r2)
            r12.mo3290g(r0)
            int r0 = r13.f2668a
            if (r0 != r6) goto L_0x006d
            int r2 = r2 + r8
        L_0x006d:
            r0 = r9
            r8 = 1
        L_0x006f:
            int r7 = r7 + 1
            goto L_0x0037
        L_0x0072:
            java.lang.Object r1 = r13.f2670c
            r12.mo3290g(r13)
            if (r8 <= 0) goto L_0x0085
            int r13 = r13.f2668a
            android.support.v7.widget.v r13 = r12.mo3285b(r13, r0, r8, r1)
            r12.mo3288e(r13, r2)
            r12.mo3290g(r13)
        L_0x0085:
            return
        L_0x0086:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            goto L_0x008f
        L_0x008e:
            throw r13
        L_0x008f:
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0777w.m2587m(android.support.v7.widget.v):void");
    }

    /* renamed from: n */
    private final void m2588n(C0776v vVar) {
        this.f2673b.add(vVar);
        int i = vVar.f2668a;
        if (i == 1) {
            this.f2676e.mo2868d(vVar.f2669b, vVar.f2671d);
        } else if (i == 2) {
            C0639fa faVar = this.f2676e;
            faVar.f2404a.offsetPositionRecordsForRemove(vVar.f2669b, vVar.f2671d, false);
            faVar.f2404a.mItemsAddedOrRemoved = true;
        } else if (i == 4) {
            this.f2676e.mo2867c(vVar.f2669b, vVar.f2671d, vVar.f2670c);
        } else if (i == 8) {
            this.f2676e.mo2869e(vVar.f2669b, vVar.f2671d);
        } else {
            new StringBuilder("Unknown update op type for ").append(vVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(vVar)));
        }
    }

    /* renamed from: o */
    private final boolean m2589o(int i) {
        int size = this.f2673b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0776v vVar = (C0776v) this.f2673b.get(i2);
            int i3 = vVar.f2668a;
            if (i3 == 8) {
                if (mo3284a(vVar.f2671d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = vVar.f2669b;
                int i5 = vVar.f2671d + i4;
                while (i4 < i5) {
                    if (mo3284a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3284a(int i, int i2) {
        int size = this.f2673b.size();
        while (i2 < size) {
            C0776v vVar = (C0776v) this.f2673b.get(i2);
            int i3 = vVar.f2668a;
            if (i3 == 8) {
                int i4 = vVar.f2669b;
                if (i4 == i) {
                    i = vVar.f2671d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (vVar.f2671d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = vVar.f2669b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = vVar.f2671d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += vVar.f2671d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: b */
    public final C0776v mo3285b(int i, int i2, int i3, Object obj) {
        C0776v vVar = (C0776v) this.f2677f.mo5126a();
        if (vVar == null) {
            return new C0776v(i, i2, i3, obj);
        }
        vVar.f2668a = i;
        vVar.f2669b = i2;
        vVar.f2671d = i3;
        vVar.f2670c = obj;
        return vVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3286c() {
        int size = this.f2673b.size();
        for (int i = 0; i < size; i++) {
            this.f2676e.mo2866b((C0776v) this.f2673b.get(i));
        }
        mo3291h(this.f2673b);
        this.f2675d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3287d() {
        mo3286c();
        int size = this.f2672a.size();
        for (int i = 0; i < size; i++) {
            C0776v vVar = (C0776v) this.f2672a.get(i);
            int i2 = vVar.f2668a;
            if (i2 == 1) {
                this.f2676e.mo2866b(vVar);
                this.f2676e.mo2868d(vVar.f2669b, vVar.f2671d);
            } else if (i2 == 2) {
                this.f2676e.mo2866b(vVar);
                this.f2676e.mo2870f(vVar.f2669b, vVar.f2671d);
            } else if (i2 == 4) {
                this.f2676e.mo2866b(vVar);
                this.f2676e.mo2867c(vVar.f2669b, vVar.f2671d, vVar.f2670c);
            } else if (i2 == 8) {
                this.f2676e.mo2866b(vVar);
                this.f2676e.mo2869e(vVar.f2669b, vVar.f2671d);
            }
        }
        mo3291h(this.f2672a);
        this.f2675d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo3288e(C0776v vVar, int i) {
        this.f2676e.mo2866b(vVar);
        int i2 = vVar.f2668a;
        if (i2 == 2) {
            this.f2676e.mo2870f(i, vVar.f2671d);
        } else if (i2 == 4) {
            this.f2676e.mo2867c(i, vVar.f2671d, vVar.f2670c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0116  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3289f() {
        /*
            r16 = this;
            r0 = r16
            android.support.v7.widget.el r1 = r0.f2674c
            java.util.ArrayList r2 = r0.f2672a
        L_0x0006:
            int r3 = r2.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = 0
            r6 = 0
        L_0x000e:
            r7 = 8
            r8 = 1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            android.support.v7.widget.v r9 = (android.support.p033v7.widget.C0776v) r9
            int r9 = r9.f2668a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            r6 = 0
            goto L_0x0023
        L_0x0022:
            r6 = 1
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x000e
        L_0x0026:
            r3 = -1
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r4) goto L_0x01b5
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            android.support.v7.widget.v r11 = (android.support.p033v7.widget.C0776v) r11
            java.lang.Object r12 = r2.get(r7)
            android.support.v7.widget.v r12 = (android.support.p033v7.widget.C0776v) r12
            int r13 = r12.f2668a
            if (r13 == r8) goto L_0x018c
            if (r13 == r9) goto L_0x00a1
            if (r13 == r6) goto L_0x0043
            goto L_0x0006
        L_0x0043:
            int r4 = r11.f2671d
            int r5 = r12.f2669b
            if (r4 >= r5) goto L_0x004f
            int r5 = r5 + -1
            r12.f2669b = r5
        L_0x004d:
            r4 = r10
            goto L_0x0062
        L_0x004f:
            int r9 = r12.f2671d
            int r5 = r5 + r9
            if (r4 >= r5) goto L_0x004d
            int r9 = r9 + -1
            r12.f2671d = r9
            android.support.v7.widget.w r4 = r1.f2385a
            int r5 = r11.f2669b
            java.lang.Object r9 = r12.f2670c
            android.support.v7.widget.v r4 = r4.mo3285b(r6, r5, r8, r9)
        L_0x0062:
            int r5 = r11.f2669b
            int r8 = r12.f2669b
            if (r5 > r8) goto L_0x006d
            int r8 = r8 + 1
            r12.f2669b = r8
            goto L_0x0082
        L_0x006d:
            int r9 = r12.f2671d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0082
            int r8 = r8 - r5
            android.support.v7.widget.w r9 = r1.f2385a
            int r5 = r5 + 1
            java.lang.Object r10 = r12.f2670c
            android.support.v7.widget.v r10 = r9.mo3285b(r6, r5, r8, r10)
            int r5 = r12.f2671d
            int r5 = r5 - r8
            r12.f2671d = r5
        L_0x0082:
            r2.set(r7, r11)
            int r5 = r12.f2671d
            if (r5 <= 0) goto L_0x008d
            r2.set(r3, r12)
            goto L_0x0095
        L_0x008d:
            r2.remove(r3)
            android.support.v7.widget.w r5 = r1.f2385a
            r5.mo3290g(r12)
        L_0x0095:
            if (r4 == 0) goto L_0x009a
            r2.add(r3, r4)
        L_0x009a:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x00a1:
            int r4 = r11.f2669b
            int r6 = r11.f2671d
            if (r4 >= r6) goto L_0x00b5
            int r13 = r12.f2669b
            if (r13 != r4) goto L_0x00b3
            int r13 = r12.f2671d
            int r4 = r6 - r4
            if (r13 != r4) goto L_0x00b3
            r4 = 0
            goto L_0x00c1
        L_0x00b3:
            r4 = 0
            goto L_0x00c4
        L_0x00b5:
            int r13 = r12.f2669b
            int r14 = r6 + 1
            if (r13 != r14) goto L_0x00c3
            int r13 = r12.f2671d
            int r4 = r4 - r6
            if (r13 != r4) goto L_0x00c3
            r4 = 1
        L_0x00c1:
            r5 = 1
            goto L_0x00c4
        L_0x00c3:
            r4 = 1
        L_0x00c4:
            int r13 = r12.f2669b
            if (r6 >= r13) goto L_0x00cd
            int r13 = r13 + -1
            r12.f2669b = r13
            goto L_0x00e9
        L_0x00cd:
            int r14 = r12.f2671d
            int r15 = r13 + r14
            if (r6 >= r15) goto L_0x00e9
            int r14 = r14 + -1
            r12.f2671d = r14
            r11.f2668a = r9
            r11.f2671d = r8
            int r3 = r12.f2671d
            if (r3 != 0) goto L_0x0006
            r2.remove(r7)
            android.support.v7.widget.w r3 = r1.f2385a
            r3.mo3290g(r12)
            goto L_0x0006
        L_0x00e9:
            int r6 = r11.f2669b
            if (r6 > r13) goto L_0x00f2
            int r13 = r13 + 1
            r12.f2669b = r13
            goto L_0x0107
        L_0x00f2:
            int r8 = r12.f2671d
            int r13 = r13 + r8
            if (r6 >= r13) goto L_0x0107
            android.support.v7.widget.w r8 = r1.f2385a
            int r14 = r6 + 1
            int r13 = r13 - r6
            android.support.v7.widget.v r10 = r8.mo3285b(r9, r14, r13, r10)
            int r6 = r11.f2669b
            int r8 = r12.f2669b
            int r6 = r6 - r8
            r12.f2671d = r6
        L_0x0107:
            if (r5 == 0) goto L_0x0116
            r2.set(r3, r12)
            r2.remove(r7)
            android.support.v7.widget.w r3 = r1.f2385a
            r3.mo3290g(r11)
            goto L_0x0006
        L_0x0116:
            if (r4 == 0) goto L_0x0147
            if (r10 == 0) goto L_0x0130
            int r4 = r11.f2669b
            int r5 = r10.f2669b
            if (r4 <= r5) goto L_0x0125
            int r5 = r10.f2671d
            int r4 = r4 - r5
            r11.f2669b = r4
        L_0x0125:
            int r4 = r11.f2671d
            int r5 = r10.f2669b
            if (r4 <= r5) goto L_0x0130
            int r5 = r10.f2671d
            int r4 = r4 - r5
            r11.f2671d = r4
        L_0x0130:
            int r4 = r11.f2669b
            int r5 = r12.f2669b
            if (r4 <= r5) goto L_0x013b
            int r5 = r12.f2671d
            int r4 = r4 - r5
            r11.f2669b = r4
        L_0x013b:
            int r4 = r11.f2671d
            int r5 = r12.f2669b
            if (r4 <= r5) goto L_0x0175
            int r5 = r12.f2671d
            int r4 = r4 - r5
            r11.f2671d = r4
            goto L_0x0175
        L_0x0147:
            if (r10 == 0) goto L_0x015f
            int r4 = r11.f2669b
            int r5 = r10.f2669b
            if (r4 < r5) goto L_0x0154
            int r5 = r10.f2671d
            int r4 = r4 - r5
            r11.f2669b = r4
        L_0x0154:
            int r4 = r11.f2671d
            int r5 = r10.f2669b
            if (r4 < r5) goto L_0x015f
            int r5 = r10.f2671d
            int r4 = r4 - r5
            r11.f2671d = r4
        L_0x015f:
            int r4 = r11.f2669b
            int r5 = r12.f2669b
            if (r4 < r5) goto L_0x016a
            int r5 = r12.f2671d
            int r4 = r4 - r5
            r11.f2669b = r4
        L_0x016a:
            int r4 = r11.f2671d
            int r5 = r12.f2669b
            if (r4 < r5) goto L_0x0175
            int r5 = r12.f2671d
            int r4 = r4 - r5
            r11.f2671d = r4
        L_0x0175:
            r2.set(r3, r12)
            int r4 = r11.f2669b
            int r5 = r11.f2671d
            if (r4 == r5) goto L_0x0182
            r2.set(r7, r11)
            goto L_0x0185
        L_0x0182:
            r2.remove(r7)
        L_0x0185:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x018c:
            int r6 = r11.f2671d
            int r8 = r12.f2669b
            if (r6 >= r8) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r4 = 0
        L_0x0194:
            int r5 = r11.f2669b
            if (r5 >= r8) goto L_0x019a
            int r4 = r4 + 1
        L_0x019a:
            if (r8 > r5) goto L_0x01a1
            int r8 = r12.f2671d
            int r5 = r5 + r8
            r11.f2669b = r5
        L_0x01a1:
            int r5 = r12.f2669b
            if (r5 > r6) goto L_0x01aa
            int r8 = r12.f2671d
            int r6 = r6 + r8
            r11.f2671d = r6
        L_0x01aa:
            int r5 = r5 + r4
            r12.f2669b = r5
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0006
        L_0x01b5:
            java.util.ArrayList r1 = r0.f2672a
            int r1 = r1.size()
            r2 = 0
        L_0x01bc:
            if (r2 >= r1) goto L_0x0285
            java.util.ArrayList r3 = r0.f2672a
            java.lang.Object r3 = r3.get(r2)
            android.support.v7.widget.v r3 = (android.support.p033v7.widget.C0776v) r3
            int r11 = r3.f2668a
            if (r11 == r8) goto L_0x027d
            if (r11 == r9) goto L_0x0229
            if (r11 == r6) goto L_0x01d7
            if (r11 == r7) goto L_0x01d2
            goto L_0x0280
        L_0x01d2:
            r0.m2588n(r3)
            goto L_0x0280
        L_0x01d7:
            int r11 = r3.f2669b
            int r12 = r3.f2671d
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L_0x01df:
            if (r11 >= r12) goto L_0x0212
            android.support.v7.widget.fa r4 = r0.f2676e
            android.support.v7.widget.gh r4 = r4.mo2865a(r11)
            if (r4 != 0) goto L_0x01ff
            boolean r4 = r0.m2589o(r11)
            if (r4 == 0) goto L_0x01f0
            goto L_0x01ff
        L_0x01f0:
            if (r15 != r8) goto L_0x01fd
            java.lang.Object r4 = r3.f2670c
            android.support.v7.widget.v r4 = r0.mo3285b(r6, r13, r14, r4)
            r0.m2588n(r4)
            r13 = r11
            r14 = 0
        L_0x01fd:
            r15 = 0
            goto L_0x020d
        L_0x01ff:
            if (r15 != 0) goto L_0x020c
            java.lang.Object r4 = r3.f2670c
            android.support.v7.widget.v r4 = r0.mo3285b(r6, r13, r14, r4)
            r0.m2587m(r4)
            r13 = r11
            r14 = 0
        L_0x020c:
            r15 = 1
        L_0x020d:
            int r14 = r14 + r8
            int r11 = r11 + 1
            r4 = -1
            goto L_0x01df
        L_0x0212:
            int r4 = r3.f2671d
            if (r14 == r4) goto L_0x021f
            java.lang.Object r4 = r3.f2670c
            r0.mo3290g(r3)
            android.support.v7.widget.v r3 = r0.mo3285b(r6, r13, r14, r4)
        L_0x021f:
            if (r15 != 0) goto L_0x0225
            r0.m2587m(r3)
            goto L_0x0280
        L_0x0225:
            r0.m2588n(r3)
            goto L_0x0280
        L_0x0229:
            int r4 = r3.f2669b
            int r11 = r3.f2671d
            int r11 = r11 + r4
            r12 = r4
            r13 = 0
            r14 = -1
        L_0x0231:
            if (r12 >= r11) goto L_0x0268
            android.support.v7.widget.fa r15 = r0.f2676e
            android.support.v7.widget.gh r15 = r15.mo2865a(r12)
            if (r15 != 0) goto L_0x0250
            boolean r15 = r0.m2589o(r12)
            if (r15 == 0) goto L_0x0242
            goto L_0x0250
        L_0x0242:
            if (r14 != r8) goto L_0x024d
            android.support.v7.widget.v r14 = r0.mo3285b(r9, r4, r13, r10)
            r0.m2588n(r14)
            r14 = 1
            goto L_0x024e
        L_0x024d:
            r14 = 0
        L_0x024e:
            r15 = 0
            goto L_0x025d
        L_0x0250:
            if (r14 != 0) goto L_0x025b
            android.support.v7.widget.v r14 = r0.mo3285b(r9, r4, r13, r10)
            r0.m2587m(r14)
            r14 = 1
            goto L_0x025c
        L_0x025b:
            r14 = 0
        L_0x025c:
            r15 = 1
        L_0x025d:
            if (r14 == 0) goto L_0x0263
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x0265
        L_0x0263:
            int r13 = r13 + 1
        L_0x0265:
            int r12 = r12 + r8
            r14 = r15
            goto L_0x0231
        L_0x0268:
            int r11 = r3.f2671d
            if (r13 == r11) goto L_0x0273
            r0.mo3290g(r3)
            android.support.v7.widget.v r3 = r0.mo3285b(r9, r4, r13, r10)
        L_0x0273:
            if (r14 != 0) goto L_0x0279
            r0.m2587m(r3)
            goto L_0x0280
        L_0x0279:
            r0.m2588n(r3)
            goto L_0x0280
        L_0x027d:
            r0.m2588n(r3)
        L_0x0280:
            int r2 = r2 + 1
            r4 = -1
            goto L_0x01bc
        L_0x0285:
            java.util.ArrayList r1 = r0.f2672a
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0777w.mo3289f():void");
    }

    /* renamed from: g */
    public final void mo3290g(C0776v vVar) {
        vVar.f2670c = null;
        this.f2677f.mo5127b(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo3291h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo3290g((C0776v) list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo3292i() {
        mo3291h(this.f2672a);
        mo3291h(this.f2673b);
        this.f2675d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo3293j(int i) {
        return (i & this.f2675d) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo3294k() {
        return this.f2672a.size() > 0;
    }
}
