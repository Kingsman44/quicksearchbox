package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67438ag;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.ci */
/* compiled from: PG */
final class C13810ci implements C13754bg {

    /* renamed from: a */
    final /* synthetic */ C13811cj f42036a;

    /* renamed from: b */
    private final C60870cx f42037b;

    /* renamed from: c */
    private final C60870cx f42038c;

    public C13810ci(C13811cj cjVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f42036a = cjVar;
        this.f42037b = cxVar;
        this.f42038c = cxVar2;
    }

    /* renamed from: a */
    public final void mo21250a(C13725ai aiVar) {
        C58976aa aaVar = C58975e.f156826a;
        C46459k.m82829b(this.f42036a.f42064h.mo21344a(aiVar), "Error processing endpointer event", new Object[0]);
        C46459k.m82829b(this.f42036a.f42042C.mo21231a(aiVar, true, this.f42037b, this.f42038c), "Error logging endpointer event", new Object[0]);
        Optional a = C13726aj.m29976a(aiVar);
        if (a.isPresent()) {
            C46459k.m82829b(this.f42036a.f42060d.mo21308c((C67438ag) a.get()), "Error handling Network Recognition Event", new Object[0]);
            if (this.f42036a.f42041B.isPresent()) {
                ((C13872dx) this.f42036a.f42041B.get()).mo21324b((C67438ag) a.get());
            }
            C13863do doVar = this.f42036a.f42043D;
            C67438ag agVar = (C67438ag) a.get();
            C60870cx cxVar = this.f42037b;
            C60870cx cxVar2 = this.f42038c;
            doVar.mo21315f(agVar);
            C46459k.m82829b(doVar.mo21313b(agVar, cxVar, cxVar2), "Error logging Network Recognition Event", new Object[0]);
        }
    }
}
