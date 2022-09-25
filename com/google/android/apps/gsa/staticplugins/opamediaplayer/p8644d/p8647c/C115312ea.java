package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p6486s.C84273m;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ea */
/* compiled from: PG */
final class C115312ea implements C84273m {

    /* renamed from: a */
    final /* synthetic */ C115315ed f319946a;

    public C115312ea(C115315ed edVar) {
        this.f319946a = edVar;
    }

    /* renamed from: a */
    public final void mo77783a(C52176ia iaVar) {
        this.f319946a.mo101965m(new C115310dz(this, iaVar));
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        C115318eg egVar;
        try {
            C52567wn wnVar = (C52567wn) C115485b.m191568b((String) oVar.mo77806l().mo56109e(BuildConfig.FLAVOR)).mo56109e(C52567wn.UNKNOWN);
            if ((wnVar == C52567wn.NARRATED_WEB || wnVar == C52567wn.PHOTO) && this.f319946a.f319958f.isDone()) {
                if (!oVar.mo77811q() || oVar.mo77798d() != 0) {
                    egVar = oVar;
                } else {
                    C115318eg egVar2 = new C115318eg(oVar);
                    egVar2.f319966a = C58833ax.m90834k(false);
                    egVar = egVar2;
                }
                if (!this.f319946a.f319956d.mo56113h() || !C58597ky.m90218i(C115315ed.m191166b((C84275o) this.f319946a.f319956d.mo56107c()), C115315ed.m191166b(egVar))) {
                    C115314ec a = this.f319946a.mo101954a();
                    if (a.mo101949c()) {
                        if (!a.mo101951e(oVar)) {
                            C115313eb ebVar = this.f319946a.f319963k;
                            long c = ebVar.f319950d.f319962j.mo26871c() - ebVar.f319947a;
                            C115314ec a2 = ebVar.f319950d.mo101954a();
                            if (ebVar.f319948b != a2.f319951a.f136916d || !ebVar.f319949c.equals(a2.mo101947a().f136895b) || c >= 2000) {
                                this.f319946a.mo101974v(oVar.mo77796b(), 1, "MOVE_TO_INDEX_FROM_EXTERNAL");
                            } else {
                                C58976aa aaVar = C58975e.f156826a;
                                return;
                            }
                        }
                        this.f319946a.f319956d = C58833ax.m90834k(egVar);
                        C115315ed edVar = this.f319946a;
                        if (egVar.mo77811q()) {
                            if (edVar.f319961i) {
                                edVar.mo101965m(new C115304dt(edVar));
                            } else {
                                edVar.mo101973u(new C115291dg(edVar), 1, "MARK_ITEM_AS_FULLY_READ");
                            }
                        } else if (egVar.mo77807m().mo56113h()) {
                            C58976aa aaVar2 = C58975e.f156826a;
                            edVar.mo101973u(new C115286db(edVar, ((Integer) egVar.mo77807m().mo56107c()).intValue()), 1, "MARK_CURRENT_ITEM_LAST_PARAGRAPH");
                        }
                        this.f319946a.mo101961i(new C115309dy(egVar));
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
        }
    }
}
