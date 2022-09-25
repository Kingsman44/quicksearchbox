package com.google.android.apps.search.googleapp.discover.p10200l;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.l.e */
/* compiled from: PG */
public final class C134461e implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C134462f f366203a;

    public C134461e(C134462f fVar) {
        this.f366203a = fVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C134458b bVar = (C134458b) obj;
        C69664n.m101058d(bVar);
        C134457a aVar = (C134457a) bVar.toBuilder();
        Instant a = this.f366203a.f366204a.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        C63042fg b = C62949a.m95467b(a);
        aVar.copyOnWrite();
        C134458b bVar2 = (C134458b) aVar.instance;
        b.getClass();
        bVar2.f366198b = b;
        bVar2.f366197a |= 1;
        return (C134458b) aVar.build();
    }
}
