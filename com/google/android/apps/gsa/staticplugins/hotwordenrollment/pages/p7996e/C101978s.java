package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.databinding.C0118a;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.s */
/* compiled from: PG */
public final /* synthetic */ class C101978s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C101933ag f284546a;

    public /* synthetic */ C101978s(C101933ag agVar) {
        this.f284546a = agVar;
    }

    public final void run() {
        C101933ag agVar = this.f284546a;
        WeakHashMap weakHashMap = C47831fm.f123851a;
        ((C89859i) agVar.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_CIRCLE_UI_INVOKE_ACTION_LISTENER);
        ((C89859i) agVar.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_SHOW_ENROLLMENT_SPINNER);
        if (agVar.f284368s.mo79746e(C90082eg.f249890aF)) {
            if (agVar.f284357h.getView() != null) {
                C101965f fVar = agVar.f284339I;
                View view = agVar.f284357h.getView();
                view.getClass();
                fVar.mo92743c(view);
            } else {
                C59104x c = C101933ag.f284328a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
                C0118a.m96d(c, "fragment.getView() is null!", 20455, C58979ad.FULL);
            }
            agVar.mo92703g();
        } else if (agVar.f284357h.getView() != null) {
            C101965f fVar2 = agVar.f284339I;
            View view2 = agVar.f284357h.getView();
            view2.getClass();
            fVar2.mo92743c(view2);
            fVar2.f284519b.mo28201a("showEnrollmentSpinner", C101926a.f284320a).mo4106b(C47810es.m84977q(new C101980u(agVar)), C60826bg.f164896a);
        } else {
            C59104x c2 = C101933ag.f284328a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
            C0118a.m96d(c2, "fragment.getView() is null!", 20454, C58979ad.FULL);
        }
    }
}
