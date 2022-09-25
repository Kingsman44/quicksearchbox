package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105281dv;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105282dw;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8154ui.C105655b;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7684gc;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.a.z */
/* compiled from: PG */
public final class C105418z implements C23113i {

    /* renamed from: a */
    private final C105416x f294033a;

    public C105418z(C105416x xVar) {
        this.f294033a = xVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        C8178yk ykVar;
        if ("SmileScaleSurveyEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("closeButtonClicked")) {
                C105416x xVar = this.f294033a;
                C58976aa aaVar = C58975e.f156826a;
                C105282dw dwVar = (C105282dw) xVar;
                if ((((C7684gc) dwVar.f293743a.mo94651g().f63720e).f26844a & 16) != 0) {
                    C91863e eVar = dwVar.f293745c;
                    C8178yk ykVar2 = ((C7684gc) dwVar.f293743a.mo94651g().f63720e).f26849f;
                    if (ykVar2 == null) {
                        ykVar2 = C8178yk.f28736g;
                    }
                    eVar.mo86386c(ykVar2, dwVar.f293746d.mo79727b(), (C57057b) dwVar.f293743a.mo94650f().f63720e, true);
                }
                dwVar.mo94700e();
            } else if (str.equals("logSurveyResult_com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ui.RatingView.OnSurveyResultListener.SurveyResult")) {
                C23259d dVar = new C23259d(C105655b.values());
                int i = pVar.f63472a.getInt("result");
                C105416x xVar2 = this.f294033a;
                C58976aa aaVar2 = C58975e.f156826a;
                C105282dw dwVar2 = (C105282dw) xVar2;
                C7684gc gcVar = (C7684gc) dwVar2.f293743a.mo94651g().f63720e;
                int ordinal = ((C105655b) dVar.f63738a[i]).ordinal();
                if (ordinal == 0) {
                    ykVar = gcVar.f26850g;
                    if (ykVar == null) {
                        ykVar = C8178yk.f28736g;
                    }
                } else if (ordinal == 1) {
                    ykVar = gcVar.f26851h;
                    if (ykVar == null) {
                        ykVar = C8178yk.f28736g;
                    }
                } else if (ordinal == 2) {
                    ykVar = gcVar.f26852i;
                    if (ykVar == null) {
                        ykVar = C8178yk.f28736g;
                    }
                } else if (ordinal == 3) {
                    ykVar = gcVar.f26853j;
                    if (ykVar == null) {
                        ykVar = C8178yk.f28736g;
                    }
                } else if (ordinal != 4) {
                    ykVar = null;
                } else {
                    ykVar = gcVar.f26854k;
                    if (ykVar == null) {
                        ykVar = C8178yk.f28736g;
                    }
                }
                if (ykVar != null) {
                    dwVar2.f293745c.mo86386c(ykVar, dwVar2.f293746d.mo79727b(), (C57057b) dwVar2.f293743a.mo94650f().f63720e, true);
                }
                dwVar2.f293744b.mo28213m("Dismiss Survey", 1500, new C105281dv(dwVar2));
            } else if (str.equals("onSurveyShown")) {
                C105282dw dwVar3 = (C105282dw) this.f294033a;
                if ((((C7684gc) dwVar3.f293743a.mo94651g().f63720e).f26844a & 8) != 0) {
                    C8178yk ykVar3 = ((C7684gc) dwVar3.f293743a.mo94651g().f63720e).f26848e;
                    if (ykVar3 == null) {
                        ykVar3 = C8178yk.f28736g;
                    }
                    dwVar3.f293745c.mo86387d(ykVar3, dwVar3.f293746d.mo79727b(), (C57057b) dwVar3.f293743a.mo94650f().f63720e, true);
                    C58976aa aaVar3 = C58975e.f156826a;
                }
            }
        }
    }
}
