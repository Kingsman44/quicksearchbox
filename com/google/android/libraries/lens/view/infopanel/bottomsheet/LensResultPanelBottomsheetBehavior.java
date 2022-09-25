package com.google.android.libraries.lens.view.infopanel.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
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
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1988h;
import androidx.customview.p103b.C2149g;
import androidx.customview.p103b.C2150h;
import androidx.customview.view.AbsSavedState;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.infopanel.C26985ac;
import com.google.android.libraries.lens.view.infopanel.InfoPanelView;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26969e;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27082i;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4566l.C60200dk;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: PG */
public final class LensResultPanelBottomsheetBehavior extends C1770c {

    /* renamed from: a */
    public static final C58974d f73737a = C58974d.m91135i("LRPBB");

    /* renamed from: A */
    private boolean f73738A;

    /* renamed from: B */
    private VelocityTracker f73739B;

    /* renamed from: C */
    private int f73740C;

    /* renamed from: D */
    private C27060g f73741D;

    /* renamed from: E */
    private C2061c f73742E;

    /* renamed from: F */
    private final C2149g f73743F = new C27056c(this);

    /* renamed from: b */
    public boolean f73744b = false;

    /* renamed from: c */
    public int f73745c;

    /* renamed from: d */
    public int f73746d;

    /* renamed from: e */
    public int f73747e;

    /* renamed from: f */
    public float f73748f = 0.2f;

    /* renamed from: g */
    public int f73749g = 0;

    /* renamed from: h */
    public boolean f73750h = true;

    /* renamed from: i */
    public int f73751i;

    /* renamed from: j */
    public boolean f73752j;

    /* renamed from: k */
    public int f73753k = 5;

    /* renamed from: l */
    public C2150h f73754l;

    /* renamed from: m */
    public int f73755m;

    /* renamed from: n */
    public Runnable f73756n = null;

    /* renamed from: o */
    public WeakReference f73757o;

    /* renamed from: p */
    public CoordinatorLayout f73758p;

    /* renamed from: q */
    public WeakReference f73759q;

    /* renamed from: r */
    public C27058e f73760r;

    /* renamed from: s */
    public int f73761s;

    /* renamed from: t */
    public boolean f73762t;

    /* renamed from: u */
    public C26244b f73763u;

    /* renamed from: v */
    public boolean f73764v;

    /* renamed from: w */
    private float f73765w;

    /* renamed from: x */
    private int f73766x;

    /* renamed from: y */
    private boolean f73767y;

    /* renamed from: z */
    private int f73768z;

    public LensResultPanelBottomsheetBehavior() {
    }

    public LensResultPanelBottomsheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27061h.f73780a);
        this.f73745c = Math.max(0, obtainStyledAttributes.getDimensionPixelSize(3, 0));
        this.f73752j = obtainStyledAttributes.getBoolean(2, true);
        this.f73746d = Math.max(0, obtainStyledAttributes.getInt(1, 0));
        obtainStyledAttributes.recycle();
        this.f73765w = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: D */
    private final void m50191D(View view, C1988h hVar, int i) {
        C2043bi.m5523Q(view, hVar, (CharSequence) null, new C27054a(this, i));
    }

    /* renamed from: E */
    private final void m50192E() {
        this.f73761s = -1;
        VelocityTracker velocityTracker = this.f73739B;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f73739B = null;
        }
    }

    /* renamed from: F */
    private final void m50193F(boolean z) {
        WeakReference weakReference = this.f73759q;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            if (z) {
                C2061c cVar = this.f73742E;
                if (cVar != null) {
                    C2043bi.m5526T(view, cVar);
                    return;
                }
                return;
            }
            C2043bi.m5526T(view, new C27057d());
        }
    }

    /* renamed from: G */
    private final void m50194G(int i) {
        View view;
        WeakReference weakReference = this.f73757o;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C2043bi.m5569aw(view)) {
                Runnable runnable = this.f73756n;
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                    this.f73756n = null;
                }
                mo32496A(view, i);
                return;
            }
            C27055b bVar = new C27055b(this, view, i);
            this.f73756n = bVar;
            view.post(bVar);
        }
    }

    /* renamed from: H */
    private final void m50195H() {
        View view;
        WeakReference weakReference = this.f73757o;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C2043bi.m5522P(view, 524288);
            C2043bi.m5522P(view, C89885b.HTTP_VALUE);
            C2043bi.m5522P(view, 1048576);
            if (this.f73752j && this.f73753k != 5) {
                m50191D(view, C1988h.f5911i, 5);
            }
            if (this.f73753k == 3) {
                m50191D(view, C1988h.f5910h, 6);
                m50193F(true);
                return;
            }
            m50193F(false);
            int i = this.f73753k;
            if (i == 6) {
                m50191D(view, C1988h.f5910h, 4);
                m50191D(view, C1988h.f5909g, 3);
            } else if (i == 4) {
                m50191D(view, C1988h.f5909g, 6);
            }
        }
    }

    /* renamed from: s */
    static View m50196s(View view) {
        if (C2043bi.m5571ay(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View s = m50196s(viewGroup.getChildAt(i));
            if (s != null) {
                return s;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static LensResultPanelBottomsheetBehavior m50197t(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C1773f) {
            C1770c cVar = ((C1773f) layoutParams).f5523a;
            if (cVar instanceof LensResultPanelBottomsheetBehavior) {
                return (LensResultPanelBottomsheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: A */
    public final void mo32496A(View view, int i) {
        int i2;
        if (C2043bi.m5569aw(view)) {
            if (i == 4) {
                i2 = this.f73751i;
            } else if (i == 6) {
                i2 = this.f73747e;
            } else if (i == 3) {
                i2 = this.f73746d;
            } else if (!this.f73752j || i != 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "Illegal state argument: %d", new Object[]{Integer.valueOf(i)}));
            } else {
                i2 = this.f73755m;
                i = 5;
            }
            mo32497B(view, i, i2, false);
        }
    }

    /* renamed from: B */
    public final void mo32497B(View view, int i, int i2, boolean z) {
        C2150h hVar = this.f73754l;
        boolean z2 = false;
        if (hVar != null && (!z ? hVar.mo5413j(view, view.getLeft(), i2) : hVar.mo5411h(view.getLeft(), i2))) {
            z2 = true;
        }
        view.getLeft();
        view.getTop();
        view.getLeft();
        if (z2) {
            mo32504z(2);
            if (this.f73741D == null) {
                this.f73741D = new C27060g(this, view, i);
            }
            C27060g gVar = this.f73741D;
            if (!gVar.f73777b) {
                gVar.f73776a = i;
                C2043bi.m5520N(view, gVar);
                this.f73741D.f73777b = true;
                return;
            }
            gVar.f73776a = i;
            return;
        }
        mo32504z(i);
    }

    /* renamed from: C */
    public final boolean mo32498C(View view, float f) {
        if (view.getTop() >= this.f73751i && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f73751i)) / ((float) this.f73745c) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo4953a(C1773f fVar) {
        this.f73757o = null;
        this.f73754l = null;
    }

    /* renamed from: c */
    public final void mo4955c() {
        this.f73757o = null;
        this.f73754l = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (true != r3) goto L_0x009c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4956d(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.f73746d
            r0 = 3
            if (r3 != r6) goto L_0x000d
            r2.mo32504z(r0)
            return
        L_0x000d:
            java.lang.ref.WeakReference r3 = r2.f73759q
            if (r3 == 0) goto L_0x00a8
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00a8
            boolean r3 = r2.f73738A
            if (r3 != 0) goto L_0x001d
            goto L_0x00a8
        L_0x001d:
            int r3 = r2.f73768z
            r5 = 6
            if (r3 <= 0) goto L_0x0030
            boolean r3 = r2.f73750h
            if (r3 == 0) goto L_0x0029
            int r6 = r2.f73746d
            goto L_0x002b
        L_0x0029:
            int r6 = r2.f73747e
        L_0x002b:
            r1 = 1
            if (r1 == r3) goto L_0x00a2
            goto L_0x009c
        L_0x0030:
            boolean r3 = r2.f73752j
            if (r3 == 0) goto L_0x0053
            android.view.VelocityTracker r3 = r2.f73739B
            if (r3 != 0) goto L_0x003a
            r3 = 0
            goto L_0x0049
        L_0x003a:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f73765w
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f73739B
            int r6 = r2.f73761s
            float r3 = r3.getYVelocity(r6)
        L_0x0049:
            boolean r3 = r2.mo32498C(r4, r3)
            if (r3 == 0) goto L_0x0053
            int r6 = r2.f73755m
            r0 = 5
            goto L_0x00a2
        L_0x0053:
            int r3 = r2.f73768z
            r6 = 4
            if (r3 != 0) goto L_0x0085
            int r3 = r4.getTop()
            int r1 = r2.f73747e
            if (r3 >= r1) goto L_0x0070
            int r6 = r2.f73751i
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L_0x006d
            int r6 = r2.f73746d
            goto L_0x00a2
        L_0x006d:
            int r6 = r2.f73747e
            goto L_0x009c
        L_0x0070:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f73751i
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0082
            int r6 = r2.f73747e
            goto L_0x009c
        L_0x0082:
            int r3 = r2.f73751i
            goto L_0x00a0
        L_0x0085:
            int r3 = r4.getTop()
            int r0 = r2.f73747e
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f73751i
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x009e
            int r6 = r2.f73747e
        L_0x009c:
            r0 = 6
            goto L_0x00a2
        L_0x009e:
            int r3 = r2.f73751i
        L_0x00a0:
            r6 = r3
            r0 = 4
        L_0x00a2:
            r3 = 0
            r2.mo32497B(r4, r0, r6, r3)
            r2.f73738A = r3
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior.mo4956d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: f */
    public final boolean mo4958f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f73744b) {
            this.f73767y = true;
            return false;
        } else if (!view.isShown()) {
            this.f73767y = true;
            return false;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m50192E();
                actionMasked = 0;
            }
            if (this.f73739B == null) {
                this.f73739B = VelocityTracker.obtain();
            }
            this.f73739B.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.f73740C = (int) motionEvent.getY();
                if (this.f73753k != 2) {
                    WeakReference weakReference = this.f73759q;
                    View view3 = weakReference != null ? (View) weakReference.get() : null;
                    if (view3 != null && coordinatorLayout.mo4928l(view3, x, this.f73740C)) {
                        this.f73761s = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f73762t = true;
                    }
                }
                this.f73767y = this.f73761s == -1 && !coordinatorLayout.mo4928l(view, x, this.f73740C);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.f73762t = false;
                this.f73761s = -1;
                if (this.f73767y) {
                    this.f73767y = false;
                    return false;
                }
            }
            C2150h hVar = this.f73754l;
            boolean z = this.f73764v && this.f73763u.mo31462g(C26239a.ONELRP_REMOVE_CUSTOM_SCROLLING) && this.f73740C >= coordinatorLayout.getHeight() - coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.filter_carousel_height_with_borders);
            if (!this.f73767y && hVar != null && !z && hVar.mo5412i(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.f73759q;
            if (weakReference2 != null) {
                view2 = (View) weakReference2.get();
            }
            return actionMasked == 2 && view2 != null && !this.f73767y && this.f73753k != 1 && !coordinatorLayout.mo4928l(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && hVar != null && Math.abs(((float) this.f73740C) - motionEvent.getY()) > ((float) hVar.f6093b);
        }
    }

    /* renamed from: g */
    public final boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f73758p = coordinatorLayout;
        if (C2043bi.m5564ar(coordinatorLayout) && !C2043bi.m5564ar(view)) {
            view.setFitsSystemWindows(true);
        }
        View s = m50196s(view);
        this.f73759q = new WeakReference(s);
        if (this.f73742E == null && s != null) {
            this.f73742E = C2043bi.m5591t(s);
        }
        if (this.f73757o == null) {
            this.f73757o = new WeakReference(view);
            m50195H();
            if (C2043bi.m5575d(view) == 0) {
                C2043bi.m5551ae(view, 1);
            }
        }
        if (this.f73754l == null) {
            this.f73754l = C2150h.m5963b(coordinatorLayout, this.f73743F);
        }
        int top = view.getTop();
        coordinatorLayout.mo4927k(view, i);
        this.f73755m = coordinatorLayout.getHeight();
        mo32500v();
        mo32499u();
        int i2 = this.f73753k;
        if (i2 == 3) {
            C2043bi.m5517K(view, this.f73746d);
        } else if (i2 == 6) {
            C2043bi.m5517K(view, this.f73747e);
        } else if (this.f73752j && i2 == 5) {
            C2043bi.m5517K(view, this.f73755m);
        } else if (i2 == 4) {
            C2043bi.m5517K(view, this.f73751i);
        } else if (i2 == 1 || i2 == 2) {
            C2043bi.m5517K(view, top - view.getTop());
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo4960h(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference = this.f73759q;
        return (weakReference == null || view2 != weakReference.get() || this.f73753k == 3) ? false : true;
    }

    /* renamed from: j */
    public final boolean mo4962j(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.f73768z = 0;
        this.f73738A = false;
        return (i & 2) != 0;
    }

    /* renamed from: k */
    public final boolean mo4963k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f73753k == 1 && actionMasked == 0) {
            return true;
        }
        C2150h hVar = this.f73754l;
        if (hVar != null) {
            hVar.mo5408e(motionEvent);
        }
        if (actionMasked == 0) {
            m50192E();
        }
        if (this.f73739B == null) {
            this.f73739B = VelocityTracker.obtain();
        }
        this.f73739B.addMovement(motionEvent);
        if (hVar != null && actionMasked == 2 && !this.f73767y && Math.abs(((float) this.f73740C) - motionEvent.getY()) > ((float) hVar.f6093b)) {
            hVar.mo5407d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f73767y) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void mo4967o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
        int i3;
        if (i2 != 1) {
            WeakReference weakReference = this.f73759q;
            if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
                if (this.f73744b) {
                    iArr[1] = i;
                    return;
                }
                int top = view.getTop();
                int i4 = top - i;
                if (i > 0) {
                    if (this.f73750h) {
                        i3 = this.f73746d;
                    } else {
                        i3 = this.f73747e;
                    }
                    if (i4 < i3) {
                        int i5 = top - i3;
                        iArr[1] = i5;
                        C2043bi.m5517K(view, -i5);
                        mo32504z(true != this.f73750h ? 6 : 3);
                    } else {
                        iArr[1] = i;
                        C2043bi.m5517K(view, -i);
                        mo32504z(1);
                    }
                } else if (i < 0 && !view2.canScrollVertically(-1)) {
                    int i6 = this.f73751i;
                    if (i4 <= i6 || this.f73752j) {
                        iArr[1] = i;
                        C2043bi.m5517K(view, -i);
                        mo32504z(1);
                    } else {
                        int i7 = top - i6;
                        iArr[1] = i7;
                        C2043bi.m5517K(view, -i7);
                        mo32504z(4);
                    }
                }
                int i8 = iArr[1];
                mo32501w(view.getTop());
                this.f73768z = i;
                this.f73738A = true;
            }
        }
    }

    /* renamed from: p */
    public final void mo4968p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    /* renamed from: q */
    public final void mo4969q(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        savedState.f6116d.getClass();
        int i = savedState.f73769a;
        if (i == 1 || i == 2) {
            this.f73753k = 4;
        } else {
            this.f73753k = i;
        }
    }

    /* renamed from: u */
    public final void mo32499u() {
        this.f73751i = this.f73755m - this.f73745c;
    }

    /* renamed from: v */
    public final void mo32500v() {
        int i = this.f73766x;
        if (i > 0) {
            this.f73747e = this.f73755m - i;
        } else {
            this.f73747e = ((int) (((float) this.f73755m) * (1.0f - this.f73748f))) - this.f73749g;
        }
    }

    /* renamed from: w */
    public final void mo32501w(int i) {
        C27058e eVar;
        WeakReference weakReference = this.f73757o;
        if (weakReference != null && ((View) weakReference.get()) != null && (eVar = this.f73760r) != null) {
            int i2 = this.f73751i;
            if (i > i2) {
                eVar.mo32449a(((float) (i2 - i)) / ((float) (this.f73755m - i2)));
            } else {
                eVar.mo32449a(((float) (i2 - i)) / ((float) (i2 - this.f73746d)));
            }
        }
    }

    /* renamed from: x */
    public final void mo32502x(int i) {
        if (this.f73766x != i) {
            this.f73766x = i;
            WeakReference weakReference = this.f73757o;
            if (weakReference != null) {
                mo32500v();
                if (this.f73753k == 6 && ((View) weakReference.get()) != null) {
                    m50194G(this.f73753k);
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo32503y(int i) {
        if (this.f73757o != null) {
            m50194G(i);
            return;
        }
        if (!(i == 4 || i == 3 || i == 6)) {
            if (this.f73752j && i == 5) {
                i = 5;
            } else {
                return;
            }
        }
        this.f73753k = i;
    }

    /* renamed from: z */
    public final void mo32504z(int i) {
        if (this.f73753k != i) {
            this.f73753k = i;
            WeakReference weakReference = this.f73757o;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                C27058e eVar = this.f73760r;
                if (eVar != null) {
                    switch (i) {
                        case 1:
                        case 2:
                            ((C26985ac) eVar).f73583b.mo32364n(C26969e.m50032a(i));
                            break;
                        case 3:
                            int i2 = InfoPanelView.f73487q;
                            ((C26985ac) eVar).f73583b.mo32364n(C26969e.m50032a(i));
                            break;
                        case 4:
                            int i3 = InfoPanelView.f73487q;
                            ((C26985ac) eVar).f73583b.mo32364n(C26969e.m50032a(i));
                            break;
                        case 5:
                            int i4 = InfoPanelView.f73487q;
                            C26985ac acVar = (C26985ac) eVar;
                            if (!acVar.f73584c) {
                                acVar.f73583b.mo32364n(C26969e.m50032a(i));
                                break;
                            } else {
                                acVar.f73582a.mo32503y(4);
                                break;
                            }
                        case 6:
                            int i5 = InfoPanelView.f73487q;
                            ((C26985ac) eVar).f73583b.mo32364n(C26969e.m50032a(i));
                            break;
                    }
                    if (i == 1) {
                        ((C26985ac) eVar).f73584c = true;
                    } else if (i != 2) {
                        ((C26985ac) eVar).f73584c = false;
                    }
                    if (i == 6 || i == 3 || i == 4) {
                        C26985ac acVar2 = (C26985ac) eVar;
                        int i6 = acVar2.f73585d;
                        if (C26985ac.m50078c(i6) && C26985ac.m50077b(i)) {
                            C47393f.m84237h(new C27082i(), acVar2.f73583b);
                            acVar2.f73583b.mo32361k(C60200dk.DOWN);
                        } else if (C26985ac.m50077b(i6) && C26985ac.m50078c(i)) {
                            acVar2.f73583b.mo32361k(C60200dk.UP);
                        }
                        acVar2.f73585d = i;
                    }
                }
                m50195H();
            }
        }
    }

    /* compiled from: PG */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C27059f();

        /* renamed from: a */
        final int f73769a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f73769a = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeInt(this.f73769a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f73769a = i;
        }
    }

    /* renamed from: r */
    public final Parcelable mo4970r(View view) {
        android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        absSavedState.getClass();
        return new SavedState((Parcelable) absSavedState, this.f73753k);
    }
}
