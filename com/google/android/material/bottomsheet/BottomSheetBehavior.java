package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1988h;
import androidx.customview.p103b.C2149g;
import androidx.customview.p103b.C2150h;
import androidx.customview.view.AbsSavedState;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44785p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class BottomSheetBehavior extends C1770c {

    /* renamed from: A */
    float f115858A = -1.0f;

    /* renamed from: B */
    public boolean f115859B;

    /* renamed from: C */
    public boolean f115860C;

    /* renamed from: D */
    public boolean f115861D = true;

    /* renamed from: E */
    public int f115862E = 4;

    /* renamed from: F */
    public int f115863F = 4;

    /* renamed from: G */
    C2150h f115864G;

    /* renamed from: H */
    int f115865H;

    /* renamed from: I */
    int f115866I;

    /* renamed from: J */
    WeakReference f115867J;

    /* renamed from: K */
    WeakReference f115868K;

    /* renamed from: L */
    public final ArrayList f115869L = new ArrayList();

    /* renamed from: M */
    int f115870M;

    /* renamed from: N */
    boolean f115871N;

    /* renamed from: O */
    private ColorStateList f115872O;

    /* renamed from: P */
    private int f115873P = -1;

    /* renamed from: Q */
    private boolean f115874Q;

    /* renamed from: R */
    private boolean f115875R;

    /* renamed from: S */
    private C44785p f115876S;

    /* renamed from: T */
    private boolean f115877T;

    /* renamed from: U */
    private final C44558i f115878U = new C44558i(this);

    /* renamed from: V */
    private ValueAnimator f115879V;

    /* renamed from: W */
    private boolean f115880W;

    /* renamed from: X */
    private int f115881X;

    /* renamed from: Y */
    private boolean f115882Y;

    /* renamed from: Z */
    private float f115883Z = 0.1f;

    /* renamed from: a */
    private float f115884a;

    /* renamed from: aa */
    private int f115885aa;

    /* renamed from: ab */
    private VelocityTracker f115886ab;

    /* renamed from: ac */
    private int f115887ac;

    /* renamed from: ad */
    private Map f115888ad;

    /* renamed from: ae */
    private int f115889ae = -1;

    /* renamed from: af */
    private final C2149g f115890af = new C44553d(this);

    /* renamed from: b */
    private boolean f115891b;

    /* renamed from: c */
    private int f115892c;

    /* renamed from: d */
    private int f115893d;

    /* renamed from: e */
    public int f115894e = 0;

    /* renamed from: f */
    public boolean f115895f = true;

    /* renamed from: g */
    public boolean f115896g = false;

    /* renamed from: h */
    public int f115897h;

    /* renamed from: i */
    public int f115898i;

    /* renamed from: j */
    public C44779j f115899j;

    /* renamed from: k */
    public int f115900k = -1;

    /* renamed from: l */
    public int f115901l;

    /* renamed from: m */
    public boolean f115902m;

    /* renamed from: n */
    public boolean f115903n;

    /* renamed from: o */
    public boolean f115904o;

    /* renamed from: p */
    public boolean f115905p;

    /* renamed from: q */
    public boolean f115906q;

    /* renamed from: r */
    public boolean f115907r;

    /* renamed from: s */
    public boolean f115908s;

    /* renamed from: t */
    public int f115909t;

    /* renamed from: u */
    public int f115910u;

    /* renamed from: v */
    int f115911v;

    /* renamed from: w */
    int f115912w;

    /* renamed from: x */
    int f115913x;

    /* renamed from: y */
    public float f115914y = 0.5f;

    /* renamed from: z */
    int f115915z;

    public BottomSheetBehavior() {
    }

    /* renamed from: C */
    public static BottomSheetBehavior m78767C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C1773f) {
            C1770c cVar = ((C1773f) layoutParams).f5523a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: P */
    private final void m78768P() {
        this.f115913x = (int) (((float) this.f115866I) * (1.0f - this.f115914y));
    }

    /* renamed from: Q */
    private final void m78769Q() {
        this.f115870M = -1;
        VelocityTracker velocityTracker = this.f115886ab;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f115886ab = null;
        }
    }

    /* renamed from: R */
    private final void m78770R() {
        View view;
        int i;
        WeakReference weakReference = this.f115867J;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C2043bi.m5522P(view, 524288);
            C2043bi.m5522P(view, C89885b.HTTP_VALUE);
            C2043bi.m5522P(view, 1048576);
            int i2 = this.f115889ae;
            if (i2 != -1) {
                C2043bi.m5522P(view, i2);
            }
            int i3 = 6;
            if (!this.f115895f && this.f115862E != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                C44554e eVar = new C44554e(this, 6);
                List F = C2043bi.m5512F(view);
                int i4 = 0;
                while (true) {
                    if (i4 >= F.size()) {
                        int i5 = -1;
                        int i6 = 0;
                        while (true) {
                            int[] iArr = C2043bi.f5944a;
                            int length = iArr.length;
                            if (i6 >= 32 || i5 != -1) {
                                i = i5;
                            } else {
                                i5 = iArr[i6];
                                boolean z = true;
                                for (int i7 = 0; i7 < F.size(); i7++) {
                                    z &= ((C1988h) F.get(i7)).mo5148a() != i5;
                                }
                                if (true != z) {
                                    i5 = -1;
                                }
                                i6++;
                            }
                        }
                        i = i5;
                    } else if (TextUtils.equals(string, ((C1988h) F.get(i4)).mo5149b())) {
                        i = ((C1988h) F.get(i4)).mo5148a();
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i != -1) {
                    C2043bi.m5513G(view, new C1988h((Object) null, i, string, eVar, (Class) null));
                }
                this.f115889ae = i;
            }
            if (this.f115859B && this.f115862E != 5) {
                C2043bi.m5523Q(view, C1988h.f5911i, (CharSequence) null, new C44554e(this, 5));
            }
            int i8 = this.f115862E;
            if (i8 == 3) {
                if (true == this.f115895f) {
                    i3 = 4;
                }
                C2043bi.m5523Q(view, C1988h.f5910h, (CharSequence) null, new C44554e(this, i3));
            } else if (i8 == 4) {
                if (true == this.f115895f) {
                    i3 = 3;
                }
                C2043bi.m5523Q(view, C1988h.f5909g, (CharSequence) null, new C44554e(this, i3));
            } else if (i8 == 6) {
                C2043bi.m5523Q(view, C1988h.f5910h, (CharSequence) null, new C44554e(this, 4));
                C2043bi.m5523Q(view, C1988h.f5909g, (CharSequence) null, new C44554e(this, 3));
            }
        }
    }

    /* renamed from: S */
    private final void m78771S(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z2 = this.f115862E == 3 && (this.f115875R || mo47523z() == 0);
            if (this.f115877T != z2 && this.f115899j != null) {
                this.f115877T = z2;
                float f = 0.0f;
                if (!z || (valueAnimator = this.f115879V) == null) {
                    ValueAnimator valueAnimator2 = this.f115879V;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        this.f115879V.cancel();
                    }
                    C44779j jVar = this.f115899j;
                    if (true != this.f115877T) {
                        f = 1.0f;
                    }
                    jVar.mo48125W(f);
                } else if (!valueAnimator.isRunning()) {
                    if (true != z2) {
                        f = 1.0f;
                    }
                    this.f115879V.setFloatValues(new float[]{1.0f - f, f});
                    this.f115879V.start();
                } else {
                    this.f115879V.reverse();
                }
            }
        }
    }

    /* renamed from: T */
    private final void m78772T(boolean z) {
        Map map;
        WeakReference weakReference = this.f115867J;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f115888ad == null) {
                        this.f115888ad = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f115867J.get()) {
                        if (z) {
                            this.f115888ad.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f115896g) {
                                C2043bi.m5551ae(childAt, 4);
                            }
                        } else if (this.f115896g && (map = this.f115888ad) != null && map.containsKey(childAt)) {
                            C2043bi.m5551ae(childAt, ((Integer) this.f115888ad.get(childAt)).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f115888ad = null;
                } else if (this.f115896g) {
                    ((View) this.f115867J.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* renamed from: U */
    private final boolean m78773U() {
        if (this.f115864G != null) {
            return this.f115861D || this.f115862E == 1;
        }
        return false;
    }

    /* renamed from: V */
    private static final int m78774V(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, LinearLayoutManager.INVALID_OFFSET);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f115901l;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m78775s() {
        /*
            r3 = this;
            boolean r0 = r3.f115891b
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f115892c
            int r1 = r3.f115866I
            int r2 = r3.f115865H
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.f115885aa
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f115909t
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f115902m
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f115903n
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f115901l
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f115898i
            int r2 = r3.f115893d
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f115898i
            int r1 = r3.f115909t
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m78775s():int");
    }

    /* renamed from: t */
    private final void m78776t() {
        int s = m78775s();
        if (this.f115895f) {
            this.f115915z = Math.max(this.f115866I - s, this.f115912w);
        } else {
            this.f115915z = this.f115866I - s;
        }
    }

    /* renamed from: A */
    public final int mo47504A() {
        if (this.f115891b) {
            return -1;
        }
        return this.f115898i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final View mo47505B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (C2043bi.m5571ay(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View B = mo47505B(viewGroup.getChildAt(i));
                if (B != null) {
                    return B;
                }
            }
        }
        return null;
    }

    /* renamed from: D */
    public final void mo47506D(C44555f fVar) {
        if (!this.f115869L.contains(fVar)) {
            this.f115869L.add(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo47507E(int i) {
        float f;
        float f2;
        View view = (View) this.f115867J.get();
        if (view != null && !this.f115869L.isEmpty()) {
            int i2 = this.f115915z;
            if (i > i2 || i2 == mo47523z()) {
                int i3 = this.f115915z;
                f = (float) (i3 - i);
                f2 = (float) (this.f115866I - i3);
            } else {
                int i4 = this.f115915z;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo47523z());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f115869L.size(); i5++) {
                ((C44555f) this.f115869L.get(i5)).mo32311a(view, f3);
            }
        }
    }

    @Deprecated
    /* renamed from: F */
    public final void mo47508F(C44555f fVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f115869L.clear();
        if (fVar != null) {
            this.f115869L.add(fVar);
        }
    }

    /* renamed from: G */
    public final void mo47509G(int i) {
        if (i >= 0) {
            this.f115911v = i;
            m78771S(this.f115862E, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: H */
    public final void mo47510H(boolean z) {
        int i;
        if (this.f115895f != z) {
            this.f115895f = z;
            if (this.f115867J != null) {
                m78776t();
            }
            if (!this.f115895f || this.f115862E != 6) {
                i = this.f115862E;
            } else {
                i = 3;
            }
            mo47512J(i);
            m78771S(this.f115862E, true);
            m78770R();
        }
    }

    /* renamed from: I */
    public final void mo47511I(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f115914y = f;
        if (this.f115867J != null) {
            m78768P();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (r8 == 4) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0028  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47512J(int r8) {
        /*
            r7 = this;
            int r0 = r7.f115862E
            if (r0 != r8) goto L_0x0005
            return
        L_0x0005:
            r7.f115862E = r8
            r0 = 6
            r1 = 3
            r2 = 5
            r3 = 4
            if (r8 == r3) goto L_0x0018
            if (r8 == r1) goto L_0x0018
            if (r8 == r0) goto L_0x0018
            boolean r4 = r7.f115859B
            if (r4 == 0) goto L_0x001a
            if (r8 != r2) goto L_0x001a
            r8 = 5
        L_0x0018:
            r7.f115863F = r8
        L_0x001a:
            java.lang.ref.WeakReference r4 = r7.f115867J
            if (r4 != 0) goto L_0x001f
            return
        L_0x001f:
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x0028
            return
        L_0x0028:
            r5 = 0
            r6 = 1
            if (r8 != r1) goto L_0x0030
            r7.m78772T(r6)
            goto L_0x003c
        L_0x0030:
            if (r8 == r0) goto L_0x0037
            if (r8 == r2) goto L_0x0037
            if (r8 != r3) goto L_0x003c
            goto L_0x0038
        L_0x0037:
            r3 = r8
        L_0x0038:
            r7.m78772T(r5)
            r8 = r3
        L_0x003c:
            r7.m78771S(r8, r6)
        L_0x003f:
            java.util.ArrayList r0 = r7.f115869L
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x0055
            java.util.ArrayList r0 = r7.f115869L
            java.lang.Object r0 = r0.get(r5)
            com.google.android.material.bottomsheet.f r0 = (com.google.android.material.bottomsheet.C44555f) r0
            r0.mo32312b(r4, r8)
            int r5 = r5 + 1
            goto L_0x003f
        L_0x0055:
            r7.m78770R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo47512J(int):void");
    }

    /* renamed from: L */
    public final boolean mo47514L() {
        return this.f115859B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo47515M(View view, float f) {
        if (this.f115860C) {
            return true;
        }
        if (view.getTop() < this.f115915z) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.f115883Z)) - ((float) this.f115915z)) / ((float) m78775s()) > 0.5f;
    }

    /* renamed from: O */
    public final void mo47517O() {
        View view;
        if (this.f115867J != null) {
            m78776t();
            if (this.f115862E == 4 && (view = (View) this.f115867J.get()) != null) {
                view.requestLayout();
            }
        }
    }

    /* renamed from: a */
    public final void mo4953a(C1773f fVar) {
        this.f115867J = null;
        this.f115864G = null;
    }

    /* renamed from: c */
    public final void mo4955c() {
        this.f115867J = null;
        this.f115864G = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r4.getTop() <= r2.f115913x) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (java.lang.Math.abs(r3 - r2.f115912w) < java.lang.Math.abs(r3 - r2.f115915z)) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (mo47521x() != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f115915z)) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if (java.lang.Math.abs(r3 - r2.f115913x) < java.lang.Math.abs(r3 - r2.f115915z)) goto L_0x002e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4956d(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.mo47523z()
            r0 = 3
            if (r3 == r6) goto L_0x00bb
            java.lang.ref.WeakReference r3 = r2.f115868K
            if (r3 == 0) goto L_0x00ba
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00ba
            boolean r3 = r2.f115882Y
            if (r3 != 0) goto L_0x001b
            goto L_0x00ba
        L_0x001b:
            int r3 = r2.f115881X
            r5 = 6
            if (r3 <= 0) goto L_0x0031
            boolean r3 = r2.f115895f
            if (r3 == 0) goto L_0x0026
            goto L_0x00b4
        L_0x0026:
            int r3 = r4.getTop()
            int r6 = r2.f115913x
            if (r3 <= r6) goto L_0x00b4
        L_0x002e:
            r0 = 6
            goto L_0x00b4
        L_0x0031:
            boolean r3 = r2.f115859B
            if (r3 == 0) goto L_0x0052
            android.view.VelocityTracker r3 = r2.f115886ab
            if (r3 != 0) goto L_0x003b
            r3 = 0
            goto L_0x004a
        L_0x003b:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f115884a
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f115886ab
            int r6 = r2.f115870M
            float r3 = r3.getYVelocity(r6)
        L_0x004a:
            boolean r3 = r2.mo47515M(r4, r3)
            if (r3 == 0) goto L_0x0052
            r0 = 5
            goto L_0x00b4
        L_0x0052:
            int r3 = r2.f115881X
            r6 = 4
            if (r3 != 0) goto L_0x0097
            int r3 = r4.getTop()
            boolean r1 = r2.f115895f
            if (r1 == 0) goto L_0x0071
            int r5 = r2.f115912w
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f115915z
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x009b
            goto L_0x00b4
        L_0x0071:
            int r1 = r2.f115913x
            if (r3 >= r1) goto L_0x0087
            int r1 = r2.f115915z
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0080
            goto L_0x00b4
        L_0x0080:
            boolean r3 = r2.mo47521x()
            if (r3 == 0) goto L_0x002e
            goto L_0x009b
        L_0x0087:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f115915z
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x009b
            goto L_0x002e
        L_0x0097:
            boolean r3 = r2.f115895f
            if (r3 == 0) goto L_0x009d
        L_0x009b:
            r0 = 4
            goto L_0x00b4
        L_0x009d:
            int r3 = r4.getTop()
            int r0 = r2.f115913x
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f115915z
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x009b
            goto L_0x002e
        L_0x00b4:
            r3 = 0
            r2.mo47513K(r4, r0, r3)
            r2.f115882Y = r3
        L_0x00ba:
            return
        L_0x00bb:
            r2.mo47512J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo4956d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4958f(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f115861D
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0018
            r9.m78769Q()
            r0 = 0
        L_0x0018:
            android.view.VelocityTracker r3 = r9.f115886ab
            if (r3 != 0) goto L_0x0022
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f115886ab = r3
        L_0x0022:
            android.view.VelocityTracker r3 = r9.f115886ab
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003d
            if (r0 == r1) goto L_0x0032
            r11 = 3
            if (r0 == r11) goto L_0x0032
            goto L_0x0080
        L_0x0032:
            r9.f115871N = r2
            r9.f115870M = r4
            boolean r11 = r9.f115880W
            if (r11 == 0) goto L_0x0080
            r9.f115880W = r2
            return r2
        L_0x003d:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f115887ac = r7
            int r7 = r9.f115862E
            if (r7 == r5) goto L_0x006f
            java.lang.ref.WeakReference r7 = r9.f115868K
            if (r7 == 0) goto L_0x0058
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0059
        L_0x0058:
            r7 = r3
        L_0x0059:
            if (r7 == 0) goto L_0x006f
            int r8 = r9.f115887ac
            boolean r7 = r10.mo4928l(r7, r6, r8)
            if (r7 == 0) goto L_0x006f
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f115870M = r7
            r9.f115871N = r1
        L_0x006f:
            int r7 = r9.f115870M
            if (r7 != r4) goto L_0x007d
            int r4 = r9.f115887ac
            boolean r11 = r10.mo4928l(r11, r6, r4)
            if (r11 != 0) goto L_0x007d
            r11 = 1
            goto L_0x007e
        L_0x007d:
            r11 = 0
        L_0x007e:
            r9.f115880W = r11
        L_0x0080:
            boolean r11 = r9.f115880W
            if (r11 != 0) goto L_0x0090
            androidx.customview.b.h r11 = r9.f115864G
            if (r11 == 0) goto L_0x0090
            boolean r11 = r11.mo5412i(r12)
            if (r11 != 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            return r1
        L_0x0090:
            java.lang.ref.WeakReference r11 = r9.f115868K
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x009b:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f115880W
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f115862E
            if (r11 == r1) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo4928l(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            androidx.customview.b.h r10 = r9.f115864G
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f115887ac
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            androidx.customview.b.h r11 = r9.f115864G
            int r11 = r11.f6093b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            return r1
        L_0x00d1:
            return r2
        L_0x00d2:
            r9.f115880W = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo4958f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4959g(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
        /*
            r5 = this;
            boolean r0 = androidx.core.p098j.C2043bi.m5564ar(r6)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.p098j.C2043bi.m5564ar(r7)
            if (r0 != 0) goto L_0x0010
            r7.setFitsSystemWindows(r1)
        L_0x0010:
            java.lang.ref.WeakReference r0 = r5.f115867J
            r2 = 0
            if (r0 != 0) goto L_0x0083
            android.content.res.Resources r0 = r6.getResources()
            r3 = 2131167314(0x7f070852, float:1.7948898E38)
            int r0 = r0.getDimensionPixelSize(r3)
            r5.f115892c = r0
            boolean r0 = r5.f115902m
            if (r0 != 0) goto L_0x002c
            boolean r0 = r5.f115891b
            if (r0 != 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            boolean r3 = r5.f115903n
            if (r3 != 0) goto L_0x0048
            boolean r3 = r5.f115904o
            if (r3 != 0) goto L_0x0048
            boolean r3 = r5.f115905p
            if (r3 != 0) goto L_0x0048
            boolean r3 = r5.f115906q
            if (r3 != 0) goto L_0x0048
            boolean r3 = r5.f115907r
            if (r3 != 0) goto L_0x0048
            boolean r3 = r5.f115908s
            if (r3 != 0) goto L_0x0048
            if (r0 == 0) goto L_0x0050
            r0 = 1
        L_0x0048:
            com.google.android.material.bottomsheet.c r3 = new com.google.android.material.bottomsheet.c
            r3.<init>(r5, r0)
            com.google.android.material.internal.C44741bm.m79313f(r7, r3)
        L_0x0050:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r7)
            r5.f115867J = r0
            com.google.android.material.l.j r0 = r5.f115899j
            if (r0 == 0) goto L_0x0070
            androidx.core.p098j.C2043bi.m5530X(r7, r0)
            com.google.android.material.l.j r0 = r5.f115899j
            float r3 = r5.f115858A
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x006c
            float r3 = androidx.core.p098j.C2043bi.m5533a(r7)
        L_0x006c:
            r0.mo48123U(r3)
            goto L_0x0077
        L_0x0070:
            android.content.res.ColorStateList r0 = r5.f115872O
            if (r0 == 0) goto L_0x0077
            androidx.core.p098j.C2043bi.m5531Y(r7, r0)
        L_0x0077:
            r5.m78770R()
            int r0 = androidx.core.p098j.C2043bi.m5575d(r7)
            if (r0 != 0) goto L_0x0083
            androidx.core.p098j.C2043bi.m5551ae(r7, r1)
        L_0x0083:
            androidx.customview.b.h r0 = r5.f115864G
            if (r0 != 0) goto L_0x008f
            androidx.customview.b.g r0 = r5.f115890af
            androidx.customview.b.h r0 = androidx.customview.p103b.C2150h.m5963b(r6, r0)
            r5.f115864G = r0
        L_0x008f:
            int r0 = r7.getTop()
            r6.mo4927k(r7, r8)
            int r8 = r6.getWidth()
            r5.f115865H = r8
            int r6 = r6.getHeight()
            r5.f115866I = r6
            int r6 = r7.getHeight()
            r5.f115885aa = r6
            int r8 = r5.f115866I
            int r3 = r5.f115910u
            int r4 = r8 - r6
            if (r4 >= r3) goto L_0x00bc
            boolean r6 = r5.f115874Q
            if (r6 == 0) goto L_0x00b8
            r5.f115885aa = r8
            r6 = r8
            goto L_0x00bc
        L_0x00b8:
            int r6 = r8 - r3
            r5.f115885aa = r6
        L_0x00bc:
            int r8 = r8 - r6
            int r6 = java.lang.Math.max(r2, r8)
            r5.f115912w = r6
            r5.m78768P()
            r5.m78776t()
            int r6 = r5.f115862E
            r8 = 3
            if (r6 != r8) goto L_0x00d6
            int r6 = r5.mo47523z()
            androidx.core.p098j.C2043bi.m5517K(r7, r6)
            goto L_0x0102
        L_0x00d6:
            r8 = 6
            if (r6 != r8) goto L_0x00df
            int r6 = r5.f115913x
            androidx.core.p098j.C2043bi.m5517K(r7, r6)
            goto L_0x0102
        L_0x00df:
            boolean r8 = r5.f115859B
            if (r8 == 0) goto L_0x00ec
            r8 = 5
            if (r6 != r8) goto L_0x00ec
            int r6 = r5.f115866I
            androidx.core.p098j.C2043bi.m5517K(r7, r6)
            goto L_0x0102
        L_0x00ec:
            r8 = 4
            if (r6 != r8) goto L_0x00f5
            int r6 = r5.f115915z
            androidx.core.p098j.C2043bi.m5517K(r7, r6)
            goto L_0x0102
        L_0x00f5:
            if (r6 == r1) goto L_0x00fa
            r8 = 2
            if (r6 != r8) goto L_0x0102
        L_0x00fa:
            int r6 = r7.getTop()
            int r0 = r0 - r6
            androidx.core.p098j.C2043bi.m5517K(r7, r0)
        L_0x0102:
            int r6 = r5.f115862E
            r5.m78771S(r6, r2)
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            android.view.View r8 = r5.mo47505B(r7)
            r6.<init>(r8)
            r5.f115868K = r6
        L_0x0112:
            java.util.ArrayList r6 = r5.f115869L
            int r6 = r6.size()
            if (r2 >= r6) goto L_0x0128
            java.util.ArrayList r6 = r5.f115869L
            java.lang.Object r6 = r6.get(r2)
            com.google.android.material.bottomsheet.f r6 = (com.google.android.material.bottomsheet.C44555f) r6
            r6.mo47531d(r7)
            int r2 = r2 + 1
            goto L_0x0112
        L_0x0128:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo4959g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* renamed from: h */
    public boolean mo4960h(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference = this.f115868K;
        return (weakReference == null || view2 != weakReference.get() || this.f115862E == 3) ? false : true;
    }

    /* renamed from: j */
    public boolean mo4962j(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.f115881X = 0;
        this.f115882Y = false;
        return (i & 2) != 0;
    }

    /* renamed from: k */
    public boolean mo4963k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f115862E == 1 && actionMasked == 0) {
            return true;
        }
        if (m78773U()) {
            this.f115864G.mo5408e(motionEvent);
        }
        if (actionMasked == 0) {
            m78769Q();
        }
        if (this.f115886ab == null) {
            this.f115886ab = VelocityTracker.obtain();
        }
        this.f115886ab.addMovement(motionEvent);
        if (m78773U() && actionMasked == 2 && !this.f115880W) {
            float abs = Math.abs(((float) this.f115887ac) - motionEvent.getY());
            C2150h hVar = this.f115864G;
            if (abs > ((float) hVar.f6093b)) {
                hVar.mo5407d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        if (!this.f115880W) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo4965m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m78774V(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f115900k, marginLayoutParams.width), m78774V(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f115873P, marginLayoutParams.height));
        return true;
    }

    /* renamed from: o */
    public final void mo4967o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
        if (i2 != 1) {
            WeakReference weakReference = this.f115868K;
            if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = view.getTop();
                int i3 = top - i;
                if (i > 0) {
                    if (i3 < mo47523z()) {
                        int z = top - mo47523z();
                        iArr[1] = z;
                        C2043bi.m5517K(view, -z);
                        mo47512J(3);
                    } else if (this.f115861D) {
                        iArr[1] = i;
                        C2043bi.m5517K(view, -i);
                        mo47512J(1);
                    } else {
                        return;
                    }
                } else if (i < 0 && !view2.canScrollVertically(-1)) {
                    int i4 = this.f115915z;
                    if (i3 > i4 && !mo47514L()) {
                        int i5 = top - i4;
                        iArr[1] = i5;
                        C2043bi.m5517K(view, -i5);
                        mo47512J(4);
                    } else if (this.f115861D) {
                        iArr[1] = i;
                        C2043bi.m5517K(view, -i);
                        mo47512J(1);
                    } else {
                        return;
                    }
                }
                mo47507E(view.getTop());
                this.f115881X = i;
                this.f115882Y = true;
            }
        }
    }

    /* renamed from: p */
    public final void mo4968p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    /* renamed from: q */
    public final void mo4969q(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f115894e;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f115898i = savedState.f115917b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f115895f = savedState.f115918e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f115859B = savedState.f115919f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f115860C = savedState.f115920g;
            }
        }
        int i2 = savedState.f115916a;
        if (i2 == 1 || i2 == 2) {
            this.f115862E = 4;
            this.f115863F = 4;
            return;
        }
        this.f115862E = i2;
        this.f115863F = i2;
    }

    /* renamed from: r */
    public final Parcelable mo4970r(View view) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, this);
    }

    /* renamed from: u */
    public void mo47518u(boolean z) {
        if (this.f115859B != z) {
            this.f115859B = z;
            if (!z && this.f115862E == 5) {
                mo47519v(4);
            }
            m78770R();
        }
    }

    /* renamed from: v */
    public void mo47519v(int i) {
        if (i == 1 || i == 2) {
            String str = i == 1 ? "DRAGGING" : "SETTLING";
            throw new IllegalArgumentException("STATE_" + str + " should not be set externally.");
        } else if (this.f115859B || i != 5) {
            int i2 = (i != 6 || !this.f115895f || this.f115913x > this.f115912w) ? i : 3;
            WeakReference weakReference = this.f115867J;
            if (weakReference == null || weakReference.get() == null) {
                mo47512J(i);
                return;
            }
            View view = (View) this.f115867J.get();
            C44550a aVar = new C44550a(this, view, i2);
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C2043bi.m5569aw(view)) {
                aVar.run();
            } else {
                view.post(aVar);
            }
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
        }
    }

    /* renamed from: w */
    public boolean mo47520w(long j, float f) {
        return false;
    }

    /* renamed from: x */
    public boolean mo47521x() {
        return false;
    }

    /* renamed from: y */
    public boolean mo47522y() {
        return true;
    }

    /* renamed from: z */
    public final int mo47523z() {
        if (this.f115895f) {
            return this.f115912w;
        }
        return Math.max(this.f115911v, this.f115874Q ? 0 : this.f115910u);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f115893d = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44570u.f115966a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f115872O = C44694d.m79230b(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f115876S = new C44785p(C44785p.m79428e(context, attributeSet, R.attr.bottomSheetStyle, 2132151247));
        }
        if (this.f115876S != null) {
            C44779j jVar = new C44779j(this.f115876S);
            this.f115899j = jVar;
            jVar.mo48121S(context);
            ColorStateList colorStateList = this.f115872O;
            if (colorStateList != null) {
                this.f115899j.mo48124V(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f115899j.setTintList(ColorStateList.valueOf(typedValue.data));
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f115879V = ofFloat;
        ofFloat.setDuration(500);
        this.f115879V.addUpdateListener(new C44551b(this));
        this.f115858A = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f115900k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f115873P = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || peekValue.data != -1) {
            mo47516N(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            mo47516N(peekValue.data);
        }
        mo47518u(obtainStyledAttributes.getBoolean(8, false));
        this.f115902m = obtainStyledAttributes.getBoolean(13, false);
        mo47510H(obtainStyledAttributes.getBoolean(6, true));
        this.f115860C = obtainStyledAttributes.getBoolean(12, false);
        this.f115861D = obtainStyledAttributes.getBoolean(4, true);
        this.f115894e = obtainStyledAttributes.getInt(10, 0);
        mo47511I(obtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo47509G(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        } else {
            mo47509G(peekValue2.data);
        }
        this.f115897h = obtainStyledAttributes.getInt(11, 500);
        this.f115903n = obtainStyledAttributes.getBoolean(17, false);
        this.f115904o = obtainStyledAttributes.getBoolean(18, false);
        this.f115905p = obtainStyledAttributes.getBoolean(19, false);
        this.f115874Q = obtainStyledAttributes.getBoolean(20, true);
        this.f115906q = obtainStyledAttributes.getBoolean(14, false);
        this.f115907r = obtainStyledAttributes.getBoolean(15, false);
        this.f115908s = obtainStyledAttributes.getBoolean(16, false);
        this.f115875R = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f115884a = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: N */
    public final void mo47516N(int i) {
        if (i == -1) {
            if (!this.f115891b) {
                this.f115891b = true;
            } else {
                return;
            }
        } else if (this.f115891b || this.f115898i != i) {
            this.f115891b = false;
            this.f115898i = Math.max(0, i);
        } else {
            return;
        }
        mo47517O();
    }

    /* renamed from: K */
    public final void mo47513K(View view, int i, boolean z) {
        int i2;
        if (i == 3) {
            i2 = mo47523z();
        } else if (i == 4) {
            i2 = this.f115915z;
        } else if (i == 5) {
            i2 = this.f115866I;
        } else if (i == 6) {
            i2 = this.f115913x;
        } else {
            throw new IllegalArgumentException("Invalid state to get top offset: " + i);
        }
        C2150h hVar = this.f115864G;
        if (hVar == null || (!z ? !hVar.mo5413j(view, view.getLeft(), i2) : !hVar.mo5411h(view.getLeft(), i2))) {
            mo47512J(i);
            return;
        }
        mo47512J(2);
        m78771S(i, true);
        this.f115878U.mo47536a(i);
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C44556g();

        /* renamed from: a */
        final int f115916a;

        /* renamed from: b */
        int f115917b;

        /* renamed from: e */
        boolean f115918e;

        /* renamed from: f */
        boolean f115919f;

        /* renamed from: g */
        boolean f115920g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f115916a = parcel.readInt();
            this.f115917b = parcel.readInt();
            boolean z = false;
            this.f115918e = parcel.readInt() == 1;
            this.f115919f = parcel.readInt() == 1;
            this.f115920g = parcel.readInt() == 1 ? true : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeInt(this.f115916a);
            parcel.writeInt(this.f115917b);
            parcel.writeInt(this.f115918e ? 1 : 0);
            parcel.writeInt(this.f115919f ? 1 : 0);
            parcel.writeInt(this.f115920g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f115916a = bottomSheetBehavior.f115862E;
            this.f115917b = bottomSheetBehavior.f115898i;
            this.f115918e = bottomSheetBehavior.f115895f;
            this.f115919f = bottomSheetBehavior.f115859B;
            this.f115920g = bottomSheetBehavior.f115860C;
        }
    }
}
