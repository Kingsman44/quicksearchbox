package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1973h;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1989i;
import androidx.core.p098j.p099a.C1991k;
import androidx.viewpager.widget.C4268a;
import androidx.viewpager.widget.C4273f;
import androidx.viewpager.widget.ViewPager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3515l.C44780k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C4273f
/* compiled from: PG */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: C */
    private static final int f117165C = 2132151253;

    /* renamed from: D */
    private static final C1971f f117166D = new C1973h(16);

    /* renamed from: A */
    public final ArrayList f117167A;

    /* renamed from: B */
    public ViewPager f117168B;

    /* renamed from: E */
    private C44909l f117169E;

    /* renamed from: F */
    private int f117170F;

    /* renamed from: G */
    private final int f117171G;

    /* renamed from: H */
    private final int f117172H;

    /* renamed from: I */
    private final int f117173I;

    /* renamed from: J */
    private int f117174J;

    /* renamed from: K */
    private C44904g f117175K;

    /* renamed from: L */
    private ValueAnimator f117176L;

    /* renamed from: M */
    private C4268a f117177M;

    /* renamed from: N */
    private DataSetObserver f117178N;

    /* renamed from: O */
    private C44910m f117179O;

    /* renamed from: P */
    private C44903f f117180P;

    /* renamed from: Q */
    private boolean f117181Q;

    /* renamed from: R */
    private final C1971f f117182R;

    /* renamed from: a */
    public final ArrayList f117183a;

    /* renamed from: b */
    final C44908k f117184b;

    /* renamed from: c */
    int f117185c;

    /* renamed from: d */
    int f117186d;

    /* renamed from: e */
    int f117187e;

    /* renamed from: f */
    int f117188f;

    /* renamed from: g */
    int f117189g;

    /* renamed from: h */
    ColorStateList f117190h;

    /* renamed from: i */
    ColorStateList f117191i;

    /* renamed from: j */
    ColorStateList f117192j;

    /* renamed from: k */
    Drawable f117193k;

    /* renamed from: l */
    PorterDuff.Mode f117194l;

    /* renamed from: m */
    float f117195m;

    /* renamed from: n */
    float f117196n;

    /* renamed from: o */
    final int f117197o;

    /* renamed from: p */
    int f117198p;

    /* renamed from: q */
    int f117199q;

    /* renamed from: r */
    int f117200r;

    /* renamed from: s */
    int f117201s;

    /* renamed from: t */
    int f117202t;

    /* renamed from: u */
    boolean f117203u;

    /* renamed from: v */
    boolean f117204v;

    /* renamed from: w */
    int f117205w;

    /* renamed from: x */
    boolean f117206x;

    /* renamed from: y */
    public C44901d f117207y;

    /* renamed from: z */
    public final TimeInterpolator f117208z;

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: o */
    private final int m79686o(int i, float f) {
        View childAt;
        int i2 = this.f117202t;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f117184b.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        View childAt2 = i4 < this.f117184b.getChildCount() ? this.f117184b.getChildAt(i4) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return C2043bi.m5577f(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: p */
    private final int m79687p() {
        int i = this.f117171G;
        if (i != -1) {
            return i;
        }
        int i2 = this.f117202t;
        if (i2 == 0 || i2 == 2) {
            return this.f117173I;
        }
        return 0;
    }

    /* renamed from: q */
    private final void m79688q(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            C44909l c = mo48407c();
            CharSequence charSequence = tabItem.f117162a;
            if (charSequence != null) {
                c.mo48444d(charSequence);
            }
            Drawable drawable = tabItem.f117163b;
            if (drawable != null) {
                c.mo48443c(drawable);
            }
            int i = tabItem.f117164c;
            if (i != 0) {
                c.f117224e = LayoutInflater.from(c.f117227h.getContext()).inflate(i, c.f117227h, false);
                c.mo48442b();
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                c.f117222c = tabItem.getContentDescription();
                c.mo48442b();
            }
            mo48409e(c, this.f117183a.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: r */
    private final void m79689r(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C2043bi.m5570ax(this)) {
                C44908k kVar = this.f117184b;
                int childCount = kVar.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    if (kVar.getChildAt(i2).getWidth() > 0) {
                        i2++;
                    }
                }
                int scrollX = getScrollX();
                int o = m79686o(i, 0.0f);
                if (scrollX != o) {
                    if (this.f117176L == null) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        this.f117176L = valueAnimator;
                        valueAnimator.setInterpolator(this.f117208z);
                        this.f117176L.setDuration((long) this.f117200r);
                        this.f117176L.addUpdateListener(new C44902e(this));
                    }
                    this.f117176L.setIntValues(new int[]{scrollX, o});
                    this.f117176L.start();
                }
                C44908k kVar2 = this.f117184b;
                int i3 = this.f117200r;
                ValueAnimator valueAnimator2 = kVar2.f117218a;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    kVar2.f117218a.cancel();
                }
                kVar2.mo48437d(true, i, i3);
                return;
            }
            mo48418m(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0 != 2) goto L_0x0050;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m79690s() {
        /*
            r4 = this;
            int r0 = r4.f117202t
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = 0
            goto L_0x0014
        L_0x000b:
            int r0 = r4.f117174J
            int r3 = r4.f117185c
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            com.google.android.material.tabs.k r3 = r4.f117184b
            androidx.core.p098j.C2043bi.m5556aj(r3, r0, r2, r2, r2)
            int r0 = r4.f117202t
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 == r3) goto L_0x0025
            if (r0 == r1) goto L_0x0025
            goto L_0x0050
        L_0x0025:
            int r0 = r4.f117199q
            if (r0 != r1) goto L_0x002e
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L_0x002e:
            com.google.android.material.tabs.k r0 = r4.f117184b
            r0.setGravity(r3)
            goto L_0x0050
        L_0x0034:
            int r0 = r4.f117199q
            if (r0 == 0) goto L_0x0043
            if (r0 == r3) goto L_0x003d
            if (r0 == r1) goto L_0x0048
            goto L_0x0050
        L_0x003d:
            com.google.android.material.tabs.k r0 = r4.f117184b
            r0.setGravity(r3)
            goto L_0x0050
        L_0x0043:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L_0x0048:
            com.google.android.material.tabs.k r0 = r4.f117184b
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L_0x0050:
            r4.mo48417l(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.m79690s():void");
    }

    /* renamed from: t */
    private final void m79691t(int i) {
        int childCount = this.f117184b.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f117184b.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: v */
    private final boolean m79693v() {
        int i = this.f117202t;
        return i == 0 || i == 2;
    }

    /* renamed from: a */
    public final int mo48401a() {
        C44909l lVar = this.f117169E;
        if (lVar != null) {
            return lVar.f117223d;
        }
        return -1;
    }

    public final void addView(View view) {
        m79688q(view);
    }

    /* renamed from: b */
    public final C44909l mo48406b(int i) {
        if (i < 0 || i >= this.f117183a.size()) {
            return null;
        }
        return (C44909l) this.f117183a.get(i);
    }

    /* renamed from: c */
    public final C44909l mo48407c() {
        C44909l lVar = (C44909l) f117166D.mo5126a();
        if (lVar == null) {
            lVar = new C44909l();
        }
        lVar.f117226g = this;
        C1971f fVar = this.f117182R;
        C44912o oVar = fVar != null ? (C44912o) fVar.mo5126a() : null;
        if (oVar == null) {
            oVar = new C44912o(this, getContext());
        }
        oVar.mo48446a(lVar);
        oVar.setFocusable(true);
        oVar.setMinimumWidth(m79687p());
        if (TextUtils.isEmpty(lVar.f117222c)) {
            oVar.setContentDescription(lVar.f117221b);
        } else {
            oVar.setContentDescription(lVar.f117222c);
        }
        lVar.f117227h = oVar;
        if (lVar.f117228i != -1) {
            lVar.f117227h.setId(0);
        }
        return lVar;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo48408d(C44904g gVar) {
        if (!this.f117167A.contains(gVar)) {
            this.f117167A.add(gVar);
        }
    }

    /* renamed from: e */
    public final void mo48409e(C44909l lVar, boolean z) {
        int size = this.f117183a.size();
        if (lVar.f117226g == this) {
            lVar.f117223d = size;
            this.f117183a.add(size, lVar);
            int size2 = this.f117183a.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                ((C44909l) this.f117183a.get(size)).f117223d = size;
            }
            C44912o oVar = lVar.f117227h;
            oVar.setSelected(false);
            oVar.setActivated(false);
            C44908k kVar = this.f117184b;
            int i = lVar.f117223d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            m79692u(layoutParams);
            kVar.addView(oVar, i, layoutParams);
            if (z) {
                lVar.mo48441a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo48410f() {
        int a;
        mo48411g();
        C4268a aVar = this.f117177M;
        if (aVar != null) {
            int k = aVar.mo9175k();
            for (int i = 0; i < k; i++) {
                C44909l c = mo48407c();
                c.mo48444d(this.f117177M.mo9177m(i));
                mo48409e(c, false);
            }
            ViewPager viewPager = this.f117168B;
            if (viewPager != null && k > 0 && (a = viewPager.mo9122a()) != mo48401a() && a < this.f117183a.size()) {
                mo48413h(mo48406b(a), true);
            }
        }
    }

    /* renamed from: g */
    public final void mo48411g() {
        for (int childCount = this.f117184b.getChildCount() - 1; childCount >= 0; childCount--) {
            C44912o oVar = (C44912o) this.f117184b.getChildAt(childCount);
            this.f117184b.removeViewAt(childCount);
            if (oVar != null) {
                oVar.mo48446a((C44909l) null);
                oVar.setSelected(false);
                this.f117182R.mo5127b(oVar);
            }
            requestLayout();
        }
        Iterator it = this.f117183a.iterator();
        while (it.hasNext()) {
            C44909l lVar = (C44909l) it.next();
            it.remove();
            lVar.f117226g = null;
            lVar.f117227h = null;
            lVar.f117220a = null;
            lVar.f117228i = -1;
            lVar.f117221b = null;
            lVar.f117222c = null;
            lVar.f117223d = -1;
            lVar.f117224e = null;
            f117166D.mo5127b(lVar);
        }
        this.f117169E = null;
    }

    /* renamed from: h */
    public final void mo48413h(C44909l lVar, boolean z) {
        C44909l lVar2 = this.f117169E;
        if (lVar2 != lVar) {
            int i = lVar != null ? lVar.f117223d : -1;
            if (z) {
                if ((lVar2 == null || lVar2.f117223d == -1) && i != -1) {
                    mo48418m(i);
                } else {
                    m79689r(i);
                }
                if (i != -1) {
                    m79691t(i);
                }
            }
            this.f117169E = lVar;
            if (lVar2 != null) {
                for (int size = this.f117167A.size() - 1; size >= 0; size--) {
                    ((C44904g) this.f117167A.get(size)).mo18260c();
                }
            }
            if (lVar != null) {
                for (int size2 = this.f117167A.size() - 1; size2 >= 0; size2--) {
                    ((C44904g) this.f117167A.get(size2)).mo18258a(lVar);
                }
            }
        } else if (lVar2 != null) {
            for (int size3 = this.f117167A.size() - 1; size3 >= 0; size3--) {
                ((C44904g) this.f117167A.get(size3)).mo18259b();
            }
            m79689r(lVar.f117223d);
        }
    }

    /* renamed from: i */
    public final void mo48414i(C4268a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C4268a aVar2 = this.f117177M;
        if (!(aVar2 == null || (dataSetObserver = this.f117178N) == null)) {
            aVar2.f13843a.unregisterObserver(dataSetObserver);
        }
        this.f117177M = aVar;
        if (z && aVar != null) {
            if (this.f117178N == null) {
                this.f117178N = new C44906i(this);
            }
            aVar.f13843a.registerObserver(this.f117178N);
        }
        mo48410f();
    }

    /* renamed from: j */
    public final void mo48415j(int i, float f, boolean z, boolean z2) {
        int i2;
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f117184b.getChildCount()) {
            if (z2) {
                C44908k kVar = this.f117184b;
                ValueAnimator valueAnimator = kVar.f117218a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    kVar.f117218a.cancel();
                }
                kVar.mo48436c(kVar.getChildAt(i), kVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.f117176L;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f117176L.cancel();
            }
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = m79686o(i, f);
            }
            scrollTo(i2, 0);
            if (z) {
                m79691t(round);
            }
        }
    }

    /* renamed from: k */
    public final void mo48416k(int i) {
        if (i != this.f117202t) {
            this.f117202t = i;
            m79690s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo48417l(boolean z) {
        for (int i = 0; i < this.f117184b.getChildCount(); i++) {
            View childAt = this.f117184b.getChildAt(i);
            childAt.setMinimumWidth(m79687p());
            m79692u((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* renamed from: m */
    public final void mo48418m(int i) {
        mo48415j(i, 0.0f, true, true);
    }

    /* renamed from: n */
    public final void mo48419n(ViewPager viewPager, boolean z) {
        List list;
        ViewPager viewPager2 = this.f117168B;
        if (viewPager2 != null) {
            C44910m mVar = this.f117179O;
            if (mVar != null) {
                viewPager2.mo9145j(mVar);
            }
            C44903f fVar = this.f117180P;
            if (!(fVar == null || (list = this.f117168B.f13824h) == null)) {
                list.remove(fVar);
            }
        }
        C44904g gVar = this.f117175K;
        if (gVar != null) {
            this.f117167A.remove(gVar);
            this.f117175K = null;
        }
        if (viewPager != null) {
            this.f117168B = viewPager;
            if (this.f117179O == null) {
                this.f117179O = new C44910m(this);
            }
            C44910m mVar2 = this.f117179O;
            mVar2.f117230b = 0;
            mVar2.f117229a = 0;
            viewPager.mo9137f(mVar2);
            C44913p pVar = new C44913p(viewPager);
            this.f117175K = pVar;
            mo48408d(pVar);
            C4268a b = viewPager.mo9126b();
            if (b != null) {
                mo48414i(b, true);
            }
            if (this.f117180P == null) {
                this.f117180P = new C44903f(this);
            }
            C44903f fVar2 = this.f117180P;
            fVar2.f117212a = true;
            if (viewPager.f13824h == null) {
                viewPager.f13824h = new ArrayList();
            }
            viewPager.f13824h.add(fVar2);
            mo48418m(viewPager.mo9122a());
        } else {
            this.f117168B = null;
            mo48414i((C4268a) null, false);
        }
        this.f117181Q = z;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44780k.m79412c(this);
        if (this.f117168B == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                mo48419n((ViewPager) parent, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f117181Q) {
            mo48419n((ViewPager) null, false);
            this.f117181Q = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (com.google.android.material.tabs.C44912o) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.k r1 = r7.f117184b
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            com.google.android.material.tabs.k r1 = r7.f117184b
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.C44912o
            if (r2 == 0) goto L_0x0031
            com.google.android.material.tabs.o r1 = (com.google.android.material.tabs.C44912o) r1
            android.graphics.drawable.Drawable r2 = r1.f117236d
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.f117236d
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C1991k(accessibilityNodeInfo).mo5154c(C1989i.m5331a(1, this.f117183a.size(), false, 1));
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m79693v() && super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r8.getMeasuredWidth() != getMeasuredWidth()) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r8.getMeasuredWidth() < getMeasuredWidth()) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        r8.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(r9, getPaddingTop() + getPaddingBottom(), r8.getLayoutParams().height));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.getContext()
            java.util.ArrayList r1 = r7.f117183a
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L_0x000c:
            r4 = 48
            if (r3 >= r1) goto L_0x0030
            java.util.ArrayList r5 = r7.f117183a
            java.lang.Object r5 = r5.get(r3)
            com.google.android.material.tabs.l r5 = (com.google.android.material.tabs.C44909l) r5
            if (r5 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r6 = r5.f117220a
            if (r6 == 0) goto L_0x002d
            java.lang.CharSequence r5 = r5.f117221b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x002d
            boolean r1 = r7.f117203u
            if (r1 != 0) goto L_0x0030
            r4 = 72
            goto L_0x0030
        L_0x002d:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0030:
            float r0 = com.google.android.material.internal.C44741bm.m79308a(r0, r4)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r3) goto L_0x0055
            if (r1 == 0) goto L_0x0046
            goto L_0x0068
        L_0x0046:
            int r9 = r7.getPaddingTop()
            int r0 = r0 + r9
            int r9 = r7.getPaddingBottom()
            int r0 = r0 + r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L_0x0068
        L_0x0055:
            int r1 = r7.getChildCount()
            if (r1 != r5) goto L_0x0068
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            if (r1 < r0) goto L_0x0068
            android.view.View r1 = r7.getChildAt(r2)
            r1.setMinimumHeight(r0)
        L_0x0068:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 == 0) goto L_0x0086
            int r1 = r7.f117172H
            if (r1 <= 0) goto L_0x0077
            goto L_0x0084
        L_0x0077:
            float r0 = (float) r0
            android.content.Context r1 = r7.getContext()
            r3 = 56
            float r1 = com.google.android.material.internal.C44741bm.m79308a(r1, r3)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x0084:
            r7.f117198p = r1
        L_0x0086:
            super.onMeasure(r8, r9)
            int r8 = r7.getChildCount()
            if (r8 != r5) goto L_0x00d3
            android.view.View r8 = r7.getChildAt(r2)
            int r0 = r7.f117202t
            if (r0 == 0) goto L_0x00a8
            if (r0 == r5) goto L_0x009d
            r1 = 2
            if (r0 == r1) goto L_0x00a8
            goto L_0x00d3
        L_0x009d:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 == r1) goto L_0x00b3
            goto L_0x00b2
        L_0x00a8:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 >= r1) goto L_0x00b3
        L_0x00b2:
            r2 = 1
        L_0x00b3:
            if (r2 == 0) goto L_0x00d3
            int r0 = r7.getPaddingTop()
            int r1 = r7.getPaddingBottom()
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            int r2 = r2.height
            int r0 = r0 + r1
            int r9 = getChildMeasureSpec(r9, r0, r2)
            int r0 = r7.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r8.measure(r0, r9)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || m79693v()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        C44780k.m79411b(this, f);
    }

    public final boolean shouldDelayChildPressedState() {
        if (Math.max(0, ((this.f117184b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0) {
            return true;
        }
        return false;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public final void addView(View view, int i) {
        m79688q(view);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r4 = f117165C
            android.content.Context r13 = com.google.android.material.theme.p3518a.C44965a.m79936a(r13, r14, r15, r4)
            r12.<init>(r13, r14, r15)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r12.f117183a = r13
            r13 = 0
            r12.f117170F = r13
            r0 = 2147483647(0x7fffffff, float:NaN)
            r12.f117198p = r0
            r6 = -1
            r12.f117205w = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f117167A = r0
            androidx.core.i.g r0 = new androidx.core.i.g
            r7 = 12
            r0.<init>(r7)
            r12.f117182R = r0
            android.content.Context r8 = r12.getContext()
            r12.setHorizontalScrollBarEnabled(r13)
            com.google.android.material.tabs.k r9 = new com.google.android.material.tabs.k
            r9.<init>(r12, r8)
            r12.f117184b = r9
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r6)
            super.addView(r9, r13, r0)
            int[] r2 = com.google.android.material.tabs.C44900c.f117210b
            r10 = 1
            int[] r5 = new int[r10]
            r11 = 23
            r5[r13] = r11
            r0 = r8
            r1 = r14
            r3 = r15
            android.content.res.TypedArray r14 = com.google.android.material.internal.C44733be.m79295a(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r15 = r12.getBackground()
            boolean r15 = r15 instanceof android.graphics.drawable.ColorDrawable
            if (r15 == 0) goto L_0x007d
            android.graphics.drawable.Drawable r15 = r12.getBackground()
            android.graphics.drawable.ColorDrawable r15 = (android.graphics.drawable.ColorDrawable) r15
            com.google.android.material.l.j r0 = new com.google.android.material.l.j
            r0.<init>()
            int r15 = r15.getColor()
            android.content.res.ColorStateList r15 = android.content.res.ColorStateList.valueOf(r15)
            r0.mo48124V(r15)
            r0.mo48121S(r8)
            float r15 = androidx.core.p098j.C2043bi.m5533a(r12)
            r0.mo48123U(r15)
            androidx.core.p098j.C2043bi.m5530X(r12, r0)
        L_0x007d:
            r15 = 5
            android.graphics.drawable.Drawable r15 = com.google.android.material.p3512i.C44694d.m79232d(r8, r14, r15)
            if (r15 != 0) goto L_0x0089
            android.graphics.drawable.GradientDrawable r15 = new android.graphics.drawable.GradientDrawable
            r15.<init>()
        L_0x0089:
            android.graphics.drawable.Drawable r15 = r15.mutate()
            r12.f117193k = r15
            int r0 = r12.f117170F
            com.google.android.material.p3507d.C44603a.m79018b(r15, r0)
            int r15 = r12.f117205w
            if (r15 != r6) goto L_0x009e
            android.graphics.drawable.Drawable r15 = r12.f117193k
            int r15 = r15.getIntrinsicHeight()
        L_0x009e:
            r9.mo48435b(r15)
            r15 = 8
            int r15 = r14.getColor(r15, r13)
            r12.f117170F = r15
            android.graphics.drawable.Drawable r0 = r12.f117193k
            com.google.android.material.p3507d.C44603a.m79018b(r0, r15)
            r12.mo48417l(r13)
            r15 = 11
            int r15 = r14.getDimensionPixelSize(r15, r6)
            r9.mo48435b(r15)
            r15 = 10
            int r15 = r14.getInt(r15, r13)
            int r0 = r12.f117201s
            if (r0 == r15) goto L_0x00c9
            r12.f117201s = r15
            androidx.core.p098j.C2043bi.m5519M(r9)
        L_0x00c9:
            r15 = 7
            int r15 = r14.getInt(r15, r13)
            r0 = 2
            if (r15 == 0) goto L_0x00fa
            if (r15 == r10) goto L_0x00f2
            if (r15 != r0) goto L_0x00db
            com.google.android.material.tabs.b r15 = new com.google.android.material.tabs.b
            r15.<init>()
            goto L_0x00f7
        L_0x00db:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r15)
            java.lang.String r15 = " is not a valid TabIndicatorAnimationMode"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x00f2:
            com.google.android.material.tabs.a r15 = new com.google.android.material.tabs.a
            r15.<init>()
        L_0x00f7:
            r12.f117207y = r15
            goto L_0x0101
        L_0x00fa:
            com.google.android.material.tabs.d r15 = new com.google.android.material.tabs.d
            r15.<init>()
            r12.f117207y = r15
        L_0x0101:
            r15 = 9
            boolean r15 = r14.getBoolean(r15, r10)
            r12.f117204v = r15
            r9.mo48434a()
            androidx.core.p098j.C2043bi.m5519M(r9)
            r15 = 16
            int r15 = r14.getDimensionPixelSize(r15, r13)
            r12.f117188f = r15
            r12.f117187e = r15
            r12.f117186d = r15
            r12.f117185c = r15
            r1 = 19
            int r15 = r14.getDimensionPixelSize(r1, r15)
            r12.f117185c = r15
            r15 = 20
            int r1 = r12.f117186d
            int r15 = r14.getDimensionPixelSize(r15, r1)
            r12.f117186d = r15
            r15 = 18
            int r1 = r12.f117187e
            int r15 = r14.getDimensionPixelSize(r15, r1)
            r12.f117187e = r15
            r15 = 17
            int r1 = r12.f117188f
            int r15 = r14.getDimensionPixelSize(r15, r1)
            r12.f117188f = r15
            r15 = 2132150365(0x7f16085d, float:1.9942762E38)
            int r15 = r14.getResourceId(r11, r15)
            r12.f117189g = r15
            int[] r1 = android.support.p033v7.p034a.C0338a.f1089y
            android.content.res.TypedArray r15 = r8.obtainStyledAttributes(r15, r1)
            int r1 = r15.getDimensionPixelSize(r13, r13)     // Catch:{ all -> 0x021e }
            float r1 = (float) r1     // Catch:{ all -> 0x021e }
            r12.f117195m = r1     // Catch:{ all -> 0x021e }
            r1 = 3
            android.content.res.ColorStateList r2 = com.google.android.material.p3512i.C44694d.m79230b(r8, r15, r1)     // Catch:{ all -> 0x021e }
            r12.f117190h = r2     // Catch:{ all -> 0x021e }
            r15.recycle()
            r15 = 24
            boolean r2 = r14.hasValue(r15)
            if (r2 == 0) goto L_0x0171
            android.content.res.ColorStateList r15 = com.google.android.material.p3512i.C44694d.m79230b(r8, r14, r15)
            r12.f117190h = r15
        L_0x0171:
            r15 = 22
            boolean r2 = r14.hasValue(r15)
            if (r2 == 0) goto L_0x019a
            int r15 = r14.getColor(r15, r13)
            android.content.res.ColorStateList r2 = r12.f117190h
            int r2 = r2.getDefaultColor()
            int[][] r3 = new int[r0][]
            int[] r4 = new int[r0]
            int[] r5 = SELECTED_STATE_SET
            r3[r13] = r5
            r4[r13] = r15
            int[] r15 = EMPTY_STATE_SET
            r3[r10] = r15
            r4[r10] = r2
            android.content.res.ColorStateList r15 = new android.content.res.ColorStateList
            r15.<init>(r3, r4)
            r12.f117190h = r15
        L_0x019a:
            android.content.res.ColorStateList r15 = com.google.android.material.p3512i.C44694d.m79230b(r8, r14, r1)
            r12.f117191i = r15
            r15 = 4
            int r15 = r14.getInt(r15, r6)
            r1 = 0
            android.graphics.PorterDuff$Mode r15 = com.google.android.material.internal.C44741bm.m79310c(r15, r1)
            r12.f117194l = r15
            r15 = 21
            android.content.res.ColorStateList r15 = com.google.android.material.p3512i.C44694d.m79230b(r8, r14, r15)
            r12.f117192j = r15
            r15 = 6
            r1 = 300(0x12c, float:4.2E-43)
            int r15 = r14.getInt(r15, r1)
            r12.f117200r = r15
            r15 = 2130970623(0x7f0407ff, float:1.7549961E38)
            android.animation.TimeInterpolator r1 = com.google.android.material.p3504a.C44497b.f115651b
            android.animation.TimeInterpolator r15 = com.google.android.material.p3510g.C44688a.m79217a(r8, r15, r1)
            r12.f117208z = r15
            r15 = 14
            int r15 = r14.getDimensionPixelSize(r15, r6)
            r12.f117171G = r15
            r15 = 13
            int r15 = r14.getDimensionPixelSize(r15, r6)
            r12.f117172H = r15
            int r15 = r14.getResourceId(r13, r13)
            r12.f117197o = r15
            int r15 = r14.getDimensionPixelSize(r10, r13)
            r12.f117174J = r15
            r15 = 15
            int r15 = r14.getInt(r15, r10)
            r12.f117202t = r15
            int r15 = r14.getInt(r0, r13)
            r12.f117199q = r15
            boolean r15 = r14.getBoolean(r7, r13)
            r12.f117203u = r15
            r15 = 25
            boolean r13 = r14.getBoolean(r15, r13)
            r12.f117206x = r13
            r14.recycle()
            android.content.res.Resources r13 = r12.getResources()
            r14 = 2131167345(0x7f070871, float:1.794896E38)
            int r14 = r13.getDimensionPixelSize(r14)
            float r14 = (float) r14
            r12.f117196n = r14
            r14 = 2131167343(0x7f07086f, float:1.7948957E38)
            int r13 = r13.getDimensionPixelSize(r14)
            r12.f117173I = r13
            r12.m79690s()
            return
        L_0x021e:
            r13 = move-exception
            r15.recycle()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: u */
    private final void m79692u(LinearLayout.LayoutParams layoutParams) {
        if (this.f117202t == 1 && this.f117199q == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m79688q(view);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m79688q(view);
    }
}
