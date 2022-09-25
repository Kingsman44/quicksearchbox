package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.gsa.shared.util.C90775bs;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupcompat.template.C45277d;
import com.google.android.setupdesign.GlifLayout;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.l */
/* compiled from: PG */
final class C84017l implements View.OnAttachStateChangeListener, C84012g {

    /* renamed from: a */
    public final C84013h f228861a;

    /* renamed from: b */
    public int f228862b = 0;

    /* renamed from: c */
    public C84011f f228863c = C84011f.f228856a;

    /* renamed from: d */
    public C84011f f228864d = C84011f.f228856a;

    /* renamed from: e */
    private final View f228865e;

    public C84017l(View view, C84013h hVar) {
        this.f228865e = view;
        this.f228861a = hVar;
    }

    /* renamed from: g */
    private final void m133899g(C90775bs bsVar) {
        C58833ax axVar;
        ViewParent parent = this.f228865e.getParent();
        while (true) {
            if (parent == null) {
                C58976aa aaVar = C58975e.f156826a;
                axVar = C58836b.f156633a;
                break;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            if (parent instanceof GlifLayout) {
                axVar = C58833ax.m90834k((GlifLayout) parent);
                break;
            }
            parent = parent.getParent();
        }
        if (axVar.mo56113h()) {
            bsVar.mo77476a((C45275b) ((GlifLayout) axVar.mo56107c()).mo49129j(C45275b.class));
        }
    }

    /* renamed from: a */
    public final void mo77472a(C84011f fVar) {
        this.f228863c = fVar;
        m133899g(new C84014i(this));
    }

    /* renamed from: b */
    public final void mo77473b(C84011f fVar) {
        this.f228864d = fVar;
        m133899g(new C84015j(this));
    }

    /* renamed from: c */
    public final void mo77474c(View.OnClickListener onClickListener) {
        this.f228861a.mo77474c(onClickListener);
    }

    /* renamed from: d */
    public final void mo77475d(int i) {
        this.f228862b = i;
        this.f228865e.addOnAttachStateChangeListener(this);
        m133899g(new C84016k(this));
    }

    /* renamed from: e */
    public final C45277d mo77477e(C84011f fVar) {
        C45276c cVar = new C45276c(this.f228865e.getContext());
        cVar.f118280a = fVar.mo77416b().toString();
        cVar.f118281b = fVar.mo77415a();
        C45277d a = cVar.mo49180a();
        a.mo49183b(true != fVar.mo77418d() ? 8 : 0);
        return a;
    }

    /* renamed from: f */
    public final C45277d mo77478f() {
        C45277d a = new C45276c(this.f228865e.getContext()).mo49180a();
        a.mo49183b(8);
        return a;
    }

    public final void onViewAttachedToWindow(View view) {
        C58976aa aaVar = C58975e.f156826a;
        this.f228865e.removeOnAttachStateChangeListener(this);
        m133899g(new C84016k(this));
        m133899g(new C84014i(this));
        m133899g(new C84015j(this));
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
