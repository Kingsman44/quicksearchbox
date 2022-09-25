package com.bumptech.glide.p287f.p288a;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p291h.C5630q;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.bumptech.glide.f.a.f */
/* compiled from: PG */
public abstract class C5564f implements C5572n {

    /* renamed from: a */
    protected final View f16849a;

    /* renamed from: b */
    private final C5563e f16850b;

    public C5564f(View view) {
        C5630q.m14607d(view, "Argument must not be null");
        this.f16849a = view;
        this.f16850b = new C5563e(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo11860b(Drawable drawable);

    /* renamed from: d */
    public final C5588e mo11990d() {
        Object tag = this.f16849a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C5588e) {
            return (C5588e) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* renamed from: e */
    public final void mo11995e(C5571m mVar) {
        C5563e eVar = this.f16850b;
        int b = eVar.mo11999b();
        int a = eVar.mo11998a();
        if (C5563e.m14408d(b, a)) {
            mVar.mo12006g(b, a);
            return;
        }
        if (!eVar.f16847c.contains(mVar)) {
            eVar.f16847c.add(mVar);
        }
        if (eVar.f16848d == null) {
            ViewTreeObserver viewTreeObserver = eVar.f16846b.getViewTreeObserver();
            eVar.f16848d = new C5562d(eVar);
            viewTreeObserver.addOnPreDrawListener(eVar.f16848d);
        }
    }

    /* renamed from: f */
    public final void mo11991f(Drawable drawable) {
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        this.f16850b.mo12000c();
        mo11860b(drawable);
    }

    /* renamed from: g */
    public final void mo11996g(C5571m mVar) {
        this.f16850b.f16847c.remove(mVar);
    }

    /* renamed from: h */
    public final void mo11993h(C5588e eVar) {
        this.f16849a.setTag(R.id.glide_custom_view_target_tag, eVar);
    }

    /* renamed from: p */
    public final void mo11881p() {
    }

    /* renamed from: q */
    public final void mo11882q() {
    }

    /* renamed from: r */
    public final void mo11883r() {
    }

    public final String toString() {
        return "Target for: ".concat(this.f16849a.toString());
    }
}
