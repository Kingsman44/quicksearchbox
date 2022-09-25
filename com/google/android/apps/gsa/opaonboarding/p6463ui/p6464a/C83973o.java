package com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.a.o */
/* compiled from: PG */
public final class C83973o implements C83975q {

    /* renamed from: a */
    public final View f228758a;

    /* renamed from: b */
    public C83966h f228759b;

    /* renamed from: c */
    boolean f228760c = false;

    /* renamed from: d */
    private final LottieAnimationView f228761d;

    /* renamed from: e */
    private final C83959a f228762e;

    /* renamed from: f */
    private int f228763f = -1;

    /* renamed from: g */
    private int f228764g = -1;

    /* renamed from: h */
    private C83972n f228765h;

    /* renamed from: i */
    private ViewTreeObserver.OnGlobalLayoutListener f228766i;

    public C83973o(View view, LottieAnimationView lottieAnimationView, C83959a aVar) {
        this.f228758a = view;
        this.f228761d = lottieAnimationView;
        this.f228762e = aVar;
    }

    /* renamed from: h */
    private final float m133824h(float f, float f2, DisplayMetrics displayMetrics) {
        C83960b b = this.f228762e.mo77378b();
        float applyDimension = TypedValue.applyDimension(1, (float) b.mo77383b(), displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) b.mo77382a(), displayMetrics);
        if (f < 0.0f) {
            f = applyDimension;
        }
        if (f2 < 0.0f) {
            f2 = applyDimension2;
        }
        return Math.min(f / applyDimension, f2 / applyDimension2);
    }

    /* renamed from: i */
    private final void m133825i() {
        float a = mo77400a(this.f228758a);
        if (a >= 0.0f) {
            C83966h hVar = this.f228759b;
            if (hVar != null) {
                hVar.f228750a.mo9705o(a);
            } else {
                mo77401b(a);
            }
        }
    }

    /* renamed from: a */
    public final float mo77400a(View view) {
        int height = view.getHeight();
        int width = view.getWidth();
        if (height == this.f228764g && width == this.f228763f) {
            return -1.0f;
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        this.f228764g = height;
        this.f228763f = width;
        int dimension = (int) view.getContext().getResources().getDimension(R.dimen.min_smallest_width_for_tablet);
        boolean z = false;
        if (displayMetrics.widthPixels >= dimension && displayMetrics.heightPixels >= dimension) {
            z = true;
        }
        if (view.getContext().getResources().getConfiguration().orientation == 1) {
            if (z) {
                return m133824h(((float) width) * 0.7f, (float) height, displayMetrics);
            }
            return m133824h((float) width, (float) height, displayMetrics);
        } else if (z) {
            return m133824h((float) width, (float) height, displayMetrics);
        } else {
            return m133824h(((float) width) * 0.7f, -1.0f, displayMetrics);
        }
    }

    /* renamed from: b */
    public final void mo77401b(float f) {
        C83966h hVar = new C83966h(this.f228761d);
        this.f228759b = hVar;
        hVar.f228750a.mo9689a(new C83964f(hVar));
        if (f >= 0.0f) {
            this.f228759b.f228750a.mo9705o(f);
        }
        C83972n nVar = this.f228765h;
        if (nVar != null) {
            nVar.mo77398a();
            this.f228765h = null;
            if (!this.f228760c) {
                this.f228759b.mo77396b();
                this.f228760c = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo77402c() {
        this.f228766i = new C83970l(this);
        this.f228758a.getViewTreeObserver().addOnGlobalLayoutListener(this.f228766i);
    }

    /* renamed from: d */
    public final void mo77403d() {
        if (this.f228759b == null) {
            this.f228765h = new C83968j(this);
            m133825i();
        } else if (!this.f228760c) {
            if (this.f228762e.mo77377a() != null) {
                C83966h hVar = this.f228759b;
                C83960b a = this.f228762e.mo77377a();
                a.getClass();
                hVar.mo77395a(a, false);
            }
            this.f228759b.mo77395a(this.f228762e.mo77378b(), this.f228762e.mo77381e());
            this.f228759b.mo77396b();
            this.f228760c = true;
        }
    }

    /* renamed from: e */
    public final void mo77404e() {
        if (this.f228759b == null) {
            this.f228765h = new C83967i(this);
            m133825i();
        } else if (this.f228762e.mo77380d() != null) {
            C83966h hVar = this.f228759b;
            C83960b d = this.f228762e.mo77380d();
            d.getClass();
            hVar.mo77395a(d, false);
        } else {
            this.f228759b.mo77397c();
        }
    }

    /* renamed from: f */
    public final void mo77405f() {
        if (this.f228759b == null) {
            this.f228765h = new C83971m(this);
            m133825i();
        } else if (this.f228762e.mo77379c() != null) {
            C83966h hVar = this.f228759b;
            C83960b c = this.f228762e.mo77379c();
            c.getClass();
            hVar.mo77395a(c, false);
        } else {
            this.f228759b.mo77397c();
        }
    }

    /* renamed from: g */
    public final void mo77406g() {
        View view;
        C83966h hVar = this.f228759b;
        if (hVar == null) {
            this.f228765h = new C83969k(this);
            return;
        }
        hVar.f228750a.mo9694e();
        hVar.f228751b = true;
        if (this.f228766i != null && (view = this.f228758a) != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f228766i);
            this.f228766i = null;
        }
    }
}
