package androidx.p197u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.p060c.C0977g;

/* renamed from: androidx.u.aa */
/* compiled from: PG */
final class C4190aa extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0977g f13580a;

    /* renamed from: b */
    final /* synthetic */ C4195af f13581b;

    public C4190aa(C4195af afVar, C0977g gVar) {
        this.f13581b = afVar;
        this.f13580a = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13580a.remove(animator);
        this.f13581b.f13602l.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f13581b.f13602l.add(animator);
    }
}
