package com.google.android.apps.search.googleapp.discover.p10203o;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.o.b */
/* compiled from: PG */
final class C134473b implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ Instant f366229a;

    public C134473b(Instant instant) {
        this.f366229a = instant;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C134477f fVar = (C134477f) obj;
        C69664n.m101058d(fVar);
        C63042fg fgVar = fVar.f366240b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar, "it!!.minusOneLastLoadTime");
        if (Duration.between(C62949a.m95469d(fgVar), this.f366229a).compareTo(C134475d.f366232a) <= 0) {
            return fVar;
        }
        Instant instant = this.f366229a;
        C62934bn builder = fVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134476e eVar = (C134476e) builder;
        C69664n.m101061g(eVar, "builder");
        C63042fg b = C62949a.m95467b(instant);
        C69664n.m101061g(b, "value");
        eVar.copyOnWrite();
        C134477f fVar2 = (C134477f) eVar.instance;
        b.getClass();
        fVar2.f366240b = b;
        fVar2.f366239a |= 1;
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134477f) build;
    }
}
