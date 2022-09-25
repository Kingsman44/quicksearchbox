package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67438ag;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.da */
/* compiled from: PG */
final class C13849da implements C13754bg {

    /* renamed from: a */
    final /* synthetic */ C13850db f42152a;

    /* renamed from: b */
    private final C60870cx f42153b;

    /* renamed from: c */
    private final C60870cx f42154c;

    public C13849da(C13850db dbVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f42152a = dbVar;
        this.f42153b = cxVar;
        this.f42154c = cxVar2;
    }

    /* renamed from: a */
    public final void mo21250a(C13725ai aiVar) {
        C58976aa aaVar = C58975e.f156826a;
        C46459k.m82829b(this.f42152a.f42163h.mo21231a(aiVar, true, this.f42153b, this.f42154c), "Error Logging Endpointer Event", new Object[0]);
        C46459k.m82829b(this.f42152a.f42159d.mo21344a(aiVar), "processing endpointer event", new Object[0]);
        Optional a = C13726aj.m29976a(aiVar);
        if (a.isPresent()) {
            C46459k.m82829b(this.f42152a.f42156a.mo21308c((C67438ag) a.get()), "Error Handling Recognition Event", new Object[0]);
            if (this.f42152a.f42161f.isPresent()) {
                ((C13872dx) this.f42152a.f42161f.get()).mo21324b((C67438ag) a.get());
            }
            C13863do doVar = this.f42152a.f42162g;
            C67438ag agVar = (C67438ag) a.get();
            C60870cx cxVar = this.f42153b;
            C60870cx cxVar2 = this.f42154c;
            doVar.mo21315f(agVar);
            C46459k.m82829b(doVar.mo21313b(agVar, cxVar, cxVar2), "Error Logging Recognition Event", new Object[0]);
        }
    }
}
