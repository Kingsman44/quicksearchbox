package com.google.android.apps.gsa.searchplate;

import android.view.View;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;

/* renamed from: com.google.android.apps.gsa.searchplate.v */
/* compiled from: PG */
public final /* synthetic */ class C88978v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SearchPlate f241114a;

    public /* synthetic */ C88978v(SearchPlate searchPlate) {
        this.f241114a = searchPlate;
    }

    public final void onClick(View view) {
        SearchPlate searchPlate = this.f241114a;
        C88893c cVar = searchPlate.f240752y;
        if (cVar != null) {
            cVar.mo17634d(searchPlate.f240685E == 0);
        }
    }
}
