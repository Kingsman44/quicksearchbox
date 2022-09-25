package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.protos.p4985f.p4988b.p4992c.C64758f;
import com.google.protos.p4985f.p4988b.p4992c.C64761i;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.bn */
/* compiled from: PG */
public final /* synthetic */ class C115244bn implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C115244bn f319785a = new C115244bn();

    private /* synthetic */ C115244bn() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C64758f fVar = (C64758f) C64761i.f175546e.createBuilder();
        fVar.copyOnWrite();
        C64761i iVar = (C64761i) fVar.instance;
        iVar.f175550c = 1;
        iVar.f175548a |= 2;
        fVar.copyOnWrite();
        C64761i iVar2 = (C64761i) fVar.instance;
        str.getClass();
        iVar2.f175548a = 1 | iVar2.f175548a;
        iVar2.f175549b = str;
        return (C64761i) fVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
