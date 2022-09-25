package com.google.android.libraries.surveys.internal.view;

import android.util.Log;
import com.google.p4281bu.p4282a.C56545cb;

/* renamed from: com.google.android.libraries.surveys.internal.view.ax */
/* compiled from: PG */
public final /* synthetic */ class C43095ax implements C43107bi {

    /* renamed from: a */
    public final /* synthetic */ C43096ay f112711a;

    public /* synthetic */ C43095ax(C43096ay ayVar) {
        this.f112711a = ayVar;
    }

    /* renamed from: a */
    public final void mo46133a(int i) {
        C43096ay ayVar = this.f112711a;
        ayVar.f112712d = Integer.toString(i);
        ayVar.f112713e = i;
        ayVar.f112714f.mo46089a();
        int a = C56545cb.m88209a(ayVar.f112647a.f150999g);
        if (a == 0) {
            a = 1;
        }
        C43130ce b = ayVar.mo46119b();
        if (b == null) {
            Log.w("SurveyRatingFragment", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
        } else if (a == 5) {
            b.mo46104a();
        } else {
            b.mo46107d(ayVar.mo46159g(), ayVar);
        }
    }
}
