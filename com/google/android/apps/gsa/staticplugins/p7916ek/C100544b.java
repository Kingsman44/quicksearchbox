package com.google.android.apps.gsa.staticplugins.p7916ek;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.searchplate.p6963a.C88896f;
import com.google.android.apps.gsa.searchplate.p6966d.C88939k;
import com.google.android.apps.gsa.shared.util.p7187ui.C91105d;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.staticplugins.ek.b */
/* compiled from: PG */
public final class C100544b extends C88896f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final ValueAnimator f281125a;

    /* renamed from: b */
    final ValueAnimator f281126b;

    /* renamed from: c */
    public final MaterialProgressBar f281127c;

    /* renamed from: d */
    private boolean f281128d;

    /* renamed from: e */
    private boolean f281129e;

    public C100544b(MaterialProgressBar materialProgressBar) {
        this.f281127c = materialProgressBar;
        materialProgressBar.setVisibility(4);
        materialProgressBar.setIndeterminate(false);
        materialProgressBar.setMax(1000);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f281125a = valueAnimator;
        valueAnimator.setDuration(200);
        valueAnimator.setInterpolator(C91105d.f254401a);
        valueAnimator.addUpdateListener(this);
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.f281126b = valueAnimator2;
        valueAnimator2.setDuration(20000);
        valueAnimator2.setInterpolator(new DecelerateInterpolator(2.0f));
        valueAnimator2.addUpdateListener(this);
    }

    /* renamed from: i */
    private final void m166641i() {
        if (this.f281125a.isRunning()) {
            this.f281125a.cancel();
        }
        if (this.f281126b.isRunning()) {
            this.f281126b.cancel();
        }
    }

    /* renamed from: l */
    private final void m166642l(boolean z) {
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            this.f281127c.mo34164g(0);
            C88939k.m144547c(this.f281127c).setDuration(200);
            this.f281128d = true;
            mo82746e(C59203do.f157270a);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C88939k.m144556l(this.f281127c).setDuration(200);
        this.f281128d = false;
    }

    /* renamed from: m */
    private static final void m166643m(ValueAnimator valueAnimator, int i, int i2) {
        valueAnimator.setIntValues(new int[]{i, i2});
        valueAnimator.start();
    }

    /* renamed from: c */
    public final void mo82744c(C88893c cVar) {
    }

    /* renamed from: e */
    public final void mo82746e(double d) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f281129e) {
            if (d >= 0.01d) {
                m166641i();
                int min = Math.min(((int) (d * 800.0d)) + 200, 1000);
                if (this.f281127c.getVisibility() == 0 && this.f281127c.getProgress() < min) {
                    m166643m(this.f281125a, this.f281127c.getProgress(), min);
                }
            } else if (!this.f281126b.isRunning() && this.f281127c.getVisibility() == 0) {
                m166643m(this.f281126b, 0, 200);
            }
        }
    }

    /* renamed from: f */
    public final void mo82747f(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            if (!this.f281128d) {
                m166642l(true);
            }
        } else if (this.f281128d && !this.f281129e) {
            if (this.f281127c.getProgress() < 1000) {
                m166641i();
                this.f281129e = true;
                m166643m(this.f281125a, this.f281127c.getProgress(), 1000);
                return;
            }
            m166642l(false);
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f281127c.mo34164g(intValue);
        if (this.f281129e && intValue == 1000) {
            m166642l(false);
            this.f281129e = false;
        }
    }
}
