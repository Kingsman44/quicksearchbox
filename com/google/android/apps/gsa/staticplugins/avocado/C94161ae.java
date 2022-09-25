package com.google.android.apps.gsa.staticplugins.avocado;

import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ae */
/* compiled from: PG */
public final /* synthetic */ class C94161ae implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94167ak f263036a;

    public /* synthetic */ C94161ae(C94167ak akVar) {
        this.f263036a = akVar;
    }

    public final void run() {
        C94167ak akVar = this.f263036a;
        HeaderLayout headerLayout = akVar.f263044a.f263055G;
        C84018m.m133908c(headerLayout.f228718a, BuildConfig.FLAVOR, TextView.BufferType.NORMAL, headerLayout);
        HeaderLayout headerLayout2 = akVar.f263044a.f263055G;
        C84018m.m133908c(headerLayout2.f228719b, BuildConfig.FLAVOR, TextView.BufferType.NORMAL, headerLayout2);
        akVar.f263044a.f263068T.setVisibility(0);
        akVar.f263044a.f263070V.setVisibility(0);
        akVar.f263044a.f263070V.mo9695f();
        akVar.f263044a.f263071W.setVisibility(0);
    }
}
