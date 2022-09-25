package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.C90648ax;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.u */
/* compiled from: PG */
public final class C91945u implements C90648ax {

    /* renamed from: a */
    public final /* synthetic */ C91946v f256421a;

    /* renamed from: b */
    private View f256422b;

    public C91945u(C91946v vVar) {
        this.f256421a = vVar;
    }

    /* renamed from: a */
    public final View mo84928a(MotionEvent motionEvent) {
        C91946v vVar = this.f256421a;
        if (vVar.f256425i) {
            return null;
        }
        Point j = vVar.mo86646j(vVar, motionEvent);
        return this.f256421a.mo86647k(j.x, j.y);
    }

    /* renamed from: b */
    public final void mo84929b(View view) {
        this.f256421a.getParent().requestDisallowInterceptTouchEvent(true);
        C91946v vVar = this.f256421a;
        vVar.f256425i = true;
        this.f256422b = view;
        vVar.invalidate();
    }

    /* renamed from: c */
    public final void mo84930c(View view) {
        view.setVisibility(8);
        C91944t tVar = new C91944t(this.f256421a, view);
        mo86645h();
        this.f256421a.mo86604i();
        tVar.mo84881b();
    }

    /* renamed from: d */
    public final void mo84931d() {
    }

    /* renamed from: e */
    public final void mo84932e() {
        View view = this.f256422b;
        if (view != null) {
            this.f256421a.mo86602g(view);
        }
    }

    /* renamed from: f */
    public final void mo84933f(View view) {
        mo86645h();
        this.f256421a.mo86604i();
        this.f256422b = null;
    }

    /* renamed from: g */
    public final boolean mo84934g(View view) {
        return this.f256421a.mo86603h(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo86645h() {
        C91946v vVar = this.f256421a;
        vVar.f256425i = false;
        vVar.invalidate();
    }
}
