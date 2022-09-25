package com.google.android.libraries.search.location.p3029a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.location.a.ab */
/* compiled from: PG */
final class C38582ab implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C38586af f101984a;

    public C38582ab(C38586af afVar) {
        this.f101984a = afVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C38586af.f101990a.mo56225c()).mo56382g(th)).mo56372aa(53141)).mo56386p("Failed to get consent data");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C38635c cVar = (C38635c) obj;
        C38590aj a = C38590aj.m67896a(cVar.f102092b);
        if (a == null) {
            a = C38590aj.CONSENT_REASON_UNKNOWN;
        }
        if (a.equals(C38590aj.CONSENT_REASON_TEMPORARILY_ALLOWED)) {
            this.f101984a.mo41516m(C38591ak.m67898a(cVar, Instant.ofEpochMilli(this.f101984a.f101994e.mo26870b())), cVar.f102094d);
        }
    }
}
