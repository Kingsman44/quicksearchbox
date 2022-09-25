package com.google.android.apps.gsa.searchplate;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.searchplate.p6966d.C88939k;

/* renamed from: com.google.android.apps.gsa.searchplate.t */
/* compiled from: PG */
public final /* synthetic */ class C88976t implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ SearchPlate f241112a;

    public /* synthetic */ C88976t(SearchPlate searchPlate) {
        this.f241112a = searchPlate;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C88893c cVar;
        SearchPlate searchPlate = this.f241112a;
        if (keyEvent.getAction() != 0 || !C88939k.m144554j(keyEvent) || (cVar = searchPlate.f240752y) == null) {
            return false;
        }
        cVar.mo17638h();
        return true;
    }
}
