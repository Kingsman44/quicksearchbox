package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.service.voice.AlwaysOnHotwordDetector;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C39608i implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C39633o f104278a;

    public /* synthetic */ C39608i(C39633o oVar) {
        this.f104278a = oVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C39633o oVar = this.f104278a;
        AlwaysOnHotwordDetector alwaysOnHotwordDetector = oVar.f104332q;
        if (alwaysOnHotwordDetector != null && oVar.f104333r != null) {
            cVar.mo5437b((Object) null);
            C59104x b = C39633o.f104316a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) b).mo56372aa(53509)).mo56386p("alwaysOnHotwordDetector already created and first onAvailabilityChanged called.");
            return "alwaysOnHotwordDetector already created and first onAvailabilityChanged called!";
        } else if (alwaysOnHotwordDetector != null) {
            C59104x b2 = C39633o.f104316a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) b2).mo56372aa(53508)).mo56386p("alwaysOnHotwordDetector already created but first onAvailabilityChanged is not called!");
            return "alwaysOnHotwordDetector already created!";
        } else {
            C59104x b3 = C39633o.f104316a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) b3).mo56372aa(53507)).mo56386p("Create a AlwaysOnHotwordDetector before we start hotword detection.");
            oVar.mo41963d("CREATING_ALWAYS_ON_HOTWORD_DETECTOR");
            oVar.f104322g.post(new C39529g(oVar, new C39632n(oVar, cVar)));
            return "Creating a AlwaysOnHotwordDetector";
        }
    }
}
