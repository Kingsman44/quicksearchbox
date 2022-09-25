package com.google.android.apps.gsa.searchplate;

import android.view.View;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;

/* renamed from: com.google.android.apps.gsa.searchplate.ab */
/* compiled from: PG */
final class C88900ab implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchPlate f240801a;

    public C88900ab(SearchPlate searchPlate) {
        this.f240801a = searchPlate;
    }

    public final void onClick(View view) {
        SearchPlate searchPlate = this.f240801a;
        C88893c cVar = searchPlate.f240752y;
        if (cVar == null) {
            return;
        }
        if (searchPlate.f240751x) {
            cVar.mo17643m();
        } else {
            cVar.mo17639i();
        }
    }
}
