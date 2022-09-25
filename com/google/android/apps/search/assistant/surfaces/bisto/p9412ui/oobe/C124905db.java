package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.p10712d.C142327bf;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142351cc;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.db */
/* compiled from: PG */
public final /* synthetic */ class C124905db implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C142327bf f344624a;

    /* renamed from: b */
    public final /* synthetic */ C142351cc f344625b;

    public /* synthetic */ C124905db(C142327bf bfVar, C142351cc ccVar) {
        this.f344624a = bfVar;
        this.f344625b = ccVar;
    }

    public final void accept(Object obj) {
        C142327bf bfVar = this.f344624a;
        C142351cc ccVar = this.f344625b;
        bfVar.copyOnWrite();
        C142328bg bgVar = C142328bg.f386139f;
        ((C142328bg) bfVar.instance).f386144d = C62942bv.emptyProtobufList();
        String a = C124907dd.m204758a((String) obj, ccVar);
        bfVar.copyOnWrite();
        C142328bg bgVar2 = (C142328bg) bfVar.instance;
        a.getClass();
        C62971cq cqVar = bgVar2.f386144d;
        if (!cqVar.mo58948c()) {
            bgVar2.f386144d = C62942bv.mutableCopy(cqVar);
        }
        bgVar2.f386144d.add(a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
