package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c;

import com.google.android.apps.auto.p450a.p452b.C8938d;
import com.google.android.apps.auto.p450a.p452b.C8940f;
import com.google.common.p4552o.p4553a.C59454ae;
import com.google.common.p4552o.p4553a.C59455af;
import com.google.common.p4552o.p4553a.C59456ag;
import com.google.common.p4552o.p4553a.C59457ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.h */
/* compiled from: PG */
public final /* synthetic */ class C11632h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C11632h f37586a = new C11632h();

    private /* synthetic */ C11632h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C8940f fVar = ((C8938d) obj).f30985a;
        if (fVar == null) {
            fVar = C8940f.f30987d;
        }
        C59454ae aeVar = (C59454ae) C59455af.f157715c.createBuilder();
        C59456ag agVar = (C59456ag) C59457ah.f157719e.createBuilder();
        int i = fVar.f30991c;
        agVar.copyOnWrite();
        C59457ah ahVar = (C59457ah) agVar.instance;
        ahVar.f157721a |= 4;
        ahVar.f157724d = i;
        C63042fg fgVar = fVar.f30989a;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        long a = C11634j.m27335a(C62953e.m95478c(fgVar));
        agVar.copyOnWrite();
        C59457ah ahVar2 = (C59457ah) agVar.instance;
        ahVar2.f157721a |= 1;
        ahVar2.f157722b = a;
        C63042fg fgVar2 = fVar.f30990b;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        long a2 = C11634j.m27335a(C62953e.m95478c(fgVar2));
        agVar.copyOnWrite();
        C59457ah ahVar3 = (C59457ah) agVar.instance;
        ahVar3.f157721a |= 2;
        ahVar3.f157723c = a2;
        C59457ah ahVar4 = (C59457ah) agVar.build();
        aeVar.copyOnWrite();
        C59455af afVar = (C59455af) aeVar.instance;
        ahVar4.getClass();
        afVar.f157718b = ahVar4;
        afVar.f157717a |= 1;
        return (C59455af) aeVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
