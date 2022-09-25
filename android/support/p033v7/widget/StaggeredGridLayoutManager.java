package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
/* compiled from: PG */
public class StaggeredGridLayoutManager extends C0653fo implements C0668gc {

    /* renamed from: a */
    public int f1837a = -1;

    /* renamed from: b */
    public C0725if[] f1838b;

    /* renamed from: c */
    C0626eo f1839c;

    /* renamed from: d */
    C0626eo f1840d;

    /* renamed from: e */
    public int f1841e;

    /* renamed from: f */
    public boolean f1842f = false;

    /* renamed from: g */
    boolean f1843g = false;

    /* renamed from: h */
    public int f1844h = -1;

    /* renamed from: i */
    public int f1845i = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: j */
    LazySpanLookup f1846j = new LazySpanLookup();

    /* renamed from: k */
    public int f1847k = 2;

    /* renamed from: l */
    public SavedState f1848l;

    /* renamed from: m */
    private int f1849m;

    /* renamed from: n */
    private final C0595dk f1850n;

    /* renamed from: o */
    private BitSet f1851o;

    /* renamed from: p */
    private boolean f1852p;

    /* renamed from: q */
    private boolean f1853q;

    /* renamed from: r */
    private int f1854r;

    /* renamed from: s */
    private final Rect f1855s = new Rect();

    /* renamed from: t */
    private final C0721ib f1856t = new C0721ib(this);

    /* renamed from: u */
    private boolean f1857u = false;

    /* renamed from: v */
    private boolean f1858v = true;

    /* renamed from: w */
    private int[] f1859w;

    /* renamed from: x */
    private final Runnable f1860x = new C0720ia(this);

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$SavedState */
    /* compiled from: PG */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0724ie();

        /* renamed from: a */
        int f1867a;

        /* renamed from: b */
        int f1868b;

        /* renamed from: c */
        int f1869c;

        /* renamed from: d */
        int[] f1870d;

        /* renamed from: e */
        int f1871e;

        /* renamed from: f */
        int[] f1872f;

        /* renamed from: g */
        List f1873g;

        /* renamed from: h */
        boolean f1874h;

        /* renamed from: i */
        boolean f1875i;

        /* renamed from: j */
        boolean f1876j;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f1867a = parcel.readInt();
            this.f1868b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1869c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1870d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1871e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1872f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f1874h = parcel.readInt() == 1;
            this.f1875i = parcel.readInt() == 1;
            this.f1876j = parcel.readInt() == 1 ? true : z;
            this.f1873g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f1869c = savedState.f1869c;
            this.f1867a = savedState.f1867a;
            this.f1868b = savedState.f1868b;
            this.f1870d = savedState.f1870d;
            this.f1871e = savedState.f1871e;
            this.f1872f = savedState.f1872f;
            this.f1874h = savedState.f1874h;
            this.f1875i = savedState.f1875i;
            this.f1876j = savedState.f1876j;
            this.f1873g = savedState.f1873g;
        }

        /* renamed from: a */
        public final void mo2349a() {
            this.f1870d = null;
            this.f1869c = 0;
            this.f1867a = -1;
            this.f1868b = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo2350b() {
            this.f1870d = null;
            this.f1869c = 0;
            this.f1871e = 0;
            this.f1872f = null;
            this.f1873g = null;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1867a);
            parcel.writeInt(this.f1868b);
            parcel.writeInt(this.f1869c);
            if (this.f1869c > 0) {
                parcel.writeIntArray(this.f1870d);
            }
            parcel.writeInt(this.f1871e);
            if (this.f1871e > 0) {
                parcel.writeIntArray(this.f1872f);
            }
            parcel.writeInt(this.f1874h ? 1 : 0);
            parcel.writeInt(this.f1875i ? 1 : 0);
            parcel.writeInt(this.f1876j ? 1 : 0);
            parcel.writeList(this.f1873g);
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f1841e = i2;
        mo2326i(i);
        this.f1850n = new C0595dk();
        m1757v();
    }

    /* renamed from: A */
    private final void m1739A(C0661fw fwVar, C0595dk dkVar) {
        int i;
        int i2;
        if (dkVar.f2302a && !dkVar.f2310i) {
            if (dkVar.f2303b != 0) {
                int i3 = 1;
                if (dkVar.f2306e == -1) {
                    int i4 = dkVar.f2307f;
                    int h = this.f1838b[0].mo3215h(i4);
                    while (i3 < this.f1837a) {
                        int h2 = this.f1838b[i3].mo3215h(i4);
                        if (h2 > h) {
                            h = h2;
                        }
                        i3++;
                    }
                    int i5 = i4 - h;
                    if (i5 < 0) {
                        i2 = dkVar.f2308g;
                    } else {
                        i2 = dkVar.f2308g - Math.min(i5, dkVar.f2303b);
                    }
                    m1740B(fwVar, i2);
                    return;
                }
                int i6 = dkVar.f2308g;
                int f = this.f1838b[0].mo3213f(i6);
                while (i3 < this.f1837a) {
                    int f2 = this.f1838b[i3].mo3213f(i6);
                    if (f2 < f) {
                        f = f2;
                    }
                    i3++;
                }
                int i7 = f - dkVar.f2308g;
                if (i7 < 0) {
                    i = dkVar.f2307f;
                } else {
                    i = Math.min(i7, dkVar.f2303b) + dkVar.f2307f;
                }
                m1741C(fwVar, i);
            } else if (dkVar.f2306e == -1) {
                m1740B(fwVar, dkVar.f2308g);
            } else {
                m1741C(fwVar, dkVar.f2307f);
            }
        }
    }

    /* renamed from: B */
    private final void m1740B(C0661fw fwVar, int i) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = getChildAt(childCount);
                if (this.f1839c.mo2841d(childAt) >= i && this.f1839c.mo2850m(childAt) >= i) {
                    C0722ic icVar = (C0722ic) childAt.getLayoutParams();
                    if (icVar.f2559b) {
                        int i2 = 0;
                        while (i2 < this.f1837a) {
                            if (this.f1838b[i2].f2560a.size() != 1) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                        for (int i3 = 0; i3 < this.f1837a; i3++) {
                            this.f1838b[i3].mo3222o();
                        }
                    } else if (icVar.f2558a.f2560a.size() != 1) {
                        icVar.f2558a.mo3222o();
                    } else {
                        return;
                    }
                    removeAndRecycleView(childAt, fwVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: C */
    private final void m1741C(C0661fw fwVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f1839c.mo2838a(childAt) <= i && this.f1839c.mo2849l(childAt) <= i) {
                C0722ic icVar = (C0722ic) childAt.getLayoutParams();
                if (icVar.f2559b) {
                    int i2 = 0;
                    while (i2 < this.f1837a) {
                        if (this.f1838b[i2].f2560a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f1837a; i3++) {
                        this.f1838b[i3].mo3223p();
                    }
                } else if (icVar.f2558a.f2560a.size() != 1) {
                    icVar.f2558a.mo3223p();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, fwVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: D */
    private final void m1742D() {
        this.f1843g = (this.f1841e == 1 || !mo2329l()) ? this.f1842f : !this.f1842f;
    }

    /* renamed from: E */
    private final void m1743E(int i) {
        C0595dk dkVar = this.f1850n;
        dkVar.f2306e = i;
        int i2 = 1;
        if (this.f1843g != (i == -1)) {
            i2 = -1;
        }
        dkVar.f2305d = i2;
    }

    /* renamed from: F */
    private final void m1744F(int i, int i2) {
        for (int i3 = 0; i3 < this.f1837a; i3++) {
            if (!this.f1838b[i3].f2560a.isEmpty()) {
                m1746H(this.f1838b[i3], i, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1745G(int r5, android.support.p033v7.widget.C0670ge r6) {
        /*
            r4 = this;
            android.support.v7.widget.dk r0 = r4.f1850n
            r1 = 0
            r0.f2303b = r1
            r0.f2304c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L_0x002c
            int r6 = r6.f2456a
            r0 = -1
            if (r6 == r0) goto L_0x002c
            boolean r0 = r4.f1843g
            if (r6 < r5) goto L_0x0019
            r5 = 0
            goto L_0x001a
        L_0x0019:
            r5 = 1
        L_0x001a:
            if (r0 != r5) goto L_0x0023
            android.support.v7.widget.eo r5 = r4.f1839c
            int r5 = r5.mo2848k()
            goto L_0x002d
        L_0x0023:
            android.support.v7.widget.eo r5 = r4.f1839c
            int r5 = r5.mo2848k()
            r6 = r5
            r5 = 0
            goto L_0x002e
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = 0
        L_0x002e:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L_0x004b
            android.support.v7.widget.dk r0 = r4.f1850n
            android.support.v7.widget.eo r3 = r4.f1839c
            int r3 = r3.mo2847j()
            int r3 = r3 - r6
            r0.f2307f = r3
            android.support.v7.widget.dk r6 = r4.f1850n
            android.support.v7.widget.eo r0 = r4.f1839c
            int r0 = r0.mo2843f()
            int r0 = r0 + r5
            r6.f2308g = r0
            goto L_0x005b
        L_0x004b:
            android.support.v7.widget.dk r0 = r4.f1850n
            android.support.v7.widget.eo r3 = r4.f1839c
            int r3 = r3.mo2842e()
            int r3 = r3 + r5
            r0.f2308g = r3
            android.support.v7.widget.dk r5 = r4.f1850n
            int r6 = -r6
            r5.f2307f = r6
        L_0x005b:
            android.support.v7.widget.dk r5 = r4.f1850n
            r5.f2309h = r1
            r5.f2302a = r2
            android.support.v7.widget.eo r6 = r4.f1839c
            int r6 = r6.mo2845h()
            if (r6 != 0) goto L_0x0072
            android.support.v7.widget.eo r6 = r4.f1839c
            int r6 = r6.mo2842e()
            if (r6 != 0) goto L_0x0072
            r1 = 1
        L_0x0072:
            r5.f2310i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.StaggeredGridLayoutManager.m1745G(int, android.support.v7.widget.ge):void");
    }

    /* renamed from: H */
    private final void m1746H(C0725if ifVar, int i, int i2) {
        int i3 = ifVar.f2563d;
        if (i == -1) {
            if (ifVar.mo3214g() + i3 <= i2) {
                this.f1851o.set(ifVar.f2564e, false);
            }
        } else if (ifVar.mo3212e() - i3 >= i2) {
            this.f1851o.set(ifVar.f2564e, false);
        }
    }

    /* renamed from: I */
    private final boolean m1747I(int i) {
        if (this.f1841e == 0) {
            return (i == -1) != this.f1843g;
        }
        return ((i == -1) == this.f1843g) == mo2329l();
    }

    /* renamed from: J */
    private final void m1748J(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.f1855s);
        C0722ic icVar = (C0722ic) view.getLayoutParams();
        int K = m1749K(i, icVar.leftMargin + this.f1855s.left, icVar.rightMargin + this.f1855s.right);
        int K2 = m1749K(i2, icVar.topMargin + this.f1855s.top, icVar.bottomMargin + this.f1855s.bottom);
        if (shouldMeasureChild(view, K, K2, icVar)) {
            view.measure(K, K2);
        }
    }

    /* renamed from: K */
    private static final int m1749K(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: o */
    private final int m1750o(int i) {
        if (getChildCount() == 0) {
            return this.f1843g ? 1 : -1;
        }
        return (i < mo2318a()) != this.f1843g ? -1 : 1;
    }

    /* renamed from: p */
    private final int m1751p(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0681gp.m2385a(geVar, this.f1839c, mo2322e(!this.f1858v), mo2321d(!this.f1858v), this, this.f1858v);
    }

    /* renamed from: q */
    private final int m1752q(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0681gp.m2386b(geVar, this.f1839c, mo2322e(!this.f1858v), mo2321d(!this.f1858v), this, this.f1858v, this.f1843g);
    }

    /* renamed from: r */
    private final int m1753r(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0681gp.m2387c(geVar, this.f1839c, mo2322e(!this.f1858v), mo2321d(!this.f1858v), this, this.f1858v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0295, code lost:
        r1 = true;
        r16 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0385  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m1754s(android.support.p033v7.widget.C0661fw r20, android.support.p033v7.widget.C0595dk r21, android.support.p033v7.widget.C0670ge r22) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r8 = r21
            java.util.BitSet r0 = r6.f1851o
            int r1 = r6.f1837a
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            android.support.v7.widget.dk r0 = r6.f1850n
            boolean r0 = r0.f2310i
            if (r0 == 0) goto L_0x0020
            int r0 = r8.f2306e
            if (r0 != r10) goto L_0x001d
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0030
        L_0x001d:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0030
        L_0x0020:
            int r0 = r8.f2306e
            if (r0 != r10) goto L_0x002a
            int r0 = r8.f2308g
            int r1 = r8.f2303b
            int r0 = r0 + r1
            goto L_0x002f
        L_0x002a:
            int r0 = r8.f2307f
            int r1 = r8.f2303b
            int r0 = r0 - r1
        L_0x002f:
            r13 = r0
        L_0x0030:
            int r0 = r8.f2306e
            r6.m1744F(r0, r13)
            boolean r0 = r6.f1843g
            if (r0 == 0) goto L_0x0040
            android.support.v7.widget.eo r0 = r6.f1839c
            int r0 = r0.mo2843f()
            goto L_0x0046
        L_0x0040:
            android.support.v7.widget.eo r0 = r6.f1839c
            int r0 = r0.mo2847j()
        L_0x0046:
            r14 = r0
            r0 = 0
        L_0x0048:
            boolean r1 = r21.mo2739a(r22)
            r2 = -1
            if (r1 == 0) goto L_0x0392
            android.support.v7.widget.dk r1 = r6.f1850n
            boolean r1 = r1.f2310i
            if (r1 != 0) goto L_0x005d
            java.util.BitSet r1 = r6.f1851o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0392
        L_0x005d:
            int r0 = r8.f2304c
            android.view.View r15 = r7.mo3039p(r0)
            int r0 = r8.f2304c
            int r1 = r8.f2305d
            int r0 = r0 + r1
            r8.f2304c = r0
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            r5 = r0
            android.support.v7.widget.ic r5 = (android.support.p033v7.widget.C0722ic) r5
            android.support.v7.widget.gh r0 = r5.f2420c
            int r0 = r0.getLayoutPosition()
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f1846j
            int[] r1 = r1.f1861a
            if (r1 == 0) goto L_0x0084
            int r3 = r1.length
            if (r0 < r3) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r1 = r1[r0]
            goto L_0x0085
        L_0x0084:
            r1 = -1
        L_0x0085:
            if (r1 != r2) goto L_0x0089
            r3 = 1
            goto L_0x008a
        L_0x0089:
            r3 = 0
        L_0x008a:
            if (r3 == 0) goto L_0x0106
            boolean r1 = r5.f2559b
            if (r1 == 0) goto L_0x0096
            android.support.v7.widget.if[] r1 = r6.f1838b
            r1 = r1[r9]
            goto L_0x00fa
        L_0x0096:
            int r1 = r8.f2306e
            boolean r1 = r6.m1747I(r1)
            if (r1 == 0) goto L_0x00a5
            int r1 = r6.f1837a
            int r1 = r1 + r2
            r4 = -1
            r16 = -1
            goto L_0x00ab
        L_0x00a5:
            int r1 = r6.f1837a
            r4 = r1
            r1 = 0
            r16 = 1
        L_0x00ab:
            int r11 = r8.f2306e
            r17 = 0
            if (r11 != r10) goto L_0x00d6
            android.support.v7.widget.eo r11 = r6.f1839c
            int r11 = r11.mo2847j()
            r12 = 2147483647(0x7fffffff, float:NaN)
        L_0x00ba:
            if (r1 == r4) goto L_0x00f8
            android.support.v7.widget.if[] r2 = r6.f1838b
            r2 = r2[r1]
            int r9 = r2.mo3213f(r11)
            if (r9 >= r12) goto L_0x00c9
            r18 = r9
            goto L_0x00cb
        L_0x00c9:
            r18 = r12
        L_0x00cb:
            if (r9 >= r12) goto L_0x00cf
            r17 = r2
        L_0x00cf:
            int r1 = r1 + r16
            r12 = r18
            r2 = -1
            r9 = 0
            goto L_0x00ba
        L_0x00d6:
            android.support.v7.widget.eo r2 = r6.f1839c
            int r2 = r2.mo2843f()
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00de:
            if (r1 == r4) goto L_0x00f8
            android.support.v7.widget.if[] r11 = r6.f1838b
            r11 = r11[r1]
            int r12 = r11.mo3215h(r2)
            if (r12 <= r9) goto L_0x00ed
            r18 = r12
            goto L_0x00ef
        L_0x00ed:
            r18 = r9
        L_0x00ef:
            if (r12 <= r9) goto L_0x00f3
            r17 = r11
        L_0x00f3:
            int r1 = r1 + r16
            r9 = r18
            goto L_0x00de
        L_0x00f8:
            r1 = r17
        L_0x00fa:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r2 = r6.f1846j
            r2.mo2339d(r0)
            int[] r2 = r2.f1861a
            int r4 = r1.f2564e
            r2[r0] = r4
            goto L_0x010a
        L_0x0106:
            android.support.v7.widget.if[] r2 = r6.f1838b
            r1 = r2[r1]
        L_0x010a:
            r9 = r1
            r5.f2558a = r9
            int r1 = r8.f2306e
            if (r1 != r10) goto L_0x0115
            r6.addView(r15)
            goto L_0x0119
        L_0x0115:
            r1 = 0
            r6.addView(r15, r1)
        L_0x0119:
            boolean r1 = r5.f2559b
            if (r1 == 0) goto L_0x015b
            int r1 = r6.f1841e
            if (r1 != r10) goto L_0x013e
            int r1 = r6.f1854r
            int r2 = r19.getHeight()
            int r4 = r19.getHeightMode()
            int r11 = r19.getPaddingTop()
            int r12 = r19.getPaddingBottom()
            int r11 = r11 + r12
            int r12 = r5.height
            int r2 = getChildMeasureSpec(r2, r4, r11, r12, r10)
            r6.m1748J(r15, r1, r2)
            goto L_0x01ae
        L_0x013e:
            int r1 = r19.getWidth()
            int r2 = r19.getWidthMode()
            int r4 = r19.getPaddingLeft()
            int r11 = r19.getPaddingRight()
            int r4 = r4 + r11
            int r11 = r5.width
            int r1 = getChildMeasureSpec(r1, r2, r4, r11, r10)
            int r2 = r6.f1854r
            r6.m1748J(r15, r1, r2)
            goto L_0x01ae
        L_0x015b:
            int r1 = r6.f1841e
            if (r1 != r10) goto L_0x0187
            int r1 = r6.f1849m
            int r2 = r19.getWidthMode()
            int r4 = r5.width
            r11 = 0
            int r1 = getChildMeasureSpec(r1, r2, r11, r4, r11)
            int r2 = r19.getHeight()
            int r4 = r19.getHeightMode()
            int r11 = r19.getPaddingTop()
            int r12 = r19.getPaddingBottom()
            int r11 = r11 + r12
            int r12 = r5.height
            int r2 = getChildMeasureSpec(r2, r4, r11, r12, r10)
            r6.m1748J(r15, r1, r2)
            goto L_0x01ae
        L_0x0187:
            int r1 = r19.getWidth()
            int r2 = r19.getWidthMode()
            int r4 = r19.getPaddingLeft()
            int r11 = r19.getPaddingRight()
            int r4 = r4 + r11
            int r11 = r5.width
            int r1 = getChildMeasureSpec(r1, r2, r4, r11, r10)
            int r2 = r6.f1849m
            int r4 = r19.getHeightMode()
            int r11 = r5.height
            r12 = 0
            int r2 = getChildMeasureSpec(r2, r4, r12, r11, r12)
            r6.m1748J(r15, r1, r2)
        L_0x01ae:
            int r1 = r8.f2306e
            if (r1 != r10) goto L_0x01fb
            boolean r1 = r5.f2559b
            if (r1 == 0) goto L_0x01bb
            int r1 = r6.m1755t(r14)
            goto L_0x01bf
        L_0x01bb:
            int r1 = r9.mo3213f(r14)
        L_0x01bf:
            android.support.v7.widget.eo r2 = r6.f1839c
            int r2 = r2.mo2839b(r15)
            int r2 = r2 + r1
            if (r3 == 0) goto L_0x01f8
            boolean r4 = r5.f2559b
            if (r4 == 0) goto L_0x01f8
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r4 = new android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r4.<init>()
            int r11 = r6.f1837a
            int[] r11 = new int[r11]
            r4.f1865c = r11
            r11 = 0
        L_0x01d8:
            int r12 = r6.f1837a
            if (r11 >= r12) goto L_0x01ee
            int[] r12 = r4.f1865c
            android.support.v7.widget.if[] r10 = r6.f1838b
            r10 = r10[r11]
            int r10 = r10.mo3213f(r1)
            int r10 = r1 - r10
            r12[r11] = r10
            int r11 = r11 + 1
            r10 = 1
            goto L_0x01d8
        L_0x01ee:
            r10 = -1
            r4.f1864b = r10
            r4.f1863a = r0
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r10 = r6.f1846j
            r10.mo2337b(r4)
        L_0x01f8:
            r4 = r1
            r10 = r2
            goto L_0x0242
        L_0x01fb:
            boolean r1 = r5.f2559b
            if (r1 == 0) goto L_0x0204
            int r1 = r6.m1756u(r14)
            goto L_0x0208
        L_0x0204:
            int r1 = r9.mo3215h(r14)
        L_0x0208:
            android.support.v7.widget.eo r2 = r6.f1839c
            int r2 = r2.mo2839b(r15)
            int r2 = r1 - r2
            if (r3 == 0) goto L_0x0240
            boolean r4 = r5.f2559b
            if (r4 == 0) goto L_0x0240
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r4 = new android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r4.<init>()
            int r10 = r6.f1837a
            int[] r10 = new int[r10]
            r4.f1865c = r10
            r10 = 0
        L_0x0222:
            int r11 = r6.f1837a
            if (r10 >= r11) goto L_0x0236
            int[] r11 = r4.f1865c
            android.support.v7.widget.if[] r12 = r6.f1838b
            r12 = r12[r10]
            int r12 = r12.mo3215h(r1)
            int r12 = r12 - r1
            r11[r10] = r12
            int r10 = r10 + 1
            goto L_0x0222
        L_0x0236:
            r10 = 1
            r4.f1864b = r10
            r4.f1863a = r0
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r10 = r6.f1846j
            r10.mo2337b(r4)
        L_0x0240:
            r10 = r1
            r4 = r2
        L_0x0242:
            boolean r1 = r5.f2559b
            if (r1 == 0) goto L_0x02a9
            int r1 = r8.f2305d
            r2 = -1
            if (r1 != r2) goto L_0x02a9
            if (r3 == 0) goto L_0x0251
            r1 = 1
            r6.f1857u = r1
            goto L_0x02aa
        L_0x0251:
            r1 = 1
            int r2 = r8.f2306e
            if (r2 != r1) goto L_0x0274
            android.support.v7.widget.if[] r1 = r6.f1838b
            r2 = 0
            r1 = r1[r2]
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1.mo3213f(r11)
            r2 = 1
        L_0x0262:
            int r3 = r6.f1837a
            if (r2 >= r3) goto L_0x0295
            android.support.v7.widget.if[] r3 = r6.f1838b
            r3 = r3[r2]
            int r3 = r3.mo3213f(r11)
            if (r3 == r1) goto L_0x0271
            goto L_0x028e
        L_0x0271:
            int r2 = r2 + 1
            goto L_0x0262
        L_0x0274:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            android.support.v7.widget.if[] r1 = r6.f1838b
            r2 = 0
            r1 = r1[r2]
            int r1 = r1.mo3215h(r11)
            r2 = 1
        L_0x0280:
            int r3 = r6.f1837a
            if (r2 >= r3) goto L_0x0295
            android.support.v7.widget.if[] r3 = r6.f1838b
            r3 = r3[r2]
            int r3 = r3.mo3215h(r11)
            if (r3 == r1) goto L_0x0292
        L_0x028e:
            r1 = 1
            r16 = 0
            goto L_0x0298
        L_0x0292:
            int r2 = r2 + 1
            goto L_0x0280
        L_0x0295:
            r1 = 1
            r16 = 1
        L_0x0298:
            r2 = r16 ^ 1
            if (r2 == 0) goto L_0x02ac
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r2 = r6.f1846j
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r2.mo2336a(r0)
            if (r0 == 0) goto L_0x02a6
            r0.f1866d = r1
        L_0x02a6:
            r6.f1857u = r1
            goto L_0x02ac
        L_0x02a9:
            r1 = 1
        L_0x02aa:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x02ac:
            int r0 = r8.f2306e
            if (r0 != r1) goto L_0x02ca
            boolean r0 = r5.f2559b
            if (r0 == 0) goto L_0x02c4
            int r0 = r6.f1837a
            r1 = -1
            int r0 = r0 + r1
        L_0x02b8:
            if (r0 < 0) goto L_0x02e3
            android.support.v7.widget.if[] r1 = r6.f1838b
            r1 = r1[r0]
            r1.mo3217j(r15)
            int r0 = r0 + -1
            goto L_0x02b8
        L_0x02c4:
            android.support.v7.widget.if r0 = r5.f2558a
            r0.mo3217j(r15)
            goto L_0x02e3
        L_0x02ca:
            boolean r0 = r5.f2559b
            if (r0 == 0) goto L_0x02de
            int r0 = r6.f1837a
            r1 = -1
            int r0 = r0 + r1
        L_0x02d2:
            if (r0 < 0) goto L_0x02e3
            android.support.v7.widget.if[] r1 = r6.f1838b
            r1 = r1[r0]
            r1.mo3224q(r15)
            int r0 = r0 + -1
            goto L_0x02d2
        L_0x02de:
            android.support.v7.widget.if r0 = r5.f2558a
            r0.mo3224q(r15)
        L_0x02e3:
            boolean r0 = r19.mo2329l()
            if (r0 == 0) goto L_0x0316
            int r0 = r6.f1841e
            r1 = 1
            if (r0 != r1) goto L_0x0316
            boolean r0 = r5.f2559b
            if (r0 == 0) goto L_0x02f9
            android.support.v7.widget.eo r0 = r6.f1840d
            int r0 = r0.mo2843f()
            goto L_0x030b
        L_0x02f9:
            android.support.v7.widget.eo r0 = r6.f1840d
            int r0 = r0.mo2843f()
            int r1 = r6.f1837a
            r2 = -1
            int r1 = r1 + r2
            int r2 = r9.f2564e
            int r1 = r1 - r2
            int r2 = r6.f1849m
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x030b:
            android.support.v7.widget.eo r1 = r6.f1840d
            int r1 = r1.mo2839b(r15)
            int r1 = r0 - r1
            r12 = r0
            r3 = r1
            goto L_0x0337
        L_0x0316:
            boolean r0 = r5.f2559b
            if (r0 == 0) goto L_0x0321
            android.support.v7.widget.eo r0 = r6.f1840d
            int r0 = r0.mo2847j()
            goto L_0x032e
        L_0x0321:
            int r0 = r9.f2564e
            int r1 = r6.f1849m
            int r0 = r0 * r1
            android.support.v7.widget.eo r1 = r6.f1840d
            int r1 = r1.mo2847j()
            int r0 = r0 + r1
        L_0x032e:
            android.support.v7.widget.eo r1 = r6.f1840d
            int r1 = r1.mo2839b(r15)
            int r1 = r1 + r0
            r3 = r0
            r12 = r1
        L_0x0337:
            int r0 = r6.f1841e
            r2 = 1
            if (r0 != r2) goto L_0x034b
            r0 = r19
            r1 = r15
            r16 = 1
            r2 = r3
            r3 = r4
            r4 = r12
            r12 = r5
            r5 = r10
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            r10 = r12
            goto L_0x0357
        L_0x034b:
            r16 = 1
            r0 = r19
            r1 = r15
            r2 = r4
            r4 = r10
            r10 = r5
            r5 = r12
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
        L_0x0357:
            boolean r0 = r10.f2559b
            if (r0 == 0) goto L_0x0363
            android.support.v7.widget.dk r0 = r6.f1850n
            int r0 = r0.f2306e
            r6.m1744F(r0, r13)
            goto L_0x036a
        L_0x0363:
            android.support.v7.widget.dk r0 = r6.f1850n
            int r0 = r0.f2306e
            r6.m1746H(r9, r0, r13)
        L_0x036a:
            android.support.v7.widget.dk r0 = r6.f1850n
            r6.m1739A(r7, r0)
            android.support.v7.widget.dk r0 = r6.f1850n
            boolean r0 = r0.f2309h
            if (r0 == 0) goto L_0x038d
            boolean r0 = r15.hasFocusable()
            if (r0 == 0) goto L_0x038d
            boolean r0 = r10.f2559b
            if (r0 == 0) goto L_0x0385
            java.util.BitSet r0 = r6.f1851o
            r0.clear()
            goto L_0x038d
        L_0x0385:
            java.util.BitSet r0 = r6.f1851o
            int r1 = r9.f2564e
            r2 = 0
            r0.set(r1, r2)
        L_0x038d:
            r0 = 1
            r9 = 0
            r10 = 1
            goto L_0x0048
        L_0x0392:
            if (r0 != 0) goto L_0x0399
            android.support.v7.widget.dk r0 = r6.f1850n
            r6.m1739A(r7, r0)
        L_0x0399:
            android.support.v7.widget.dk r0 = r6.f1850n
            int r0 = r0.f2306e
            r1 = -1
            if (r0 != r1) goto L_0x03b2
            android.support.v7.widget.eo r0 = r6.f1839c
            int r0 = r0.mo2847j()
            int r0 = r6.m1756u(r0)
            android.support.v7.widget.eo r1 = r6.f1839c
            int r1 = r1.mo2847j()
            int r1 = r1 - r0
            goto L_0x03c4
        L_0x03b2:
            android.support.v7.widget.eo r0 = r6.f1839c
            int r0 = r0.mo2843f()
            int r0 = r6.m1755t(r0)
            android.support.v7.widget.eo r1 = r6.f1839c
            int r1 = r1.mo2843f()
            int r1 = r0 - r1
        L_0x03c4:
            if (r1 <= 0) goto L_0x03cd
            int r0 = r8.f2303b
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L_0x03cd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.StaggeredGridLayoutManager.m1754s(android.support.v7.widget.fw, android.support.v7.widget.dk, android.support.v7.widget.ge):int");
    }

    /* renamed from: t */
    private final int m1755t(int i) {
        int f = this.f1838b[0].mo3213f(i);
        for (int i2 = 1; i2 < this.f1837a; i2++) {
            int f2 = this.f1838b[i2].mo3213f(i);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    /* renamed from: u */
    private final int m1756u(int i) {
        int h = this.f1838b[0].mo3215h(i);
        for (int i2 = 1; i2 < this.f1837a; i2++) {
            int h2 = this.f1838b[i2].mo3215h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    /* renamed from: v */
    private final void m1757v() {
        this.f1839c = C0626eo.m2232p(this, this.f1841e);
        this.f1840d = C0626eo.m2232p(this, 1 - this.f1841e);
    }

    /* renamed from: w */
    private final void m1758w(C0661fw fwVar, C0670ge geVar, boolean z) {
        int f;
        int t = m1755t(LinearLayoutManager.INVALID_OFFSET);
        if (t != Integer.MIN_VALUE && (f = this.f1839c.mo2843f() - t) > 0) {
            int i = f - (-mo2320c(-f, fwVar, geVar));
            if (z && i > 0) {
                this.f1839c.mo2851n(i);
            }
        }
    }

    /* renamed from: x */
    private final void m1759x(C0661fw fwVar, C0670ge geVar, boolean z) {
        int j;
        int u = m1756u(Integer.MAX_VALUE);
        if (u != Integer.MAX_VALUE && (j = u - this.f1839c.mo2847j()) > 0) {
            int c = j - mo2320c(j, fwVar, geVar);
            if (z && c > 0) {
                this.f1839c.mo2851n(-c);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1760y(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f1843g
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo2319b()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo2318a()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f1846j
            r4.mo2344i(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f1846j
            r9.mo2341f(r7, r4)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f1846j
            r7.mo2340e(r8, r4)
            goto L_0x0041
        L_0x0036:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f1846j
            r9.mo2341f(r7, r8)
            goto L_0x0041
        L_0x003c:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f1846j
            r9.mo2340e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f1843g
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo2318a()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo2319b()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.requestLayout()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.StaggeredGridLayoutManager.m1760y(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03ec, code lost:
        if (mo2328k() != false) goto L_0x03f0;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1761z(android.support.p033v7.widget.C0661fw r12, android.support.p033v7.widget.C0670ge r13, boolean r14) {
        /*
            r11 = this;
            android.support.v7.widget.ib r0 = r11.f1856t
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r1 = r11.f1848l
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f1844h
            if (r1 == r2) goto L_0x0011
        L_0x000b:
            int r1 = r13.mo3052a()
            if (r1 == 0) goto L_0x040e
        L_0x0011:
            boolean r1 = r0.f2555e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0022
            int r1 = r11.f1844h
            if (r1 != r2) goto L_0x0022
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r1 = r11.f1848l
            if (r1 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r1 = 0
            goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01f0
            r0.mo3203a()
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f1848l
            if (r6 == 0) goto L_0x009e
            int r7 = r6.f1869c
            if (r7 <= 0) goto L_0x0070
            int r8 = r11.f1837a
            if (r7 != r8) goto L_0x0067
            r6 = 0
        L_0x0037:
            int r7 = r11.f1837a
            if (r6 >= r7) goto L_0x0070
            android.support.v7.widget.if[] r7 = r11.f1838b
            r7 = r7[r6]
            r7.mo3220m()
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f1848l
            int[] r8 = r7.f1870d
            r8 = r8[r6]
            if (r8 == r5) goto L_0x005c
            boolean r7 = r7.f1875i
            if (r7 == 0) goto L_0x0055
            android.support.v7.widget.eo r7 = r11.f1839c
            int r7 = r7.mo2843f()
            goto L_0x005b
        L_0x0055:
            android.support.v7.widget.eo r7 = r11.f1839c
            int r7 = r7.mo2847j()
        L_0x005b:
            int r8 = r8 + r7
        L_0x005c:
            android.support.v7.widget.if[] r7 = r11.f1838b
            r7 = r7[r6]
            r7.f2561b = r8
            r7.f2562c = r8
            int r6 = r6 + 1
            goto L_0x0037
        L_0x0067:
            r6.mo2350b()
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f1848l
            int r7 = r6.f1868b
            r6.f1867a = r7
        L_0x0070:
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f1848l
            boolean r7 = r6.f1876j
            r11.f1853q = r7
            boolean r6 = r6.f1874h
            r11.mo2325h(r6)
            r11.m1742D()
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f1848l
            int r7 = r6.f1867a
            if (r7 == r2) goto L_0x008b
            r11.f1844h = r7
            boolean r7 = r6.f1875i
            r0.f2553c = r7
            goto L_0x008f
        L_0x008b:
            boolean r7 = r11.f1843g
            r0.f2553c = r7
        L_0x008f:
            int r7 = r6.f1871e
            if (r7 <= r3) goto L_0x00a5
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r11.f1846j
            int[] r8 = r6.f1872f
            r7.f1861a = r8
            java.util.List r6 = r6.f1873g
            r7.f1862b = r6
            goto L_0x00a5
        L_0x009e:
            r11.m1742D()
            boolean r6 = r11.f1843g
            r0.f2553c = r6
        L_0x00a5:
            boolean r6 = r13.f2462g
            if (r6 != 0) goto L_0x01ae
            int r6 = r11.f1844h
            if (r6 != r2) goto L_0x00af
            goto L_0x01ae
        L_0x00af:
            if (r6 < 0) goto L_0x01aa
            int r7 = r13.mo3052a()
            if (r6 < r7) goto L_0x00b9
            goto L_0x01aa
        L_0x00b9:
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f1848l
            if (r6 == 0) goto L_0x00ce
            int r7 = r6.f1867a
            if (r7 == r2) goto L_0x00ce
            int r6 = r6.f1869c
            if (r6 > 0) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            r0.f2552b = r5
            int r6 = r11.f1844h
            r0.f2551a = r6
            goto L_0x01ee
        L_0x00ce:
            int r6 = r11.f1844h
            android.view.View r6 = r11.findViewByPosition(r6)
            if (r6 == 0) goto L_0x0163
            boolean r7 = r11.f1843g
            if (r7 == 0) goto L_0x00df
            int r7 = r11.mo2319b()
            goto L_0x00e3
        L_0x00df:
            int r7 = r11.mo2318a()
        L_0x00e3:
            r0.f2551a = r7
            int r7 = r11.f1845i
            if (r7 == r5) goto L_0x0115
            boolean r7 = r0.f2553c
            if (r7 == 0) goto L_0x0101
            android.support.v7.widget.eo r7 = r11.f1839c
            int r7 = r7.mo2843f()
            int r8 = r11.f1845i
            int r7 = r7 - r8
            android.support.v7.widget.eo r8 = r11.f1839c
            int r6 = r8.mo2838a(r6)
            int r7 = r7 - r6
            r0.f2552b = r7
            goto L_0x01ee
        L_0x0101:
            android.support.v7.widget.eo r7 = r11.f1839c
            int r7 = r7.mo2847j()
            int r8 = r11.f1845i
            int r7 = r7 + r8
            android.support.v7.widget.eo r8 = r11.f1839c
            int r6 = r8.mo2841d(r6)
            int r7 = r7 - r6
            r0.f2552b = r7
            goto L_0x01ee
        L_0x0115:
            android.support.v7.widget.eo r7 = r11.f1839c
            int r7 = r7.mo2839b(r6)
            android.support.v7.widget.eo r8 = r11.f1839c
            int r8 = r8.mo2848k()
            if (r7 <= r8) goto L_0x0138
            boolean r6 = r0.f2553c
            if (r6 == 0) goto L_0x012e
            android.support.v7.widget.eo r6 = r11.f1839c
            int r6 = r6.mo2843f()
            goto L_0x0134
        L_0x012e:
            android.support.v7.widget.eo r6 = r11.f1839c
            int r6 = r6.mo2847j()
        L_0x0134:
            r0.f2552b = r6
            goto L_0x01ee
        L_0x0138:
            android.support.v7.widget.eo r7 = r11.f1839c
            int r7 = r7.mo2841d(r6)
            android.support.v7.widget.eo r8 = r11.f1839c
            int r8 = r8.mo2847j()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x014c
            int r6 = -r7
            r0.f2552b = r6
            goto L_0x01ee
        L_0x014c:
            android.support.v7.widget.eo r7 = r11.f1839c
            int r7 = r7.mo2843f()
            android.support.v7.widget.eo r8 = r11.f1839c
            int r6 = r8.mo2838a(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x015f
            r0.f2552b = r7
            goto L_0x01ee
        L_0x015f:
            r0.f2552b = r5
            goto L_0x01ee
        L_0x0163:
            int r6 = r11.f1844h
            r0.f2551a = r6
            int r7 = r11.f1845i
            if (r7 != r5) goto L_0x018c
            int r6 = r11.m1750o(r6)
            if (r6 != r3) goto L_0x0173
            r6 = 1
            goto L_0x0174
        L_0x0173:
            r6 = 0
        L_0x0174:
            r0.f2553c = r6
            if (r6 == 0) goto L_0x0181
            android.support.v7.widget.StaggeredGridLayoutManager r6 = r0.f2557g
            android.support.v7.widget.eo r6 = r6.f1839c
            int r6 = r6.mo2843f()
            goto L_0x0189
        L_0x0181:
            android.support.v7.widget.StaggeredGridLayoutManager r6 = r0.f2557g
            android.support.v7.widget.eo r6 = r6.f1839c
            int r6 = r6.mo2847j()
        L_0x0189:
            r0.f2552b = r6
            goto L_0x01a7
        L_0x018c:
            boolean r6 = r0.f2553c
            if (r6 == 0) goto L_0x019c
            android.support.v7.widget.StaggeredGridLayoutManager r6 = r0.f2557g
            android.support.v7.widget.eo r6 = r6.f1839c
            int r6 = r6.mo2843f()
            int r6 = r6 - r7
            r0.f2552b = r6
            goto L_0x01a7
        L_0x019c:
            android.support.v7.widget.StaggeredGridLayoutManager r6 = r0.f2557g
            android.support.v7.widget.eo r6 = r6.f1839c
            int r6 = r6.mo2847j()
            int r6 = r6 + r7
            r0.f2552b = r6
        L_0x01a7:
            r0.f2554d = r3
            goto L_0x01ee
        L_0x01aa:
            r11.f1844h = r2
            r11.f1845i = r5
        L_0x01ae:
            boolean r6 = r11.f1852p
            if (r6 == 0) goto L_0x01cd
            int r6 = r13.mo3052a()
            int r7 = r11.getChildCount()
            int r7 = r7 + r2
        L_0x01bb:
            if (r7 < 0) goto L_0x01e9
            android.view.View r8 = r11.getChildAt(r7)
            int r8 = r11.getPosition(r8)
            if (r8 < 0) goto L_0x01ca
            if (r8 >= r6) goto L_0x01ca
            goto L_0x01ea
        L_0x01ca:
            int r7 = r7 + -1
            goto L_0x01bb
        L_0x01cd:
            int r6 = r13.mo3052a()
            int r7 = r11.getChildCount()
            r8 = 0
        L_0x01d6:
            if (r8 >= r7) goto L_0x01e9
            android.view.View r9 = r11.getChildAt(r8)
            int r9 = r11.getPosition(r9)
            if (r9 < 0) goto L_0x01e6
            if (r9 >= r6) goto L_0x01e6
            r8 = r9
            goto L_0x01ea
        L_0x01e6:
            int r8 = r8 + 1
            goto L_0x01d6
        L_0x01e9:
            r8 = 0
        L_0x01ea:
            r0.f2551a = r8
            r0.f2552b = r5
        L_0x01ee:
            r0.f2555e = r3
        L_0x01f0:
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f1848l
            if (r6 != 0) goto L_0x020d
            int r6 = r11.f1844h
            if (r6 != r2) goto L_0x020d
            boolean r6 = r0.f2553c
            boolean r7 = r11.f1852p
            if (r6 != r7) goto L_0x0206
            boolean r6 = r11.mo2329l()
            boolean r7 = r11.f1853q
            if (r6 == r7) goto L_0x020d
        L_0x0206:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r11.f1846j
            r6.mo2338c()
            r0.f2554d = r3
        L_0x020d:
            int r6 = r11.getChildCount()
            if (r6 <= 0) goto L_0x02c1
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f1848l
            if (r6 == 0) goto L_0x021b
            int r6 = r6.f1869c
            if (r6 > 0) goto L_0x02c1
        L_0x021b:
            boolean r6 = r0.f2554d
            if (r6 == 0) goto L_0x023a
            r1 = 0
        L_0x0220:
            int r6 = r11.f1837a
            if (r1 >= r6) goto L_0x02c1
            android.support.v7.widget.if[] r6 = r11.f1838b
            r6 = r6[r1]
            r6.mo3220m()
            int r6 = r0.f2552b
            if (r6 == r5) goto L_0x0237
            android.support.v7.widget.if[] r7 = r11.f1838b
            r7 = r7[r1]
            r7.f2561b = r6
            r7.f2562c = r6
        L_0x0237:
            int r1 = r1 + 1
            goto L_0x0220
        L_0x023a:
            if (r1 != 0) goto L_0x025c
            android.support.v7.widget.ib r1 = r11.f1856t
            int[] r1 = r1.f2556f
            if (r1 != 0) goto L_0x0243
            goto L_0x025c
        L_0x0243:
            r1 = 0
        L_0x0244:
            int r6 = r11.f1837a
            if (r1 >= r6) goto L_0x02c1
            android.support.v7.widget.if[] r6 = r11.f1838b
            r6 = r6[r1]
            r6.mo3220m()
            android.support.v7.widget.ib r7 = r11.f1856t
            int[] r7 = r7.f2556f
            r7 = r7[r1]
            r6.f2561b = r7
            r6.f2562c = r7
            int r1 = r1 + 1
            goto L_0x0244
        L_0x025c:
            r1 = 0
        L_0x025d:
            int r6 = r11.f1837a
            if (r1 >= r6) goto L_0x029c
            android.support.v7.widget.if[] r6 = r11.f1838b
            r6 = r6[r1]
            boolean r7 = r11.f1843g
            int r8 = r0.f2552b
            if (r7 == 0) goto L_0x0270
            int r9 = r6.mo3213f(r5)
            goto L_0x0274
        L_0x0270:
            int r9 = r6.mo3215h(r5)
        L_0x0274:
            r6.mo3220m()
            if (r9 != r5) goto L_0x027a
            goto L_0x0299
        L_0x027a:
            if (r7 == 0) goto L_0x0286
            android.support.v7.widget.StaggeredGridLayoutManager r10 = r6.f2565f
            android.support.v7.widget.eo r10 = r10.f1839c
            int r10 = r10.mo2843f()
            if (r9 < r10) goto L_0x0299
        L_0x0286:
            if (r7 != 0) goto L_0x0292
            android.support.v7.widget.StaggeredGridLayoutManager r7 = r6.f2565f
            android.support.v7.widget.eo r7 = r7.f1839c
            int r7 = r7.mo2847j()
            if (r9 > r7) goto L_0x0299
        L_0x0292:
            if (r8 == r5) goto L_0x0295
            int r9 = r9 + r8
        L_0x0295:
            r6.f2562c = r9
            r6.f2561b = r9
        L_0x0299:
            int r1 = r1 + 1
            goto L_0x025d
        L_0x029c:
            android.support.v7.widget.ib r1 = r11.f1856t
            android.support.v7.widget.if[] r6 = r11.f1838b
            int r7 = r6.length
            int[] r8 = r1.f2556f
            if (r8 == 0) goto L_0x02a8
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02b1
        L_0x02a8:
            android.support.v7.widget.StaggeredGridLayoutManager r8 = r1.f2557g
            android.support.v7.widget.if[] r8 = r8.f1838b
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f2556f = r8
        L_0x02b1:
            r8 = 0
        L_0x02b2:
            if (r8 >= r7) goto L_0x02c1
            int[] r9 = r1.f2556f
            r10 = r6[r8]
            int r10 = r10.mo3215h(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02b2
        L_0x02c1:
            r11.detachAndScrapAttachedViews(r12)
            android.support.v7.widget.dk r1 = r11.f1850n
            r1.f2302a = r4
            r11.f1857u = r4
            android.support.v7.widget.eo r1 = r11.f1840d
            int r1 = r1.mo2848k()
            r11.mo2327j(r1)
            int r1 = r0.f2551a
            r11.m1745G(r1, r13)
            boolean r1 = r0.f2553c
            if (r1 == 0) goto L_0x02f4
            r11.m1743E(r2)
            android.support.v7.widget.dk r1 = r11.f1850n
            r11.m1754s(r12, r1, r13)
            r11.m1743E(r3)
            android.support.v7.widget.dk r1 = r11.f1850n
            int r6 = r0.f2551a
            int r7 = r1.f2305d
            int r6 = r6 + r7
            r1.f2304c = r6
            r11.m1754s(r12, r1, r13)
            goto L_0x030b
        L_0x02f4:
            r11.m1743E(r3)
            android.support.v7.widget.dk r1 = r11.f1850n
            r11.m1754s(r12, r1, r13)
            r11.m1743E(r2)
            android.support.v7.widget.dk r1 = r11.f1850n
            int r6 = r0.f2551a
            int r7 = r1.f2305d
            int r6 = r6 + r7
            r1.f2304c = r6
            r11.m1754s(r12, r1, r13)
        L_0x030b:
            android.support.v7.widget.eo r1 = r11.f1840d
            int r1 = r1.mo2845h()
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 != r6) goto L_0x0317
            goto L_0x03b2
        L_0x0317:
            int r1 = r11.getChildCount()
            r6 = 0
            r7 = 0
        L_0x031d:
            if (r7 >= r1) goto L_0x0344
            android.view.View r8 = r11.getChildAt(r7)
            android.support.v7.widget.eo r9 = r11.f1840d
            int r9 = r9.mo2839b(r8)
            float r9 = (float) r9
            int r10 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x032f
            goto L_0x0341
        L_0x032f:
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            android.support.v7.widget.ic r8 = (android.support.p033v7.widget.C0722ic) r8
            boolean r8 = r8.f2559b
            if (r8 == 0) goto L_0x033d
            int r8 = r11.f1837a
            float r8 = (float) r8
            float r9 = r9 / r8
        L_0x033d:
            float r6 = java.lang.Math.max(r6, r9)
        L_0x0341:
            int r7 = r7 + 1
            goto L_0x031d
        L_0x0344:
            int r7 = r11.f1849m
            int r8 = r11.f1837a
            float r8 = (float) r8
            float r6 = r6 * r8
            int r6 = java.lang.Math.round(r6)
            android.support.v7.widget.eo r8 = r11.f1840d
            int r8 = r8.mo2845h()
            if (r8 != r5) goto L_0x0361
            android.support.v7.widget.eo r5 = r11.f1840d
            int r5 = r5.mo2848k()
            int r6 = java.lang.Math.min(r6, r5)
        L_0x0361:
            r11.mo2327j(r6)
            int r5 = r11.f1849m
            if (r5 == r7) goto L_0x03b2
            r5 = 0
        L_0x0369:
            if (r5 >= r1) goto L_0x03b2
            android.view.View r6 = r11.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            android.support.v7.widget.ic r8 = (android.support.p033v7.widget.C0722ic) r8
            boolean r9 = r8.f2559b
            if (r9 == 0) goto L_0x037a
            goto L_0x03af
        L_0x037a:
            boolean r9 = r11.mo2329l()
            if (r9 == 0) goto L_0x0398
            int r9 = r11.f1841e
            if (r9 != r3) goto L_0x0398
            int r9 = r11.f1837a
            int r9 = r9 + r2
            android.support.v7.widget.if r8 = r8.f2558a
            int r8 = r8.f2564e
            int r9 = r9 - r8
            int r8 = -r9
            int r9 = r11.f1849m
            int r9 = r9 * r8
            int r8 = r8 * r7
            int r9 = r9 - r8
            r6.offsetLeftAndRight(r9)
            goto L_0x03af
        L_0x0398:
            android.support.v7.widget.if r8 = r8.f2558a
            int r8 = r8.f2564e
            int r9 = r11.f1849m
            int r9 = r9 * r8
            int r8 = r8 * r7
            int r10 = r11.f1841e
            if (r10 != r3) goto L_0x03ab
            int r9 = r9 - r8
            r6.offsetLeftAndRight(r9)
            goto L_0x03af
        L_0x03ab:
            int r9 = r9 - r8
            r6.offsetTopAndBottom(r9)
        L_0x03af:
            int r5 = r5 + 1
            goto L_0x0369
        L_0x03b2:
            int r1 = r11.getChildCount()
            if (r1 <= 0) goto L_0x03c9
            boolean r1 = r11.f1843g
            if (r1 == 0) goto L_0x03c3
            r11.m1758w(r12, r13, r3)
            r11.m1759x(r12, r13, r4)
            goto L_0x03c9
        L_0x03c3:
            r11.m1759x(r12, r13, r3)
            r11.m1758w(r12, r13, r4)
        L_0x03c9:
            if (r14 == 0) goto L_0x03ef
            boolean r14 = r13.f2462g
            if (r14 != 0) goto L_0x03ef
            int r14 = r11.f1847k
            if (r14 == 0) goto L_0x03ef
            int r14 = r11.getChildCount()
            if (r14 <= 0) goto L_0x03ef
            boolean r14 = r11.f1857u
            if (r14 != 0) goto L_0x03e3
            android.view.View r14 = r11.mo2323f()
            if (r14 == 0) goto L_0x03ef
        L_0x03e3:
            java.lang.Runnable r14 = r11.f1860x
            r11.removeCallbacks(r14)
            boolean r14 = r11.mo2328k()
            if (r14 == 0) goto L_0x03ef
            goto L_0x03f0
        L_0x03ef:
            r3 = 0
        L_0x03f0:
            boolean r14 = r13.f2462g
            if (r14 == 0) goto L_0x03f9
            android.support.v7.widget.ib r14 = r11.f1856t
            r14.mo3203a()
        L_0x03f9:
            boolean r14 = r0.f2553c
            r11.f1852p = r14
            boolean r14 = r11.mo2329l()
            r11.f1853q = r14
            if (r3 == 0) goto L_0x040d
            android.support.v7.widget.ib r14 = r11.f1856t
            r14.mo3203a()
            r11.m1761z(r12, r13, r4)
        L_0x040d:
            return
        L_0x040e:
            r11.removeAndRecycleAllViews(r12)
            r0.mo3203a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.StaggeredGridLayoutManager.m1761z(android.support.v7.widget.fw, android.support.v7.widget.ge, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo2318a() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f1848l == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo2319b() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo2320c(int i, C0661fw fwVar, C0670ge geVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo2324g(i, geVar);
        int s = m1754s(fwVar, this.f1850n, geVar);
        if (this.f1850n.f2303b >= s) {
            i = i < 0 ? -s : s;
        }
        this.f1839c.mo2851n(-i);
        this.f1852p = this.f1843g;
        C0595dk dkVar = this.f1850n;
        dkVar.f2303b = 0;
        m1739A(fwVar, dkVar);
        return i;
    }

    public final boolean canScrollHorizontally() {
        return this.f1841e == 0;
    }

    public final boolean canScrollVertically() {
        return this.f1841e == 1;
    }

    public final boolean checkLayoutParams(C0654fp fpVar) {
        return fpVar instanceof C0722ic;
    }

    public final void collectAdjacentPrefetchPositions(int i, int i2, C0670ge geVar, C0651fm fmVar) {
        int i3;
        int i4;
        if (1 == this.f1841e) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            mo2324g(i, geVar);
            int[] iArr = this.f1859w;
            if (iArr == null || iArr.length < this.f1837a) {
                this.f1859w = new int[this.f1837a];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f1837a; i6++) {
                C0595dk dkVar = this.f1850n;
                if (dkVar.f2305d == -1) {
                    i4 = dkVar.f2307f;
                    i3 = this.f1838b[i6].mo3215h(i4);
                } else {
                    i4 = this.f1838b[i6].mo3213f(dkVar.f2308g);
                    i3 = this.f1850n.f2308g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f1859w[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f1859w, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f1850n.mo2739a(geVar); i8++) {
                fmVar.mo2729a(this.f1850n.f2304c, this.f1859w[i8]);
                C0595dk dkVar2 = this.f1850n;
                dkVar2.f2304c += dkVar2.f2305d;
            }
        }
    }

    public final int computeHorizontalScrollExtent(C0670ge geVar) {
        return m1751p(geVar);
    }

    public final int computeHorizontalScrollOffset(C0670ge geVar) {
        return m1752q(geVar);
    }

    public final int computeHorizontalScrollRange(C0670ge geVar) {
        return m1753r(geVar);
    }

    public final PointF computeScrollVectorForPosition(int i) {
        int o = m1750o(i);
        PointF pointF = new PointF();
        if (o == 0) {
            return null;
        }
        if (this.f1841e == 0) {
            pointF.x = (float) o;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) o;
        }
        return pointF;
    }

    public final int computeVerticalScrollExtent(C0670ge geVar) {
        return m1751p(geVar);
    }

    public final int computeVerticalScrollOffset(C0670ge geVar) {
        return m1752q(geVar);
    }

    public final int computeVerticalScrollRange(C0670ge geVar) {
        return m1753r(geVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final View mo2321d(boolean z) {
        int j = this.f1839c.mo2847j();
        int f = this.f1839c.mo2843f();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int d = this.f1839c.mo2841d(childAt);
            int a = this.f1839c.mo2838a(childAt);
            if (a > j && d < f) {
                if (a <= f || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final View mo2322e(boolean z) {
        int j = this.f1839c.mo2847j();
        int f = this.f1839c.mo2843f();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int d = this.f1839c.mo2841d(childAt);
            if (this.f1839c.mo2838a(childAt) > j && d < f) {
                if (d >= j || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final View mo2323f() {
        int i;
        int i2;
        int childCount = getChildCount() - 1;
        BitSet bitSet = new BitSet(this.f1837a);
        bitSet.set(0, this.f1837a, true);
        char c = (this.f1841e != 1 || !mo2329l()) ? (char) 65535 : 1;
        if (this.f1843g) {
            i = -1;
        } else {
            i = childCount + 1;
            childCount = 0;
        }
        int i3 = childCount < i ? 1 : -1;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            C0722ic icVar = (C0722ic) childAt.getLayoutParams();
            if (bitSet.get(icVar.f2558a.f2564e)) {
                C0725if ifVar = icVar.f2558a;
                if (this.f1843g) {
                    if (ifVar.mo3212e() < this.f1839c.mo2843f()) {
                        ArrayList arrayList = ifVar.f2560a;
                        if (!((C0722ic) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).f2559b) {
                        }
                    }
                    bitSet.clear(icVar.f2558a.f2564e);
                } else {
                    if (ifVar.mo3214g() > this.f1839c.mo2847j() && !((C0722ic) ((View) ifVar.f2560a.get(0)).getLayoutParams()).f2559b) {
                    }
                    bitSet.clear(icVar.f2558a.f2564e);
                }
                return childAt;
            }
            if (!icVar.f2559b && (i2 = childCount + i3) != i) {
                View childAt2 = getChildAt(i2);
                if (this.f1843g) {
                    int a = this.f1839c.mo2838a(childAt);
                    int a2 = this.f1839c.mo2838a(childAt2);
                    if (a < a2) {
                        return childAt;
                    }
                    if (a != a2) {
                        continue;
                    }
                } else {
                    int d = this.f1839c.mo2841d(childAt);
                    int d2 = this.f1839c.mo2841d(childAt2);
                    if (d > d2) {
                        return childAt;
                    }
                    if (d != d2) {
                        continue;
                    }
                }
                if ((icVar.f2558a.f2564e - ((C0722ic) childAt2.getLayoutParams()).f2558a.f2564e < 0) != (c < 0)) {
                    return childAt;
                }
            }
            childCount += i3;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo2324g(int i, C0670ge geVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo2319b();
            i2 = 1;
        } else {
            i3 = mo2318a();
            i2 = -1;
        }
        this.f1850n.f2302a = true;
        m1745G(i3, geVar);
        m1743E(i2);
        C0595dk dkVar = this.f1850n;
        dkVar.f2304c = i3 + dkVar.f2305d;
        dkVar.f2303b = Math.abs(i);
    }

    public final C0654fp generateDefaultLayoutParams() {
        if (this.f1841e == 0) {
            return new C0722ic(-2, -1);
        }
        return new C0722ic(-1, -2);
    }

    public final C0654fp generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0722ic(context, attributeSet);
    }

    /* renamed from: h */
    public final void mo2325h(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        SavedState savedState = this.f1848l;
        if (!(savedState == null || savedState.f1874h == z)) {
            savedState.f1874h = z;
        }
        this.f1842f = z;
        requestLayout();
    }

    /* renamed from: i */
    public final void mo2326i(int i) {
        assertNotInLayoutOrScroll((String) null);
        if (i != this.f1837a) {
            this.f1846j.mo2338c();
            requestLayout();
            this.f1837a = i;
            this.f1851o = new BitSet(i);
            this.f1838b = new C0725if[this.f1837a];
            for (int i2 = 0; i2 < this.f1837a; i2++) {
                this.f1838b[i2] = new C0725if(this, i2);
            }
            requestLayout();
        }
    }

    public final boolean isAutoMeasureEnabled() {
        return this.f1847k != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo2327j(int i) {
        this.f1849m = i / this.f1837a;
        this.f1854r = View.MeasureSpec.makeMeasureSpec(i, this.f1840d.mo2845h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo2328k() {
        int i;
        int i2;
        if (getChildCount() == 0 || this.f1847k == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f1843g) {
            i2 = mo2319b();
            i = mo2318a();
        } else {
            i2 = mo2318a();
            i = mo2319b();
        }
        if (i2 == 0) {
            if (mo2323f() == null) {
                i2 = 0;
            } else {
                this.f1846j.mo2338c();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        if (!this.f1857u) {
            return false;
        }
        int i3 = true != this.f1843g ? 1 : -1;
        int i4 = i + 1;
        LazySpanLookup.FullSpanItem h = this.f1846j.mo2343h(i2, i4, i3);
        if (h == null) {
            this.f1857u = false;
            this.f1846j.mo2342g(i4);
            return false;
        }
        LazySpanLookup.FullSpanItem h2 = this.f1846j.mo2343h(i2, h.f1863a, -i3);
        if (h2 == null) {
            this.f1846j.mo2342g(h.f1863a);
        } else {
            this.f1846j.mo2342g(h2.f1863a + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo2329l() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: m */
    public int[] mo2330m(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f1837a];
        } else {
            int length = iArr.length;
            if (length < this.f1837a) {
                throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f1837a + ", array size:" + length);
            }
        }
        for (int i = 0; i < this.f1837a; i++) {
            C0725if ifVar = this.f1838b[i];
            iArr[i] = ifVar.f2565f.f1842f ? ifVar.mo3211d(0, ifVar.f2560a.size(), true) : ifVar.mo3211d(ifVar.f2560a.size() - 1, -1, true);
        }
        return iArr;
    }

    /* renamed from: n */
    public int[] mo2331n() {
        throw null;
    }

    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f1837a; i2++) {
            this.f1838b[i2].mo3221n(i);
        }
    }

    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f1837a; i2++) {
            this.f1838b[i2].mo3221n(i);
        }
    }

    public final void onAdapterChanged(C0640fb fbVar, C0640fb fbVar2) {
        this.f1846j.mo2338c();
        for (int i = 0; i < this.f1837a; i++) {
            this.f1838b[i].mo3220m();
        }
    }

    public final void onDetachedFromWindow(RecyclerView recyclerView, C0661fw fwVar) {
        super.onDetachedFromWindow(recyclerView, fwVar);
        removeCallbacks(this.f1860x);
        for (int i = 0; i < this.f1837a; i++) {
            this.f1838b[i].mo3220m();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r9.f1841e == 1) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r9.f1841e == 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (mo2329l() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (mo2329l() == false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onFocusSearchFailed(android.view.View r10, int r11, android.support.p033v7.widget.C0661fw r12, android.support.p033v7.widget.C0670ge r13) {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r10 = r9.findContainingItemView(r10)
            if (r10 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r9.m1742D()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r11 == r3) goto L_0x004f
            r4 = 2
            if (r11 == r4) goto L_0x0042
            r4 = 17
            if (r11 == r4) goto L_0x003d
            r4 = 33
            if (r11 == r4) goto L_0x0038
            r4 = 66
            if (r11 == r4) goto L_0x0033
            r4 = 130(0x82, float:1.82E-43)
            if (r11 == r4) goto L_0x002e
        L_0x002b:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005c
        L_0x002e:
            int r11 = r9.f1841e
            if (r11 != r3) goto L_0x002b
            goto L_0x0046
        L_0x0033:
            int r11 = r9.f1841e
            if (r11 != 0) goto L_0x002b
            goto L_0x0046
        L_0x0038:
            int r11 = r9.f1841e
            if (r11 != r3) goto L_0x002b
            goto L_0x0053
        L_0x003d:
            int r11 = r9.f1841e
            if (r11 != 0) goto L_0x002b
            goto L_0x0053
        L_0x0042:
            int r11 = r9.f1841e
            if (r11 != r3) goto L_0x0048
        L_0x0046:
            r11 = 1
            goto L_0x005c
        L_0x0048:
            boolean r11 = r9.mo2329l()
            if (r11 == 0) goto L_0x0046
            goto L_0x0053
        L_0x004f:
            int r11 = r9.f1841e
            if (r11 != r3) goto L_0x0055
        L_0x0053:
            r11 = -1
            goto L_0x005c
        L_0x0055:
            boolean r11 = r9.mo2329l()
            if (r11 == 0) goto L_0x0053
            goto L_0x0046
        L_0x005c:
            if (r11 != r0) goto L_0x005f
            return r1
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.support.v7.widget.ic r0 = (android.support.p033v7.widget.C0722ic) r0
            boolean r4 = r0.f2559b
            android.support.v7.widget.if r0 = r0.f2558a
            if (r11 != r3) goto L_0x0070
            int r5 = r9.mo2319b()
            goto L_0x0074
        L_0x0070:
            int r5 = r9.mo2318a()
        L_0x0074:
            r9.m1745G(r5, r13)
            r9.m1743E(r11)
            android.support.v7.widget.dk r6 = r9.f1850n
            int r7 = r6.f2305d
            int r7 = r7 + r5
            r6.f2304c = r7
            android.support.v7.widget.eo r7 = r9.f1839c
            int r7 = r7.mo2848k()
            float r7 = (float) r7
            r8 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r7 = r7 * r8
            int r7 = (int) r7
            r6.f2303b = r7
            android.support.v7.widget.dk r6 = r9.f1850n
            r6.f2309h = r3
            r7 = 0
            r6.f2302a = r7
            r9.m1754s(r12, r6, r13)
            boolean r12 = r9.f1843g
            r9.f1852p = r12
            if (r4 != 0) goto L_0x00aa
            android.view.View r12 = r0.mo3216i(r5, r11)
            if (r12 == 0) goto L_0x00aa
            if (r12 != r10) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            return r12
        L_0x00aa:
            boolean r12 = r9.m1747I(r11)
            if (r12 == 0) goto L_0x00c6
            int r12 = r9.f1837a
            int r12 = r12 + r2
        L_0x00b3:
            if (r12 < 0) goto L_0x00dc
            android.support.v7.widget.if[] r13 = r9.f1838b
            r13 = r13[r12]
            android.view.View r13 = r13.mo3216i(r5, r11)
            if (r13 == 0) goto L_0x00c3
            if (r13 != r10) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            return r13
        L_0x00c3:
            int r12 = r12 + -1
            goto L_0x00b3
        L_0x00c6:
            r12 = 0
        L_0x00c7:
            int r13 = r9.f1837a
            if (r12 >= r13) goto L_0x00dc
            android.support.v7.widget.if[] r13 = r9.f1838b
            r13 = r13[r12]
            android.view.View r13 = r13.mo3216i(r5, r11)
            if (r13 == 0) goto L_0x00d9
            if (r13 != r10) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            return r13
        L_0x00d9:
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00dc:
            boolean r12 = r9.f1842f
            r12 = r12 ^ r3
            if (r11 == r2) goto L_0x00e3
            r13 = 0
            goto L_0x00e4
        L_0x00e3:
            r13 = 1
        L_0x00e4:
            if (r12 != r13) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            if (r4 != 0) goto L_0x00ff
            if (r3 == 0) goto L_0x00f1
            int r12 = r0.mo3208a()
            goto L_0x00f5
        L_0x00f1:
            int r12 = r0.mo3209b()
        L_0x00f5:
            android.view.View r12 = r9.findViewByPosition(r12)
            if (r12 == 0) goto L_0x00ff
            if (r12 != r10) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            return r12
        L_0x00ff:
            boolean r11 = r9.m1747I(r11)
            if (r11 == 0) goto L_0x012e
            int r11 = r9.f1837a
            int r11 = r11 + r2
        L_0x0108:
            if (r11 < 0) goto L_0x0152
            int r12 = r0.f2564e
            if (r11 != r12) goto L_0x010f
            goto L_0x012b
        L_0x010f:
            if (r3 == 0) goto L_0x011a
            android.support.v7.widget.if[] r12 = r9.f1838b
            r12 = r12[r11]
            int r12 = r12.mo3208a()
            goto L_0x0122
        L_0x011a:
            android.support.v7.widget.if[] r12 = r9.f1838b
            r12 = r12[r11]
            int r12 = r12.mo3209b()
        L_0x0122:
            android.view.View r12 = r9.findViewByPosition(r12)
            if (r12 == 0) goto L_0x012b
            if (r12 == r10) goto L_0x012b
            return r12
        L_0x012b:
            int r11 = r11 + -1
            goto L_0x0108
        L_0x012e:
            int r11 = r9.f1837a
            if (r7 >= r11) goto L_0x0152
            if (r3 == 0) goto L_0x013d
            android.support.v7.widget.if[] r11 = r9.f1838b
            r11 = r11[r7]
            int r11 = r11.mo3208a()
            goto L_0x0145
        L_0x013d:
            android.support.v7.widget.if[] r11 = r9.f1838b
            r11 = r11[r7]
            int r11 = r11.mo3209b()
        L_0x0145:
            android.view.View r11 = r9.findViewByPosition(r11)
            if (r11 == 0) goto L_0x014f
            if (r11 != r10) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            return r11
        L_0x014f:
            int r7 = r7 + 1
            goto L_0x012e
        L_0x0152:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, android.support.v7.widget.fw, android.support.v7.widget.ge):android.view.View");
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View e = mo2322e(false);
            View d = mo2321d(false);
            if (e != null && d != null) {
                int position = getPosition(e);
                int position2 = getPosition(d);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m1760y(i, i2, 1);
    }

    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f1846j.mo2338c();
        requestLayout();
    }

    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m1760y(i, i2, 8);
    }

    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m1760y(i, i2, 2);
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m1760y(i, i2, 4);
    }

    public final void onLayoutChildren(C0661fw fwVar, C0670ge geVar) {
        m1761z(fwVar, geVar, true);
    }

    public void onLayoutCompleted(C0670ge geVar) {
        this.f1844h = -1;
        this.f1845i = LinearLayoutManager.INVALID_OFFSET;
        this.f1848l = null;
        this.f1856t.mo3203a();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f1848l = savedState;
            if (this.f1844h != -1) {
                savedState.mo2349a();
                this.f1848l.mo2350b();
            }
            requestLayout();
        }
    }

    public final Parcelable onSaveInstanceState() {
        int i;
        View view;
        int i2;
        int i3;
        int[] iArr;
        SavedState savedState = this.f1848l;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f1874h = this.f1842f;
        savedState2.f1875i = this.f1852p;
        savedState2.f1876j = this.f1853q;
        LazySpanLookup lazySpanLookup = this.f1846j;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f1861a) == null) {
            savedState2.f1871e = 0;
        } else {
            savedState2.f1872f = iArr;
            savedState2.f1871e = savedState2.f1872f.length;
            savedState2.f1873g = lazySpanLookup.f1862b;
        }
        int i4 = -1;
        if (getChildCount() > 0) {
            if (this.f1852p) {
                i = mo2319b();
            } else {
                i = mo2318a();
            }
            savedState2.f1867a = i;
            if (this.f1843g) {
                view = mo2321d(true);
            } else {
                view = mo2322e(true);
            }
            if (view != null) {
                i4 = getPosition(view);
            }
            savedState2.f1868b = i4;
            int i5 = this.f1837a;
            savedState2.f1869c = i5;
            savedState2.f1870d = new int[i5];
            for (int i6 = 0; i6 < this.f1837a; i6++) {
                if (this.f1852p) {
                    i2 = this.f1838b[i6].mo3213f(LinearLayoutManager.INVALID_OFFSET);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f1839c.mo2843f();
                    } else {
                        savedState2.f1870d[i6] = i2;
                    }
                } else {
                    i2 = this.f1838b[i6].mo3215h(LinearLayoutManager.INVALID_OFFSET);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f1839c.mo2847j();
                    } else {
                        savedState2.f1870d[i6] = i2;
                    }
                }
                i2 -= i3;
                savedState2.f1870d[i6] = i2;
            }
        } else {
            savedState2.f1867a = -1;
            savedState2.f1868b = -1;
            savedState2.f1869c = 0;
        }
        return savedState2;
    }

    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            mo2328k();
        }
    }

    public final int scrollHorizontallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        return mo2320c(i, fwVar, geVar);
    }

    public final void scrollToPosition(int i) {
        SavedState savedState = this.f1848l;
        if (!(savedState == null || savedState.f1867a == i)) {
            savedState.mo2349a();
        }
        this.f1844h = i;
        this.f1845i = LinearLayoutManager.INVALID_OFFSET;
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        return mo2320c(i, fwVar, geVar);
    }

    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f1841e == 1) {
            i4 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i3 = chooseSize(i, (this.f1849m * this.f1837a) + paddingLeft, getMinimumWidth());
        } else {
            i3 = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            i4 = chooseSize(i2, (this.f1849m * this.f1837a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        C0602dr drVar = new C0602dr(recyclerView.getContext());
        drVar.f2449g = i;
        startSmoothScroll(drVar);
    }

    public final boolean supportsPredictiveItemAnimations() {
        return this.f1848l == null;
    }

    public C0654fp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0722ic((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0722ic(layoutParams);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0652fn properties = getProperties(context, attributeSet, i, i2);
        int i3 = properties.f2416a;
        if (i3 == 0 || i3 == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i3 != this.f1841e) {
                this.f1841e = i3;
                C0626eo eoVar = this.f1839c;
                this.f1839c = this.f1840d;
                this.f1840d = eoVar;
                requestLayout();
            }
            mo2326i(properties.f2417b);
            mo2325h(properties.f2418c);
            this.f1850n = new C0595dk();
            m1757v();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup */
    /* compiled from: PG */
    final class LazySpanLookup {

        /* renamed from: a */
        int[] f1861a;

        /* renamed from: b */
        List f1862b;

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem */
        /* compiled from: PG */
        class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator CREATOR = new C0723id();

            /* renamed from: a */
            int f1863a;

            /* renamed from: b */
            int f1864b;

            /* renamed from: c */
            int[] f1865c;

            /* renamed from: d */
            boolean f1866d;

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.f1863a = parcel.readInt();
                this.f1864b = parcel.readInt();
                this.f1866d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1865c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final int mo2345a(int i) {
                int[] iArr = this.f1865c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f1863a + ", mGapDir=" + this.f1864b + ", mHasUnwantedGapAfter=" + this.f1866d + ", mGapPerSpan=" + Arrays.toString(this.f1865c) + '}';
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int length;
                parcel.writeInt(this.f1863a);
                parcel.writeInt(this.f1864b);
                parcel.writeInt(this.f1866d ? 1 : 0);
                int[] iArr = this.f1865c;
                if (iArr == null || (length = iArr.length) <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(length);
                parcel.writeIntArray(this.f1865c);
            }
        }

        /* renamed from: a */
        public final FullSpanItem mo2336a(int i) {
            FullSpanItem fullSpanItem;
            List list = this.f1862b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            do {
                size--;
                if (size < 0) {
                    return null;
                }
                fullSpanItem = (FullSpanItem) this.f1862b.get(size);
            } while (fullSpanItem.f1863a != i);
            return fullSpanItem;
        }

        /* renamed from: b */
        public final void mo2337b(FullSpanItem fullSpanItem) {
            if (this.f1862b == null) {
                this.f1862b = new ArrayList();
            }
            int size = this.f1862b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f1862b.get(i);
                if (fullSpanItem2.f1863a == fullSpanItem.f1863a) {
                    this.f1862b.remove(i);
                }
                if (fullSpanItem2.f1863a >= fullSpanItem.f1863a) {
                    this.f1862b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f1862b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo2338c() {
            int[] iArr = this.f1861a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1862b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo2339d(int i) {
            int[] iArr = this.f1861a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f1861a = iArr2;
                Arrays.fill(iArr2, -1);
                return;
            }
            int length = iArr.length;
            if (i >= length) {
                while (length <= i) {
                    length += length;
                }
                int[] iArr3 = new int[length];
                this.f1861a = iArr3;
                int length2 = iArr.length;
                System.arraycopy(iArr, 0, iArr3, 0, length2);
                int[] iArr4 = this.f1861a;
                Arrays.fill(iArr4, length2, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final void mo2340e(int i, int i2) {
            int[] iArr = this.f1861a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo2339d(i3);
                int[] iArr2 = this.f1861a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f1861a, i, i3, -1);
                List list = this.f1862b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = (FullSpanItem) this.f1862b.get(size);
                        int i4 = fullSpanItem.f1863a;
                        if (i4 >= i) {
                            fullSpanItem.f1863a = i4 + i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final void mo2341f(int i, int i2) {
            int[] iArr = this.f1861a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo2339d(i3);
                int[] iArr2 = this.f1861a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f1861a;
                int length = iArr3.length;
                Arrays.fill(iArr3, length - i2, length, -1);
                List list = this.f1862b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = (FullSpanItem) this.f1862b.get(size);
                        int i4 = fullSpanItem.f1863a;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f1862b.remove(size);
                            } else {
                                fullSpanItem.f1863a = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final void mo2342g(int i) {
            List list = this.f1862b;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (((FullSpanItem) this.f1862b.get(size)).f1863a >= i) {
                        this.f1862b.remove(size);
                    }
                }
            }
            mo2344i(i);
        }

        /* renamed from: h */
        public final FullSpanItem mo2343h(int i, int i2, int i3) {
            List list = this.f1862b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f1862b.get(i4);
                int i5 = fullSpanItem.f1863a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f1864b == i3 || fullSpanItem.f1866d)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2344i(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f1861a
                if (r0 != 0) goto L_0x0005
                return
            L_0x0005:
                int r0 = r0.length
                if (r5 < r0) goto L_0x0009
                return
            L_0x0009:
                java.util.List r0 = r4.f1862b
                r1 = -1
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = -1
                goto L_0x0045
            L_0x0010:
                android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.mo2336a(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List r2 = r4.f1862b
                r2.remove(r0)
            L_0x001b:
                java.util.List r0 = r4.f1862b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0033
                java.util.List r3 = r4.f1862b
                java.lang.Object r3 = r3.get(r2)
                android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (android.support.p033v7.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f1863a
                if (r3 >= r5) goto L_0x0034
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                r2 = -1
            L_0x0034:
                if (r2 == r1) goto L_0x000e
                java.util.List r0 = r4.f1862b
                java.lang.Object r0 = r0.get(r2)
                android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (android.support.p033v7.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List r3 = r4.f1862b
                r3.remove(r2)
                int r0 = r0.f1863a
            L_0x0045:
                if (r0 != r1) goto L_0x0051
                int[] r0 = r4.f1861a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f1861a
                int r5 = r5.length
                return
            L_0x0051:
                int[] r2 = r4.f1861a
                int r2 = r2.length
                int r0 = r0 + 1
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.f1861a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.StaggeredGridLayoutManager.LazySpanLookup.mo2344i(int):void");
        }
    }
}
