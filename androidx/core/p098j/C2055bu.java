package androidx.core.p098j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: androidx.core.j.bu */
/* compiled from: PG */
final class C2055bu extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C2059by f5962a;

    /* renamed from: b */
    final /* synthetic */ View f5963b;

    public C2055bu(C2059by byVar, View view) {
        this.f5962a = byVar;
        this.f5963b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f5962a.mo2431c();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5962a.mo1119a(this.f5963b);
    }

    public final void onAnimationStart(Animator animator) {
        this.f5962a.mo1120b();
    }
}
