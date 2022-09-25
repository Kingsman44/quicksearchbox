package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107382f;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.ab */
/* compiled from: PG */
final class C107642ab implements C2333ah {

    /* renamed from: a */
    final /* synthetic */ C107656ap f299473a;

    public C107642ab(C107656ap apVar) {
        this.f299473a = apVar;
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        if (((C107382f) obj) == C107382f.DISMISSED) {
            this.f299473a.mo96161am();
            this.f299473a.f299586i.findViewById(R.id.opa_search_plate_explore_icon_container).setVisibility(0);
            return;
        }
        this.f299473a.mo96102A();
        this.f299473a.f299586i.findViewById(R.id.opa_search_plate_explore_icon_container).setVisibility(8);
    }
}
