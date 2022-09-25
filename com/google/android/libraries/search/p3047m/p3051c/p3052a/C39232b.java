package com.google.android.libraries.search.p3047m.p3051c.p3052a;

import com.google.android.libraries.search.location.p3029a.C38591ak;
import com.google.android.libraries.search.location.p3029a.C38635c;
import com.google.common.base.C58817ah;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.m.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C39232b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39234d f103356a;

    public /* synthetic */ C39232b(C39234d dVar) {
        this.f103356a = dVar;
    }

    public final Object apply(Object obj) {
        C39234d dVar = this.f103356a;
        C38635c cVar = (C38635c) obj;
        if (cVar == null) {
            return null;
        }
        if (!dVar.mo41741a(cVar) && cVar.f102093c) {
            return null;
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(cVar.f102094d);
        if (dVar.mo41741a(cVar)) {
            ofEpochMilli = ofEpochMilli.plus(C38591ak.f102016a);
        }
        Duration between = Duration.between(ofEpochMilli, Instant.ofEpochMilli(dVar.f103360d.mo26870b()));
        if (between.compareTo(C39234d.f103357a) >= 0) {
            return new C39231a(between);
        }
        return null;
    }
}
