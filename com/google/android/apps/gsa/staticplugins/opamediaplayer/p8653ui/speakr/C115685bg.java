package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115422a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115612a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.bg */
/* compiled from: PG */
public final /* synthetic */ class C115685bg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C115711cf f320881a;

    public /* synthetic */ C115685bg(C115711cf cfVar) {
        this.f320881a = cfVar;
    }

    public final void run() {
        C115711cf cfVar = this.f320881a;
        byte[] a = C115612a.m191748a(cfVar.mo28297il().getRootView());
        if (!cfVar.f321210d.booleanValue()) {
            cfVar.f320936g.mo101881l(a);
            return;
        }
        C44581b bVar = new C44581b(cfVar.mo28297il().getContext(), 0);
        bVar.mo47605x(cfVar.f321208b.getResources().getString(R.string.select_feedback_category));
        bVar.mo47596o((CharSequence[]) Collection.EL.stream(C115422a.f320241a).map(C115692bn.f320889a).toArray(C115693bo.f320890a), new C115694bp(cfVar, a));
        bVar.create().show();
    }
}
