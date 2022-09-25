package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115639o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.ee */
/* compiled from: PG */
public final /* synthetic */ class C115764ee implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f321032a;

    /* renamed from: b */
    public final /* synthetic */ String f321033b;

    /* renamed from: c */
    public final /* synthetic */ String f321034c;

    public /* synthetic */ C115764ee(C115791fe feVar, String str, String str2) {
        this.f321032a = feVar;
        this.f321033b = str;
        this.f321034c = str2;
    }

    public final void run() {
        C115791fe feVar = this.f321032a;
        String str = this.f321033b;
        String str2 = this.f321034c;
        C115639o oVar = (C115639o) feVar.f321097h.mo27525b();
        oVar.mo102160b(feVar.f321208b.getResources().getString(R.string.omp_speakr_send_feedback_confirmation, new Object[]{str}));
        oVar.mo102162d(feVar.f321208b.getResources().getString(R.string.omp_speakr_yes), new C115728cw(feVar, str, str2));
        oVar.mo102161c(feVar.f321208b.getResources().getString(R.string.omp_speakr_no), C115729cx.f320991a);
        oVar.mo102159a().show();
    }
}
