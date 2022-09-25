package com.google.android.libraries.surveys.internal.view;

import android.util.Log;

/* renamed from: com.google.android.libraries.surveys.internal.view.d */
/* compiled from: PG */
public final /* synthetic */ class C43146d implements C43155m {

    /* renamed from: a */
    public final /* synthetic */ C43147e f112832a;

    public /* synthetic */ C43146d(C43147e eVar) {
        this.f112832a = eVar;
    }

    /* renamed from: a */
    public final void mo46138a(C43154l lVar) {
        C43147e eVar = this.f112832a;
        C43130ce b = eVar.mo46119b();
        if (b == null) {
            Log.w("SurveyMultiSelectFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
        } else if (!lVar.mo46214a()) {
            b.mo46105b(false);
        } else {
            eVar.f112834e = lVar;
            eVar.f112833d.mo46089a();
            b.mo46107d(eVar.mo46205i(), eVar);
        }
    }
}
