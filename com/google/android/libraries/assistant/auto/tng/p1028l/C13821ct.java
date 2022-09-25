package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67438ag;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.ct */
/* compiled from: PG */
final class C13821ct implements C13754bg {

    /* renamed from: a */
    final /* synthetic */ C13822cu f42095a;

    /* renamed from: b */
    private final C60870cx f42096b;

    /* renamed from: c */
    private final C60870cx f42097c;

    public C13821ct(C13822cu cuVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f42095a = cuVar;
        this.f42096b = cxVar;
        this.f42097c = cxVar2;
    }

    /* renamed from: a */
    public final void mo21250a(C13725ai aiVar) {
        C58976aa aaVar = C58975e.f156826a;
        C46459k.m82829b(this.f42095a.f42103e.mo21231a(aiVar, false, this.f42096b, this.f42097c), "Error Logging Endpointer Event", new Object[0]);
        C46459k.m82829b(this.f42095a.f42099a.mo21344a(aiVar), "processing endpointer event", new Object[0]);
        Optional a = C13726aj.m29976a(aiVar);
        if (a.isPresent()) {
            C46459k.m82829b(this.f42095a.f42100b.mo21307b((C67438ag) a.get(), false), "Error Handling Recognition Event", new Object[0]);
            if (this.f42095a.f42105g.isPresent()) {
                ((C13872dx) this.f42095a.f42105g.get()).mo21323a((C67438ag) a.get());
            }
            C13863do doVar = this.f42095a.f42104f;
            C67438ag agVar = (C67438ag) a.get();
            C60870cx cxVar = this.f42096b;
            C60870cx cxVar2 = this.f42097c;
            doVar.mo21314e(agVar);
            C46459k.m82829b(doVar.mo21312a(agVar, cxVar, cxVar2), "Error Logging Recognition Event", new Object[0]);
        }
    }
}
