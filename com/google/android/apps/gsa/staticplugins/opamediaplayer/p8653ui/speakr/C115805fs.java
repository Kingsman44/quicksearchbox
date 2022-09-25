package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fs */
/* compiled from: PG */
public final /* synthetic */ class C115805fs implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115808fv f321150a;

    /* renamed from: b */
    public final /* synthetic */ int f321151b;

    public /* synthetic */ C115805fs(C115808fv fvVar, int i) {
        this.f321150a = fvVar;
        this.f321151b = i;
    }

    public final void onClick(View view) {
        C115808fv fvVar = this.f321150a;
        int i = this.f321151b;
        C115806ft ftVar = fvVar.f321154c;
        if (ftVar != null) {
            C115801fo foVar = (C115801fo) ftVar;
            int computeHorizontalScrollOffset = foVar.f321131f.computeHorizontalScrollOffset();
            foVar.f321131f.smoothScrollToPosition(i);
            if (i == foVar.f321135j.f321153b) {
                foVar.f321134i.performClick();
            } else if (computeHorizontalScrollOffset == foVar.f321131f.computeHorizontalScrollOffset()) {
                foVar.mo102268e(i);
            }
        }
    }
}
