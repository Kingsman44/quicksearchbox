package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m;

import com.google.assistant.p3803ag.p3809c.C49155y;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.m.a */
/* compiled from: PG */
public final class C131428a {

    /* renamed from: a */
    private static final Duration f359244a = Duration.ofHours(24);

    /* renamed from: b */
    private final C60950i f359245b;

    public C131428a(C60950i iVar) {
        this.f359245b = iVar;
    }

    /* renamed from: a */
    public final C49156z mo110159a() {
        Instant a = this.f359245b.mo57444a();
        C49155y yVar = (C49155y) C49156z.f127111d.createBuilder();
        C63042fg i = C62953e.m95484i(a.toEpochMilli());
        yVar.copyOnWrite();
        C49156z zVar = (C49156z) yVar.instance;
        i.getClass();
        zVar.f127114b = i;
        zVar.f127113a |= 1;
        C63042fg i2 = C62953e.m95484i(a.plus(f359244a).toEpochMilli());
        yVar.copyOnWrite();
        C49156z zVar2 = (C49156z) yVar.instance;
        i2.getClass();
        zVar2.f127115c = i2;
        zVar2.f127113a |= 2;
        return (C49156z) yVar.build();
    }
}
