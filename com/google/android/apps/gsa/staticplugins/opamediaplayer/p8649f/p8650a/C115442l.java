package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115217an;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115218ao;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115219ap;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115224au;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115226aw;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.l */
/* compiled from: PG */
public final class C115442l implements C23113i {

    /* renamed from: a */
    private final C115440j f320285a;

    public C115442l(C115440j jVar) {
        this.f320285a = jVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SpeakrLanguageSelectionEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onLanguageSelected_int")) {
                int intValue = Integer.valueOf(pVar.f63472a.getInt("index")).intValue();
                C115440j jVar = this.f320285a;
                C58976aa aaVar = C58975e.f156826a;
                C115226aw awVar = (C115226aw) jVar;
                String str3 = ((C115437g) ((C58485gu) ((C23251a) awVar.f319759b.mo101981d()).f63720e).get(intValue)).f320278b;
                ((C23251a) awVar.f319759b.mo101979b()).mo28730f(str3, false);
                C60870cx h = C60922j.m93045h(awVar.f319761d.mo78864a(), new C115217an(awVar, str3), C60826bg.f164896a);
                awVar.f319762e.mo101973u(new C115224au(str3), 1, "update-voices");
                new C90873ag(h, awVar.f319760c, "updateSettings", new C115218ao(awVar)).mo85223a(C115219ap.f319752a);
            } else if (str.equals("snackbarClosed")) {
                C115440j jVar2 = this.f320285a;
                C58976aa aaVar2 = C58975e.f156826a;
                C115226aw awVar2 = (C115226aw) jVar2;
                ((C23251a) awVar2.f319759b.mo101980c()).mo28730f(false, false);
                awVar2.mo101901e();
            }
        }
    }
}
