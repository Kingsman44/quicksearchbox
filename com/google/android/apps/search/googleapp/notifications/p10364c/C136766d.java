package com.google.android.apps.search.googleapp.notifications.p10364c;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.c.d */
/* compiled from: PG */
public final class C136766d implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ String f372298a;

    public C136766d(String str) {
        this.f372298a = str;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C136764b bVar = (C136764b) obj;
        C69664n.m101060f(bVar, "it");
        String str = this.f372298a;
        C62934bn builder = bVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C136763a aVar = (C136763a) builder;
        C69664n.m101061g(aVar, "builder");
        C69664n.m101061g(str, "value");
        aVar.copyOnWrite();
        C136764b bVar2 = (C136764b) aVar.instance;
        str.getClass();
        bVar2.f372293a |= 1;
        bVar2.f372294b = str;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C136764b) build;
    }
}
