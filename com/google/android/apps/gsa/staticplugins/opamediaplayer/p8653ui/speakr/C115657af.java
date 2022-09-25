package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89315s;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89321y;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115423aa;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.af */
/* compiled from: PG */
public final /* synthetic */ class C115657af implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115711cf f320849a;

    public /* synthetic */ C115657af(C115711cf cfVar) {
        this.f320849a = cfVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115711cf cfVar = this.f320849a;
        C89321y yVar = (C89321y) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (((C58833ax) ((C23249a) cfVar.f320935f.mo102017u()).mo28725a()).mo56109e(C115423aa.HIGHLIGHTING_OFF) == C115423aa.HIGHLIGHTING_ON) {
            if (!cfVar.f320918F.mo56113h()) {
                C59104x d = C115711cf.f320912e.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                ((C59052c) ((C59052c) d).mo56372aa(30030)).mo56386p("Highlighter not initialized yet.");
                return;
            }
            ((C89315s) cfVar.f320918F.mo56107c()).mo83244c(yVar);
        }
    }
}
