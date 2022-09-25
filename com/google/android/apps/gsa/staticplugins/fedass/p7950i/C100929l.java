package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.libraries.assistant.trainingcache.p1618c.C19445f;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60945d;
import com.google.common.p4580v.C60948g;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67303bg;
import com.google.speech.p5228m.C67305bi;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.l */
/* compiled from: PG */
public final /* synthetic */ class C100929l implements C58817ah {
    public final Object apply(Object obj) {
        C67270aa aaVar = (C67270aa) obj;
        try {
            C60948g gVar = C60948g.f165068a;
            long a = C60945d.m93096a(Instant.now().minus(Duration.ofDays(3)));
            C67303bg bgVar = (C67303bg) C67305bi.f182944f.createBuilder();
            bgVar.copyOnWrite();
            C67305bi biVar = (C67305bi) bgVar.instance;
            biVar.f182950e = 8000;
            biVar.f182946a |= 16;
            bgVar.copyOnWrite();
            C67305bi biVar2 = (C67305bi) bgVar.instance;
            biVar2.f182946a |= 4;
            biVar2.f182949d = false;
            bgVar.copyOnWrite();
            C67305bi biVar3 = (C67305bi) bgVar.instance;
            biVar3.f182946a |= 1;
            biVar3.f182947b = a;
            bgVar.copyOnWrite();
            C67305bi biVar4 = (C67305bi) bgVar.instance;
            biVar4.f182948c = 5;
            biVar4.f182946a |= 2;
            return C19445f.m37136a(aaVar, (C67305bi) bgVar.build(), 100);
        } catch (RuntimeException e) {
            C59104x c = C100931n.f281969a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SheldonDumpableHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19683)).mo56386p("Failed to read speech learning scheduling events from Ekho");
            return C58485gu.m89845m();
        }
    }
}
