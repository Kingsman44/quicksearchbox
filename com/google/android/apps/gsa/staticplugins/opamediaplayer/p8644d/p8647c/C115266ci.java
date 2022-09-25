package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ci */
/* compiled from: PG */
public final /* synthetic */ class C115266ci implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C115274cq f319835a;

    public /* synthetic */ C115266ci(C115274cq cqVar) {
        this.f319835a = cqVar;
    }

    public final void run() {
        C52583xc xcVar;
        C115274cq cqVar = this.f319835a;
        C115314ec a = cqVar.f319853g.mo101954a();
        C59104x b = C115274cq.f319847a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageC");
        ((C59052c) ((C59052c) b).mo56372aa(29804)).mo56386p("Loading text data in webview");
        ((C23251a) cqVar.f319849c.mo102015s()).mo28730f(Boolean.valueOf(cqVar.mo101926J(a)), false);
        C23251a aVar = (C23251a) cqVar.f319849c.mo102016t();
        C52568wo woVar = ((C52174hz) a.f319951a.f136914b.get(0)).f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        aVar.mo28730f(C115274cq.m191070r(xcVar), false);
        ((C23251a) cqVar.f319849c.mo102002f()).mo28730f(false, false);
        ((C23251a) cqVar.f319849c.mo102003g()).mo28730f(Boolean.valueOf(a.mo101950d()), false);
    }
}
