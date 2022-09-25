package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82832cb;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82833cc;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bp */
/* compiled from: PG */
public final /* synthetic */ class C77044bp implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f212645a;

    public /* synthetic */ C77044bp(String str) {
        this.f212645a = str;
    }

    public final void accept(Object obj) {
        String str = this.f212645a;
        C82832cb cbVar = (C82832cb) obj;
        cbVar.copyOnWrite();
        C82833cc ccVar = (C82833cc) cbVar.instance;
        C82833cc ccVar2 = C82833cc.f225801h;
        str.getClass();
        C62971cq cqVar = ccVar.f225807e;
        if (!cqVar.mo58948c()) {
            ccVar.f225807e = C62942bv.mutableCopy(cqVar);
        }
        ccVar.f225807e.add(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
