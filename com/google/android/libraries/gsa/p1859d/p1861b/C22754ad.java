package com.google.android.libraries.gsa.p1859d.p1861b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.google.android.libraries.gsa.p1859d.C22785g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.gsa.d.b.ad */
/* compiled from: PG */
public class C22754ad extends FrameLayout {

    /* renamed from: b */
    public static final Property f62602b = new C22751aa(Integer.class);

    /* renamed from: c */
    public static final PathInterpolator f62603c = new PathInterpolator(0.4f, 0.0f, 0.3f, 1.0f);

    /* renamed from: A */
    final int f62604A;

    /* renamed from: B */
    final int f62605B;

    /* renamed from: C */
    public boolean f62606C;

    /* renamed from: D */
    public int f62607D = 1;

    /* renamed from: E */
    private float f62608E = -1.0f;

    /* renamed from: F */
    private final List f62609F = Arrays.asList(new Rect[]{new Rect(), new Rect()});

    /* renamed from: G */
    private VelocityTracker f62610G;

    /* renamed from: H */
    private float f62611H;

    /* renamed from: a */
    private View f62612a;

    /* renamed from: d */
    public View f62613d;

    /* renamed from: e */
    public int f62614e;

    /* renamed from: f */
    public float f62615f;

    /* renamed from: g */
    protected final boolean f62616g;

    /* renamed from: h */
    public float f62617h;

    /* renamed from: i */
    public float f62618i;

    /* renamed from: j */
    float f62619j;

    /* renamed from: k */
    float f62620k;

    /* renamed from: l */
    float f62621l;

    /* renamed from: m */
    float f62622m;

    /* renamed from: n */
    public int f62623n = -1;

    /* renamed from: o */
    public int f62624o = 0;

    /* renamed from: p */
    final C22753ac f62625p;

    /* renamed from: q */
    C22752ab f62626q;

    /* renamed from: r */
    public final C22785g f62627r = new C22785g("SlidingPanelLayout", 40);

    /* renamed from: s */
    public boolean f62628s = false;

    /* renamed from: t */
    public boolean f62629t = false;

    /* renamed from: u */
    public boolean f62630u;

    /* renamed from: v */
    public boolean f62631v;

    /* renamed from: w */
    public boolean f62632w;

    /* renamed from: x */
    final int f62633x;

    /* renamed from: y */
    final int f62634y;

    /* renamed from: z */
    final int f62635z;

    public C22754ad(Context context) {
        super(context);
        new DecelerateInterpolator(3.0f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f62633x = viewConfiguration.getScaledPagingTouchSlop();
        this.f62634y = viewConfiguration.getScaledMaximumFlingVelocity();
        float f = getResources().getDisplayMetrics().density;
        this.f62635z = (int) (500.0f * f);
        this.f62604A = (int) (250.0f * f);
        this.f62605B = (int) (f * 1500.0f);
        this.f62625p = new C22753ac(this);
        this.f62616g = m42437p(getResources());
    }

    /* renamed from: p */
    public static boolean m42437p(Resources resources) {
        return resources.getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: q */
    private final void m42438q(MotionEvent motionEvent) {
        if (this.f62610G == null) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f62610G = obtain;
            obtain.clear();
        }
        this.f62610G.addMovement(motionEvent);
    }

    /* renamed from: r */
    private final void m42439r() {
        this.f62629t = true;
        C22752ab abVar = this.f62626q;
        if (abVar != null) {
            abVar.mo27946c();
        }
    }

    /* renamed from: s */
    private final void m42440s(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() >> 8) & PrivateKeyType.INVALID;
        if (motionEvent.getPointerId(action) == this.f62623n) {
            int i = action == 0 ? 1 : 0;
            float x = motionEvent.getX(i);
            this.f62619j += x - this.f62621l;
            this.f62617h = x;
            this.f62621l = x;
            this.f62623n = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f62610G;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: t */
    private final void m42441t(int i) {
        if (getMeasuredWidth() == 0) {
            mo27966h();
            return;
        }
        m42439r();
        this.f62606C = true;
        this.f62625p.mo27955b(getMeasuredWidth(), i);
    }

    /* renamed from: u */
    private final void m42442u() {
        VelocityTracker velocityTracker = this.f62610G;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f62610G.recycle();
            this.f62610G = null;
        }
    }

    /* renamed from: v */
    private final void m42443v() {
        m42442u();
        this.f62630u = false;
        this.f62624o = 0;
        this.f62623n = -1;
    }

    /* renamed from: w */
    private final void m42444w() {
        this.f62615f = 1.0f;
        int measuredWidth = getMeasuredWidth();
        this.f62614e = measuredWidth;
        View view = this.f62613d;
        if (this.f62616g) {
            measuredWidth = -measuredWidth;
        }
        view.setTranslationX((float) measuredWidth);
    }

    /* renamed from: x */
    private final void m42445x() {
        Rect rect = (Rect) this.f62609F.get(0);
        Rect rect2 = (Rect) this.f62609F.get(1);
        rect.setEmpty();
        rect2.setEmpty();
        int width = getWidth() / 2;
        C22752ab abVar = this.f62626q;
        if (abVar != null) {
            if ((abVar.mo27950g() && !this.f62616g) || (abVar.mo27948e() && this.f62616g)) {
                rect.set(0, 0, width, getHeight());
            }
            if ((abVar.mo27948e() && !this.f62616g) || (abVar.mo27950g() && this.f62616g)) {
                rect2.set(getWidth() - width, 0, getWidth(), getHeight());
            }
        }
        setSystemGestureExclusionRects(this.f62609F);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27959a(MotionEvent motionEvent, float f) {
        int findPointerIndex = motionEvent.findPointerIndex(this.f62623n);
        if (findPointerIndex != -1) {
            float x = motionEvent.getX(findPointerIndex);
            if (((int) Math.abs(x - this.f62617h)) > Math.round(f * ((float) this.f62633x))) {
                this.f62622m += Math.abs(this.f62621l - x);
                this.f62619j = x;
                this.f62621l = x;
                mo27973o();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo27960b() {
        C58976aa aaVar = C58975e.f156826a;
        mo27971m();
        mo27963e();
        mo27962d();
        this.f62606C = false;
    }

    /* renamed from: c */
    public final void mo27961c(int i) {
        if (getMeasuredWidth() == 0) {
            mo27960b();
            return;
        }
        mo27963e();
        this.f62606C = true;
        this.f62625p.mo27955b(0, i);
    }

    /* renamed from: d */
    public final void mo27962d() {
        this.f62628s = false;
        this.f62629t = false;
        C22752ab abVar = this.f62626q;
        if (abVar != null) {
            abVar.mo27951h(this.f62611H, this.f62607D);
            this.f62611H = 0.0f;
            this.f62607D = 1;
        }
    }

    /* renamed from: e */
    public final void mo27963e() {
        boolean z = true;
        this.f62629t = true;
        C22752ab abVar = this.f62626q;
        if (abVar != null) {
            int i = this.f62624o;
            float f = this.f62611H;
            int i2 = this.f62607D;
            if (1 != i) {
                z = false;
            }
            abVar.mo27952i(z, f, i2);
        }
    }

    /* renamed from: f */
    public final void mo27964f() {
        this.f62628s = true;
        this.f62629t = false;
        C22752ab abVar = this.f62626q;
        if (abVar != null) {
            abVar.mo27953j(this.f62611H, this.f62607D);
            this.f62611H = 1.0f;
            this.f62607D = 1;
        }
    }

    /* renamed from: g */
    public final void mo27965g(float f) {
        C22752ab abVar = this.f62626q;
        if (abVar != null) {
            abVar.mo27947d(f);
            C58976aa aaVar = C58975e.f156826a;
            this.f62608E = f;
        }
    }

    /* renamed from: h */
    public final void mo27966h() {
        C58976aa aaVar = C58975e.f156826a;
        m42444w();
        this.f62613d.setAlpha(1.0f);
        m42439r();
        mo27964f();
        this.f62606C = false;
    }

    /* renamed from: i */
    public final void mo27967i(C22749a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        C22757c cVar = (C22757c) aVar;
        int i = cVar.f62636a;
        if (i <= 0) {
            i = 750;
        }
        this.f62607D = 2;
        int i2 = cVar.f62637b - 1;
        if (i2 == 0) {
            mo27966h();
        } else if (i2 != 3) {
            m42441t(i);
        } else if (getMeasuredWidth() == 0) {
            mo27966h();
        } else {
            m42439r();
            this.f62613d.setAlpha(0.0f);
            this.f62613d.setScaleX(0.92f);
            this.f62613d.setScaleY(0.92f);
            m42444w();
            this.f62613d.animate().setDuration((long) i).scaleX(1.0f).scaleY(1.0f).setInterpolator(f62603c).setUpdateListener(new C22779y(this)).alpha(1.0f).withEndAction(new C22780z(this));
        }
    }

    /* renamed from: j */
    public final void mo27968j(View view) {
        View view2 = this.f62612a;
        if (view2 != null) {
            super.removeView(view2);
        }
        this.f62612a = view;
        super.addView(view, 0);
    }

    /* renamed from: k */
    public final void mo27969k(C22752ab abVar) {
        this.f62627r.mo28121a("setCallbacks ".concat(String.valueOf(abVar != null ? abVar.mo27944a() : "null")));
        this.f62626q = abVar;
        if (abVar != null) {
            m42445x();
        }
    }

    /* renamed from: l */
    public final void mo27970l(View view) {
        this.f62613d = view;
        super.addView(view);
    }

    /* renamed from: m */
    public final void mo27971m() {
        this.f62615f = 0.0f;
        this.f62614e = 0;
        this.f62613d.setTranslationX(0.0f);
    }

    /* renamed from: n */
    public final void mo27972n(int i) {
        int i2;
        int i3 = 0;
        if (i <= 1) {
            i = 0;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth != 0) {
            this.f62615f = ((float) i) / ((float) measuredWidth);
            i3 = Math.max(Math.min(i, measuredWidth), 0);
            this.f62614e = i3;
            i2 = i3;
        } else if (i == 0) {
            this.f62615f = 0.0f;
            this.f62614e = 0;
            i2 = 0;
        } else {
            return;
        }
        float f = this.f62616g ? (float) (-i2) : (float) i3;
        if (!this.f62631v || Math.abs(this.f62613d.getTranslationX() - f) > 1.0E-6f || ((this.f62632w && f > 1.0E-6f) || Math.abs(this.f62608E - this.f62615f) > 1.0E-6f)) {
            this.f62613d.setTranslationX(f);
            mo27965g(this.f62615f);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: o */
    public final void mo27973o() {
        this.f62624o = 1;
        this.f62629t = true;
        this.f62606C = false;
        this.f62625p.mo27954a();
        C22752ab abVar = this.f62626q;
        if (abVar != null) {
            abVar.mo27945b();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m42438q(motionEvent);
        if (getChildCount() <= 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 2) {
            if (this.f62624o == 1) {
                return true;
            }
            action = 2;
        }
        int i = action & PrivateKeyType.INVALID;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            m42440s(motionEvent);
                            m42442u();
                        }
                    }
                } else if (this.f62623n != -1) {
                    mo27959a(motionEvent, 1.0f);
                }
            }
            m42443v();
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f62617h = x;
            this.f62618i = y;
            this.f62620k = (float) this.f62614e;
            this.f62621l = x;
            this.f62622m = 0.0f;
            this.f62623n = motionEvent.getPointerId(0);
            int abs = Math.abs(this.f62625p.f62599a - this.f62614e);
            if ((!this.f62625p.mo27956c() && abs >= this.f62633x / 3) || this.f62630u) {
                this.f62630u = false;
                mo27973o();
                this.f62619j = x;
            }
        }
        return this.f62624o != 0;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            m42445x();
        }
        View view = this.f62612a;
        if (view != null) {
            view.layout(0, 0, view.getMeasuredWidth(), this.f62612a.getMeasuredHeight());
        }
        View view2 = this.f62613d;
        if (view2 != null) {
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = this.f62613d.getMeasuredHeight();
            boolean z2 = this.f62616g;
            this.f62613d.layout(z2 ? measuredWidth : -measuredWidth, 0, z2 ? measuredWidth + measuredWidth : 0, measuredHeight);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C58976aa aaVar = C58975e.f156826a;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        View view = this.f62612a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        View view2 = this.f62613d;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
        mo27972n((int) (((float) size) * this.f62615f));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        super.onTouchEvent(motionEvent);
        C58976aa aaVar = C58975e.f156826a;
        if (this.f62613d == null) {
            return super.onTouchEvent(motionEvent);
        }
        m42438q(motionEvent);
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            m42440s(motionEvent);
                            m42442u();
                        }
                    }
                } else if (this.f62624o == 1) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f62623n);
                    if (findPointerIndex == -1) {
                        return true;
                    }
                    float x = motionEvent.getX(findPointerIndex);
                    this.f62622m += Math.abs(x - this.f62621l);
                    this.f62621l = x;
                    float f = x - this.f62619j;
                    float f2 = this.f62620k;
                    if (this.f62616g) {
                        f = -f;
                    }
                    mo27972n((int) (f2 + f));
                    this.f62611H = this.f62615f;
                } else {
                    mo27959a(motionEvent, 1.0f);
                }
            }
            if (this.f62624o == 1) {
                this.f62610G.computeCurrentVelocity(1000, (float) this.f62634y);
                int xVelocity = (int) this.f62610G.getXVelocity(this.f62623n);
                if (this.f62622m > 25.0f && Math.abs(xVelocity) > this.f62635z) {
                    z = true;
                }
                Math.abs(xVelocity);
                if (z) {
                    if (this.f62616g) {
                        xVelocity = -xVelocity;
                    }
                    if (Math.abs(xVelocity) < this.f62604A) {
                        this.f62607D = 4;
                        if (xVelocity < 0) {
                            mo27961c(750);
                        } else {
                            m42441t(750);
                        }
                    } else {
                        if (xVelocity < 0) {
                            i = this.f62614e;
                        } else {
                            i = getMeasuredWidth() - this.f62614e;
                        }
                        float min = Math.min(1.0f, ((float) i) / ((float) getMeasuredWidth()));
                        int measuredWidth = getMeasuredWidth();
                        int measuredWidth2 = getMeasuredWidth();
                        double d = (double) (min - 8.0f);
                        Double.isNaN(d);
                        int round = Math.round(Math.abs((((float) (measuredWidth / 2)) + (((float) (measuredWidth2 / 2)) * ((float) Math.sin((double) ((float) (d * 0.4712389167638204d)))))) / ((float) Math.max(this.f62605B, Math.abs(xVelocity)))) * 1000.0f) * 4;
                        this.f62607D = 3;
                        if (xVelocity > 0) {
                            m42441t(round);
                        } else {
                            mo27961c(round);
                        }
                    }
                } else {
                    this.f62607D = 4;
                    if (this.f62614e >= getMeasuredWidth() / 2) {
                        m42441t(750);
                    } else {
                        mo27961c(750);
                    }
                }
                m42443v();
            }
        } else {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            this.f62617h = x2;
            this.f62618i = y;
            this.f62620k = (float) this.f62614e;
            this.f62621l = x2;
            this.f62622m = 0.0f;
            this.f62623n = motionEvent.getPointerId(0);
            int abs = Math.abs(this.f62625p.f62599a - this.f62614e);
            if ((!this.f62625p.mo27956c() && abs >= this.f62633x / 3) || this.f62630u) {
                this.f62630u = false;
                mo27973o();
                this.f62619j = x2;
            }
        }
        return true;
    }
}
