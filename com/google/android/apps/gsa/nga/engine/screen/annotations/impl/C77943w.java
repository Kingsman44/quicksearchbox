package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.a;
import com.google.android.apps.gsa.nga.d.a.ac;
import com.google.android.apps.gsa.nga.d.a.b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.w */
/* compiled from: PG */
public final /* synthetic */ class C77943w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ a f214683a;

    public /* synthetic */ C77943w(a aVar) {
        this.f214683a = aVar;
    }

    public final void accept(Object obj) {
        a aVar = this.f214683a;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/nga.screen_annotator.proto.TcLibModelConfiguration";
        C63088z byteString = ((ac) obj).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        aVar.copyOnWrite();
        b bVar = aVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        b bVar2 = b.f;
        hVar.getClass();
        C62971cq cqVar = bVar.e;
        if (!cqVar.mo58948c()) {
            bVar.e = C62942bv.mutableCopy(cqVar);
        }
        bVar.e.add(hVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
