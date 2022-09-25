package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import com.google.android.apps.gsa.search.shared.service.OnTranscriptionUpdateEventParcelable;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.shared.speech.Hypothesis;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94960u;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.aa */
/* compiled from: PG */
public final /* synthetic */ class C94982aa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94983ab f265710a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f265711b;

    public /* synthetic */ C94982aa(C94983ab abVar, ServiceEventData serviceEventData) {
        this.f265710a = abVar;
        this.f265711b = serviceEventData;
    }

    public final void run() {
        C94983ab abVar = this.f265710a;
        ServiceEventData serviceEventData = this.f265711b;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 45) {
            C59104x b = C94983ab.f265712a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17848)).mo56389s("UPDATE_RECOGNIZED_TEXT: %s", serviceEventData);
            C88382zp zpVar = (C88382zp) serviceEventData.mo81918e(C88380zn.f238990a);
            String str = zpVar.f238994b;
            String str2 = zpVar.f238995c;
            C95007y yVar = abVar.f265719h;
            if (yVar == null) {
                C59104x c = C94983ab.f265712a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
                ((C59052c) ((C59052c) c).mo56372aa(17855)).mo56386p("No callback!");
                return;
            }
            yVar.mo88825p(String.valueOf(str).concat(String.valueOf(str2)), !str2.isEmpty(), str.length());
        } else if (ordinal != 46) {
            if (ordinal == 52) {
                C59104x b2 = C94983ab.f265712a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
                ((C59052c) ((C59052c) b2).mo56372aa(17849)).mo56386p("ON_TRANSCRIPTION_UPDATE");
                if (serviceEventData.mo81913d(OnTranscriptionUpdateEventParcelable.class)) {
                    List list = ((OnTranscriptionUpdateEventParcelable) serviceEventData.mo81912b(OnTranscriptionUpdateEventParcelable.class)).f236958b;
                    C59104x b3 = C94983ab.f265712a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
                    ((C59052c) ((C59052c) b3).mo56372aa(17853)).mo56389s("onTranscriptionUpdate %b", Boolean.valueOf(abVar.f265718g));
                    if (abVar.f265718g) {
                        abVar.f265721j = ((Hypothesis) list.get(0)).f253055a;
                        C95294af afVar = abVar.f265720i;
                        if (afVar != null) {
                            afVar.mo89220a(C95457c.f267106f);
                            abVar.f265720i = null;
                        }
                    }
                }
            }
        } else if (((C88304ws) serviceEventData.mo81918e(C88302wq.f238816a)).f238820b == 9) {
            C59104x b4 = C94983ab.f265712a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
            ((C59052c) ((C59052c) b4).mo56372aa(17847)).mo56386p("STATE_DONE");
            C94960u uVar = abVar.f265722k;
            if (uVar == null) {
                C59104x c2 = C94983ab.f265712a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
                ((C59052c) ((C59052c) c2).mo56372aa(17852)).mo56386p("No endpoint event callback!");
                return;
            }
            uVar.mo88861a();
            if (abVar.f265718g) {
                abVar.f265718g = false;
                C95007y yVar2 = abVar.f265719h;
                if (yVar2 == null) {
                    C59104x c3 = C94983ab.f265712a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
                    ((C59052c) ((C59052c) c3).mo56372aa(17851)).mo56386p("No callback!");
                    return;
                }
                String str3 = abVar.f265721j;
                if (str3 != null) {
                    yVar2.mo88811b(str3);
                    C95007y yVar3 = abVar.f265719h;
                    String str4 = abVar.f265721j;
                    str4.getClass();
                    yVar3.mo88821l(str4);
                    abVar.f265719h.mo88815f(C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED);
                    return;
                }
                yVar2.mo88815f(C48098ce.QUERY_FAILED);
            }
        }
    }
}
