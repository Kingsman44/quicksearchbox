package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.bm */
/* compiled from: PG */
public final /* synthetic */ class C115243bm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C115274cq f319784a;

    public /* synthetic */ C115243bm(C115274cq cqVar) {
        this.f319784a = cqVar;
    }

    public final void run() {
        C115274cq cqVar = this.f319784a;
        C115314ec a = cqVar.f319853g.mo101954a();
        C59104x b = C115274cq.f319847a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageC");
        ((C59052c) ((C59052c) b).mo56372aa(29803)).mo56386p("Loading imageView");
        ((C23251a) cqVar.f319849c.mo102015s()).mo28730f(Boolean.valueOf(cqVar.mo101926J(a)), false);
        C23251a aVar = (C23251a) cqVar.f319849c.mo102000d();
        C52568wo woVar = cqVar.f319853g.mo101954a().mo101947a().f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C51012dc dcVar = woVar.f138004k;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        aVar.mo28730f(dcVar, false);
        ((C23251a) cqVar.f319849c.mo102002f()).mo28730f(false, false);
        ((C23251a) cqVar.f319849c.mo102003g()).mo28730f(Boolean.valueOf(a.mo101950d()), false);
    }
}
