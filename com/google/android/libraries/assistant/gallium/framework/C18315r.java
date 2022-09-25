package com.google.android.libraries.assistant.gallium.framework;

import com.google.common.base.C58817ah;
import com.google.protos.p5127o.C65652ag;
import com.google.protos.p5127o.C65653ah;
import com.google.protos.p5127o.C65696v;
import com.google.protos.p5127o.C65697w;
import com.google.protos.p5127o.C65699y;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.r */
/* compiled from: PG */
public final /* synthetic */ class C18315r implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C18315r f51953a = new C18315r();

    private /* synthetic */ C18315r() {
    }

    public final Object apply(Object obj) {
        int i = GalliumIpc.f51688h;
        C65652ag agVar = (C65652ag) C65653ah.f178394c.createBuilder();
        C65696v vVar = (C65696v) C65697w.f178495c.createBuilder();
        C65699y yVar = C18218av.m35482e((Exception) obj).f51741a;
        vVar.copyOnWrite();
        C65697w wVar = (C65697w) vVar.instance;
        yVar.getClass();
        wVar.f178498b = yVar;
        wVar.f178497a = 2;
        agVar.copyOnWrite();
        C65653ah ahVar = (C65653ah) agVar.instance;
        C65697w wVar2 = (C65697w) vVar.build();
        wVar2.getClass();
        ahVar.f178397b = wVar2;
        ahVar.f178396a |= 1;
        return (C65653ah) agVar.build();
    }
}
