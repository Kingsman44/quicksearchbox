package androidx.p197u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.u.ax */
/* compiled from: PG */
final class C4213ax extends AnimatorListenerAdapter implements C4194ae {

    /* renamed from: a */
    boolean f13638a = false;

    /* renamed from: b */
    private final View f13639b;

    /* renamed from: c */
    private final int f13640c;

    /* renamed from: d */
    private final ViewGroup f13641d;

    /* renamed from: e */
    private final boolean f13642e;

    /* renamed from: f */
    private boolean f13643f;

    public C4213ax(View view, int i) {
        this.f13639b = view;
        this.f13640c = i;
        this.f13641d = (ViewGroup) view.getParent();
        this.f13642e = true;
        m12093g(true);
    }

    /* renamed from: f */
    private final void m12092f() {
        if (!this.f13638a) {
            View view = this.f13639b;
            int i = this.f13640c;
            int i2 = C4211av.f13633b;
            view.setTransitionVisibility(i);
            ViewGroup viewGroup = this.f13641d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m12093g(false);
    }

    /* renamed from: g */
    private final void m12093g(boolean z) {
        ViewGroup viewGroup;
        if (this.f13642e && this.f13643f != z && (viewGroup = this.f13641d) != null) {
            this.f13643f = z;
            C4208as.m12087b(viewGroup, z);
        }
    }

    /* renamed from: a */
    public final void mo8864a(C4195af afVar) {
        m12092f();
        afVar.mo8870B(this);
    }

    /* renamed from: b */
    public final void mo8865b() {
    }

    /* renamed from: c */
    public final void mo8866c() {
        m12093g(false);
    }

    /* renamed from: d */
    public final void mo8867d() {
        m12093g(true);
    }

    /* renamed from: e */
    public final void mo8868e(C4195af afVar) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.f13638a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        m12092f();
    }

    public final void onAnimationPause(Animator animator) {
        if (!this.f13638a) {
            View view = this.f13639b;
            int i = this.f13640c;
            int i2 = C4211av.f13633b;
            view.setTransitionVisibility(i);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationResume(Animator animator) {
        if (!this.f13638a) {
            View view = this.f13639b;
            int i = C4211av.f13633b;
            view.setTransitionVisibility(0);
        }
    }

    public final void onAnimationStart(Animator animator) {
    }
}
