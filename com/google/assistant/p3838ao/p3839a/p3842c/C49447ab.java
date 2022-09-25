package com.google.assistant.p3838ao.p3839a.p3842c;

import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3846f.C49642f;
import com.google.assistant.p3838ao.p3839a.p3848h.C49664s;
import com.google.assistant.p3838ao.p3839a.p3848h.C49665t;
import com.google.assistant.p3838ao.p3839a.p3848h.C49666u;
import com.google.assistant.p3838ao.p3839a.p3849i.C49679j;
import com.google.assistant.p3838ao.p3839a.p3849i.C49683n;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.c.ab */
/* compiled from: PG */
public final class C49447ab implements C49477be {
    /* renamed from: a */
    public final C58485gu mo53269a() {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C58485gu mo53270b(C49692r rVar) {
        C58485gu guVar;
        Optional r = rVar.mo53331r();
        if (r.isEmpty()) {
            return C58485gu.m89845m();
        }
        C49666u e = ((C49381a) rVar).f127637c.mo53307e();
        String e2 = ((C49642f) r.get()).mo53284e();
        if (C58837ba.m90859h(e2)) {
            guVar = C58485gu.m89845m();
        } else {
            guVar = (C58485gu) Collection.EL.stream(e.f128181a).filter(new C49664s(C49683n.m85674a(e2))).map(C49665t.f128180a).collect(C49679j.m85667a());
            guVar.size();
        }
        return (C58485gu) Collection.EL.stream(guVar).filter(C49501y.f127719a).map(C49502z.f127720a).map(C49446aa.f127698a).collect(C49679j.m85667a());
    }
}
