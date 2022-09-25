package com.google.android.apps.gsa.nga.shared.p6358n;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65476c;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65477d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.n.h */
/* compiled from: PG */
public final /* synthetic */ class C81437h implements Function {

    /* renamed from: a */
    public final /* synthetic */ C65475b f222846a;

    public /* synthetic */ C81437h(C65475b bVar) {
        this.f222846a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65475b bVar = this.f222846a;
        C80295aq aqVar = (C80295aq) obj;
        C60870cx cxVar = C81442m.f222851a;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "com.google.android.apps.gsa.nga.shared.execution.NgaExecuteArgs";
        C65476c cVar = (C65476c) C65477d.f177983c.createBuilder();
        cVar.copyOnWrite();
        aqVar.getClass();
        ((C65477d) cVar.instance).f177985a = aqVar;
        cVar.copyOnWrite();
        bVar.getClass();
        ((C65477d) cVar.instance).f177986b = bVar;
        C63088z byteString = ((C65477d) cVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "nga.EXECUTE";
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "nga_execute_params";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        dvVar.mo53733c((C52232kc) kbVar.build());
        C51807dw dwVar = (C51807dw) dvVar.build();
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
