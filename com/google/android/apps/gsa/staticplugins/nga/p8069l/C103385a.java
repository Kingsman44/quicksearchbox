package com.google.android.apps.gsa.staticplugins.nga.p8069l;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119265aa;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4580v.C60951j;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.l.a */
/* compiled from: PG */
public final /* synthetic */ class C103385a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103393e f288207a;

    public /* synthetic */ C103385a(C103393e eVar) {
        this.f288207a = eVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103393e eVar = this.f288207a;
        C119265aa aaVar = (C119265aa) obj;
        if (Instant.ofEpochMilli(aaVar.f332607b).plus(Duration.ofDays(1)).isAfter(eVar.f288225j.mo57444a())) {
            return true;
        }
        return Boolean.valueOf(Instant.ofEpochMilli(aaVar.f332606a).atZone(C60951j.f165070a).truncatedTo(ChronoUnit.DAYS).isEqual(eVar.f288225j.mo57444a().atZone(C60951j.f165070a).truncatedTo(ChronoUnit.DAYS)));
    }
}
