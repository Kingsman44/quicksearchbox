package com.google.android.libraries.search.udcdataservice.ulr;

import com.google.android.gms.location.reporting.C144964b;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41388d;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.udcdataservice.ulr.k */
/* compiled from: PG */
public final /* synthetic */ class C41432k implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C41432k f108215a = new C41432k();

    private /* synthetic */ C41432k() {
    }

    public final Object apply(Object obj) {
        ReportingState reportingState = (ReportingState) obj;
        boolean z = false;
        if (C144964b.m235615a(reportingState.f391923b) == 1 && C144964b.m235615a(reportingState.f391922a) == 1) {
            z = true;
        }
        boolean z2 = reportingState.f391924c;
        C41388d dVar = (C41388d) C41389e.f108143e.createBuilder();
        C41387c cVar = C41387c.LOCATION_HISTORY_AND_REPORTING;
        dVar.copyOnWrite();
        C41389e eVar = (C41389e) dVar.instance;
        eVar.f108146b = cVar.f108142h;
        eVar.f108145a |= 1;
        int i = 3;
        int i2 = true != z ? 3 : 2;
        dVar.copyOnWrite();
        C41389e eVar2 = (C41389e) dVar.instance;
        eVar2.f108147c = i2 - 1;
        eVar2.f108145a |= 2;
        if (true == z2) {
            i = 2;
        }
        dVar.copyOnWrite();
        C41389e eVar3 = (C41389e) dVar.instance;
        eVar3.f108148d = i - 1;
        eVar3.f108145a |= 4;
        return (C41389e) dVar.build();
    }
}
