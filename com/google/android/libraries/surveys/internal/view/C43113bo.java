package com.google.android.libraries.surveys.internal.view;

import android.util.Log;

/* renamed from: com.google.android.libraries.surveys.internal.view.bo */
/* compiled from: PG */
public final /* synthetic */ class C43113bo implements C43120bv {

    /* renamed from: a */
    public final /* synthetic */ C43114bp f112757a;

    public /* synthetic */ C43113bo(C43114bp bpVar) {
        this.f112757a = bpVar;
    }

    /* renamed from: a */
    public final void mo46130a(C43121bw bwVar) {
        C43114bp bpVar = this.f112757a;
        C43130ce b = bpVar.mo46119b();
        if (b == null) {
            Log.w("SurveyMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
            return;
        }
        bpVar.f112760j = bwVar.f112780c;
        bpVar.f112758d = bwVar.f112778a;
        bpVar.f112759e = bwVar.f112779b;
        if (bwVar.f112780c == 4) {
            b.mo46105b(true);
        } else {
            b.mo46104a();
        }
    }
}
