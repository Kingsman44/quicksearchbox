package com.google.android.libraries.search.assistant.proactive;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124211d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.proactive.az */
/* compiled from: PG */
public final /* synthetic */ class C36230az implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C36240bh f94640a;

    public /* synthetic */ C36230az(C36240bh bhVar) {
        this.f94640a = bhVar;
    }

    public final Object call() {
        C36240bh bhVar = this.f94640a;
        if (bhVar.f94657g.isEmpty() && bhVar.f94660j.get() <= 0) {
            C59104x b = C36240bh.f94651a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
            ((C59052c) ((C59052c) b).mo56372aa(52261)).mo56386p("Disconnecting with APA Context Session.");
            C32881e eVar = bhVar.f94663m;
            if (eVar != null) {
                eVar.close();
                bhVar.f94663m = null;
            }
            C59104x b2 = C36240bh.f94651a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
            ((C59052c) ((C59052c) b2).mo56372aa(52262)).mo56386p("Disconnecting with APA Cross Device Service.");
            C124211d dVar = bhVar.f94662l;
            if (dVar != null) {
                dVar.mo106320a();
                bhVar.f94662l = null;
            }
            C59104x b3 = C36240bh.f94651a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
            ((C59052c) ((C59052c) b3).mo56372aa(52263)).mo56386p("Disconnecting with Conversation Service.");
            C119748c cVar = bhVar.f94661k;
            if (cVar != null) {
                cVar.mo104501d();
                bhVar.f94661k = null;
            }
        }
        return null;
    }
}
