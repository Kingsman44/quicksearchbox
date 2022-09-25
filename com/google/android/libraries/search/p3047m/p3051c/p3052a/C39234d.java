package com.google.android.libraries.search.p3047m.p3051c.p3052a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.p3029a.C38588ah;
import com.google.android.libraries.search.location.p3029a.C38590aj;
import com.google.android.libraries.search.location.p3029a.C38591ak;
import com.google.android.libraries.search.location.p3029a.C38635c;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.m.c.a.d */
/* compiled from: PG */
public final class C39234d {

    /* renamed from: a */
    static final Duration f103357a = Duration.ofSeconds(3);

    /* renamed from: b */
    public final C60888db f103358b;

    /* renamed from: c */
    public final C38588ah f103359c;

    /* renamed from: d */
    public final C21370a f103360d;

    public C39234d(C60888db dbVar, C38588ah ahVar, C21370a aVar) {
        this.f103358b = dbVar;
        this.f103359c = ahVar;
        this.f103360d = aVar;
    }

    /* renamed from: a */
    public final boolean mo41741a(C38635c cVar) {
        C38590aj a = C38590aj.m67896a(cVar.f102092b);
        if (a == null) {
            a = C38590aj.CONSENT_REASON_UNKNOWN;
        }
        if (!a.equals(C38590aj.CONSENT_REASON_TEMPORARILY_ALLOWED)) {
            return false;
        }
        return C38591ak.m67898a(cVar, Instant.ofEpochMilli(this.f103360d.mo26870b())).isZero();
    }
}
