package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.v */
/* compiled from: PG */
public final /* synthetic */ class C115833v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115520an f321231a;

    public /* synthetic */ C115833v(C115520an anVar) {
        this.f321231a = anVar;
    }

    public final void onClick(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f321231a.f320422v;
        int i = bottomSheetBehavior.f115862E;
        if (i == 3) {
            bottomSheetBehavior.mo47519v(4);
        } else if (i == 4) {
            bottomSheetBehavior.mo47519v(3);
        }
    }
}
