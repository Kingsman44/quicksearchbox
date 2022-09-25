package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.provider.Settings;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87833fg;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ey */
/* compiled from: PG */
public final /* synthetic */ class C116695ey implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116703ff f323622a;

    /* renamed from: b */
    public final /* synthetic */ C87833fg f323623b;

    public /* synthetic */ C116695ey(C116703ff ffVar, C87833fg fgVar) {
        this.f323622a = ffVar;
        this.f323623b = fgVar;
    }

    public final void run() {
        C60870cx cxVar;
        C116703ff ffVar = this.f323622a;
        String str = this.f323623b.f237648b;
        if (Settings.canDrawOverlays(ffVar.f323640h)) {
            if (((C86124t) ffVar.f323637e.mo27525b()).mo79746e(C90037cp.f248461ap)) {
                ffVar.mo102836j(C89849ae.OPA_GROWTH_NUDGE_UI_START);
                new C90873ag(ffVar.f323641i.mo28209i(ffVar.f323634b.mo78577a(str), "nudgeResult", new C116688er(ffVar, str)), ffVar.f323638f, "chatHeadNudgeCreated", C116690et.f323616a).mo85223a(new C116691eu(ffVar));
                ffVar.mo102837k(str);
            } else if (((C86124t) ffVar.f323637e.mo27525b()).mo79746e(C90037cp.f248464as)) {
                ffVar.mo102836j(C89849ae.OPA_GROWTH_NUDGE_UI_START);
                ffVar.mo102836j(C89849ae.OPA_GROWTH_NUDGE_UI_HIDDEN_BY_TIMEOUT);
                ffVar.mo102833e(str);
            } else if (ffVar.f323643k != null || ((cxVar = ffVar.f323635c) != null && !cxVar.isDone())) {
                ffVar.mo102834g();
                ffVar.mo102837k(str);
            } else {
                ffVar.mo102836j(C89849ae.OPA_GROWTH_NUDGE_UI_START);
                ffVar.f323635c = ffVar.f323634b.mo78578b(str);
                new C90873ag(ffVar.f323635c, ffVar.f323638f, "nudgeUiCreated", new C116692ev(ffVar, str)).mo85223a(new C116693ew(ffVar));
            }
        }
    }
}
