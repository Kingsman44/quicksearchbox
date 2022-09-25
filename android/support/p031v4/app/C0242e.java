package android.support.p031v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.e */
/* compiled from: PG */
final class C0242e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f885a;

    /* renamed from: b */
    final /* synthetic */ View f886b;

    /* renamed from: c */
    final /* synthetic */ boolean f887c;

    /* renamed from: d */
    final /* synthetic */ C0238dc f888d;

    /* renamed from: e */
    final /* synthetic */ C0251n f889e;

    public C0242e(ViewGroup viewGroup, View view, boolean z, C0238dc dcVar, C0251n nVar) {
        this.f885a = viewGroup;
        this.f886b = view;
        this.f887c = z;
        this.f888d = dcVar;
        this.f889e = nVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f885a.endViewTransition(this.f886b);
        if (this.f887c) {
            C0237db.m554d(this.f888d.f876e, this.f886b);
        }
        this.f889e.mo766b();
        if (FragmentManager.m246Z(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.f888d + " has ended.");
        }
    }
}
