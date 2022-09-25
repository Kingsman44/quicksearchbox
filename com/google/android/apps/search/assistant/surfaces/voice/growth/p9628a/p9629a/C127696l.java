package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import com.google.apps.tiktok.dataservice.C46688af;
import com.google.assistant.p4008y.p4009a.C53542ab;
import com.google.common.base.C58817ah;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C127696l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C127700p f351557a;

    public /* synthetic */ C127696l(C127700p pVar) {
        this.f351557a = pVar;
    }

    public final Object apply(Object obj) {
        C58872ci ciVar;
        C127700p pVar = this.f351557a;
        C53542ab abVar = (C53542ab) obj;
        C127701q qVar = pVar.f351564d;
        if (qVar.f351575k == null || (ciVar = qVar.f351574j) == null || Duration.ofNanos(ciVar.mo56159b()).compareTo(Duration.ofMillis(pVar.f351564d.f351567c.longValue())) > 0) {
            C58976aa aaVar = C58975e.f156826a;
            Instant instant = pVar.f351564d.f351575k;
            if (instant != null) {
                instant.toEpochMilli();
            }
            C58872ci ciVar2 = pVar.f351564d.f351574j;
            if (ciVar2 != null) {
                Duration.ofNanos(ciVar2.mo56159b()).toMillis();
            }
            return C46688af.f121976a;
        }
        C59104x b = C127701q.f351565a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrpcOlcDataService");
        ((C59052c) ((C59052c) b).mo56372aa(37582)).mo56386p("Returning cache hit.");
        Instant instant2 = pVar.f351564d.f351575k;
        instant2.getClass();
        return C46688af.m83205b(abVar, instant2.toEpochMilli());
    }
}
