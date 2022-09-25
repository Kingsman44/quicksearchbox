package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22076bf;
import com.google.android.libraries.gsa.actionusermodel.C22077bg;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.q */
/* compiled from: PG */
public final /* synthetic */ class C22038q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22076bf f60760a;

    public /* synthetic */ C22038q(C22076bf bfVar) {
        this.f60760a = bfVar;
    }

    public final void accept(Object obj) {
        C22076bf bfVar = this.f60760a;
        C63088z zVar = (C63088z) obj;
        bfVar.copyOnWrite();
        C22077bg bgVar = (C22077bg) bfVar.instance;
        C22077bg bgVar2 = C22077bg.f60849o;
        zVar.getClass();
        bgVar.f60851a |= 64;
        bgVar.f60859i = zVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
