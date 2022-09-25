package com.google.assistant.p3838ao.p3839a.p3840a;

import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49552bi;
import com.google.assistant.p3838ao.p3839a.p3848h.C49653h;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.Temporal;

/* renamed from: com.google.assistant.ao.a.a.n */
/* compiled from: PG */
final class C49411n implements C49382a {
    /* renamed from: a */
    public final /* synthetic */ boolean mo53258a(C49692r rVar, Object obj) {
        C49381a aVar = (C49381a) rVar;
        Instant a = aVar.f127644j.mo57444a();
        long millis = Duration.ofSeconds((long) ((C49552bi) obj).f127862a).toMillis();
        C58485gu g = aVar.f127637c.mo53310g();
        if (g.size() > 0) {
            C49653h hVar = (C49653h) g.get(0);
            Instant instant = hVar.f128162a;
            if (Duration.between((Temporal) null, a).toMillis() <= millis) {
                int i = hVar.f128163b;
                throw null;
            }
        }
        return false;
    }
}
