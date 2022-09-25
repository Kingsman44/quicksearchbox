package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.n */
/* compiled from: PG */
final class C106789n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ ViewStub f297581a;

    /* renamed from: b */
    final /* synthetic */ C106791p f297582b;

    public C106789n(C106791p pVar, ViewStub viewStub) {
        this.f297582b = pVar;
        this.f297581a = viewStub;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f297582b.f297585a.mo56226d()).mo56382g(th)).mo56372aa(23194)).mo56386p("onFailure()");
        ViewGroup viewGroup = (ViewGroup) this.f297581a.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f297581a);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        ViewGroup viewGroup = (ViewGroup) this.f297581a.getParent();
        if (viewGroup != null) {
            int indexOfChild = viewGroup.indexOfChild(this.f297581a);
            viewGroup.removeView(this.f297581a);
            if (optional != null && optional.isPresent()) {
                View view = (View) optional.get();
                this.f297582b.mo95653d(view);
                viewGroup.addView(view, indexOfChild);
            }
        }
    }
}
