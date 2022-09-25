package com.google.android.apps.search.assistant.platform.appintegration.grpc.p9003b;

import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17924z;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.b.d */
/* compiled from: PG */
public final /* synthetic */ class C119611d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C119611d f333359a = new C119611d();

    private /* synthetic */ C119611d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C17924z zVar = (C17924z) obj;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        String str = zVar.f51351b;
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        str.getClass();
        kaVar.f137059a |= 1;
        kaVar.f137060b = str;
        C63088z zVar2 = zVar.f51352c;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        zVar2.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = zVar2;
        return (C52230ka) jzVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
