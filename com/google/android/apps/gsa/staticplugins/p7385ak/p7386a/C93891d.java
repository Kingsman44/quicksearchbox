package com.google.android.apps.gsa.staticplugins.p7385ak.p7386a;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.a.d */
/* compiled from: PG */
public final /* synthetic */ class C93891d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f262236a;

    public /* synthetic */ C93891d(Instant instant) {
        this.f262236a = instant;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f262236a;
        C93888a aVar = (C93888a) ((C93889b) obj).toBuilder();
        C63042fg c = C62950b.m95472c(instant);
        aVar.copyOnWrite();
        C93889b bVar = (C93889b) aVar.instance;
        c.getClass();
        bVar.f262234b = c;
        bVar.f262233a |= 1;
        return (C93889b) aVar.build();
    }
}
