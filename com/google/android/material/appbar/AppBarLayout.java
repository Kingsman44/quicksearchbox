package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.C1769b;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1930c;
import androidx.core.p092d.C1886a;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2110y;
import androidx.core.p098j.p099a.C1988h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44780k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class AppBarLayout extends LinearLayout implements C1769b {

    /* renamed from: a */
    public boolean f115666a;

    /* renamed from: b */
    public int f115667b;

    /* renamed from: c */
    public C2082cp f115668c;

    /* renamed from: d */
    public List f115669d;

    /* renamed from: e */
    public boolean f115670e;

    /* renamed from: f */
    public int f115671f;

    /* renamed from: g */
    public final List f115672g;

    /* renamed from: h */
    public Drawable f115673h;

    /* renamed from: i */
    private int f115674i;

    /* renamed from: j */
    private int f115675j;

    /* renamed from: k */
    private int f115676k;

    /* renamed from: l */
    private int f115677l;

    /* renamed from: m */
    private boolean f115678m;

    /* renamed from: n */
    private boolean f115679n;

    /* renamed from: o */
    private WeakReference f115680o;

    /* renamed from: p */
    private ValueAnimator f115681p;

    /* renamed from: q */
    private int[] f115682q;

    /* renamed from: r */
    private Behavior f115683r;

    /* compiled from: PG */
    public class BaseBehavior extends C44526v {

        /* renamed from: a */
        public int f115684a;

        /* renamed from: b */
        public C44512h f115685b;

        /* renamed from: c */
        public boolean f115686c;

        /* renamed from: e */
        private int f115687e;

        /* renamed from: f */
        private ValueAnimator f115688f;

        /* renamed from: g */
        private SavedState f115689g;

        /* renamed from: h */
        private WeakReference f115690h;

        public BaseBehavior() {
        }

        /* renamed from: E */
        private final void m78631E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int i = appBarLayout.mo47399i() + appBarLayout.getPaddingTop();
            int C = (mo47465C() + this.f115684a) - i;
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C44518n nVar = (C44518n) childAt.getLayoutParams();
                if (m78633G(nVar.f115750a, 32)) {
                    top -= nVar.topMargin;
                    bottom += nVar.bottomMargin;
                }
                int i3 = -C;
                if (top <= i3 && bottom >= i3) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i2);
                C44518n nVar2 = (C44518n) childAt2.getLayoutParams();
                int i4 = nVar2.f115750a;
                if ((i4 & 17) == 17) {
                    int i5 = -childAt2.getTop();
                    int i6 = -childAt2.getBottom();
                    if (i2 == 0 && C2043bi.m5564ar(appBarLayout) && C2043bi.m5564ar(childAt2)) {
                        i5 -= appBarLayout.mo47399i();
                    }
                    if (m78633G(i4, 2)) {
                        i6 += C2043bi.m5579h(childAt2);
                    } else if (m78633G(i4, 5)) {
                        int h = C2043bi.m5579h(childAt2) + i6;
                        if (C < h) {
                            i5 = h;
                        } else {
                            i6 = h;
                        }
                    }
                    if (m78633G(i4, 32)) {
                        i5 += nVar2.topMargin;
                        i6 -= nVar2.bottomMargin;
                    }
                    if (C < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    m78634H(coordinatorLayout, appBarLayout, C1886a.m5145c(i5 + i, -appBarLayout.mo47400j(), 0));
                }
            }
        }

        /* renamed from: F */
        private final void m78632F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View view;
            C2043bi.m5522P(coordinatorLayout, C1988h.f5907e.mo5148a());
            C2043bi.m5522P(coordinatorLayout, C1988h.f5908f.mo5148a());
            if (appBarLayout.mo47400j() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        view = null;
                        break;
                    }
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (((C1773f) childAt.getLayoutParams()).f5523a instanceof ScrollingViewBehavior) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
                if (view != null) {
                    int childCount2 = appBarLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        if (((C44518n) appBarLayout.getChildAt(i2).getLayoutParams()).f115750a != 0) {
                            if (!C2043bi.m5565as(coordinatorLayout)) {
                                C2043bi.m5526T(coordinatorLayout, new C44509e(this));
                            }
                            boolean z2 = true;
                            if (mo47465C() + this.f115684a != (-appBarLayout.mo47400j())) {
                                m78636J(coordinatorLayout, appBarLayout, C1988h.f5907e, false);
                                z = true;
                            }
                            if (mo47465C() + this.f115684a != 0) {
                                if (view.canScrollVertically(-1)) {
                                    int i3 = -appBarLayout.mo47393f();
                                    if (i3 != 0) {
                                        C2043bi.m5523Q(coordinatorLayout, C1988h.f5908f, (CharSequence) null, new C44510f(this, coordinatorLayout, appBarLayout, view, i3));
                                    }
                                } else {
                                    m78636J(coordinatorLayout, appBarLayout, C1988h.f5908f, true);
                                }
                                this.f115686c = z2;
                                return;
                            }
                            z2 = z;
                            this.f115686c = z2;
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: G */
        private static boolean m78633G(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: H */
        private final void m78634H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int i2;
            int abs = Math.abs((mo47465C() + this.f115684a) - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int C = mo47465C() + this.f115684a;
            if (C == i) {
                ValueAnimator valueAnimator = this.f115688f;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f115688f.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f115688f;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f115688f = valueAnimator3;
                valueAnimator3.setInterpolator(C44497b.f115654e);
                this.f115688f.addUpdateListener(new C44508d(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f115688f.setDuration((long) Math.min(i2, 600));
            this.f115688f.setIntValues(new int[]{C, i});
            this.f115688f.start();
        }

        /* renamed from: I */
        private static final View m78635I(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C2110y) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: J */
        private static final void m78636J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, C1988h hVar, boolean z) {
            C2043bi.m5523Q(coordinatorLayout, hVar, (CharSequence) null, new C44511g(appBarLayout, z));
        }

        /* renamed from: K */
        private static final void m78637K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            List list;
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                list = null;
                if (i4 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i4);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                }
                i4++;
            }
            if (view != null) {
                int i5 = ((C44518n) view.getLayoutParams()).f115750a;
                if ((i5 & 1) != 0) {
                    int h = C2043bi.m5579h(view);
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.f115670e) {
                z2 = appBarLayout.mo47413r(m78635I(coordinatorLayout));
            }
            boolean t = appBarLayout.mo47417t(z2);
            if (!z) {
                if (t) {
                    ArrayList a = coordinatorLayout.f5502e.mo4982a(appBarLayout);
                    if (a != null) {
                        list = new ArrayList(a);
                    }
                    if (list == null) {
                        list = Collections.emptyList();
                    }
                    int size = list.size();
                    while (i3 < size) {
                        C1770c cVar = ((C1773f) ((View) list.get(i3)).getLayoutParams()).f5523a;
                        if (!(cVar instanceof ScrollingViewBehavior)) {
                            i3++;
                        } else if (((ScrollingViewBehavior) cVar).f115771d == 0) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        /* renamed from: A */
        public final void mo47419A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.mo47400j();
                    i3 = i4;
                    i2 = appBarLayout.mo47393f() + i4;
                } else {
                    i3 = -appBarLayout.mo47400j();
                    i2 = 0;
                }
                if (i3 != i2) {
                    iArr[1] = mo47423v(coordinatorLayout, appBarLayout, mo47422u() - i, i3, i2);
                }
            }
            if (appBarLayout.f115670e) {
                appBarLayout.mo47417t(appBarLayout.mo47413r(view));
            }
        }

        /* renamed from: d */
        public final /* bridge */ /* synthetic */ void mo4956d(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f115687e == 0 || i == 1) {
                m78631E(coordinatorLayout, appBarLayout);
                if (appBarLayout.f115670e) {
                    appBarLayout.mo47417t(appBarLayout.mo47413r(view2));
                }
            }
            this.f115690h = new WeakReference(view2);
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean g = super.mo4959g(coordinatorLayout, appBarLayout, i);
            int i3 = appBarLayout.f115667b;
            SavedState savedState = this.f115689g;
            if (savedState == null || (i3 & 8) != 0) {
                if (i3 != 0) {
                    int i4 = i3 & 4;
                    if ((i3 & 2) != 0) {
                        int i5 = -appBarLayout.mo47400j();
                        if (i4 != 0) {
                            m78634H(coordinatorLayout, appBarLayout, i5);
                        } else {
                            mo47462B(coordinatorLayout, appBarLayout, i5);
                        }
                    } else if ((i3 & 1) != 0) {
                        if (i4 != 0) {
                            m78634H(coordinatorLayout, appBarLayout, 0);
                        } else {
                            mo47462B(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f115691a) {
                mo47462B(coordinatorLayout, appBarLayout, -appBarLayout.mo47400j());
            } else if (savedState.f115692b) {
                mo47462B(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f115693e);
                int i6 = -childAt.getBottom();
                if (this.f115689g.f115695g) {
                    i2 = C2043bi.m5579h(childAt) + appBarLayout.mo47399i();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f115689g.f115694f);
                }
                mo47462B(coordinatorLayout, appBarLayout, i6 + i2);
            }
            appBarLayout.f115667b = 0;
            this.f115689g = null;
            mo47466D(C1886a.m5145c(mo47465C(), -appBarLayout.mo47400j(), 0));
            m78637K(coordinatorLayout, appBarLayout, mo47465C(), 0, true);
            appBarLayout.mo47404n(mo47465C());
            m78632F(coordinatorLayout, appBarLayout);
            View I = m78635I(coordinatorLayout);
            if (I != null) {
                I.addOnUnhandledKeyEventListener(new C44507c(I, appBarLayout));
            }
            return g;
        }

        /* renamed from: j */
        public final /* bridge */ /* synthetic */ boolean mo4962j(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i3 = i & 2;
            boolean z = false;
            if (i3 != 0 && (appBarLayout.f115670e || (appBarLayout.mo47400j() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.f115688f) != null) {
                valueAnimator.cancel();
            }
            this.f115690h = null;
            this.f115687e = i2;
            return z;
        }

        /* renamed from: m */
        public final /* bridge */ /* synthetic */ boolean mo4965m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((C1773f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.mo4945p(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        /* renamed from: o */
        public final /* bridge */ /* synthetic */ void mo4967o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            mo47419A(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        /* renamed from: p */
        public final /* bridge */ /* synthetic */ void mo4968p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                AppBarLayout appBarLayout2 = appBarLayout;
                iArr[1] = mo47423v(coordinatorLayout2, appBarLayout2, mo47422u() - i3, -appBarLayout.mo47394g(), 0);
            }
            if (i3 == 0) {
                m78632F(coordinatorLayout, appBarLayout);
            }
        }

        /* renamed from: q */
        public final /* bridge */ /* synthetic */ void mo4969q(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                mo47426y((SavedState) parcelable, true);
                Parcelable parcelable2 = this.f115689g.f6116d;
                return;
            }
            this.f115689g = null;
        }

        /* renamed from: r */
        public final /* bridge */ /* synthetic */ Parcelable mo4970r(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState w = mo47424w(absSavedState, (AppBarLayout) view);
            return w == null ? absSavedState : w;
        }

        /* renamed from: s */
        public final /* synthetic */ int mo47420s(View view) {
            return -((AppBarLayout) view).mo47394g();
        }

        /* renamed from: t */
        public final /* synthetic */ int mo47421t(View view) {
            return ((AppBarLayout) view).mo47400j();
        }

        /* renamed from: u */
        public final int mo47422u() {
            return mo47465C() + this.f115684a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0132  */
        /* renamed from: v */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ int mo47423v(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13, int r14, int r15) {
            /*
                r10 = this;
                com.google.android.material.appbar.AppBarLayout r12 = (com.google.android.material.appbar.AppBarLayout) r12
                int r0 = r10.mo47465C()
                int r1 = r10.f115684a
                int r0 = r0 + r1
                r1 = 0
                if (r14 == 0) goto L_0x0138
                if (r0 < r14) goto L_0x0138
                if (r0 > r15) goto L_0x0138
                int r13 = androidx.core.p092d.C1886a.m5145c(r13, r14, r15)
                if (r0 == r13) goto L_0x013a
                boolean r14 = r12.f115666a
                if (r14 == 0) goto L_0x0088
                int r14 = java.lang.Math.abs(r13)
                int r15 = r12.getChildCount()
                r2 = 0
            L_0x0023:
                if (r2 >= r15) goto L_0x0088
                android.view.View r3 = r12.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.n r4 = (com.google.android.material.appbar.C44518n) r4
                android.view.animation.Interpolator r5 = r4.f115752c
                int r6 = r3.getTop()
                if (r14 < r6) goto L_0x0085
                int r6 = r3.getBottom()
                if (r14 > r6) goto L_0x0085
                if (r5 == 0) goto L_0x0088
                int r15 = r4.f115750a
                r2 = r15 & 1
                if (r2 == 0) goto L_0x0059
                int r2 = r3.getHeight()
                int r6 = r4.topMargin
                int r2 = r2 + r6
                int r4 = r4.bottomMargin
                int r2 = r2 + r4
                r15 = r15 & 2
                if (r15 == 0) goto L_0x005a
                int r15 = androidx.core.p098j.C2043bi.m5579h(r3)
                int r2 = r2 - r15
                goto L_0x005a
            L_0x0059:
                r2 = 0
            L_0x005a:
                boolean r15 = androidx.core.p098j.C2043bi.m5564ar(r3)
                if (r15 == 0) goto L_0x0065
                int r15 = r12.mo47399i()
                int r2 = r2 - r15
            L_0x0065:
                if (r2 <= 0) goto L_0x0088
                int r15 = r3.getTop()
                float r2 = (float) r2
                int r14 = r14 - r15
                float r14 = (float) r14
                float r14 = r14 / r2
                float r14 = r5.getInterpolation(r14)
                float r2 = r2 * r14
                int r14 = java.lang.Math.round(r2)
                int r15 = java.lang.Integer.signum(r13)
                int r2 = r3.getTop()
                int r2 = r2 + r14
                int r15 = r15 * r2
                goto L_0x0089
            L_0x0085:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x0088:
                r15 = r13
            L_0x0089:
                boolean r14 = r10.mo47466D(r15)
                int r2 = r0 - r13
                int r15 = r13 - r15
                r10.f115684a = r15
                r15 = 1
                if (r14 == 0) goto L_0x0122
                r14 = 0
            L_0x0097:
                int r3 = r12.getChildCount()
                if (r14 >= r3) goto L_0x0129
                android.view.View r3 = r12.getChildAt(r14)
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                com.google.android.material.appbar.n r3 = (com.google.android.material.appbar.C44518n) r3
                com.google.android.material.appbar.l r4 = r3.f115751b
                if (r4 == 0) goto L_0x011e
                int r3 = r3.f115750a
                r3 = r3 & r15
                if (r3 == 0) goto L_0x011e
                android.view.View r3 = r12.getChildAt(r14)
                int r5 = r10.mo47465C()
                com.google.android.material.appbar.m r4 = (com.google.android.material.appbar.C44517m) r4
                android.graphics.Rect r6 = r4.f115748a
                r3.getDrawingRect(r6)
                r12.offsetDescendantRectToMyCoords(r3, r6)
                int r7 = r12.mo47399i()
                int r7 = -r7
                r6.offset(r1, r7)
                android.graphics.Rect r6 = r4.f115748a
                int r6 = r6.top
                float r6 = (float) r6
                float r5 = (float) r5
                float r5 = java.lang.Math.abs(r5)
                float r6 = r6 - r5
                r5 = 0
                int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                if (r7 > 0) goto L_0x0117
                android.graphics.Rect r7 = r4.f115748a
                int r7 = r7.height()
                float r7 = (float) r7
                float r7 = r6 / r7
                float r7 = java.lang.Math.abs(r7)
                r8 = 1065353216(0x3f800000, float:1.0)
                float r5 = androidx.core.p092d.C1886a.m5144b(r7, r5, r8)
                float r5 = r8 - r5
                float r6 = -r6
                android.graphics.Rect r7 = r4.f115748a
                int r7 = r7.height()
                float r7 = (float) r7
                r9 = 1050253722(0x3e99999a, float:0.3)
                float r7 = r7 * r9
                float r5 = r5 * r5
                float r8 = r8 - r5
                float r7 = r7 * r8
                float r6 = r6 - r7
                r3.setTranslationY(r6)
                android.graphics.Rect r5 = r4.f115749b
                r3.getDrawingRect(r5)
                android.graphics.Rect r5 = r4.f115749b
                float r6 = -r6
                int r6 = (int) r6
                r5.offset(r1, r6)
                android.graphics.Rect r4 = r4.f115749b
                androidx.core.p098j.C2043bi.m5547aa(r3, r4)
                goto L_0x011e
            L_0x0117:
                r4 = 0
                androidx.core.p098j.C2043bi.m5547aa(r3, r4)
                r3.setTranslationY(r5)
            L_0x011e:
                int r14 = r14 + 1
                goto L_0x0097
            L_0x0122:
                boolean r14 = r12.f115666a
                if (r14 == 0) goto L_0x0129
                r11.mo4915c(r12)
            L_0x0129:
                int r14 = r10.mo47465C()
                r12.mo47404n(r14)
                if (r13 >= r0) goto L_0x0133
                r15 = -1
            L_0x0133:
                m78637K(r11, r12, r13, r15, r1)
                r1 = r2
                goto L_0x013a
            L_0x0138:
                r10.f115684a = r1
            L_0x013a:
                r10.m78632F(r11, r12)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo47423v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final SavedState mo47424w(Parcelable parcelable, AppBarLayout appBarLayout) {
            int C = mo47465C();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + C;
                if (childAt.getTop() + C > 0 || bottom < 0) {
                    i++;
                } else {
                    if (parcelable == null) {
                        parcelable = androidx.customview.view.AbsSavedState.f6115c;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z2 = C == 0;
                    savedState.f115692b = z2;
                    savedState.f115691a = !z2 && (-C) >= appBarLayout.mo47400j();
                    savedState.f115693e = i;
                    if (bottom == C2043bi.m5579h(childAt) + appBarLayout.mo47399i()) {
                        z = true;
                    }
                    savedState.f115695g = z;
                    savedState.f115694f = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return null;
        }

        /* renamed from: x */
        public final /* bridge */ /* synthetic */ void mo47425x(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m78631E(coordinatorLayout, appBarLayout);
            if (appBarLayout.f115670e) {
                appBarLayout.mo47417t(appBarLayout.mo47413r(m78635I(coordinatorLayout)));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo47426y(SavedState savedState, boolean z) {
            if (this.f115689g == null || z) {
                this.f115689g = savedState;
            }
        }

        /* renamed from: z */
        public final /* bridge */ /* synthetic */ boolean mo47427z(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f115685b == null) {
                WeakReference weakReference = this.f115690h;
                if (weakReference == null) {
                    return true;
                }
                View view2 = (View) weakReference.get();
                return view2 != null && view2.isShown() && !view2.canScrollVertically(-1);
            } else if (Build.VERSION.SDK_INT > 33 && appBarLayout.getResources().getConfiguration().orientation == 2) {
                return true;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* compiled from: PG */
        public class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator CREATOR = new C44513i();

            /* renamed from: a */
            boolean f115691a;

            /* renamed from: b */
            boolean f115692b;

            /* renamed from: e */
            int f115693e;

            /* renamed from: f */
            float f115694f;

            /* renamed from: g */
            boolean f115695g;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.f115691a = parcel.readByte() != 0;
                this.f115692b = parcel.readByte() != 0;
                this.f115693e = parcel.readInt();
                this.f115694f = parcel.readFloat();
                this.f115695g = parcel.readByte() == 0 ? false : z;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f6116d, i);
                parcel.writeByte(this.f115691a ? (byte) 1 : 0);
                parcel.writeByte(this.f115692b ? (byte) 1 : 0);
                parcel.writeInt(this.f115693e);
                parcel.writeFloat(this.f115694f);
                parcel.writeByte(this.f115695g ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class ScrollingViewBehavior extends C44527w {
        public ScrollingViewBehavior() {
        }

        /* renamed from: w */
        static final AppBarLayout m78655w(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final void mo4954b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C2043bi.m5522P(coordinatorLayout, C1988h.f5907e.mo5148a());
                C2043bi.m5522P(coordinatorLayout, C1988h.f5908f.mo5148a());
                C2043bi.m5526T(coordinatorLayout, (C2061c) null);
            }
        }

        /* renamed from: e */
        public boolean mo4957e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            C1770c cVar = ((C1773f) view2.getLayoutParams()).f5523a;
            if (cVar instanceof BaseBehavior) {
                C2043bi.m5517K(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f115684a) + this.f115770c) - mo47464x(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f115670e) {
                return false;
            }
            appBarLayout.mo47417t(appBarLayout.mo47413r(view));
            return false;
        }

        /* renamed from: i */
        public final boolean mo4961i(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout w = m78655w(coordinatorLayout.mo4914b(view));
            if (w != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f115768a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    w.mo47405o(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: l */
        public final boolean mo4964l(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: m */
        public final /* bridge */ /* synthetic */ boolean mo4965m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            C2082cp cpVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View v = mo47430v(coordinatorLayout.mo4914b(view));
            if (v == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (C2043bi.m5564ar(v) && (cpVar = coordinatorLayout.f5503f) != null) {
                size += cpVar.mo5242d() + cpVar.mo5239a();
            }
            int u = size + mo47429u(v);
            int measuredHeight = v.getMeasuredHeight();
            if (mo34098s()) {
                view.setTranslationY((float) (-measuredHeight));
            } else {
                view.setTranslationY(0.0f);
                u -= measuredHeight;
            }
            coordinatorLayout.mo4945p(view, i, i2, View.MeasureSpec.makeMeasureSpec(u, i4 == -1 ? 1073741824 : LinearLayoutManager.INVALID_OFFSET));
            return true;
        }

        /* renamed from: t */
        public final float mo47428t(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int j = appBarLayout.mo47400j();
                int f = appBarLayout.mo47393f();
                C1770c cVar = ((C1773f) appBarLayout.getLayoutParams()).f5523a;
                if (cVar instanceof BaseBehavior) {
                    BaseBehavior baseBehavior = (BaseBehavior) cVar;
                    i = baseBehavior.mo47465C() + baseBehavior.f115684a;
                } else {
                    i = 0;
                }
                if ((f == 0 || j + i > f) && (i2 = j - f) != 0) {
                    return (((float) i) / ((float) i2)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: u */
        public final int mo47429u(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).mo47400j();
            }
            return view.getMeasuredHeight();
        }

        /* renamed from: v */
        public final /* bridge */ /* synthetic */ View mo47430v(List list) {
            return m78655w(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44528x.f115777f);
            this.f115771d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private final boolean m78613c() {
        return this.f115673h != null && mo47399i() > 0;
    }

    /* renamed from: d */
    private final boolean mo114830d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() == 8 || C2043bi.m5564ar(childAt)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: s */
    protected static C44518n m78615s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C44518n((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C44518n((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C44518n(layoutParams);
    }

    /* renamed from: a */
    public final C1770c mo4952a() {
        Behavior behavior = new Behavior();
        this.f115683r = behavior;
        return behavior;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C44518n;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (m78613c()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f115674i));
            this.f115673h.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f115673h;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo47393f() {
        int i;
        int h;
        int i2 = this.f115676k;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C44518n nVar = (C44518n) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = nVar.f115750a;
                if ((i4 & 5) == 5) {
                    int i5 = nVar.topMargin + nVar.bottomMargin;
                    if ((i4 & 8) != 0) {
                        h = C2043bi.m5579h(childAt);
                    } else if ((i4 & 2) != 0) {
                        h = measuredHeight - C2043bi.m5579h(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && C2043bi.m5564ar(childAt)) {
                            i = Math.min(i, measuredHeight - mo47399i());
                        }
                        i3 += i;
                    }
                    i = i5 + h;
                    i = Math.min(i, measuredHeight - mo47399i());
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.f115676k = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo47394g() {
        int i = this.f115677l;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C44518n nVar = (C44518n) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + nVar.topMargin + nVar.bottomMargin;
                int i4 = nVar.f115750a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= C2043bi.m5579h(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f115677l = max;
        return max;
    }

    /* renamed from: h */
    public final int mo47398h() {
        int i = mo47399i();
        int h = C2043bi.m5579h(this);
        if (h == 0) {
            int childCount = getChildCount();
            h = childCount > 0 ? C2043bi.m5579h(getChildAt(childCount - 1)) : 0;
            if (h == 0) {
                return getHeight() / 3;
            }
        }
        return h + h + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo47399i() {
        C2082cp cpVar = this.f115668c;
        if (cpVar != null) {
            return cpVar.mo5242d();
        }
        return 0;
    }

    /* renamed from: j */
    public final int mo47400j() {
        int i = this.f115675j;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C44518n nVar = (C44518n) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = nVar.f115750a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + nVar.topMargin + nVar.bottomMargin;
                if (i2 == 0) {
                    if (C2043bi.m5564ar(childAt)) {
                        i3 -= mo47399i();
                    }
                    i2 = 0;
                }
                if ((i4 & 2) != 0) {
                    i3 -= C2043bi.m5579h(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f115675j = max;
        return max;
    }

    /* renamed from: k */
    public final C44518n generateLayoutParams(AttributeSet attributeSet) {
        return new C44518n(getContext(), attributeSet);
    }

    /* renamed from: l */
    public final void mo47402l(C44514j jVar) {
        if (this.f115669d == null) {
            this.f115669d = new ArrayList();
        }
        if (jVar != null && !this.f115669d.contains(jVar)) {
            this.f115669d.add(jVar);
        }
    }

    /* renamed from: m */
    public final void mo47403m() {
        WeakReference weakReference = this.f115680o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f115680o = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo47404n(int i) {
        this.f115674i = i;
        if (!willNotDraw()) {
            C2043bi.m5519M(this);
        }
        List list = this.f115669d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C44514j jVar = (C44514j) this.f115669d.get(i2);
                if (jVar != null) {
                    jVar.mo18107a(this, i);
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo47405o(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (true != z ? 2 : 1) | (true != z2 ? 0 : 4);
        if (true == z3) {
            i = 8;
        }
        this.f115667b = i2 | i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44780k.m79412c(this);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.f115682q == null) {
            this.f115682q = new int[4];
        }
        int[] iArr = this.f115682q;
        int length = iArr.length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.f115678m;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130971101 : R.attr.state_liftable;
        int i2 = -2130971102;
        if (z2) {
            if (this.f115679n) {
                i2 = R.attr.state_lifted;
            }
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = i2;
        iArr[2] = true != z3 ? R.attr.state_collapsible : -2130971090;
        int i3 = -2130971089;
        if (z && this.f115679n) {
            i3 = R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo47403m();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            boolean r2 = androidx.core.p098j.C2043bi.m5564ar(r1)
            if (r2 == 0) goto L_0x0023
            boolean r2 = r1.mo114830d()
            if (r2 == 0) goto L_0x0023
            int r2 = r1.mo47399i()
            int r3 = r1.getChildCount()
        L_0x0017:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0023
            android.view.View r4 = r1.getChildAt(r3)
            androidx.core.p098j.C2043bi.m5517K(r4, r2)
            goto L_0x0017
        L_0x0023:
            r1.mo114768b()
            r2 = 0
            r1.f115666a = r2
            int r3 = r1.getChildCount()
            r4 = 0
        L_0x002e:
            r5 = 1
            if (r4 >= r3) goto L_0x0045
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.n r6 = (com.google.android.material.appbar.C44518n) r6
            android.view.animation.Interpolator r6 = r6.f115752c
            if (r6 == 0) goto L_0x0042
            r1.f115666a = r5
            goto L_0x0045
        L_0x0042:
            int r4 = r4 + 1
            goto L_0x002e
        L_0x0045:
            android.graphics.drawable.Drawable r3 = r1.f115673h
            if (r3 == 0) goto L_0x0054
            int r4 = r1.getWidth()
            int r6 = r1.mo47399i()
            r3.setBounds(r2, r2, r4, r6)
        L_0x0054:
            boolean r3 = r1.f115670e
            if (r3 != 0) goto L_0x0077
            int r3 = r1.getChildCount()
            r4 = 0
        L_0x005d:
            if (r4 >= r3) goto L_0x0078
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.n r6 = (com.google.android.material.appbar.C44518n) r6
            int r6 = r6.f115750a
            r0 = r6 & 1
            if (r0 != r5) goto L_0x0074
            r6 = r6 & 10
            if (r6 == 0) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            int r4 = r4 + 1
            goto L_0x005d
        L_0x0077:
            r2 = 1
        L_0x0078:
            boolean r3 = r1.f115678m
            if (r3 == r2) goto L_0x0081
            r1.f115678m = r2
            r1.refreshDrawableState()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C2043bi.m5564ar(this) && mo114830d()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C1886a.m5145c(getMeasuredHeight() + mo47399i(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += mo47399i();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        mo114768b();
    }

    /* renamed from: p */
    public final void mo47411p(Drawable drawable) {
        Drawable drawable2 = this.f115673h;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f115673h = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f115673h.setState(getDrawableState());
                }
                C1930c.m5230b(this.f115673h, C2043bi.m5577f(this));
                this.f115673h.setVisible(getVisibility() == 0, false);
                this.f115673h.setCallback(this);
            }
            mo47412q();
            C2043bi.m5519M(this);
        }
    }

    /* renamed from: q */
    public final void mo47412q() {
        setWillNotDraw(!m78613c());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.view.View} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47413r(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f115680o
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x0031
            int r0 = r4.f115671f
            if (r0 == r2) goto L_0x0031
            if (r5 == 0) goto L_0x0011
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0028
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.f115671f
            android.view.View r0 = r0.findViewById(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.f115680o = r3
        L_0x0031:
            java.lang.ref.WeakReference r0 = r4.f115680o
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            r0 = 0
            if (r5 == 0) goto L_0x0053
            boolean r1 = r5.canScrollVertically(r2)
            r2 = 1
            if (r1 != 0) goto L_0x0052
            int r5 = r5.getScrollY()
            if (r5 > 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            return r2
        L_0x0052:
            r0 = 1
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.mo47413r(android.view.View):boolean");
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        C44780k.m79411b(this, f);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f115673h;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo47417t(boolean z) {
        if (this.f115679n == z) {
            return false;
        }
        this.f115679n = z;
        refreshDrawableState();
        if (this.f115670e && (getBackground() instanceof C44779j)) {
            C44779j jVar = (C44779j) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = true != z ? dimension : 0.0f;
            if (true != z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f115681p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
            this.f115681p = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f115681p.setInterpolator(C44497b.f115650a);
            this.f115681p.addUpdateListener(new C44506b(this, jVar));
            this.f115681p.start();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f115673h;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    /* renamed from: b */
    private final void mo114768b() {
        Behavior behavior = this.f115683r;
        BaseBehavior.SavedState savedState = null;
        if (!(behavior == null || this.f115675j == -1 || this.f115667b != 0)) {
            savedState = behavior.mo47424w(androidx.customview.view.AbsSavedState.f6115c, this);
        }
        this.f115675j = -1;
        this.f115676k = -1;
        this.f115677l = -1;
        if (savedState != null) {
            this.f115683r.mo47426y(savedState, false);
        }
    }

    public final void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(1);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r8 = r17
            r2 = 2132151245(0x7f160bcd, float:1.9944547E38)
            r3 = r15
            android.content.Context r2 = com.google.android.material.theme.p3518a.C44965a.m79936a(r15, r0, r8, r2)
            r14.<init>(r2, r0, r8)
            r9 = -1
            r1.f115675j = r9
            r1.f115676k = r9
            r1.f115677l = r9
            r10 = 0
            r1.f115667b = r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f115672g = r2
            android.content.Context r11 = r14.getContext()
            r12 = 1
            super.setOrientation(r12)
            android.view.ViewOutlineProvider r2 = r14.getOutlineProvider()
            android.view.ViewOutlineProvider r3 = android.view.ViewOutlineProvider.BACKGROUND
            if (r2 != r3) goto L_0x0038
            int[] r2 = com.google.android.material.appbar.C44505aa.f115732a
            android.view.ViewOutlineProvider r2 = android.view.ViewOutlineProvider.BOUNDS
            r14.setOutlineProvider(r2)
        L_0x0038:
            int[] r2 = com.google.android.material.appbar.C44505aa.f115732a
            android.content.Context r13 = r14.getContext()
            int[] r4 = com.google.android.material.appbar.C44505aa.f115732a
            r6 = 2132151245(0x7f160bcd, float:1.9944547E38)
            int[] r7 = new int[r10]
            r2 = r13
            r3 = r16
            r5 = r17
            android.content.res.TypedArray r2 = com.google.android.material.internal.C44733be.m79295a(r2, r3, r4, r5, r6, r7)
            boolean r3 = r2.hasValue(r10)     // Catch:{ all -> 0x00f7 }
            if (r3 == 0) goto L_0x005f
            int r3 = r2.getResourceId(r10, r10)     // Catch:{ all -> 0x00f7 }
            android.animation.StateListAnimator r3 = android.animation.AnimatorInflater.loadStateListAnimator(r13, r3)     // Catch:{ all -> 0x00f7 }
            r14.setStateListAnimator(r3)     // Catch:{ all -> 0x00f7 }
        L_0x005f:
            r2.recycle()
            int[] r4 = com.google.android.material.appbar.C44528x.f115772a
            r6 = 2132151245(0x7f160bcd, float:1.9944547E38)
            int[] r7 = new int[r10]
            r2 = r11
            r3 = r16
            r5 = r17
            android.content.res.TypedArray r0 = com.google.android.material.internal.C44733be.m79295a(r2, r3, r4, r5, r6, r7)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r10)
            androidx.core.p098j.C2043bi.m5530X(r14, r2)
            android.graphics.drawable.Drawable r2 = r14.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x009d
            android.graphics.drawable.Drawable r2 = r14.getBackground()
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            com.google.android.material.l.j r3 = new com.google.android.material.l.j
            r3.<init>()
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r3.mo48124V(r2)
            r3.mo48121S(r11)
            androidx.core.p098j.C2043bi.m5530X(r14, r3)
        L_0x009d:
            r2 = 4
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00ab
            boolean r2 = r0.getBoolean(r2, r10)
            r14.mo47405o(r2, r10, r10)
        L_0x00ab:
            r2 = 3
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00ba
            int r2 = r0.getDimensionPixelSize(r2, r10)
            float r2 = (float) r2
            com.google.android.material.appbar.C44505aa.m78682a(r14, r2)
        L_0x00ba:
            r2 = 2
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00c8
            boolean r2 = r0.getBoolean(r2, r10)
            r14.setKeyboardNavigationCluster(r2)
        L_0x00c8:
            boolean r2 = r0.hasValue(r12)
            if (r2 == 0) goto L_0x00d5
            boolean r2 = r0.getBoolean(r12, r10)
            r14.setTouchscreenBlocksFocus(r2)
        L_0x00d5:
            r2 = 5
            boolean r2 = r0.getBoolean(r2, r10)
            r1.f115670e = r2
            r2 = 6
            int r2 = r0.getResourceId(r2, r9)
            r1.f115671f = r2
            r2 = 7
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r14.mo47411p(r2)
            r0.recycle()
            com.google.android.material.appbar.a r0 = new com.google.android.material.appbar.a
            r0.<init>(r14)
            androidx.core.p098j.C2043bi.m5555ai(r14, r0)
            return
        L_0x00f7:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
