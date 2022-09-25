package com.google.android.libraries.home.coreui.devicetile;

import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bi */
/* compiled from: PG */
final class C23690bi implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ C23693bl f64803a;

    public C23690bi(C23693bl blVar) {
        this.f64803a = blVar;
    }

    public final boolean onLongClick(View view) {
        C23656ab abVar = this.f64803a.f64807a;
        if (abVar == null) {
            C69664n.m101065k("cvh");
            abVar = null;
        }
        C23693bl.m44177c(abVar);
        return true;
    }
}
