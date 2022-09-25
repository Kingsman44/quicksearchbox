package com.google.android.flexbox;

import android.support.p033v7.widget.LinearLayoutManager;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2104s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.flexbox.e */
/* compiled from: PG */
final class C142640e {

    /* renamed from: a */
    public final C142636a f387057a;

    /* renamed from: b */
    int[] f387058b;

    /* renamed from: c */
    long[] f387059c;

    /* renamed from: d */
    private boolean[] f387060d;

    /* renamed from: e */
    private long[] f387061e;

    public C142640e(C142636a aVar) {
        this.f387057a = aVar;
    }

    /* renamed from: A */
    private static final int m231404A(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo117343g();
        }
        return flexItem.mo117345i();
    }

    /* renamed from: B */
    private static final int m231405B(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo117341e();
        }
        return flexItem.mo117351o();
    }

    /* renamed from: C */
    private static final int m231406C(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: D */
    private static final boolean m231407D(int i, int i2, C142637b bVar) {
        return i == i2 + -1 && bVar.f387044h - bVar.f387045i != 0;
    }

    /* renamed from: l */
    static final long m231408l(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* renamed from: m */
    public static final int[] m231409m(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C142639d dVar = (C142639d) it.next();
            int i3 = dVar.f387055a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, dVar.f387056b);
            i2++;
        }
        return iArr;
    }

    /* renamed from: n */
    private final int m231410n(int i, FlexItem flexItem, int i2) {
        C142636a aVar = this.f387057a;
        int e = aVar.mo117357e(i, aVar.getPaddingTop() + this.f387057a.getPaddingBottom() + flexItem.mo117345i() + flexItem.mo117342f() + i2, flexItem.mo117341e());
        int size = View.MeasureSpec.getSize(e);
        if (size > flexItem.mo117346j()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo117346j(), View.MeasureSpec.getMode(e));
        }
        return size < flexItem.mo117348l() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo117348l(), View.MeasureSpec.getMode(e)) : e;
    }

    /* renamed from: o */
    private final int m231411o(int i, FlexItem flexItem, int i2) {
        C142636a aVar = this.f387057a;
        int f = aVar.mo117358f(i, aVar.getPaddingLeft() + this.f387057a.getPaddingRight() + flexItem.mo117343g() + flexItem.mo117344h() + i2, flexItem.mo117351o());
        int size = View.MeasureSpec.getSize(f);
        if (size > flexItem.mo117347k()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo117347k(), View.MeasureSpec.getMode(f));
        }
        return size < flexItem.mo117349m() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo117349m(), View.MeasureSpec.getMode(f)) : f;
    }

    /* renamed from: p */
    private final void m231412p(List list, C142637b bVar, int i, int i2) {
        bVar.f387049m = i2;
        this.f387057a.mo117376s(bVar);
        bVar.f387052p = i;
        list.add(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m231413q(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo117349m()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.mo117349m()
        L_0x0019:
            r3 = 1
            goto L_0x0027
        L_0x001b:
            int r3 = r0.mo117347k()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo117347k()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo117348l()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo117348l()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo117346j()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo117346j()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m231418v(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f387057a
            r0.mo117378u(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C142640e.m231413q(android.view.View, int):void");
    }

    /* renamed from: r */
    private final void m231414r(int i, int i2, C142637b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        double d2;
        C142637b bVar2 = bVar;
        int i8 = i3;
        float f = bVar2.f387046j;
        float f2 = 0.0f;
        if (f > 0.0f && i8 >= (i5 = bVar2.f387041e)) {
            float f3 = ((float) (i8 - i5)) / f;
            bVar2.f387041e = i4 + bVar2.f387042f;
            int i9 = 0;
            if (!z) {
                bVar2.f387043g = LinearLayoutManager.INVALID_OFFSET;
            }
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < bVar2.f387044h) {
                int i11 = bVar2.f387051o + i9;
                View p = this.f387057a.mo117373p(i11);
                if (p == null || p.getVisibility() == 8) {
                    int i12 = i2;
                    i6 = i5;
                } else {
                    FlexItem flexItem = (FlexItem) p.getLayoutParams();
                    int i13 = this.f387057a.mo117363i();
                    if (i13 == 0 || i13 == 1) {
                        i6 = i5;
                        int i14 = i;
                        int measuredWidth = p.getMeasuredWidth();
                        long[] jArr = this.f387061e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i11];
                        }
                        int measuredHeight = p.getMeasuredHeight();
                        long[] jArr2 = this.f387061e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i11] >> 32);
                        }
                        if (this.f387060d[i11] || flexItem.mo117338b() <= 0.0f) {
                            int i15 = i2;
                        } else {
                            float b = ((float) measuredWidth) + (flexItem.mo117338b() * f3);
                            if (i9 == bVar2.f387044h - 1) {
                                b += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(b);
                            if (round > flexItem.mo117347k()) {
                                round = flexItem.mo117347k();
                                z2 = true;
                                this.f387060d[i11] = true;
                                bVar2.f387046j -= flexItem.mo117338b();
                            } else {
                                f4 += b - ((float) round);
                                double d3 = (double) f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    Double.isNaN(d3);
                                    d = d3 - 4.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    Double.isNaN(d3);
                                    d = d3 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int n = m231410n(i2, flexItem, bVar2.f387049m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            p.measure(makeMeasureSpec, n);
                            int measuredWidth2 = p.getMeasuredWidth();
                            int measuredHeight2 = p.getMeasuredHeight();
                            m231418v(i11, makeMeasureSpec, n, p);
                            this.f387057a.mo117378u(i11, p);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i10, measuredHeight + flexItem.mo117345i() + flexItem.mo117342f() + this.f387057a.mo117359g(p));
                        bVar2.f387041e += measuredWidth + flexItem.mo117343g() + flexItem.mo117344h();
                        i7 = max;
                    } else {
                        int measuredHeight3 = p.getMeasuredHeight();
                        long[] jArr3 = this.f387061e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i11] >> 32);
                        }
                        int measuredWidth3 = p.getMeasuredWidth();
                        long[] jArr4 = this.f387061e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i11];
                        }
                        if (this.f387060d[i11] || flexItem.mo117338b() <= f2) {
                            i6 = i5;
                            int i16 = i;
                        } else {
                            float b2 = ((float) measuredHeight3) + (flexItem.mo117338b() * f3);
                            if (i9 == bVar2.f387044h - 1) {
                                b2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(b2);
                            if (round2 > flexItem.mo117346j()) {
                                round2 = flexItem.mo117346j();
                                this.f387060d[i11] = true;
                                bVar2.f387046j -= flexItem.mo117338b();
                                i6 = i5;
                                z2 = true;
                            } else {
                                f4 += b2 - ((float) round2);
                                i6 = i5;
                                double d4 = (double) f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    Double.isNaN(d4);
                                    d2 = d4 - 4.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    Double.isNaN(d4);
                                    d2 = d4 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int o = m231411o(i, flexItem, bVar2.f387049m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            p.measure(o, makeMeasureSpec2);
                            measuredWidth3 = p.getMeasuredWidth();
                            int measuredHeight4 = p.getMeasuredHeight();
                            m231418v(i11, o, makeMeasureSpec2, p);
                            this.f387057a.mo117378u(i11, p);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i10, measuredWidth3 + flexItem.mo117343g() + flexItem.mo117344h() + this.f387057a.mo117359g(p));
                        bVar2.f387041e += measuredHeight3 + flexItem.mo117345i() + flexItem.mo117342f();
                        int i17 = i2;
                    }
                    bVar2.f387043g = Math.max(bVar2.f387043g, i7);
                    i10 = i7;
                }
                i9++;
                i5 = i6;
                f2 = 0.0f;
            }
            int i18 = i2;
            int i19 = i5;
            if (z2 && i19 != bVar2.f387041e) {
                m231414r(i, i2, bVar, i3, i4, true);
            }
        }
    }

    /* renamed from: s */
    private final void m231415s(int i, int i2, C142637b bVar, int i3, int i4, boolean z) {
        float f;
        int i5;
        C142637b bVar2 = bVar;
        int i6 = i3;
        int i7 = bVar2.f387041e;
        float f2 = bVar2.f387047k;
        float f3 = 0.0f;
        if (f2 > 0.0f && i6 <= i7) {
            float f4 = ((float) (i7 - i6)) / f2;
            bVar2.f387041e = i4 + bVar2.f387042f;
            int i8 = 0;
            if (!z) {
                bVar2.f387043g = LinearLayoutManager.INVALID_OFFSET;
            }
            boolean z2 = false;
            int i9 = 0;
            float f5 = 0.0f;
            while (i8 < bVar2.f387044h) {
                int i10 = bVar2.f387051o + i8;
                View p = this.f387057a.mo117373p(i10);
                if (p == null || p.getVisibility() == 8) {
                    int i11 = i2;
                    f = f4;
                } else {
                    FlexItem flexItem = (FlexItem) p.getLayoutParams();
                    int i12 = this.f387057a.mo117363i();
                    if (i12 == 0 || i12 == 1) {
                        int measuredWidth = p.getMeasuredWidth();
                        long[] jArr = this.f387061e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i10];
                        }
                        int measuredHeight = p.getMeasuredHeight();
                        long[] jArr2 = this.f387061e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i10] >> 32);
                        }
                        if (this.f387060d[i10]) {
                            int i13 = i2;
                            f = f4;
                        } else if (flexItem.mo117339c() > 0.0f) {
                            float c = ((float) measuredWidth) - (flexItem.mo117339c() * f4);
                            if (i8 == bVar2.f387044h - 1) {
                                c += f5;
                                f5 = 0.0f;
                            }
                            int round = Math.round(c);
                            if (round < flexItem.mo117349m()) {
                                round = flexItem.mo117349m();
                                z2 = true;
                                this.f387060d[i10] = true;
                                bVar2.f387047k -= flexItem.mo117339c();
                                f = f4;
                            } else {
                                f5 += c - ((float) round);
                                f = f4;
                                double d = (double) f5;
                                if (d > 1.0d) {
                                    round++;
                                    f5 -= 4.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f5 += 1.0f;
                                }
                            }
                            int n = m231410n(i2, flexItem, bVar2.f387049m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            p.measure(makeMeasureSpec, n);
                            int measuredWidth2 = p.getMeasuredWidth();
                            int measuredHeight2 = p.getMeasuredHeight();
                            m231418v(i10, makeMeasureSpec, n, p);
                            this.f387057a.mo117378u(i10, p);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        } else {
                            int i14 = i2;
                            f = f4;
                        }
                        int max = Math.max(i9, measuredHeight + flexItem.mo117345i() + flexItem.mo117342f() + this.f387057a.mo117359g(p));
                        bVar2.f387041e += measuredWidth + flexItem.mo117343g() + flexItem.mo117344h();
                        i5 = max;
                    } else {
                        int measuredHeight3 = p.getMeasuredHeight();
                        long[] jArr3 = this.f387061e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i10] >> 32);
                        }
                        int measuredWidth3 = p.getMeasuredWidth();
                        long[] jArr4 = this.f387061e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i10];
                        }
                        if (!this.f387060d[i10] && flexItem.mo117339c() > f3) {
                            float c2 = ((float) measuredHeight3) - (flexItem.mo117339c() * f4);
                            if (i8 == bVar2.f387044h - 1) {
                                c2 += f5;
                                f5 = 0.0f;
                            }
                            int round2 = Math.round(c2);
                            if (round2 < flexItem.mo117348l()) {
                                round2 = flexItem.mo117348l();
                                this.f387060d[i10] = true;
                                bVar2.f387047k -= flexItem.mo117339c();
                                z2 = true;
                            } else {
                                f5 += c2 - ((float) round2);
                                double d2 = (double) f5;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f5 -= 4.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f5 += 1.0f;
                                }
                                bVar2 = bVar;
                            }
                            int o = m231411o(i, flexItem, bVar2.f387049m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            p.measure(o, makeMeasureSpec2);
                            int measuredWidth4 = p.getMeasuredWidth();
                            int measuredHeight4 = p.getMeasuredHeight();
                            m231418v(i10, o, makeMeasureSpec2, p);
                            this.f387057a.mo117378u(i10, p);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        }
                        i5 = Math.max(i9, measuredWidth3 + flexItem.mo117343g() + flexItem.mo117344h() + this.f387057a.mo117359g(p));
                        bVar2.f387041e += measuredHeight3 + flexItem.mo117345i() + flexItem.mo117342f();
                        int i15 = i2;
                        f = f4;
                    }
                    bVar2.f387043g = Math.max(bVar2.f387043g, i5);
                    i9 = i5;
                }
                i8++;
                int i16 = i3;
                f4 = f;
                f3 = 0.0f;
            }
            int i17 = i2;
            if (z2 && i7 != bVar2.f387041e) {
                m231415s(i, i2, bVar, i3, i4, true);
            }
        }
    }

    /* renamed from: t */
    private final void m231416t(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo117343g()) - flexItem.mo117344h()) - this.f387057a.mo117359g(view), flexItem.mo117349m()), flexItem.mo117347k());
        long[] jArr = this.f387061e;
        if (jArr != null) {
            i3 = (int) (jArr[i2] >> 32);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m231418v(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f387057a.mo117378u(i2, view);
    }

    /* renamed from: u */
    private final void m231417u(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo117345i()) - flexItem.mo117342f()) - this.f387057a.mo117359g(view), flexItem.mo117348l()), flexItem.mo117346j());
        long[] jArr = this.f387061e;
        if (jArr != null) {
            i3 = (int) jArr[i2];
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m231418v(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f387057a.mo117378u(i2, view);
    }

    /* renamed from: v */
    private final void m231418v(int i, int i2, int i3, View view) {
        long[] jArr = this.f387059c;
        if (jArr != null) {
            jArr[i] = m231408l(i2, i3);
        }
        long[] jArr2 = this.f387061e;
        if (jArr2 != null) {
            jArr2[i] = m231408l(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: w */
    private static final List m231419w(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C142637b bVar = new C142637b();
        bVar.f387043g = (i - i2) / 2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                arrayList.add(bVar);
                i3 = 0;
            }
            arrayList.add((C142637b) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(bVar);
            }
            i3++;
        }
        return arrayList;
    }

    /* renamed from: x */
    private static final int m231420x(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo117342f();
        }
        return flexItem.mo117344h();
    }

    /* renamed from: y */
    private static final int m231421y(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo117344h();
        }
        return flexItem.mo117342f();
    }

    /* renamed from: z */
    private static final int m231422z(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo117345i();
        }
        return flexItem.mo117343g();
    }

    /* renamed from: a */
    public final List mo117405a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C142639d dVar = new C142639d();
            dVar.f387056b = ((FlexItem) this.f387057a.mo117369o(i2).getLayoutParams()).mo117350n();
            dVar.f387055a = i2;
            arrayList.add(dVar);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ed, code lost:
        if (r2 < (r7 + r9)) goto L_0x01ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0352 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x031d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117406b(com.google.android.flexbox.C142638c r29, int r30, int r31, int r32, int r33, int r34, java.util.List r35) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r34
            com.google.android.flexbox.a r5 = r0.f387057a
            boolean r5 = r5.mo117379v()
            int r6 = android.view.View.MeasureSpec.getMode(r30)
            int r7 = android.view.View.MeasureSpec.getSize(r30)
            if (r35 != 0) goto L_0x0020
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L_0x0022
        L_0x0020:
            r8 = r35
        L_0x0022:
            r1.f387053a = r8
            r9 = -1
            if (r4 != r9) goto L_0x0029
            r12 = 1
            goto L_0x002a
        L_0x0029:
            r12 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x0033
            com.google.android.flexbox.a r13 = r0.f387057a
            int r13 = r13.getPaddingStart()
            goto L_0x0039
        L_0x0033:
            com.google.android.flexbox.a r13 = r0.f387057a
            int r13 = r13.getPaddingTop()
        L_0x0039:
            if (r5 == 0) goto L_0x0042
            com.google.android.flexbox.a r14 = r0.f387057a
            int r14 = r14.getPaddingEnd()
            goto L_0x0048
        L_0x0042:
            com.google.android.flexbox.a r14 = r0.f387057a
            int r14 = r14.getPaddingBottom()
        L_0x0048:
            if (r5 == 0) goto L_0x0051
            com.google.android.flexbox.a r15 = r0.f387057a
            int r15 = r15.getPaddingTop()
            goto L_0x0057
        L_0x0051:
            com.google.android.flexbox.a r15 = r0.f387057a
            int r15 = r15.getPaddingStart()
        L_0x0057:
            if (r5 == 0) goto L_0x0060
            com.google.android.flexbox.a r9 = r0.f387057a
            int r9 = r9.getPaddingBottom()
            goto L_0x0066
        L_0x0060:
            com.google.android.flexbox.a r9 = r0.f387057a
            int r9 = r9.getPaddingEnd()
        L_0x0066:
            com.google.android.flexbox.b r10 = new com.google.android.flexbox.b
            r10.<init>()
            r11 = r33
            r10.f387051o = r11
            int r13 = r13 + r14
            r10.f387041e = r13
            com.google.android.flexbox.a r14 = r0.f387057a
            int r14 = r14.mo117364j()
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r33 = r12
            r1 = 0
            r4 = 0
            r12 = 0
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0081:
            if (r11 >= r14) goto L_0x0370
            r20 = r4
            com.google.android.flexbox.a r4 = r0.f387057a
            android.view.View r4 = r4.mo117373p(r11)
            if (r4 != 0) goto L_0x0099
            boolean r4 = m231407D(r11, r14, r10)
            if (r4 == 0) goto L_0x0096
            r0.m231412p(r8, r10, r11, r12)
        L_0x0096:
            r21 = r1
            goto L_0x00b7
        L_0x0099:
            r21 = r1
            int r1 = r4.getVisibility()
            r3 = 8
            if (r1 != r3) goto L_0x00c9
            int r1 = r10.f387045i
            r3 = 1
            int r1 = r1 + r3
            r10.f387045i = r1
            int r1 = r10.f387044h
            int r1 = r1 + r3
            r10.f387044h = r1
            boolean r1 = m231407D(r11, r14, r10)
            if (r1 == 0) goto L_0x00b7
            r0.m231412p(r8, r10, r11, r12)
        L_0x00b7:
            r4 = r34
            r23 = r6
            r2 = r7
            r16 = r9
            r1 = r14
            r25 = r21
            r14 = r31
            r9 = r32
            r7 = r33
            goto L_0x035d
        L_0x00c9:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            com.google.android.flexbox.FlexItem r1 = (com.google.android.flexbox.FlexItem) r1
            int r3 = r1.mo117340d()
            r22 = r14
            r14 = 4
            if (r3 != r14) goto L_0x00e1
            java.util.List r3 = r10.f387050n
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r3.add(r14)
        L_0x00e1:
            if (r5 == 0) goto L_0x00e8
            int r3 = r1.mo117351o()
            goto L_0x00ec
        L_0x00e8:
            int r3 = r1.mo117341e()
        L_0x00ec:
            float r14 = r1.mo117337a()
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r14 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r14 == 0) goto L_0x0106
            r14 = 1073741824(0x40000000, float:2.0)
            if (r6 != r14) goto L_0x0106
            float r3 = (float) r7
            float r23 = r1.mo117337a()
            float r3 = r3 * r23
            int r3 = java.lang.Math.round(r3)
            goto L_0x0107
        L_0x0106:
            r14 = r6
        L_0x0107:
            if (r5 == 0) goto L_0x014a
            r23 = r6
            com.google.android.flexbox.a r6 = r0.f387057a
            r24 = r7
            r7 = 1
            int r17 = m231404A(r1, r7)
            int r17 = r13 + r17
            int r25 = m231421y(r1, r7)
            int r7 = r17 + r25
            int r3 = r6.mo117358f(r2, r7, r3)
            com.google.android.flexbox.a r6 = r0.f387057a
            int r7 = r15 + r9
            r25 = r14
            r14 = 1
            int r17 = m231422z(r1, r14)
            int r7 = r7 + r17
            int r17 = m231420x(r1, r14)
            int r7 = r7 + r17
            int r7 = r7 + r12
            r26 = r8
            int r8 = m231405B(r1, r14)
            r14 = r31
            int r6 = r6.mo117357e(r14, r7, r8)
            r4.measure(r3, r6)
            r0.m231418v(r11, r3, r6, r4)
            r16 = r9
            r8 = 0
            goto L_0x0187
        L_0x014a:
            r23 = r6
            r24 = r7
            r26 = r8
            r25 = r14
            r14 = r31
            com.google.android.flexbox.a r6 = r0.f387057a
            int r7 = r15 + r9
            r8 = 0
            int r16 = m231422z(r1, r8)
            int r7 = r7 + r16
            int r16 = m231420x(r1, r8)
            int r7 = r7 + r16
            int r7 = r7 + r12
            r16 = r9
            int r9 = m231405B(r1, r8)
            int r6 = r6.mo117358f(r14, r7, r9)
            com.google.android.flexbox.a r7 = r0.f387057a
            int r9 = m231404A(r1, r8)
            int r9 = r9 + r13
            int r27 = m231421y(r1, r8)
            int r9 = r9 + r27
            int r3 = r7.mo117357e(r2, r9, r3)
            r4.measure(r6, r3)
            r0.m231418v(r11, r6, r3, r4)
        L_0x0187:
            com.google.android.flexbox.a r6 = r0.f387057a
            r6.mo117378u(r11, r4)
            r0.m231413q(r4, r11)
            int r6 = r4.getMeasuredState()
            r7 = r21
            int r6 = android.view.View.combineMeasuredStates(r7, r6)
            int r7 = r10.f387041e
            int r9 = m231406C(r4, r5)
            int r21 = m231404A(r1, r5)
            int r9 = r9 + r21
            int r21 = m231421y(r1, r5)
            int r9 = r9 + r21
            int r21 = r26.size()
            com.google.android.flexbox.a r8 = r0.f387057a
            int r8 = r8.mo117365k()
            if (r8 != 0) goto L_0x01c2
        L_0x01b7:
            r25 = r6
        L_0x01b9:
            r6 = r20
            r2 = r24
        L_0x01bd:
            r8 = r26
            r3 = 1
            goto L_0x0276
        L_0x01c2:
            boolean r8 = r1.mo117352p()
            if (r8 == 0) goto L_0x01cd
            r25 = r6
            r2 = r24
            goto L_0x01ef
        L_0x01cd:
            if (r25 == 0) goto L_0x01b7
            com.google.android.flexbox.a r8 = r0.f387057a
            int r8 = r8.mo117367m()
            r2 = -1
            r25 = r6
            if (r8 == r2) goto L_0x01df
            r2 = 1
            int r6 = r21 + 1
            if (r8 <= r6) goto L_0x01b9
        L_0x01df:
            com.google.android.flexbox.a r2 = r0.f387057a
            r6 = r20
            int r2 = r2.mo117362h(r4, r11, r6)
            if (r2 <= 0) goto L_0x01ea
            int r9 = r9 + r2
        L_0x01ea:
            int r7 = r7 + r9
            r2 = r24
            if (r2 >= r7) goto L_0x01bd
        L_0x01ef:
            int r6 = r10.f387044h
            int r7 = r10.f387045i
            int r6 = r6 - r7
            if (r6 <= 0) goto L_0x0207
            if (r11 <= 0) goto L_0x01fd
            int r6 = r11 + -1
            r8 = r26
            goto L_0x0200
        L_0x01fd:
            r8 = r26
            r6 = 0
        L_0x0200:
            r0.m231412p(r8, r10, r6, r12)
            int r6 = r10.f387043g
            int r12 = r12 + r6
            goto L_0x0209
        L_0x0207:
            r8 = r26
        L_0x0209:
            if (r5 == 0) goto L_0x0239
            int r6 = r1.mo117341e()
            r7 = -1
            if (r6 != r7) goto L_0x0266
            com.google.android.flexbox.a r6 = r0.f387057a
            int r7 = r6.getPaddingTop()
            com.google.android.flexbox.a r9 = r0.f387057a
            int r9 = r9.getPaddingBottom()
            int r7 = r7 + r9
            int r9 = r1.mo117345i()
            int r7 = r7 + r9
            int r9 = r1.mo117342f()
            int r7 = r7 + r9
            int r7 = r7 + r12
            int r9 = r1.mo117341e()
            int r6 = r6.mo117357e(r14, r7, r9)
            r4.measure(r3, r6)
            r0.m231413q(r4, r11)
            goto L_0x0266
        L_0x0239:
            int r6 = r1.mo117351o()
            r7 = -1
            if (r6 != r7) goto L_0x0266
            com.google.android.flexbox.a r6 = r0.f387057a
            int r7 = r6.getPaddingLeft()
            com.google.android.flexbox.a r9 = r0.f387057a
            int r9 = r9.getPaddingRight()
            int r7 = r7 + r9
            int r9 = r1.mo117343g()
            int r7 = r7 + r9
            int r9 = r1.mo117344h()
            int r7 = r7 + r9
            int r7 = r7 + r12
            int r9 = r1.mo117351o()
            int r6 = r6.mo117358f(r14, r7, r9)
            r4.measure(r6, r3)
            r0.m231413q(r4, r11)
        L_0x0266:
            com.google.android.flexbox.b r10 = new com.google.android.flexbox.b
            r10.<init>()
            r3 = 1
            r10.f387044h = r3
            r10.f387041e = r13
            r10.f387051o = r11
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x027f
        L_0x0276:
            int r7 = r10.f387044h
            int r7 = r7 + r3
            r10.f387044h = r7
            int r6 = r6 + 1
            r7 = r19
        L_0x027f:
            int[] r9 = r0.f387058b
            if (r9 == 0) goto L_0x0289
            int r17 = r8.size()
            r9[r11] = r17
        L_0x0289:
            int r9 = r10.f387041e
            int r17 = m231406C(r4, r5)
            int r19 = m231404A(r1, r5)
            int r17 = r17 + r19
            int r19 = m231421y(r1, r5)
            int r17 = r17 + r19
            int r9 = r9 + r17
            r10.f387041e = r9
            float r9 = r10.f387046j
            float r17 = r1.mo117338b()
            float r9 = r9 + r17
            r10.f387046j = r9
            float r9 = r10.f387047k
            float r17 = r1.mo117339c()
            float r9 = r9 + r17
            r10.f387047k = r9
            com.google.android.flexbox.a r9 = r0.f387057a
            r9.mo117375r(r4, r11, r6, r10)
            if (r5 == 0) goto L_0x02bf
            int r9 = r4.getMeasuredHeight()
            goto L_0x02c3
        L_0x02bf:
            int r9 = r4.getMeasuredWidth()
        L_0x02c3:
            int r17 = m231422z(r1, r5)
            int r9 = r9 + r17
            int r17 = m231420x(r1, r5)
            int r9 = r9 + r17
            com.google.android.flexbox.a r3 = r0.f387057a
            int r3 = r3.mo117359g(r4)
            int r9 = r9 + r3
            int r3 = java.lang.Math.max(r7, r9)
            int r7 = r10.f387043g
            int r7 = java.lang.Math.max(r7, r3)
            r10.f387043g = r7
            if (r5 == 0) goto L_0x0315
            com.google.android.flexbox.a r7 = r0.f387057a
            int r7 = r7.mo117365k()
            r9 = 2
            if (r7 == r9) goto L_0x02ff
            int r7 = r10.f387048l
            int r4 = r4.getBaseline()
            int r1 = r1.mo117345i()
            int r4 = r4 + r1
            int r1 = java.lang.Math.max(r7, r4)
            r10.f387048l = r1
            goto L_0x0315
        L_0x02ff:
            int r7 = r10.f387048l
            int r9 = r4.getMeasuredHeight()
            int r4 = r4.getBaseline()
            int r9 = r9 - r4
            int r1 = r1.mo117342f()
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r7, r9)
            r10.f387048l = r1
        L_0x0315:
            r1 = r22
            boolean r4 = m231407D(r11, r1, r10)
            if (r4 == 0) goto L_0x0323
            r0.m231412p(r8, r10, r11, r12)
            int r4 = r10.f387043g
            int r12 = r12 + r4
        L_0x0323:
            r4 = r34
            r9 = -1
            if (r4 == r9) goto L_0x034c
            int r7 = r8.size()
            if (r7 <= 0) goto L_0x034c
            int r7 = r8.size()
            int r7 = r7 + r9
            java.lang.Object r7 = r8.get(r7)
            com.google.android.flexbox.b r7 = (com.google.android.flexbox.C142637b) r7
            int r7 = r7.f387052p
            if (r7 < r4) goto L_0x034c
            if (r11 < r4) goto L_0x034c
            if (r33 != 0) goto L_0x0348
            int r7 = r10.f387043g
            int r7 = -r7
            r9 = r32
            r12 = r7
            goto L_0x034a
        L_0x0348:
            r9 = r32
        L_0x034a:
            r7 = 1
            goto L_0x0350
        L_0x034c:
            r9 = r32
            r7 = r33
        L_0x0350:
            if (r12 <= r9) goto L_0x0359
            if (r7 == 0) goto L_0x0359
            r2 = r29
            r1 = r25
            goto L_0x0373
        L_0x0359:
            r19 = r3
            r20 = r6
        L_0x035d:
            int r11 = r11 + 1
            r33 = r7
            r3 = r14
            r9 = r16
            r4 = r20
            r6 = r23
            r14 = r1
            r7 = r2
            r1 = r25
            r2 = r30
            goto L_0x0081
        L_0x0370:
            r7 = r1
            r2 = r29
        L_0x0373:
            r2.f387054b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C142640e.mo117406b(com.google.android.flexbox.c, int, int, int, int, int, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo117407c(List list, int i) {
        int i2 = this.f387058b[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.f387058b;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f387059c;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo117408d(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = this.f387057a.mo117363i();
        if (i7 == 0 || i7 == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (i7 == 2 || i7 == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i7);
        }
        List<C142637b> q = this.f387057a.mo117374q();
        if (i4 == 1073741824) {
            int n = this.f387057a.mo117368n() + i3;
            int i8 = 0;
            if (q.size() == 1) {
                ((C142637b) q.get(0)).f387043g = i5 - i3;
            } else if (q.size() >= 2) {
                int c = this.f387057a.mo117354c();
                if (c == 1) {
                    C142637b bVar = new C142637b();
                    bVar.f387043g = i5 - n;
                    q.add(0, bVar);
                } else if (c == 2) {
                    this.f387057a.mo117377t(m231419w(q, i5, n));
                } else if (c != 3) {
                    if (c != 4) {
                        if (c == 5 && n < i5) {
                            float size2 = ((float) (i5 - n)) / ((float) q.size());
                            int size3 = q.size();
                            float f = 0.0f;
                            while (i8 < size3) {
                                C142637b bVar2 = (C142637b) q.get(i8);
                                float f2 = ((float) bVar2.f387043g) + size2;
                                if (i8 == q.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                f += f2 - ((float) round);
                                if (f > 1.0f) {
                                    round++;
                                    f -= 4.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                bVar2.f387043g = round;
                                i8++;
                            }
                        }
                    } else if (n >= i5) {
                        this.f387057a.mo117377t(m231419w(q, i5, n));
                    } else {
                        int size4 = q.size();
                        int i9 = (i5 - n) / (size4 + size4);
                        ArrayList arrayList = new ArrayList();
                        C142637b bVar3 = new C142637b();
                        bVar3.f387043g = i9;
                        for (C142637b add : q) {
                            arrayList.add(bVar3);
                            arrayList.add(add);
                            arrayList.add(bVar3);
                        }
                        this.f387057a.mo117377t(arrayList);
                    }
                } else if (n < i5) {
                    float size5 = ((float) (i5 - n)) / ((float) (q.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = q.size();
                    float f3 = 0.0f;
                    while (i8 < size6) {
                        arrayList2.add((C142637b) q.get(i8));
                        if (i8 != q.size() - 1) {
                            C142637b bVar4 = new C142637b();
                            if (i8 == q.size() - 2) {
                                int round2 = Math.round(f3 + size5);
                                bVar4.f387043g = round2;
                                i6 = round2;
                                f3 = 0.0f;
                            } else {
                                i6 = Math.round(size5);
                                bVar4.f387043g = i6;
                            }
                            f3 += size5 - ((float) i6);
                            if (f3 > 1.0f) {
                                bVar4.f387043g = i6 + 1;
                                f3 -= 4.0f;
                            } else if (f3 < -1.0f) {
                                bVar4.f387043g = i6 - 1;
                                f3 += 1.0f;
                            }
                            arrayList2.add(bVar4);
                        }
                        i8++;
                    }
                    this.f387057a.mo117377t(arrayList2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo117409e(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int j = this.f387057a.mo117364j();
        boolean[] zArr = this.f387060d;
        int i7 = 0;
        if (zArr == null) {
            if (j < 10) {
                j = 10;
            }
            this.f387060d = new boolean[j];
        } else {
            int length = zArr.length;
            if (length < j) {
                int i8 = length + length;
                if (i8 >= j) {
                    j = i8;
                }
                this.f387060d = new boolean[j];
            } else {
                Arrays.fill(zArr, false);
            }
        }
        if (i3 < this.f387057a.mo117364j()) {
            int i9 = this.f387057a.mo117363i();
            int i10 = this.f387057a.mo117363i();
            if (i10 == 0 || i10 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                if (mode != 1073741824) {
                    size = this.f387057a.mo117366l();
                }
                i6 = this.f387057a.getPaddingLeft();
                i4 = this.f387057a.getPaddingRight();
            } else if (i10 == 2 || i10 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.f387057a.mo117366l();
                }
                i6 = this.f387057a.getPaddingTop();
                i4 = this.f387057a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + i9);
            }
            int i11 = i6 + i4;
            int[] iArr = this.f387058b;
            if (iArr != null) {
                i7 = iArr[i3];
            }
            List q = this.f387057a.mo117374q();
            int size2 = q.size();
            while (i7 < size2) {
                C142637b bVar = (C142637b) q.get(i7);
                if (bVar.f387041e < i5) {
                    m231414r(i, i2, bVar, i5, i11, false);
                } else {
                    m231415s(i, i2, bVar, i5, i11, false);
                }
                i7++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo117410f(int i) {
        int[] iArr = this.f387058b;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f387058b = new int[i];
            return;
        }
        int length = iArr.length;
        if (length < i) {
            int i2 = length + length;
            if (i2 >= i) {
                i = i2;
            }
            this.f387058b = Arrays.copyOf(iArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo117411g(int i) {
        long[] jArr = this.f387059c;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f387059c = new long[i];
            return;
        }
        int length = jArr.length;
        if (length < i) {
            int i2 = length + length;
            if (i2 >= i) {
                i = i2;
            }
            this.f387059c = Arrays.copyOf(jArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo117412h(int i) {
        long[] jArr = this.f387061e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f387061e = new long[i];
            return;
        }
        int length = jArr.length;
        if (length < i) {
            int i2 = length + length;
            if (i2 >= i) {
                i = i2;
            }
            this.f387061e = Arrays.copyOf(jArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo117413i(View view, C142637b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int d = this.f387057a.mo117356d();
        if (flexItem.mo117340d() != -1) {
            d = flexItem.mo117340d();
        }
        int i5 = bVar.f387043g;
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo117345i()) - flexItem.mo117342f()) / 2;
                    if (this.f387057a.mo117365k() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (d != 3) {
                    if (d != 4) {
                        return;
                    }
                } else if (this.f387057a.mo117365k() != 2) {
                    int max = Math.max(bVar.f387048l - view.getBaseline(), flexItem.mo117345i());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((bVar.f387048l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo117342f());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f387057a.mo117365k() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.mo117342f(), i3, i8 - flexItem.mo117342f());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo117345i(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo117345i());
                return;
            }
        }
        if (this.f387057a.mo117365k() != 2) {
            view.layout(i, i2 + flexItem.mo117345i(), i3, i4 + flexItem.mo117345i());
        } else {
            view.layout(i, i2 - flexItem.mo117342f(), i3, i4 - flexItem.mo117342f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo117414j(View view, C142637b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int d = this.f387057a.mo117356d();
        if (flexItem.mo117340d() != -1) {
            d = flexItem.mo117340d();
        }
        int i5 = bVar.f387043g;
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + C2104s.m5790c(marginLayoutParams)) - C2104s.m5789b(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(d == 3 || d == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo117344h(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo117344h(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo117343g(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo117343g(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.mo117343g(), i2, i3 + flexItem.mo117343g(), i4);
        } else {
            view.layout(i - flexItem.mo117344h(), i2, i3 - flexItem.mo117344h(), i4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo117415k(int i) {
        View p;
        int i2 = i;
        if (i2 < this.f387057a.mo117364j()) {
            int i3 = this.f387057a.mo117363i();
            if (this.f387057a.mo117356d() == 4) {
                int[] iArr = this.f387058b;
                List q = this.f387057a.mo117374q();
                int size = q.size();
                for (int i4 = iArr != null ? iArr[i2] : 0; i4 < size; i4++) {
                    C142637b bVar = (C142637b) q.get(i4);
                    int i5 = bVar.f387044h;
                    for (int i6 = 0; i6 < i5; i6++) {
                        int i7 = bVar.f387051o + i6;
                        if (!(i6 >= this.f387057a.mo117364j() || (p = this.f387057a.mo117373p(i7)) == null || p.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) p.getLayoutParams();
                            if (flexItem.mo117340d() == -1 || flexItem.mo117340d() == 4) {
                                if (i3 == 0 || i3 == 1) {
                                    m231417u(p, bVar.f387043g, i7);
                                } else if (i3 == 2 || i3 == 3) {
                                    m231416t(p, bVar.f387043g, i7);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + i3);
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (C142637b bVar2 : this.f387057a.mo117374q()) {
                Iterator it = bVar2.f387050n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View p2 = this.f387057a.mo117373p(num.intValue());
                        if (i3 == 0 || i3 == 1) {
                            m231417u(p2, bVar2.f387043g, num.intValue());
                        } else if (i3 == 2 || i3 == 3) {
                            m231416t(p2, bVar2.f387043g, num.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + i3);
                        }
                    }
                }
            }
        }
    }
}
