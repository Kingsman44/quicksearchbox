package com.google.android.libraries.gsa.actionusermodel;

import com.google.common.p4522b.C58468gd;
import com.google.protos.p4985f.p4986a.C64660an;
import com.google.protos.p4985f.p4986a.C64661ao;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.aj */
/* compiled from: PG */
public final /* synthetic */ class C22052aj implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C22052aj f60779a = new C22052aj();

    private /* synthetic */ C22052aj() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C58468gd gdVar = C22063au.f60791a;
        C64660an anVar = (C64660an) C64661ao.f175264d.createBuilder();
        anVar.copyOnWrite();
        C64661ao aoVar = (C64661ao) anVar.instance;
        str.getClass();
        aoVar.f175266a |= 1;
        aoVar.f175267b = str;
        return (C64661ao) anVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
