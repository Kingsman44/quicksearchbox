package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.c */
/* compiled from: PG */
public final class C134214c {
    /* renamed from: a */
    public static final C59770f m217785a(C89885b bVar) {
        C69664n.m101061g(bVar, "gsaErrorCode");
        C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
        eVar.copyOnWrite();
        C59770f fVar = (C59770f) eVar.instance;
        fVar.f161503a |= 1;
        fVar.f161504b = 0;
        int i = bVar.f246280a;
        eVar.copyOnWrite();
        C59770f fVar2 = (C59770f) eVar.instance;
        fVar2.f161503a |= 2;
        fVar2.f161505c = i;
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "newBuilder()\n    .setErr…Code.number)\n    .build()");
        return (C59770f) build;
    }
}
