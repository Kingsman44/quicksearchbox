package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80160ci;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80161cj;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.az */
/* compiled from: PG */
public final /* synthetic */ class C103677az implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80160ci f288776a;

    public /* synthetic */ C103677az(C80160ci ciVar) {
        this.f288776a = ciVar;
    }

    public final void accept(Object obj) {
        C80160ci ciVar = this.f288776a;
        String str = (String) obj;
        ciVar.copyOnWrite();
        C80161cj cjVar = (C80161cj) ciVar.instance;
        C80161cj cjVar2 = C80161cj.f219962e;
        str.getClass();
        C62971cq cqVar = cjVar.f219966c;
        if (!cqVar.mo58948c()) {
            cjVar.f219966c = C62942bv.mutableCopy(cqVar);
        }
        cjVar.f219966c.add(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
