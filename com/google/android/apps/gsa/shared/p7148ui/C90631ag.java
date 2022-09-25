package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.ui.ag */
/* compiled from: PG */
public final class C90631ag {

    /* renamed from: v */
    private static final C59071e f253432v = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.ag");

    /* renamed from: a */
    public final Context f253433a;

    /* renamed from: b */
    public final C90633ai f253434b;

    /* renamed from: c */
    public final View f253435c;

    /* renamed from: d */
    public final OverScroller f253436d;

    /* renamed from: e */
    public final int f253437e;

    /* renamed from: f */
    public int f253438f;

    /* renamed from: g */
    public int f253439g;

    /* renamed from: h */
    public int f253440h;

    /* renamed from: i */
    public int f253441i;

    /* renamed from: j */
    public boolean f253442j;

    /* renamed from: k */
    public boolean f253443k;

    /* renamed from: l */
    public boolean f253444l;

    /* renamed from: m */
    public EdgeEffect f253445m;

    /* renamed from: n */
    public VelocityTracker f253446n;

    /* renamed from: o */
    public boolean f253447o;

    /* renamed from: p */
    public int f253448p = -1;

    /* renamed from: q */
    public boolean f253449q;

    /* renamed from: r */
    public int f253450r = -1;

    /* renamed from: s */
    public boolean f253451s = true;

    /* renamed from: t */
    public boolean f253452t;

    /* renamed from: u */
    public boolean f253453u;

    /* renamed from: w */
    private final ViewConfiguration f253454w;

    /* renamed from: x */
    private float f253455x;

    /* renamed from: y */
    private final C90630af f253456y;

    public C90631ag(Context context, C90633ai aiVar, View view, int i) {
        this.f253433a = context;
        this.f253434b = aiVar;
        this.f253435c = view;
        this.f253437e = i;
        C90630af afVar = new C90630af();
        this.f253456y = afVar;
        this.f253436d = new OverScroller(context, afVar);
        this.f253454w = ViewConfiguration.get(context);
    }

    /* renamed from: a */
    public final int mo84884a(int i) {
        if (i > 0) {
            return Math.min(i, this.f253434b.mo84791d() - this.f253434b.getScrollY());
        }
        if (i < 0) {
            return Math.max(i, -this.f253434b.getScrollY());
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo84885b(boolean z) {
        if (z && this.f253447o) {
            mo84888e(this.f253450r);
        }
        if (!mo84894k()) {
            this.f253434b.mo84805l();
        }
        this.f253447o = false;
        this.f253450r = -1;
        this.f253453u = false;
        VelocityTracker velocityTracker = this.f253446n;
        if (velocityTracker != null && !this.f253449q) {
            velocityTracker.recycle();
            this.f253446n = null;
        }
        if (this.f253444l) {
            this.f253445m.onRelease();
        }
        this.f253442j = false;
        this.f253441i = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo84886c() {
        ViewParent parent = this.f253435c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: d */
    public final void mo84887d(MotionEvent motionEvent) {
        if (mo84894k()) {
            this.f253447o = true;
            this.f253448p = -1;
            this.f253436d.abortAnimation();
        }
        this.f253450r = motionEvent.getPointerId(0);
        this.f253455x = motionEvent.getY();
        this.f253442j = false;
        this.f253440h = 0;
    }

    /* renamed from: e */
    public final void mo84888e(int i) {
        int scaledMaximumFlingVelocity = this.f253454w.getScaledMaximumFlingVelocity();
        int scaledMinimumFlingVelocity = this.f253454w.getScaledMinimumFlingVelocity();
        this.f253446n.computeCurrentVelocity(1000, (float) scaledMaximumFlingVelocity);
        int yVelocity = (int) this.f253446n.getYVelocity(i);
        this.f253434b.getScrollY();
        if (((float) Math.abs(yVelocity)) <= ((float) scaledMinimumFlingVelocity)) {
            yVelocity = 0;
        }
        if (yVelocity != 0) {
            this.f253436d.fling(this.f253435c.getScrollX(), this.f253435c.getScrollY(), 0, -yVelocity, 0, 0, 0, this.f253434b.mo84791d(), 0, 0);
            this.f253436d.getFinalY();
            this.f253436d.getStartY();
            this.f253448p = -2;
            this.f253435c.postInvalidateOnAnimation();
        }
    }

    /* renamed from: f */
    public final void mo84889f(MotionEvent motionEvent) {
        if (this.f253446n == null) {
            this.f253446n = VelocityTracker.obtain();
        }
        this.f253446n.addMovement(motionEvent);
    }

    /* renamed from: g */
    public final void mo84890g(MotionEvent motionEvent) {
        int findPointerIndex;
        int i = this.f253450r;
        if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
            float y = motionEvent.getY(findPointerIndex);
            float f = this.f253455x;
            if (y != f) {
                float f2 = f - y;
                int i2 = (int) f2;
                this.f253455x = y - (((float) i2) - f2);
                this.f253438f = i2;
                this.f253440h += i2;
                if (this.f253442j) {
                    this.f253441i += i2;
                    return;
                }
                return;
            }
            this.f253438f = 0;
        }
    }

    /* renamed from: h */
    public final void mo84891h() {
        if (this.f253437e > 0 && this.f253442j && this.f253438f != 0) {
            if (this.f253445m == null) {
                this.f253445m = new EdgeEffect(this.f253433a);
                if (this.f253435c.willNotDraw()) {
                    C59104x d = f253432v.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Velvet.ScrollHelper");
                    ((C59052c) ((C59052c) d).mo56372aa(11241)).mo56386p("Can't draw overscroll effects if the view doesn't draw");
                }
            }
            this.f253444l = true;
        }
        if (!this.f253444l) {
            return;
        }
        if (this.f253442j) {
            float f = (float) this.f253438f;
            if (this.f253443k) {
                f = -f;
            }
            this.f253445m.onPull(f / ((float) this.f253435c.getHeight()));
            this.f253435c.invalidate();
            return;
        }
        this.f253445m.onRelease();
        this.f253445m.finish();
        this.f253444l = false;
    }

    /* renamed from: i */
    public final boolean mo84892i(boolean z) {
        return z ? this.f253434b.getScrollY() < this.f253434b.mo84791d() : this.f253434b.getScrollY() > 0;
    }

    /* renamed from: j */
    public final boolean mo84893j() {
        return Math.abs(this.f253440h) >= this.f253454w.getScaledTouchSlop();
    }

    /* renamed from: k */
    public final boolean mo84894k() {
        return this.f253448p != -1;
    }

    /* renamed from: m */
    public final boolean mo84896m(int i, int i2) {
        if (mo84894k()) {
            this.f253436d.forceFinished(true);
        }
        int scrollY = this.f253434b.getScrollY();
        int min = Math.min(this.f253434b.mo84791d(), Math.max(i, 0));
        if (min == scrollY) {
            return false;
        }
        this.f253448p = min;
        if (i2 == -1) {
            this.f253436d.startScroll(0, scrollY, 0, min - scrollY);
        } else {
            this.f253436d.startScroll(0, scrollY, 0, min - scrollY, 0);
        }
        this.f253435c.postInvalidateOnAnimation();
        return true;
    }

    /* renamed from: l */
    public final boolean mo84895l(boolean z) {
        if (this.f253451s) {
            if (z) {
                if (this.f253434b.getScrollY() < this.f253434b.mo84791d()) {
                    this.f253434b.setScrollY(Math.min(this.f253434b.getScrollY() + Math.round(((float) this.f253434b.mo84791d()) * 0.2f), this.f253434b.mo84791d()));
                    return true;
                }
            } else if (this.f253434b.getScrollY() > 0) {
                this.f253434b.setScrollY(Math.max(0, this.f253434b.getScrollY() - Math.round(((float) this.f253434b.mo84791d()) * 0.2f)));
                return true;
            }
        }
        return false;
    }
}
