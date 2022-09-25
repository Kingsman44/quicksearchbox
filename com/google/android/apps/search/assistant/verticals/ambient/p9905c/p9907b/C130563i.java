package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b;

import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.b.i */
/* compiled from: PG */
public final /* synthetic */ class C130563i implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f357621a;

    public /* synthetic */ C130563i(String str) {
        this.f357621a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f357621a;
        C63088z zVar = (C63088z) obj;
        C50728m mVar = (C50728m) C50729n.f132007g.createBuilder();
        mVar.copyOnWrite();
        C50729n nVar = (C50729n) mVar.instance;
        str.getClass();
        nVar.f132009a |= 4;
        nVar.f132011c = str;
        mVar.copyOnWrite();
        C50729n nVar2 = (C50729n) mVar.instance;
        zVar.getClass();
        nVar2.f132009a |= 16;
        nVar2.f132013e = zVar;
        return (C50729n) mVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
