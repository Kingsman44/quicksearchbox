package com.google.p4449cd.p4460h.p4461a;

import com.google.common.base.C58838bb;
import com.google.p4449cd.p4451b.C57938a;
import com.google.p4449cd.p4453d.C57957c;
import com.google.p4449cd.p4453d.C57958d;

/* renamed from: com.google.cd.h.a.ai */
/* compiled from: PG */
public final class C58013ai {
    /* renamed from: a */
    public static C57958d m88768a(Class cls, C57957c cVar, C57938a aVar, long j) {
        Long valueOf = Long.valueOf(aVar.f154953d.incrementAndGet());
        Long b = m88769b();
        C58838bb.m90869d(!cVar.f155000f, "TaskDescription#forProducerTask should be used to construct producer task descriptions.");
        return new C57958d(cVar, (Object) null, cls, Long.valueOf(j), valueOf, b);
    }

    /* renamed from: b */
    public static Long m88769b() {
        C57958d dVar = (C57958d) C58021h.f155121a.get();
        if (dVar == null) {
            return null;
        }
        return dVar.f155003c;
    }
}
