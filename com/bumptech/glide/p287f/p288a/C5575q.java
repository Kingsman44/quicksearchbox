package com.bumptech.glide.p287f.p288a;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p291h.C5630q;
import com.google.android.googlequicksearchbox.R;

@Deprecated
/* renamed from: com.bumptech.glide.f.a.q */
/* compiled from: PG */
public abstract class C5575q extends C5559a {

    /* renamed from: a */
    protected final View f16861a;

    /* renamed from: b */
    public final C5574p f16862b;

    public C5575q(View view) {
        C5630q.m14607d(view, "Argument must not be null");
        this.f16861a = view;
        this.f16862b = new C5574p(view);
    }

    /* renamed from: d */
    public final C5588e mo11990d() {
        Object tag = this.f16861a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C5588e) {
            return (C5588e) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: e */
    public void mo11995e(C5571m mVar) {
        C5574p pVar = this.f16862b;
        int b = pVar.mo12009b();
        int a = pVar.mo12008a();
        if (C5574p.m14449d(b, a)) {
            mVar.mo12006g(b, a);
            return;
        }
        if (!pVar.f16859c.contains(mVar)) {
            pVar.f16859c.add(mVar);
        }
        if (pVar.f16860d == null) {
            ViewTreeObserver viewTreeObserver = pVar.f16858b.getViewTreeObserver();
            pVar.f16860d = new C5573o(pVar);
            viewTreeObserver.addOnPreDrawListener(pVar.f16860d);
        }
    }

    /* renamed from: g */
    public final void mo11996g(C5571m mVar) {
        this.f16862b.f16859c.remove(mVar);
    }

    /* renamed from: h */
    public final void mo11993h(C5588e eVar) {
        this.f16861a.setTag(R.id.glide_custom_view_target_tag, eVar);
    }

    /* renamed from: m */
    public final View mo12011m() {
        return this.f16861a;
    }

    public final String toString() {
        return "Target for: ".concat(this.f16861a.toString());
    }
}
