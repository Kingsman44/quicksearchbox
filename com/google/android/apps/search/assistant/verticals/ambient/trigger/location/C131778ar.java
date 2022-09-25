package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import com.google.android.gms.semanticlocation.SemanticLocationEvent;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.assistant.p4016z.C53693ar;
import com.google.assistant.p4016z.C53694as;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ar */
/* compiled from: PG */
public final class C131778ar {

    /* renamed from: a */
    public final C58974d f359958a;

    /* renamed from: b */
    private final C130895ag f359959b;

    /* renamed from: c */
    private final C60950i f359960c;

    public C131778ar(C130895ag agVar, C60950i iVar, C130603a aVar) {
        this.f359959b = agVar;
        this.f359960c = iVar;
        this.f359958a = aVar.mo109740b(this);
    }

    /* renamed from: a */
    public final C53694as mo110311a(PlaceCandidate placeCandidate) {
        if (placeCandidate == null) {
            return C53694as.f140951e;
        }
        ((C58970a) ((C58970a) this.f359958a.mo56224b()).mo56372aa(39366)).mo56371Z(placeCandidate.f394587a.f394592a, placeCandidate.f394589c);
        C53693ar arVar = (C53693ar) C53694as.f140951e.createBuilder();
        float f = placeCandidate.f394589c;
        arVar.copyOnWrite();
        C53694as asVar = (C53694as) arVar.instance;
        asVar.f140953a |= 1;
        asVar.f140954b = f;
        C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
        int i = placeCandidate.f394591e.f394593a;
        jVar.copyOnWrite();
        double d = (double) i;
        Double.isNaN(d);
        ((C58079k) jVar.instance).f155252a = d * 1.0E-7d;
        int i2 = placeCandidate.f394591e.f394594b;
        jVar.copyOnWrite();
        double d2 = (double) i2;
        Double.isNaN(d2);
        ((C58079k) jVar.instance).f155253b = d2 * 1.0E-7d;
        C58079k kVar = (C58079k) jVar.build();
        arVar.copyOnWrite();
        C53694as asVar2 = (C53694as) arVar.instance;
        kVar.getClass();
        asVar2.f140955c = kVar;
        asVar2.f140953a |= 2;
        long j = placeCandidate.f394587a.f394592a;
        arVar.copyOnWrite();
        C53694as asVar3 = (C53694as) arVar.instance;
        asVar3.f140953a |= 4;
        asVar3.f140956d = j;
        return (C53694as) arVar.build();
    }

    /* renamed from: b */
    public final void mo110312b(SemanticLocationState semanticLocationState, SemanticLocationEvent semanticLocationEvent, int i) {
        Instant a = this.f359960c.mo57444a();
        this.f359959b.mo109901aJ(Duration.between(Instant.ofEpochSecond(semanticLocationState.f394628b), a).toMillis(), i);
        this.f359959b.mo109902aK(Duration.between(Instant.ofEpochSecond(semanticLocationEvent.f394617a), a).toMillis(), i);
        ((C58970a) ((C58970a) this.f359958a.mo56224b()).mo56372aa(39369)).mo56359L("CSL %s event detected timestamp seconds: %d, current timestamp millis: %d", i != 2 ? i != 3 ? "EXIT" : "ONGOING" : "ENTER", Long.valueOf(semanticLocationEvent.f394617a), Long.valueOf(a.toEpochMilli()));
    }
}
