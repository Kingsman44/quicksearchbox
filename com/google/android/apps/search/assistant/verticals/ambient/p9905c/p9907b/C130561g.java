package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b;

import com.google.android.apps.gsa.opa.smartspace.C83736ah;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.b.g */
/* compiled from: PG */
public final /* synthetic */ class C130561g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83736ah f357619a;

    public /* synthetic */ C130561g(C83736ah ahVar) {
        this.f357619a = ahVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83736ah ahVar = this.f357619a;
        C63088z zVar = (C63088z) obj;
        C50728m mVar = (C50728m) C50729n.f132007g.createBuilder();
        mVar.copyOnWrite();
        C50729n nVar = (C50729n) mVar.instance;
        zVar.getClass();
        nVar.f132009a |= 16;
        nVar.f132013e = zVar;
        if (ahVar.f228224a == 1) {
            String str = (String) ahVar.f228225b;
            mVar.copyOnWrite();
            C50729n nVar2 = (C50729n) mVar.instance;
            str.getClass();
            nVar2.f132009a |= 4;
            nVar2.f132011c = str;
        }
        return (C50729n) mVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
