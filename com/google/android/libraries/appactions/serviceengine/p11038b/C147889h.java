package com.google.android.libraries.appactions.serviceengine.p11038b;

import com.google.assistant.p3944g.p3948b.p3949a.C52931ab;
import com.google.assistant.p3944g.p3948b.p3949a.C52932ac;
import com.google.assistant.p3944g.p3948b.p3949a.C52957v;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.serviceengine.b.h */
/* compiled from: PG */
public final /* synthetic */ class C147889h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52931ab f398936a;

    public /* synthetic */ C147889h(C52931ab abVar) {
        this.f398936a = abVar;
    }

    public final void accept(Object obj) {
        C52931ab abVar = this.f398936a;
        C52957v vVar = (C52957v) obj;
        abVar.copyOnWrite();
        C52932ac acVar = (C52932ac) abVar.instance;
        C52932ac acVar2 = C52932ac.f138781d;
        vVar.getClass();
        acVar.f138784b = vVar;
        acVar.f138783a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
