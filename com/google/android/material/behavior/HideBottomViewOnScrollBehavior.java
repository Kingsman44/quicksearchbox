package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
public class HideBottomViewOnScrollBehavior extends C1770c {

    /* renamed from: a */
    public ViewPropertyAnimator f115827a;

    /* renamed from: b */
    private final LinkedHashSet f115828b = new LinkedHashSet();

    /* renamed from: c */
    private int f115829c;

    /* renamed from: d */
    private int f115830d;

    /* renamed from: e */
    private TimeInterpolator f115831e;

    /* renamed from: f */
    private TimeInterpolator f115832f;

    /* renamed from: g */
    private int f115833g = 0;

    /* renamed from: h */
    private int f115834h = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: s */
    private final void m78735s(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f115827a = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C44540a(this));
    }

    /* renamed from: t */
    private final void m78736t(int i) {
        this.f115834h = i;
        Iterator it = this.f115828b.iterator();
        while (it.hasNext()) {
            ((C44541b) it.next()).mo47493a();
        }
    }

    /* renamed from: g */
    public boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f115833g = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f115829c = C44693c.m79225a(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f115830d = C44693c.m79225a(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f115831e = C44688a.m79217a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, C44497b.f115653d);
        this.f115832f = C44688a.m79217a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, C44497b.f115652c);
        return false;
    }

    /* renamed from: j */
    public boolean mo4962j(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    /* renamed from: p */
    public final void mo4968p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.f115834h != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f115827a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                m78736t(1);
                m78735s(view, this.f115833g, (long) this.f115830d, this.f115832f);
            }
        } else if (i < 0 && this.f115834h != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f115827a;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            m78736t(2);
            m78735s(view, 0, (long) this.f115829c, this.f115831e);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
