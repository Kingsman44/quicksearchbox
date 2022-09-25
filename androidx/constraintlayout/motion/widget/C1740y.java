package androidx.constraintlayout.motion.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* renamed from: androidx.constraintlayout.motion.widget.y */
/* compiled from: PG */
final class C1740y {

    /* renamed from: a */
    public static final C1740y f5191a = new C1740y();

    /* renamed from: b */
    VelocityTracker f5192b;

    private C1740y() {
    }

    /* renamed from: a */
    public final float mo4820a() {
        VelocityTracker velocityTracker = this.f5192b;
        if (velocityTracker != null) {
            return velocityTracker.getXVelocity();
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo4821b() {
        VelocityTracker velocityTracker = this.f5192b;
        if (velocityTracker != null) {
            return velocityTracker.getYVelocity();
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final void mo4822c(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f5192b;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
    }

    /* renamed from: d */
    public final void mo4823d(int i) {
        VelocityTracker velocityTracker = this.f5192b;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(i);
        }
    }
}
