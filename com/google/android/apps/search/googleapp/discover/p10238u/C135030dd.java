package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10214s.C134600r;
import com.google.android.apps.search.googleapp.discover.p10214s.C134601s;
import com.google.common.base.C58817ah;
import com.google.common.p4580v.C60941b;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.dd */
/* compiled from: PG */
final class C135030dd implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ Instant f367696a;

    public C135030dd(Instant instant) {
        this.f367696a = instant;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C134601s sVar = (C134601s) obj;
        C69664n.m101060f(sVar, "data");
        Instant instant = this.f367696a;
        C62934bn builder = sVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134600r rVar = (C134600r) builder;
        C69664n.m101061g(rVar, "builder");
        long a = C60941b.m93082a(instant);
        rVar.copyOnWrite();
        C134601s sVar2 = (C134601s) rVar.instance;
        sVar2.f366555a |= 1;
        sVar2.f366556b = a;
        C62942bv build = rVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134601s) build;
    }
}
