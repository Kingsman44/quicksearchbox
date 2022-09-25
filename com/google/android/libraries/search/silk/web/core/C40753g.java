package com.google.android.libraries.search.silk.web.core;

import com.google.p4283bv.p4287b.p4288a.p4322b.C56845a;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56846b;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56852h;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.contrib.android.ProtoParsers;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.core.g */
/* compiled from: PG */
public final /* synthetic */ class C40753g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C56845a f106854a;

    public /* synthetic */ C40753g(C56845a aVar) {
        this.f106854a = aVar;
    }

    public final void accept(Object obj) {
        C56845a aVar = this.f106854a;
        C56852h hVar = (C56852h) ((ProtoParsers.ParcelableProto) obj).mo58938a(C56852h.f151675d, C62921ba.m95368a());
        aVar.copyOnWrite();
        C56846b bVar = (C56846b) aVar.instance;
        C56846b bVar2 = C56846b.f151664d;
        hVar.getClass();
        C62971cq cqVar = bVar.f151668c;
        if (!cqVar.mo58948c()) {
            bVar.f151668c = C62942bv.mutableCopy(cqVar);
        }
        bVar.f151668c.add(hVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
