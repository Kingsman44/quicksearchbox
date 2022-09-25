package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52579wz;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ds */
/* compiled from: PG */
public final /* synthetic */ class C115303ds implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C115315ed f319931a;

    public /* synthetic */ C115303ds(C115315ed edVar) {
        this.f319931a = edVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C52583xc xcVar;
        C115315ed edVar = this.f319931a;
        C115314ec a = edVar.mo101954a();
        if (a.mo101952f()) {
            C59104x b = C115315ed.f319953a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SpeakrOMPAdapter");
            ((C59052c) ((C59052c) b).mo56372aa(29844)).mo56386p("Play - Already playing.");
            return C60866ct.f164955a;
        }
        C52568wo woVar = a.mo101947a().f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52579wz a2 = C52579wz.m86656a(xcVar.f138066b);
        if (a2 == null) {
            a2 = C52579wz.UNKNOWN_READ_STATE;
        }
        if (a2 == C52579wz.READ) {
            C59104x b2 = C115315ed.f319953a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SpeakrOMPAdapter");
            ((C59052c) ((C59052c) b2).mo56372aa(29843)).mo56386p("Play - Already fully read.");
            return C60866ct.f164955a;
        }
        C59104x b3 = C115315ed.f319953a.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "SpeakrOMPAdapter");
        ((C59052c) ((C59052c) b3).mo56372aa(29842)).mo56395y("Play requested. Current snapshot index: %d, URL: %s", a.f319951a.f136916d, a.mo101947a().f136895b);
        return edVar.mo101956d(a.f319951a.f136916d);
    }
}
