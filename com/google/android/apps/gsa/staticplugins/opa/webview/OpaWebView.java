package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.animation.Animator;
import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import androidx.core.p098j.C2100o;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113926aa;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114068ed;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114069ee;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianDynamicResponseLayerView;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianRecyclerView;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114216d;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class OpaWebView extends C114216d {

    /* renamed from: o */
    private static final C59071e f316491o = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView");

    /* renamed from: a */
    int f316492a;

    /* renamed from: b */
    public int f316493b;

    /* renamed from: c */
    public int f316494c;

    /* renamed from: d */
    int f316495d;

    /* renamed from: e */
    boolean f316496e = true;

    /* renamed from: f */
    boolean f316497f = true;

    /* renamed from: g */
    public boolean f316498g;

    /* renamed from: h */
    int f316499h;

    /* renamed from: i */
    public boolean f316500i;

    /* renamed from: j */
    public final List f316501j = new ArrayList();

    /* renamed from: k */
    boolean f316502k;

    /* renamed from: l */
    public boolean f316503l;

    /* renamed from: m */
    long f316504m;

    /* renamed from: n */
    public C114069ee f316505n;

    /* renamed from: p */
    private ViewGroup f316506p;

    /* renamed from: q */
    private boolean f316507q;

    /* renamed from: r */
    private boolean f316508r;

    /* renamed from: s */
    private float f316509s;

    /* renamed from: t */
    private boolean f316510t;

    /* renamed from: u */
    private final ViewTreeObserver.OnGlobalLayoutListener f316511u = new C114239r(this);

    public OpaWebView(Context context) {
        super(context);
    }

    /* renamed from: l */
    private final void m189386l(float f, int i) {
        if (m189391q(f, i == 1 ? -1 : 1)) {
            this.f316508r = true;
            if (this.f316502k) {
                this.f316507q = false;
                requestDisallowInterceptTouchEvent(true);
            }
        } else if (m189391q(f, i)) {
            this.f316507q = true;
            requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: o */
    private final boolean m189389o() {
        return canScrollVertically(1) || !this.f316497f;
    }

    /* renamed from: p */
    private final boolean m189390p(View view) {
        View view2 = this;
        while (view2.getParent() instanceof View) {
            view2 = (View) view2.getParent();
            if (view == view2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private final boolean m189391q(float f, int i) {
        return i == 1 ? f - this.f316509s < ((float) (-this.f316492a)) : f - this.f316509s > ((float) this.f316492a);
    }

    /* renamed from: a */
    public final int mo101221a() {
        return ((int) Math.floor((double) (((float) getContentHeight()) * getResources().getDisplayMetrics().density))) - this.f316499h;
    }

    /* renamed from: b */
    public final void mo101222b(C2100o oVar) {
        this.f316501j.add(oVar);
    }

    /* renamed from: c */
    public final void mo101223c(boolean z) {
        this.f316497f = z;
        C114069ee eeVar = this.f316505n;
        if (eeVar != null) {
            C114071eg egVar = eeVar.f315778a;
            egVar.f315828aL = !z;
            if (z) {
                if (egVar.f315983s.mo96407t()) {
                    eeVar.f315778a.f315853ak.mo100794r();
                } else {
                    eeVar.f315778a.mo100848bJ(false);
                }
                eeVar.f315778a.mo101025ck(true);
                return;
            }
            if (egVar.f315983s.mo96407t()) {
                C113926aa aaVar = eeVar.f315778a.f315853ak;
                aaVar.mo100788l();
                aaVar.mo100784h();
            } else {
                eeVar.f315778a.f315853ak.mo100786j(false);
            }
            eeVar.f315778a.mo101022ce();
            C114071eg egVar2 = eeVar.f315778a;
            if (!C114071eg.m188864do(egVar2.f315829aM)) {
                egVar2.mo101025ck(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int computeVerticalScrollRange() {
        return (super.computeVerticalScrollRange() - this.f316499h) + this.f316495d;
    }

    /* renamed from: d */
    public final void mo101225d(boolean z, boolean z2) {
        this.f316496e = z;
        C114069ee eeVar = this.f316505n;
        if (eeVar != null) {
            C114071eg egVar = eeVar.f315778a;
            if (egVar.f315827aK == z) {
                ViewGroup viewGroup = egVar.f315988x;
                viewGroup.getClass();
                C28295m.m52919e(viewGroup, new C28292j(true != z2 ? 118207 : 118208));
                C89949q.m146521e(C28285c.m52874a(eeVar.f315778a.f315988x, 472), false);
                C114071eg egVar2 = eeVar.f315778a;
                egVar2.f315827aK = !z;
                RecyclerView aT = egVar2.mo100994aT();
                if (z) {
                    eeVar.f315778a.mo101027cn();
                    eeVar.f315778a.mo101000bL();
                    aT.setAlpha(0.0f);
                    aT.setVisibility(0);
                    aT.animate().setListener((Animator.AnimatorListener) null).alpha(1.0f).setDuration(200).start();
                    return;
                }
                eeVar.f315778a.mo101026cm();
                C114071eg egVar3 = eeVar.f315778a;
                if (egVar3.f315856an.mo101172s() == 3) {
                    egVar3.f315856an.mo101173t(3);
                }
                aT.animate().alpha(0.0f).setDuration(200).setListener(new C114068ed(aT)).start();
            }
        }
    }

    /* renamed from: e */
    public final void mo101226e(ValueCallback valueCallback) {
        int i = this.f316493b;
        evaluateJavascript("javascript:(function(){ document.body.style.paddingTop = '" + i + "px';})();", valueCallback);
    }

    /* renamed from: f */
    public final void mo101227f() {
        int aN;
        if (this.f316504m <= 0) {
            setVisibility(0);
        } else if (getVisibility() != 0) {
            setAlpha(0.0f);
            setVisibility(0);
            animate().alpha(1.0f).setDuration(this.f316504m).start();
        }
        this.f316510t = computeVerticalScrollRange() - getMeasuredHeight() <= getScrollY();
        C114069ee eeVar = this.f316505n;
        if (eeVar != null) {
            if (eeVar.f315778a.mo101037dg() && eeVar.f315778a.f315982r.mo79746e(C90014bt.f247389gI)) {
                OpaWebView opaWebView = eeVar.f315778a.f315824aH;
                opaWebView.getClass();
                int min = Math.min(opaWebView.mo101221a() + eeVar.f315778a.mo100988aK(), eeVar.f315778a.mo100986aI(false));
                ViewGroup aY = eeVar.f315778a.mo100995aY();
                int i = aY.getLayoutParams().height;
                aY.getHeight();
                if (min > 0) {
                    eeVar.f315778a.mo100998bG(min);
                }
            }
            if (eeVar.f315778a.mo101037dg() && (eeVar.f315778a.f315982r.mo79746e(C90029ch.f248238aY) || (eeVar.f315778a.f315982r.mo79746e(C90029ch.f248239aZ) && C87566i.m142287ak(eeVar.f315778a.f315833aQ.getIntent().getExtras())))) {
                OpaWebView opaWebView2 = eeVar.f315778a.f315824aH;
                opaWebView2.getClass();
                if (opaWebView2.mo101221a() > eeVar.f315778a.mo100986aI(false) && (aN = eeVar.f315778a.mo100990aN()) > 0) {
                    ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = eeVar.f315778a.f315865aw;
                    valyrianDynamicResponseLayerView.getClass();
                    C58976aa aaVar = C58975e.f156826a;
                    valyrianDynamicResponseLayerView.f316102c = aN;
                    valyrianDynamicResponseLayerView.requestLayout();
                    C114071eg egVar = eeVar.f315778a;
                    ValyrianRecyclerView valyrianRecyclerView = egVar.f315866ax;
                    valyrianRecyclerView.getClass();
                    valyrianRecyclerView.f316112b = aN;
                    egVar.mo100998bG(aN);
                }
            }
            eeVar.f315778a.f315847ae.mo101149a();
        }
    }

    /* renamed from: g */
    public final void mo101228g(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.f316506p;
        if (viewGroup2 != viewGroup) {
            if (viewGroup2 != null) {
                m189388n();
            }
            this.f316506p = viewGroup;
            if (viewGroup != null && m189390p(viewGroup)) {
                m189387m();
                mo101229h();
            }
        }
    }

    /* renamed from: h */
    public final void mo101229h() {
        ViewGroup viewGroup = this.f316506p;
        if (viewGroup != null && m189390p(viewGroup)) {
            ViewGroup viewGroup2 = this.f316506p;
            viewGroup2.getClass();
            int height = viewGroup2.getHeight();
            int i = this.f316494c;
            if (i != 0) {
                height -= i;
            }
            if (getResources().getConfiguration().orientation != 2) {
                int max = Math.max(height, viewGroup2.getWidth());
                this.f316495d = max - height;
                height = max;
            } else {
                this.f316495d = 0;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null && height != layoutParams.height) {
                layoutParams.height = height;
                setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo101230i() {
        return mo101232k();
    }

    /* renamed from: j */
    public final boolean mo101231j() {
        return m189389o() && !this.f316510t;
    }

    /* renamed from: k */
    public final boolean mo101232k() {
        return canScrollVertically(-1) || !this.f316496e;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup viewGroup = this.f316506p;
        if (viewGroup != null && m189390p(viewGroup)) {
            m189387m();
            mo101229h();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f316506p != null) {
            m189388n();
            this.f316506p = null;
        } else {
            ((C59052c) ((C59052c) f316491o.mo56226d()).mo56372aa(28783)).mo56386p("RecyclerView is null at onDetachedFromWindow");
        }
        boolean z = this.f316500i;
        this.f316500i = false;
        if (!z) {
            loadUrl("about:blank");
        }
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onScrollChanged(i, i2, i3, i4);
        C114069ee eeVar = this.f316505n;
        if (eeVar != null) {
            C59071e eVar = C114071eg.f315790j;
            eeVar.f315778a.mo101037dg();
            eeVar.f315778a.mo100994aT().setTranslationY((float) (-i2));
            if (eeVar.f315778a.mo101037dg() && i2 > i4) {
                if (eeVar.f315778a.f315982r.mo79746e(C90029ch.f248237aX)) {
                    i5 = eeVar.f315778a.mo100990aN();
                } else {
                    i5 = eeVar.f315778a.mo100986aI(false);
                }
                if (i5 > eeVar.f315778a.mo100995aY().getMinimumHeight()) {
                    if (eeVar.f315778a.f315982r.mo79746e(C90029ch.f248237aX)) {
                        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = eeVar.f315778a.f315865aw;
                        valyrianDynamicResponseLayerView.getClass();
                        C58976aa aaVar = C58975e.f156826a;
                        valyrianDynamicResponseLayerView.f316102c = i5;
                        valyrianDynamicResponseLayerView.requestLayout();
                        ValyrianRecyclerView valyrianRecyclerView = eeVar.f315778a.f315866ax;
                        valyrianRecyclerView.getClass();
                        valyrianRecyclerView.f316112b = i5;
                    }
                    eeVar.f315778a.mo100998bG(i5);
                }
            }
            eeVar.f315778a.f315847ae.mo101149a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 != 3) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 == r2) goto L_0x0036
            r3 = 2
            if (r0 == r3) goto L_0x0011
            r2 = 3
            if (r0 == r2) goto L_0x0036
            goto L_0x006f
        L_0x0011:
            boolean r0 = r4.f316508r
            if (r0 != 0) goto L_0x006f
            boolean r0 = r4.f316507q
            if (r0 != 0) goto L_0x006f
            boolean r0 = r4.m189389o()
            if (r0 != 0) goto L_0x0027
            float r0 = r5.getY()
            r4.m189386l(r0, r2)
            goto L_0x006f
        L_0x0027:
            boolean r0 = r4.mo101232k()
            if (r0 != 0) goto L_0x006f
            float r0 = r5.getY()
            r1 = -1
            r4.m189386l(r0, r1)
            goto L_0x006f
        L_0x0036:
            r4.requestDisallowInterceptTouchEvent(r1)
            r4.f316508r = r1
            r4.f316507q = r1
            goto L_0x006f
        L_0x003e:
            boolean r0 = r4.mo101232k()
            if (r0 == 0) goto L_0x0050
            boolean r0 = r4.m189389o()
            if (r0 == 0) goto L_0x0050
            r4.f316508r = r2
            r4.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0069
        L_0x0050:
            boolean r0 = r4.mo101232k()
            if (r0 != 0) goto L_0x0062
            boolean r0 = r4.m189389o()
            if (r0 != 0) goto L_0x0062
            r4.f316507q = r2
            r4.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0069
        L_0x0062:
            boolean r0 = r4.f316502k
            if (r0 != 0) goto L_0x0069
            r4.requestDisallowInterceptTouchEvent(r2)
        L_0x0069:
            float r0 = r5.getY()
            r4.f316509s = r0
        L_0x006f:
            java.util.List r0 = r4.f316501j
            java.util.Iterator r0 = r0.iterator()
        L_0x0075:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = r0.next()
            androidx.core.j.o r1 = (androidx.core.p098j.C2100o) r1
            androidx.core.j.n r1 = r1.f6015a
            android.view.GestureDetector r1 = r1.f6014a
            r1.onTouchEvent(r5)
            goto L_0x0075
        L_0x0089:
            boolean r5 = super.onTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = i2;
        int computeVerticalScrollRange = (computeVerticalScrollRange() - getMeasuredHeight()) - i4;
        if (i9 >= computeVerticalScrollRange) {
            i9 = Math.min(i2, Math.max(0, computeVerticalScrollRange));
            this.f316510t = true;
        } else {
            this.f316510t = false;
        }
        return super.overScrollBy(i, i9, i3, i4, i5, i6, i7, i8, z);
    }

    public OpaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: m */
    private final void m189387m() {
        ViewGroup viewGroup = this.f316506p;
        viewGroup.getClass();
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.f316511u);
        viewGroup.setOnHierarchyChangeListener(new C114244w(this));
    }

    /* renamed from: n */
    private final void m189388n() {
        ViewGroup viewGroup = this.f316506p;
        viewGroup.getClass();
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this.f316511u);
        viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
    }

    public OpaWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
