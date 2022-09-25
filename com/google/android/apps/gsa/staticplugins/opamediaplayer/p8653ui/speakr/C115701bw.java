package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.app.Activity;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.bw */
/* compiled from: PG */
public final /* synthetic */ class C115701bw implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115711cf f320899a;

    public /* synthetic */ C115701bw(C115711cf cfVar) {
        this.f320899a = cfVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115711cf cfVar = this.f320899a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C59104x b = C115711cf.f320912e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
        ((C59052c) ((C59052c) b).mo56372aa(30005)).mo56389s("isFinished: %b", Boolean.valueOf(booleanValue));
        if (booleanValue && cfVar.f321209c.mo56113h()) {
            ((Activity) cfVar.f321209c.mo56107c()).finish();
        }
    }
}
