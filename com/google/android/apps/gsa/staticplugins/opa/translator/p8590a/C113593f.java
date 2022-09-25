package com.google.android.apps.gsa.staticplugins.opa.translator.p8590a;

import android.widget.RelativeLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113670av;
import com.google.android.libraries.logging.C28285c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.a.f */
/* compiled from: PG */
public final /* synthetic */ class C113593f implements C113670av {

    /* renamed from: a */
    public final /* synthetic */ C113613z f314524a;

    public /* synthetic */ C113593f(C113613z zVar) {
        this.f314524a = zVar;
    }

    /* renamed from: a */
    public final void mo100320a() {
        C113613z zVar = this.f314524a;
        C59104x b = C113613z.f314555a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(28014)).mo56386p("Auto Mic Button Opened");
        RelativeLayout relativeLayout = zVar.f314584l;
        if (relativeLayout != null) {
            C89949q.m146521e(C28285c.m52882i(C113613z.m188060e(relativeLayout).mo100375d(), 5, (Integer) null), false);
            if (!C113613z.m188063h(zVar.f314584l).mo100463e()) {
                zVar.mo100350y();
                zVar.f314592t = false;
                if (C113613z.m188058c(zVar.f314584l).getVisibility() == 0) {
                    C113613z.m188058c(zVar.f314584l).setVisibility(8);
                }
                zVar.mo100344s(BuildConfig.FLAVOR);
            }
        }
    }
}
