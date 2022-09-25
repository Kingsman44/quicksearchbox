package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104610cx;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104611cy;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7664fj;
import com.google.p375ai.p378b.C7665fk;
import com.google.p375ai.p378b.C8178yk;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a.v */
/* compiled from: PG */
public final class C104459v implements C23113i {

    /* renamed from: a */
    private final C104457t f290579a;

    public C104459v(C104457t tVar) {
        this.f290579a = tVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("FollowUpSurveyEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onBottomsheetDismissed")) {
                C104611cy cyVar = (C104611cy) this.f290579a;
                if (!((C58833ax) ((C23251a) cyVar.f291235d.mo94212b()).f63720e).mo56113h()) {
                    C59104x d = C104611cy.f291232a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "FollowUpController");
                    ((C59052c) ((C59052c) d).mo56372aa(22017)).mo56386p("No survey data found on FollowUpSurveyModel, unable to log VEs");
                    cyVar.f291233b.mo94264a(C58836b.f156633a);
                } else if (((Boolean) cyVar.f291235d.mo94214d().f63720e).booleanValue()) {
                    cyVar.f291233b.mo94264a(C58833ax.m90834k(new C104610cx(cyVar)));
                } else {
                    cyVar.mo94274e();
                    cyVar.f291233b.mo94264a(C58836b.f156633a);
                }
            } else if (str.equals("onOptionSelected_int")) {
                int intValue = Integer.valueOf(pVar.f63472a.getInt("optionIndex")).intValue();
                C104611cy cyVar2 = (C104611cy) this.f290579a;
                if (((C58833ax) ((C23251a) cyVar2.f291235d.mo94212b()).f63720e).mo56113h()) {
                    C7665fk fkVar = (C7665fk) ((C58833ax) ((C23251a) cyVar2.f291235d.mo94212b()).f63720e).mo56107c();
                    if (intValue >= 0 && intValue < fkVar.f26615c.size()) {
                        cyVar2.f291235d.mo94213c().mo28730f(C58833ax.m90834k((C7664fj) fkVar.f26615c.get(intValue)), false);
                    }
                }
            } else if (str.equals("onSurveyShown")) {
                C104611cy cyVar3 = (C104611cy) this.f290579a;
                if (!((C58833ax) ((C23251a) cyVar3.f291235d.mo94212b()).f63720e).mo56113h()) {
                    C59104x d2 = C104611cy.f291232a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "FollowUpController");
                    ((C59052c) ((C59052c) d2).mo56372aa(22018)).mo56386p("No survey data found on FollowUpSurveyModel.");
                    return;
                }
                C8178yk ykVar = ((C7665fk) ((C58833ax) ((C23251a) cyVar3.f291235d.mo94212b()).f63720e).mo56107c()).f26616d;
                if (ykVar == null) {
                    ykVar = C8178yk.f28736g;
                }
                cyVar3.f291234c.mo85750j(ykVar);
            }
        }
    }
}
