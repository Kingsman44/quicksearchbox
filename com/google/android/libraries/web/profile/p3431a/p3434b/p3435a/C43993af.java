package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.a.b.a.af */
/* compiled from: PG */
final class C43993af implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C44009av f114514a;

    /* renamed from: b */
    final /* synthetic */ long f114515b;

    public C43993af(C44009av avVar, long j) {
        this.f114514a = avVar;
        this.f114515b = j;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C44010aw awVar = (C44010aw) obj;
        if (this.f114514a != C44009av.NEVER) {
            long j = this.f114515b;
            long a = C43998ak.m77670a(this.f114514a);
            C69664n.m101060f(awVar, "data");
            if (j + a <= C43998ak.m77671b(awVar)) {
                return awVar;
            }
        }
        C69664n.m101060f(awVar, "data");
        long j2 = this.f114515b;
        C44009av avVar = this.f114514a;
        C62934bn builder = awVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C44007at atVar = (C44007at) builder;
        C69664n.m101061g(atVar, "builder");
        atVar.copyOnWrite();
        C44010aw awVar2 = (C44010aw) atVar.instance;
        awVar2.f114564a |= 1;
        awVar2.f114565b = j2;
        C69664n.m101061g(avVar, "value");
        atVar.copyOnWrite();
        C44010aw awVar3 = (C44010aw) atVar.instance;
        awVar3.f114566c = avVar.f114561f;
        awVar3.f114564a |= 2;
        C62942bv build = atVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C44010aw) build;
    }
}
