package androidx.p197u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: androidx.u.n */
/* compiled from: PG */
final class C4229n extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final View f13671a;

    /* renamed from: b */
    private boolean f13672b = false;

    public C4229n(View view) {
        this.f13671a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.f13671a;
        int i = C4211av.f13633b;
        view.setTransitionAlpha(1.0f);
        if (this.f13672b) {
            this.f13671a.setLayerType(0, (Paint) null);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (C2043bi.m5567au(this.f13671a) && this.f13671a.getLayerType() == 0) {
            this.f13672b = true;
            this.f13671a.setLayerType(2, (Paint) null);
        }
    }
}
