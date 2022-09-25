package androidx.core.p098j;

import android.animation.Animator;
import android.support.p033v7.app.C0378bl;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.j.bx */
/* compiled from: PG */
public final class C2058bx {

    /* renamed from: a */
    public final WeakReference f5964a;

    public C2058bx(View view) {
        this.f5964a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void mo5199a() {
        View view = (View) this.f5964a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public final void mo5200b() {
        View view = (View) this.f5964a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: c */
    public final void mo5201c(float f) {
        View view = (View) this.f5964a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: d */
    public final void mo5202d(long j) {
        View view = (View) this.f5964a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* renamed from: e */
    public final void mo5203e(C2059by byVar) {
        View view = (View) this.f5964a.get();
        if (view == null) {
            return;
        }
        if (byVar != null) {
            view.animate().setListener(new C2055bu(byVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: f */
    public final void mo5204f(C0378bl blVar) {
        View view = (View) this.f5964a.get();
        if (view != null) {
            C2057bw.m5631a(view.animate(), blVar != null ? new C2054bt(blVar) : null);
        }
    }

    /* renamed from: g */
    public final void mo5205g(float f) {
        View view = (View) this.f5964a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* renamed from: h */
    public final void mo5206h() {
        View view = (View) this.f5964a.get();
        if (view != null) {
            C2056bv.m5629b(view.animate());
        }
    }
}
