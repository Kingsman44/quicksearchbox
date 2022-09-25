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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.x */
/* compiled from: PG */
public final /* synthetic */ class C127708x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C127678aa f351588a;

    public /* synthetic */ C127708x(C127678aa aaVar) {
        this.f351588a = aaVar;
    }

    public final Object apply(Object obj) {
        C58872ci ciVar;
        C127678aa aaVar = this.f351588a;
        C53542ab abVar = (C53542ab) obj;
        C127679ab abVar2 = aaVar.f351517e;
        if (abVar2.f351529l == null || (ciVar = abVar2.f351528k) == null || Duration.ofNanos(ciVar.mo56159b()).compareTo(Duration.ofMillis(aaVar.f351517e.f351519b.longValue())) > 0) {
            C58976aa aaVar2 = C58975e.f156826a;
            Instant instant = aaVar.f351517e.f351529l;
            if (instant != null) {
                instant.toEpochMilli();
            }
            C58872ci ciVar2 = aaVar.f351517e.f351528k;
            if (ciVar2 != null) {
                Duration.ofNanos(ciVar2.mo56159b()).toMillis();
            }
            return C46688af.f121976a;
        }
        C59104x b = C127679ab.f351518a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrpcWpfOlcDataService");
        ((C59052c) ((C59052c) b).mo56372aa(37591)).mo56386p("Returning cache hit");
        Instant instant2 = aaVar.f351517e.f351529l;
        instant2.getClass();
        return C46688af.m83205b(abVar, instant2.toEpochMilli());
    }
}
