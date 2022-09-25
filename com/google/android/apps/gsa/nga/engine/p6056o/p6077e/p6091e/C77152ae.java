package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.ae */
/* compiled from: PG */
public final /* synthetic */ class C77152ae implements Function {

    /* renamed from: a */
    public final /* synthetic */ C51446i f212923a;

    public /* synthetic */ C77152ae(C51446i iVar) {
        this.f212923a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51446i iVar = this.f212923a;
        String str = (String) obj;
        iVar.copyOnWrite();
        C51473j jVar = (C51473j) iVar.instance;
        C51473j jVar2 = C51473j.f134090i;
        str.getClass();
        jVar.f134092a |= 64;
        jVar.f134099h = str;
        return iVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
