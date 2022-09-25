package com.google.android.libraries.gsa.actionusermodel;

import com.google.protos.p4985f.p5030q.C64996ai;
import com.google.protos.p4985f.p5030q.C64997aj;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ai */
/* compiled from: PG */
public final /* synthetic */ class C22051ai implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64996ai f60778a;

    public /* synthetic */ C22051ai(C64996ai aiVar) {
        this.f60778a = aiVar;
    }

    public final void accept(Object obj) {
        C64996ai aiVar = this.f60778a;
        String str = (String) obj;
        aiVar.copyOnWrite();
        C64997aj ajVar = (C64997aj) aiVar.instance;
        C64997aj ajVar2 = C64997aj.f176026i;
        str.getClass();
        ajVar.f176028a |= 8;
        ajVar.f176033f = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
