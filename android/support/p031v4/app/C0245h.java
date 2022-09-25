package android.support.p031v4.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: android.support.v4.app.h */
/* compiled from: PG */
final class C0245h implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C0238dc f893a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f894b;

    /* renamed from: c */
    final /* synthetic */ View f895c;

    /* renamed from: d */
    final /* synthetic */ C0251n f896d;

    public C0245h(C0238dc dcVar, ViewGroup viewGroup, View view, C0251n nVar) {
        this.f893a = dcVar;
        this.f894b = viewGroup;
        this.f895c = view;
        this.f896d = nVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f894b.post(new C0244g(this));
        if (FragmentManager.m246Z(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f893a + " has ended.");
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (FragmentManager.m246Z(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f893a + " has reached onAnimationStart.");
        }
    }
}
