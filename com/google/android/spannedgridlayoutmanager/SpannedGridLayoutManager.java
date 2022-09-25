package com.google.android.spannedgridlayoutmanager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.p033v7.widget.C0624em;
import android.support.p033v7.widget.C0625en;
import android.support.p033v7.widget.C0626eo;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2104s;
import com.google.android.libraries.p10915aa.p10921c.C146704a;
import java.util.ArrayList;

/* compiled from: PG */
public class SpannedGridLayoutManager extends C0653fo {

    /* renamed from: a */
    C45341g f118468a;

    /* renamed from: b */
    public C45336b f118469b;

    /* renamed from: c */
    int[] f118470c;

    /* renamed from: d */
    public int f118471d;

    /* renamed from: e */
    public int f118472e;

    /* renamed from: f */
    public int f118473f;

    /* renamed from: g */
    int f118474g = 0;

    /* renamed from: h */
    final ArrayList f118475h = new ArrayList();

    /* renamed from: i */
    final ArrayList f118476i = new ArrayList();

    /* renamed from: j */
    final ArrayList f118477j = new ArrayList();

    /* renamed from: k */
    final ArrayList f118478k = new ArrayList();

    /* renamed from: l */
    C0626eo f118479l;

    /* renamed from: m */
    C0626eo f118480m;

    /* renamed from: n */
    private int f118481n;

    /* renamed from: o */
    private boolean f118482o;

    /* renamed from: p */
    private final Rect f118483p = new Rect();

    /* renamed from: q */
    private final C45339e f118484q = new C45339e();

    /* renamed from: r */
    private final C45340f f118485r = new C45340f(this);

    /* renamed from: s */
    private int f118486s;

    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int[] iArr;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C146704a.f396148a, i, i2);
        int i3 = obtainStyledAttributes.getInt(2, 1);
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        float[] fArr = null;
        if (resourceId != -1) {
            TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
            iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = obtainTypedArray.getDimensionPixelSize(i4, 0);
            }
            obtainTypedArray.recycle();
        } else {
            iArr = null;
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(3, -1);
        if (resourceId2 != -1) {
            TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(resourceId2);
            fArr = new float[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                fArr[i5] = obtainTypedArray2.getFloat(i5, 1.0f);
            }
            obtainTypedArray2.recycle();
        }
        this.f118469b = new C45336b(i3, fArr, iArr);
        int i6 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        this.f118486s = i6;
        if (i6 == 1) {
            this.f118479l = new C0625en(this);
            this.f118480m = new C0624em(this);
        } else {
            this.f118479l = new C0624em(this);
            this.f118480m = new C0625en(this);
        }
        setAutoMeasureEnabled(true);
    }

    /* renamed from: i */
    private final int m80831i() {
        int[] iArr = this.f118470c;
        return iArr[this.f118469b.f118488a] - iArr[0];
    }

    /* renamed from: j */
    private final C45340f m80832j(int i, int i2, boolean z) {
        int i3;
        C45340f fVar = this.f118485r;
        fVar.f118502d = i;
        fVar.f118503e = i2;
        fVar.f118504f = z;
        fVar.f118505g = false;
        if (z) {
            i3 = this.f118481n;
        } else {
            i3 = this.f118473f;
        }
        fVar.f118501c = i3;
        fVar.f118506h = false;
        return fVar;
    }

    /* renamed from: k */
    private final void m80833k(C45340f fVar) {
        int i;
        int i2;
        C45340f fVar2 = fVar;
        while (true) {
            if (fVar2.f118503e <= 0 && !fVar2.f118506h) {
                return;
            }
            if (fVar2.f118504f && fVar2.f118507i.f118472e >= fVar2.f118500b.mo3052a() - 1) {
                return;
            }
            if (fVar2.f118504f || fVar2.f118507i.f118471d > 0) {
                C45339e eVar = this.f118484q;
                eVar.f118497a = 0;
                eVar.f118498b = true;
                int a = this.f118468a.mo49349a(fVar2.f118501c);
                int b = this.f118468a.mo49350b(fVar2.f118501c);
                int i3 = (b - a) + 1;
                int d = this.f118468a.mo49352d(a);
                int i4 = 0;
                for (int i5 = a; i5 <= b; i5++) {
                    i4 = Math.max(i4, (this.f118468a.mo49352d(i5) - d) + this.f118468a.mo49353e(i5).f118492b);
                }
                m80838p(this.f118475h, i3);
                m80838p(this.f118477j, i3);
                m80838p(this.f118476i, i3);
                m80838p(this.f118478k, i4 + 1);
                View[] viewArr = new View[i3];
                int i6 = 0;
                while (i6 < i3) {
                    int i7 = i6 + a;
                    View p = fVar2.f118499a.mo3039p(i7);
                    C45338d dVar = (C45338d) p.getLayoutParams();
                    eVar.f118498b = eVar.f118498b && !dVar.f2420c.isRemoved();
                    C45337c e = this.f118468a.mo49353e(i7);
                    viewArr[i6] = p;
                    int[] iArr = this.f118470c;
                    int i8 = e.f118493c;
                    View view = p;
                    int i9 = i6;
                    m80834l(p, dVar, iArr[e.f118494d + i8] - iArr[i8], this.f118486s == 1 ? dVar.height : dVar.width, 0);
                    int i10 = i9;
                    this.f118476i.set(i10, Integer.valueOf(this.f118479l.mo2839b(view)));
                    this.f118475h.set(i10, 0);
                    this.f118477j.set(i10, Integer.valueOf(e.f118492b));
                    i6 = i10 + 1;
                    viewArr = viewArr;
                    i4 = i4;
                    b = b;
                }
                View[] viewArr2 = viewArr;
                int i11 = b;
                int i12 = i4;
                for (int i13 = 0; i13 < i12; i13++) {
                    this.f118478k.set(i13, (Object) null);
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = -1;
                    int i16 = -1;
                    for (int i17 = 0; i17 < i3; i17++) {
                        C45337c e2 = this.f118468a.mo49353e(i17 + a);
                        Integer num = (Integer) this.f118477j.get(i17);
                        if (num.intValue() > 0) {
                            int intValue = ((Integer) this.f118476i.get(i17)).intValue() / num.intValue();
                            int i18 = e2.f118492b;
                            int i19 = 0;
                            while (i19 < i18) {
                                int i20 = i15;
                                i15 = (e2.f118491a + i19) - d;
                                C45337c cVar = e2;
                                if (this.f118478k.get(i15) != null || intValue <= i16) {
                                    i15 = i20;
                                } else {
                                    i16 = intValue;
                                }
                                i19++;
                                e2 = cVar;
                            }
                            int i21 = i15;
                        }
                    }
                    this.f118478k.set(i15, Integer.valueOf(i16));
                    int i22 = i15 + d;
                    for (int i23 = 0; i23 < i3; i23++) {
                        C45337c e3 = this.f118468a.mo49353e(i23 + a);
                        int i24 = e3.f118491a;
                        if (i24 <= i22 && i24 + e3.f118492b > i22) {
                            ArrayList arrayList = this.f118477j;
                            arrayList.set(i23, Integer.valueOf(((Integer) arrayList.get(i23)).intValue() - 1));
                            ArrayList arrayList2 = this.f118476i;
                            arrayList2.set(i23, Integer.valueOf(Math.max(0, ((Integer) arrayList2.get(i23)).intValue() - i16)));
                            ArrayList arrayList3 = this.f118475h;
                            arrayList3.set(i23, Integer.valueOf(((Integer) arrayList3.get(i23)).intValue() + i16));
                        }
                    }
                }
                if (fVar2.f118504f) {
                    int i25 = fVar2.f118502d;
                    int i26 = 0;
                    while (i26 < i12) {
                        int intValue2 = ((Integer) this.f118478k.get(i26)).intValue() + i25;
                        this.f118478k.set(i26, Integer.valueOf(i25));
                        i26++;
                        i25 = intValue2;
                    }
                    this.f118478k.set(i12, Integer.valueOf(i25));
                    for (int i27 = 0; i27 < i3; i27++) {
                        C45337c e4 = this.f118468a.mo49353e(i27 + a);
                        int intValue3 = ((Integer) this.f118478k.get(e4.f118491a - d)).intValue();
                        View view2 = viewArr2[i27];
                        if (fVar2.f118505g) {
                            addDisappearingView(view2);
                        } else {
                            addView(view2);
                        }
                        mo49346g(e4, view2, ((Integer) this.f118475h.get(i27)).intValue(), intValue3, true);
                    }
                    i2 = ((Integer) this.f118478k.get(i12)).intValue();
                    i = fVar2.f118502d;
                } else {
                    int i28 = fVar2.f118502d;
                    int i29 = i12;
                    while (i29 > 0) {
                        this.f118478k.set(i29, Integer.valueOf(i28));
                        i29--;
                        i28 -= ((Integer) this.f118478k.get(i29)).intValue();
                    }
                    this.f118478k.set(0, Integer.valueOf(i28));
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C45337c e5 = this.f118468a.mo49353e(i3 + a);
                        int intValue4 = ((Integer) this.f118478k.get((e5.f118491a + e5.f118492b) - d)).intValue();
                        View view3 = viewArr2[i3];
                        if (fVar2.f118505g) {
                            addDisappearingView(view3, 0);
                        } else {
                            addView(view3, 0);
                        }
                        mo49346g(e5, view3, ((Integer) this.f118475h.get(i3)).intValue(), intValue4, false);
                    }
                    i2 = fVar2.f118502d;
                    i = ((Integer) this.f118478k.get(0)).intValue();
                }
                eVar.f118497a = i2 - i;
                if (!fVar2.f118505g) {
                    if (a < this.f118471d) {
                        this.f118471d = a;
                        this.f118473f = this.f118468a.mo49352d(a);
                    }
                    int i30 = i11;
                    if (i30 > this.f118472e) {
                        this.f118472e = i30;
                        this.f118481n = this.f118468a.mo49352d(i30);
                    }
                }
                C45339e eVar2 = this.f118484q;
                if (eVar2.f118498b) {
                    fVar2.f118503e -= eVar2.f118497a;
                }
                int i31 = eVar2.f118497a;
                if (fVar2.f118504f) {
                    fVar2.f118502d += i31;
                } else {
                    fVar2.f118502d -= i31;
                }
                fVar.mo49348a();
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m80834l(View view, C45338d dVar, int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.f118486s == 1) {
            i5 = getChildMeasureSpec(i, 1073741824, 0, dVar.width, false);
            i4 = getChildMeasureSpec(getHeight(), i3, 0, i2, true);
        } else {
            int childMeasureSpec = getChildMeasureSpec(i, 1073741824, 0, dVar.height, false);
            int childMeasureSpec2 = getChildMeasureSpec(getWidth(), i3, 0, i2, true);
            i4 = childMeasureSpec;
            i5 = childMeasureSpec2;
        }
        calculateItemDecorationsForChild(view, this.f118483p);
        view.measure(m80839q(i5, dVar.leftMargin + this.f118483p.left, dVar.rightMargin + this.f118483p.right), m80839q(i4, dVar.topMargin + this.f118483p.top, dVar.bottomMargin + this.f118483p.bottom));
    }

    /* renamed from: m */
    private final void m80835m(int i, C0661fw fwVar) {
        int a = this.f118468a.mo49349a(i);
        int b = this.f118468a.mo49350b(i);
        for (int i2 = b; i2 >= a; i2--) {
            removeAndRecycleViewAt(i2 - this.f118471d, fwVar);
        }
        if (i == this.f118473f) {
            int i3 = b + 1;
            this.f118471d = i3;
            this.f118473f = this.f118468a.mo49352d(i3);
        }
        if (i == this.f118481n) {
            int i4 = a - 1;
            this.f118472e = i4;
            this.f118481n = this.f118468a.mo49352d(i4);
        }
    }

    /* renamed from: n */
    private final void m80836n() {
        int a = this.f118468a.mo49349a(this.f118473f);
        this.f118471d = a;
        this.f118481n = this.f118473f;
        this.f118472e = a;
    }

    /* renamed from: o */
    private final void m80837o(C0661fw fwVar, C0670ge geVar) {
        C45340f fVar = this.f118485r;
        fVar.f118499a = fwVar;
        fVar.f118500b = geVar;
    }

    /* renamed from: p */
    private static final void m80838p(ArrayList arrayList, int i) {
        arrayList.ensureCapacity(i);
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add((Object) null);
        }
    }

    /* renamed from: q */
    private static final int m80839q(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo49340a() {
        if (getChildCount() == 0) {
            return 0;
        }
        return this.f118471d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo49341b() {
        C45341g gVar = this.f118468a;
        if (gVar == null) {
            return 0;
        }
        return gVar.f118508a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo49342c() {
        if (getChildCount() == 0) {
            return 0;
        }
        return this.f118474g;
    }

    public final boolean canScrollHorizontally() {
        if (this.f118486s == 1) {
            return mo49347h();
        }
        return true;
    }

    public final boolean canScrollVertically() {
        if (this.f118486s == 1) {
            return true;
        }
        return mo49347h();
    }

    public final boolean checkLayoutParams(C0654fp fpVar) {
        return fpVar instanceof C45338d;
    }

    public final int computeHorizontalScrollOffset(C0670ge geVar) {
        return this.f118486s == 1 ? mo49342c() : mo49340a();
    }

    public final int computeHorizontalScrollRange(C0670ge geVar) {
        return this.f118486s == 1 ? mo49343d() : mo49341b();
    }

    public final int computeVerticalScrollOffset(C0670ge geVar) {
        return this.f118486s == 1 ? mo49340a() : mo49342c();
    }

    public final int computeVerticalScrollRange(C0670ge geVar) {
        return this.f118486s == 1 ? mo49341b() : mo49343d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo49343d() {
        if (getChildCount() == 0) {
            return 0;
        }
        return m80831i() - this.f118480m.mo2848k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo49344e(int i, C0661fw fwVar, C0670ge geVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m80837o(fwVar, geVar);
        int d = this.f118479l.mo2841d(getChildAt(0));
        if (i < 0) {
            if (this.f118473f == 0) {
                i = Math.max(i, -(this.f118479l.mo2847j() - d));
            }
            int i2 = d - i;
            if (i2 > 0) {
                C45340f j = m80832j(d, i2, false);
                if (j.mo49348a()) {
                    m80833k(j);
                }
            }
            int d2 = this.f118479l.mo2841d(getChildAt(this.f118468a.mo49349a(this.f118481n) - this.f118471d));
            while (d2 - i > this.f118479l.mo2848k()) {
                m80835m(this.f118481n, fwVar);
                d2 = this.f118479l.mo2841d(getChildAt(this.f118468a.mo49349a(this.f118481n) - this.f118471d));
            }
        } else {
            int a = this.f118479l.mo2838a(getChildAt(getChildCount() - 1));
            if (this.f118472e == getItemCount() - 1) {
                i = Math.min(i, Math.max(a - this.f118479l.mo2843f(), 0));
            }
            int i3 = a - i;
            if (i3 < this.f118479l.mo2848k()) {
                C45340f j2 = m80832j(this.f118479l.mo2838a(getChildAt(getChildCount() - 1)), this.f118479l.mo2848k() - i3, true);
                if (j2.mo49348a()) {
                    m80833k(j2);
                }
            }
            int a2 = this.f118479l.mo2838a(getChildAt(this.f118468a.mo49350b(this.f118473f) - this.f118471d));
            while (a2 - i < 0) {
                m80835m(this.f118473f, fwVar);
                a2 = this.f118479l.mo2838a(getChildAt(this.f118468a.mo49350b(this.f118473f) - this.f118471d));
            }
        }
        this.f118479l.mo2851n(-i);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo49345f(int i) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int d = mo49343d();
        if (i < 0) {
            int i2 = this.f118474g;
            if (i + i2 < 0) {
                i = -i2;
                this.f118474g += i;
                this.f118480m.mo2851n(-i);
                return i;
            }
        }
        if (i > 0) {
            int i3 = this.f118474g;
            if (i + i3 > d) {
                i = d - i3;
            }
        }
        this.f118474g += i;
        this.f118480m.mo2851n(-i);
        return i;
    }

    public final View findViewByPosition(int i) {
        int i2 = this.f118471d;
        if (i < i2 || i > this.f118472e) {
            return null;
        }
        return getChildAt(i - i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo49346g(C45337c cVar, View view, int i, int i2, boolean z) {
        int i3;
        C45338d dVar = (C45338d) view.getLayoutParams();
        int[] iArr = this.f118470c;
        int i4 = cVar.f118493c;
        m80834l(view, dVar, iArr[cVar.f118494d + i4] - iArr[i4], i, 1073741824);
        int i5 = this.f118470c[cVar.f118493c] - this.f118474g;
        int c = this.f118479l.mo2840c(view) + i5;
        if (z) {
            i3 = this.f118479l.mo2839b(view) + i2;
        } else {
            i3 = i2;
            i2 -= this.f118479l.mo2839b(view);
        }
        if (this.f118486s != 1) {
            layoutDecorated(view, i2 + C2104s.m5790c(dVar), i5 - dVar.bottomMargin, i3 + C2104s.m5790c(dVar), c - dVar.bottomMargin);
        } else if (getLayoutDirection() == 1) {
            int[] iArr2 = this.f118470c;
            int i6 = iArr2[iArr2.length - 1];
            layoutDecorated(view, i6 - (c + C2104s.m5789b(dVar)), i2 + dVar.topMargin, i6 - (i5 + C2104s.m5789b(dVar)), i3 + dVar.topMargin);
        } else {
            layoutDecorated(view, i5 + C2104s.m5790c(dVar), i2 + dVar.topMargin, c + C2104s.m5790c(dVar), i3 + dVar.topMargin);
        }
        dVar.f118495a = cVar.f118494d;
        dVar.f118496b = cVar.f118492b;
    }

    public final C0654fp generateDefaultLayoutParams() {
        return new C45338d();
    }

    public final C0654fp generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C45338d(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo49347h() {
        return getChildCount() > 0 && m80831i() > this.f118480m.mo2848k();
    }

    public final void onAdapterChanged(C0640fb fbVar, C0640fb fbVar2) {
        removeAllViews();
        this.f118468a = null;
        this.f118471d = 0;
        this.f118473f = 0;
        this.f118472e = 0;
        this.f118481n = 0;
        this.f118482o = false;
        this.f118474g = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChildren(android.support.p033v7.widget.C0661fw r11, android.support.p033v7.widget.C0670ge r12) {
        /*
            r10 = this;
            com.google.android.spannedgridlayoutmanager.b r0 = r10.f118469b
            int r0 = r0.f118488a
            r1 = 1
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r10.f118470c = r0
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000f:
            com.google.android.spannedgridlayoutmanager.b r6 = r10.f118469b
            int r7 = r6.f118488a
            if (r3 >= r7) goto L_0x0022
            float[] r7 = r6.f118489b
            r7 = r7[r3]
            float r5 = r5 + r7
            int[] r6 = r6.f118490c
            r6 = r6[r3]
            int r4 = r4 + r6
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0022:
            int[] r3 = r10.f118470c
            android.support.v7.widget.eo r6 = r10.f118480m
            int r6 = r6.mo2847j()
            r3[r2] = r6
            android.support.v7.widget.eo r3 = r10.f118480m
            int r3 = r3.mo2848k()
            if (r4 >= r3) goto L_0x0038
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r5
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            r4 = 1
        L_0x003a:
            com.google.android.spannedgridlayoutmanager.b r5 = r10.f118469b
            int r6 = r5.f118488a
            if (r4 > r6) goto L_0x0068
            int r6 = r4 + -1
            float[] r7 = r5.f118489b
            r7 = r7[r6]
            float r7 = r7 * r3
            float r7 = r7 + r0
            int r0 = (int) r7
            float r8 = (float) r0
            float r8 = r7 - r8
            r9 = 1065353048(0x3f7fff58, float:0.99999)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0056
            int r0 = r0 + 1
        L_0x0056:
            float r8 = (float) r0
            float r7 = r7 - r8
            int[] r5 = r5.f118490c
            r5 = r5[r6]
            int[] r8 = r10.f118470c
            r6 = r8[r6]
            int r0 = r0 + r5
            int r6 = r6 + r0
            r8[r4] = r6
            int r4 = r4 + 1
            r0 = r7
            goto L_0x003a
        L_0x0068:
            com.google.android.spannedgridlayoutmanager.g r0 = new com.google.android.spannedgridlayoutmanager.g
            int r3 = r12.mo3052a()
            r0.<init>(r10, r11, r3)
            r10.f118468a = r0
            int r0 = r12.mo3052a()
            if (r0 != 0) goto L_0x0082
            r10.detachAndScrapAttachedViews(r11)
            r10.f118473f = r2
            r10.m80836n()
            return
        L_0x0082:
            r10.m80837o(r11, r12)
            android.support.v7.widget.eo r12 = r10.f118479l
            int r12 = r12.mo2847j()
            boolean r0 = r10.f118482o
            if (r0 == 0) goto L_0x0093
            r10.f118482o = r2
        L_0x0091:
            r0 = 0
            goto L_0x00a7
        L_0x0093:
            int r0 = r10.getChildCount()
            if (r0 == 0) goto L_0x0091
            android.support.v7.widget.eo r12 = r10.f118479l
            android.view.View r0 = r10.getChildAt(r2)
            int r12 = r12.mo2841d(r0)
            r10.m80836n()
            r0 = r12
        L_0x00a7:
            r10.detachAndScrapAttachedViews(r11)
            android.support.v7.widget.eo r11 = r10.f118479l
            int r11 = r11.mo2848k()
            int r11 = r11 - r0
            com.google.android.spannedgridlayoutmanager.f r11 = r10.m80832j(r12, r11, r1)
            android.support.v7.widget.eo r0 = r10.f118479l
            int r0 = r0.mo2845h()
            if (r0 != 0) goto L_0x00c7
            android.support.v7.widget.eo r0 = r10.f118479l
            int r0 = r0.mo2842e()
            if (r0 != 0) goto L_0x00c7
            r0 = 1
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            r11.f118506h = r0
            r10.m80833k(r11)
            int r0 = r11.f118502d
            int r3 = r11.f118503e
            if (r3 <= 0) goto L_0x00e6
            r11.f118504f = r2
            int r3 = r10.f118473f
            r11.f118501c = r3
            r11.f118502d = r12
            boolean r3 = r11.mo49348a()
            if (r3 == 0) goto L_0x00e6
            r10.m80833k(r11)
            int r12 = r11.f118502d
        L_0x00e6:
            android.support.v7.widget.ge r3 = r11.f118500b
            boolean r3 = r3.f2466k
            if (r3 == 0) goto L_0x016a
            int r3 = r10.getChildCount()
            if (r3 == 0) goto L_0x016a
            android.support.v7.widget.ge r3 = r11.f118500b
            boolean r3 = r3.f2462g
            if (r3 != 0) goto L_0x016a
            android.support.v7.widget.fw r11 = r11.f118499a
            java.util.List r11 = r11.f2434d
            int r3 = r11.size()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0103:
            if (r4 >= r3) goto L_0x0148
            java.lang.Object r7 = r11.get(r4)
            android.support.v7.widget.gh r7 = (android.support.p033v7.widget.C0673gh) r7
            android.view.View r8 = r7.itemView
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            com.google.android.spannedgridlayoutmanager.d r8 = (com.google.android.spannedgridlayoutmanager.C45338d) r8
            if (r8 == 0) goto L_0x011e
            android.support.v7.widget.gh r8 = r8.f2420c
            boolean r8 = r8.isRemoved()
            if (r8 == 0) goto L_0x011e
            goto L_0x0145
        L_0x011e:
            com.google.android.spannedgridlayoutmanager.g r8 = r10.f118468a
            int r9 = r7.getLayoutPosition()
            com.google.android.spannedgridlayoutmanager.c r8 = r8.mo49353e(r9)
            int r9 = r8.f118493c
            if (r9 != 0) goto L_0x0145
            int r8 = r8.f118491a
            int r9 = r10.f118473f
            if (r8 >= r9) goto L_0x013c
            android.support.v7.widget.eo r8 = r10.f118479l
            android.view.View r7 = r7.itemView
            int r7 = r8.mo2839b(r7)
            int r5 = r5 + r7
            goto L_0x0145
        L_0x013c:
            android.support.v7.widget.eo r8 = r10.f118479l
            android.view.View r7 = r7.itemView
            int r7 = r8.mo2839b(r7)
            int r6 = r6 + r7
        L_0x0145:
            int r4 = r4 + 1
            goto L_0x0103
        L_0x0148:
            com.google.android.spannedgridlayoutmanager.f r11 = r10.m80832j(r12, r5, r2)
            r11.f118505g = r1
            if (r5 <= 0) goto L_0x0159
            boolean r12 = r11.mo49348a()
            if (r12 == 0) goto L_0x0159
            r10.m80833k(r11)
        L_0x0159:
            com.google.android.spannedgridlayoutmanager.f r11 = r10.m80832j(r0, r6, r1)
            r11.f118505g = r1
            if (r6 <= 0) goto L_0x016a
            boolean r12 = r11.mo49348a()
            if (r12 == 0) goto L_0x016a
            r10.m80833k(r11)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.onLayoutChildren(android.support.v7.widget.fw, android.support.v7.widget.ge):void");
    }

    public final int scrollHorizontallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        return this.f118486s == 1 ? mo49345f(i) : mo49344e(i, fwVar, geVar);
    }

    public final void scrollToPosition(int i) {
        if (i >= getItemCount()) {
            i = getItemCount() - 1;
        }
        this.f118473f = this.f118468a.mo49352d(i);
        m80836n();
        this.f118482o = true;
        removeAllViews();
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        return this.f118486s == 1 ? mo49344e(i, fwVar, geVar) : mo49345f(i);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        if (i >= getItemCount()) {
            i = getItemCount() - 1;
        }
        C45335a aVar = new C45335a(this, recyclerView.getContext());
        aVar.f2449g = i;
        startSmoothScroll(aVar);
    }

    public final boolean supportsPredictiveItemAnimations() {
        return true;
    }

    public final int computeHorizontalScrollExtent(C0670ge geVar) {
        if (this.f118486s == 1) {
            return this.f118480m.mo2848k();
        }
        return getChildCount();
    }

    public final int computeVerticalScrollExtent(C0670ge geVar) {
        if (this.f118486s == 1) {
            return getChildCount();
        }
        return this.f118480m.mo2848k();
    }

    public final C0654fp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C45338d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C45338d(layoutParams);
    }
}
