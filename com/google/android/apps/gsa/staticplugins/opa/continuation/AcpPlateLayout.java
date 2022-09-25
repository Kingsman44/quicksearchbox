package com.google.android.apps.gsa.staticplugins.opa.continuation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;

/* compiled from: PG */
public class AcpPlateLayout extends RelativeLayout {

    /* renamed from: a */
    private float f301893a;

    public AcpPlateLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final void m180447b() {
        mo96934a();
        C89949q.m146521e(C28285c.m52882i(this, 22, (Integer) null), false);
    }

    /* renamed from: a */
    public final void mo96934a() {
        if (getVisibility() != 8 && getAnimation() == null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_animation);
            loadAnimation.setFillAfter(true);
            loadAnimation.setAnimationListener(new C108499a(this));
            startAnimation(loadAnimation);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f301893a = motionEvent.getRawY();
            return false;
        } else if (motionEvent.getAction() == 2) {
            return false;
        } else {
            if (motionEvent.getAction() != 1 || motionEvent.getRawY() - this.f301893a <= 50.0f) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            m180447b();
            return true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            return true;
        }
        if (motionEvent.getAction() != 1 || motionEvent.getRawY() - this.f301893a <= 50.0f) {
            return super.onTouchEvent(motionEvent);
        }
        m180447b();
        return true;
    }

    public AcpPlateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AcpPlateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
