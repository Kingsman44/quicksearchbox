package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class BaseTransientBottomBar {

    /* renamed from: a */
    static final Handler f117073a = new Handler(Looper.getMainLooper(), new C44877h());

    /* renamed from: b */
    public static final String f117074b = "BaseTransientBottomBar";

    /* renamed from: v */
    private static final TimeInterpolator f117075v = C44497b.f115651b;

    /* renamed from: w */
    private static final TimeInterpolator f117076w = C44497b.f115650a;

    /* renamed from: x */
    private static final TimeInterpolator f117077x = C44497b.f115653d;

    /* renamed from: y */
    private static final int[] f117078y = {R.attr.snackbarStyle};

    /* renamed from: A */
    private C44886q f117079A;

    /* renamed from: B */
    private final Runnable f117080B = new C44878i(this);

    /* renamed from: C */
    private final AccessibilityManager f117081C;

    /* renamed from: c */
    public final int f117082c;

    /* renamed from: d */
    public final int f117083d;

    /* renamed from: e */
    public final int f117084e;

    /* renamed from: f */
    public final TimeInterpolator f117085f;

    /* renamed from: g */
    public final TimeInterpolator f117086g;

    /* renamed from: h */
    public final ViewGroup f117087h;

    /* renamed from: i */
    public final Context f117088i;

    /* renamed from: j */
    public final C44890u f117089j;

    /* renamed from: k */
    public int f117090k;

    /* renamed from: l */
    public final boolean f117091l = false;

    /* renamed from: m */
    public int f117092m;

    /* renamed from: n */
    public int f117093n;

    /* renamed from: o */
    public int f117094o;

    /* renamed from: p */
    public int f117095p;

    /* renamed from: q */
    public int f117096q;

    /* renamed from: r */
    public boolean f117097r;

    /* renamed from: s */
    public List f117098s;

    /* renamed from: t */
    public final SnackbarContentLayout f117099t;

    /* renamed from: u */
    public final C44881l f117100u = new C44881l(this);

    /* renamed from: z */
    private final TimeInterpolator f117101z;

    /* compiled from: PG */
    public class Behavior extends SwipeDismissBehavior {

        /* renamed from: g */
        public final C44888s f117102g = new C44888s(this);

        /* renamed from: f */
        public final boolean mo4958f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C44888s sVar = this.f117102g;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C44870aa.m79667a().mo48362f(sVar.f117135a);
                }
            } else if (coordinatorLayout.mo4928l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C44870aa.m79667a().mo48361e(sVar.f117135a);
            }
            return super.mo4958f(coordinatorLayout, view, motionEvent);
        }

        /* renamed from: s */
        public final boolean mo47491s(View view) {
            return view instanceof C44890u;
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout != null) {
            this.f117087h = viewGroup;
            this.f117099t = snackbarContentLayout;
            this.f117088i = context;
            C44733be.m79297c(context);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f117078y);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            C44890u uVar = (C44890u) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
            this.f117089j = uVar;
            uVar.f117137a = this;
            float f = uVar.f117140d;
            if (f != 1.0f) {
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
                snackbarContentLayout2.f117108b.setTextColor(C44535e.m78721d(C44535e.m78719b(view, R.attr.colorSurface), snackbarContentLayout2.f117108b.getCurrentTextColor(), f));
            }
            ((SnackbarContentLayout) view).f117110d = uVar.f117141e;
            uVar.addView(view);
            C2043bi.m5527U(uVar, 1);
            C2043bi.m5551ae(uVar, 1);
            C2043bi.m5549ac(uVar, true);
            C2043bi.m5555ai(uVar, new C44879j(this));
            C2043bi.m5526T(uVar, new C44880k(this));
            this.f117081C = (AccessibilityManager) context.getSystemService("accessibility");
            this.f117084e = C44693c.m79225a(context, R.attr.motionDurationLong2, 250);
            this.f117082c = C44693c.m79225a(context, R.attr.motionDurationLong2, 150);
            this.f117083d = C44693c.m79225a(context, R.attr.motionDurationMedium1, 75);
            this.f117101z = C44688a.m79217a(context, R.attr.motionEasingEmphasizedInterpolator, f117076w);
            this.f117086g = C44688a.m79217a(context, R.attr.motionEasingEmphasizedInterpolator, f117077x);
            this.f117085f = C44688a.m79217a(context, R.attr.motionEasingEmphasizedInterpolator, f117075v);
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: a */
    public int mo48336a() {
        throw null;
    }

    /* renamed from: b */
    public final int mo48337b() {
        int height = this.f117089j.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f117089j.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* renamed from: c */
    public final ValueAnimator mo48338c(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f117101z);
        ofFloat.addUpdateListener(new C44871b(this));
        return ofFloat;
    }

    /* renamed from: d */
    public final View mo48339d() {
        C44886q qVar = this.f117079A;
        if (qVar == null) {
            return null;
        }
        return (View) qVar.f117133a.get();
    }

    /* renamed from: e */
    public final void mo48340e(int i) {
        C44895z zVar;
        C44870aa a = C44870aa.m79667a();
        C44881l lVar = this.f117100u;
        synchronized (a.f117114a) {
            if (a.mo48363g(lVar)) {
                zVar = a.f117116c;
            } else if (a.mo48364h(lVar)) {
                zVar = a.f117117d;
            }
            a.mo48360d(zVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo48341f(int i) {
        C44870aa a = C44870aa.m79667a();
        C44881l lVar = this.f117100u;
        synchronized (a.f117114a) {
            if (a.mo48363g(lVar)) {
                a.f117116c = null;
                if (a.f117117d != null) {
                    a.mo48359c();
                }
            }
        }
        List list = this.f117098s;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C44887r) this.f117098s.get(size)).mo33565b(this, i);
            }
        }
        ViewParent parent = this.f117089j.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f117089j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo48342g() {
        C44870aa a = C44870aa.m79667a();
        C44881l lVar = this.f117100u;
        synchronized (a.f117114a) {
            if (a.mo48363g(lVar)) {
                a.mo48358b(a.f117116c);
            }
        }
        List list = this.f117098s;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C44887r) this.f117098s.get(size)).mo33567d(this);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo48343h() {
        C44870aa a = C44870aa.m79667a();
        int a2 = mo48336a();
        C44881l lVar = this.f117100u;
        synchronized (a.f117114a) {
            if (a.mo48363g(lVar)) {
                C44895z zVar = a.f117116c;
                zVar.f117153b = a2;
                a.f117115b.removeCallbacksAndMessages(zVar);
                a.mo48358b(a.f117116c);
                return;
            }
            if (a.mo48364h(lVar)) {
                a.f117117d.f117153b = a2;
            } else {
                a.f117117d = new C44895z(a2, lVar);
            }
            C44895z zVar2 = a.f117116c;
            if (zVar2 == null || !a.mo48360d(zVar2, 4)) {
                a.f117116c = null;
                a.mo48359c();
            }
        }
    }

    /* renamed from: i */
    public final void mo48344i() {
        if (mo48347l()) {
            this.f117089j.post(new C44884o(this));
            return;
        }
        if (this.f117089j.getParent() != null) {
            this.f117089j.setVisibility(0);
        }
        mo48342g();
    }

    /* renamed from: j */
    public final void mo48345j() {
        ViewGroup.LayoutParams layoutParams = this.f117089j.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C44890u uVar = this.f117089j;
            if (uVar.f117142f != null) {
                if (uVar.getParent() != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = this.f117089j.f117142f.bottom + (mo48339d() != null ? this.f117096q : this.f117092m);
                    marginLayoutParams.leftMargin = this.f117089j.f117142f.left + this.f117093n;
                    marginLayoutParams.rightMargin = this.f117089j.f117142f.right + this.f117094o;
                    marginLayoutParams.topMargin = this.f117089j.f117142f.top;
                    this.f117089j.requestLayout();
                    if (this.f117095p > 0) {
                        ViewGroup.LayoutParams layoutParams2 = this.f117089j.getLayoutParams();
                        if ((layoutParams2 instanceof C1773f) && (((C1773f) layoutParams2).f5523a instanceof SwipeDismissBehavior)) {
                            this.f117089j.removeCallbacks(this.f117080B);
                            this.f117089j.post(this.f117080B);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.w(f117074b, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    /* renamed from: k */
    public final boolean mo48346k() {
        boolean z;
        C44870aa a = C44870aa.m79667a();
        C44881l lVar = this.f117100u;
        synchronized (a.f117114a) {
            z = true;
            if (!a.mo48363g(lVar)) {
                if (!a.mo48364h(lVar)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo48347l() {
        AccessibilityManager accessibilityManager = this.f117081C;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void mo48348m(C44887r rVar) {
        if (this.f117098s == null) {
            this.f117098s = new ArrayList();
        }
        this.f117098s.add(rVar);
    }

    /* renamed from: n */
    public final void mo48349n(View view) {
        C44886q qVar;
        C44886q qVar2 = this.f117079A;
        if (qVar2 != null) {
            qVar2.mo48379a();
        }
        if (view == null) {
            qVar = null;
        } else {
            C44886q qVar3 = new C44886q(this, view);
            if (C2043bi.m5569aw(view)) {
                C44741bm.m79312e(view, qVar3);
            }
            view.addOnAttachStateChangeListener(qVar3);
            qVar = qVar3;
        }
        this.f117079A = qVar;
    }

    /* renamed from: o */
    public final void mo48350o() {
        this.f117089j.f117139c = 1;
    }
}
