package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.p10712d.C142327bf;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142351cc;
import com.google.protobuf.C62942bv;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.da */
/* compiled from: PG */
public final /* synthetic */ class C124904da implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C142327bf f344622a;

    /* renamed from: b */
    public final /* synthetic */ C142351cc f344623b;

    public /* synthetic */ C124904da(C142327bf bfVar, C142351cc ccVar) {
        this.f344622a = bfVar;
        this.f344623b = ccVar;
    }

    public final void accept(Object obj) {
        C142327bf bfVar = this.f344622a;
        C142351cc ccVar = this.f344623b;
        bfVar.copyOnWrite();
        C142328bg bgVar = C142328bg.f386139f;
        ((C142328bg) bfVar.instance).f386142b = C62942bv.emptyProtobufList();
        bfVar.mo117125a(C124907dd.m204758a((String) obj, ccVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
