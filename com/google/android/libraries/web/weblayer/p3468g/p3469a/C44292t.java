package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import android.support.p031v4.app.Fragment;
import android.view.View;
import org.chromium.weblayer.C72615d;
import p3186j$.util.function.Supplier;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.t */
/* compiled from: PG */
public final class C44292t implements Supplier {

    /* renamed from: a */
    final /* synthetic */ C44296x f115187a;

    public C44292t(C44296x xVar) {
        this.f115187a = xVar;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        Fragment fragment;
        C72615d dVar = this.f115187a.f115197f.f114854a.f114872j;
        View view = null;
        if (!(dVar == null || (fragment = dVar.f193178a) == null)) {
            view = fragment.getView();
        }
        C69664n.m101058d(view);
        return view;
    }
}
