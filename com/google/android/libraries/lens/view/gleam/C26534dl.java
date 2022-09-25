package com.google.android.libraries.lens.view.gleam;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.gleam.region.C26620k;
import com.google.android.libraries.lens.view.gleam.region.RegionView;
import com.google.android.libraries.lens.view.p2078at.C25518ax;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gleam.dl */
/* compiled from: PG */
public final /* synthetic */ class C26534dl implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26540dr f72324a;

    public /* synthetic */ C26534dl(C26540dr drVar) {
        this.f72324a = drVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26540dr drVar = this.f72324a;
        C58833ax axVar = (C58833ax) obj;
        C26559ej ejVar = drVar.f72355v;
        C25518ax.m46997e(axVar, ejVar.mo31825d());
        ejVar.mo31827f();
        C26620k c = drVar.mo31810c();
        if (c != null) {
            RegionView regionView = c.f72593f;
            regionView.f72548g = axVar;
            regionView.invalidate();
        }
    }
}
