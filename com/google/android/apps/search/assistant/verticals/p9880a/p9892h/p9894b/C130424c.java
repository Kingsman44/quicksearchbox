package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9894b;

import com.google.assistant.p3825an.p3830c.p3831a.C49261ag;
import com.google.assistant.p3825an.p3830c.p3831a.C49270ap;
import com.google.assistant.p3825an.p3830c.p3831a.C49277aw;
import com.google.assistant.p3825an.p3830c.p3831a.C49279ay;
import com.google.assistant.p3825an.p3830c.p3831a.C49287bf;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.assistant.p3825an.p3830c.p3831a.C49329f;
import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.b.c */
/* compiled from: PG */
public final /* synthetic */ class C130424c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C49301bt f357385a;

    public /* synthetic */ C130424c(C49301bt btVar) {
        this.f357385a = btVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49301bt btVar = this.f357385a;
        C49270ap apVar = (C49270ap) obj;
        C49329f fVar = (C49329f) C49330g.f127488o.createBuilder();
        String str = btVar.f127426b;
        fVar.copyOnWrite();
        C49330g gVar = (C49330g) fVar.instance;
        str.getClass();
        gVar.f127490a |= 1;
        gVar.f127491b = str;
        String str2 = apVar.f127356b;
        fVar.copyOnWrite();
        C49330g gVar2 = (C49330g) fVar.instance;
        str2.getClass();
        gVar2.f127490a |= 2;
        gVar2.f127492c = str2;
        String str3 = apVar.f127360f;
        fVar.copyOnWrite();
        C49330g gVar3 = (C49330g) fVar.instance;
        str3.getClass();
        gVar3.f127490a |= 4;
        gVar3.f127493d = str3;
        C49261ag agVar = btVar.f127427c;
        if (agVar == null) {
            agVar = C49261ag.f127334e;
        }
        C49287bf bfVar = agVar.f127338c;
        if (bfVar == null) {
            bfVar = C49287bf.f127390b;
        }
        String str4 = bfVar.f127392a;
        fVar.copyOnWrite();
        C49330g gVar4 = (C49330g) fVar.instance;
        str4.getClass();
        gVar4.f127490a |= 512;
        gVar4.f127501l = str4;
        C49261ag agVar2 = btVar.f127427c;
        if (agVar2 == null) {
            agVar2 = C49261ag.f127334e;
        }
        String str5 = agVar2.f127336a;
        fVar.copyOnWrite();
        C49330g gVar5 = (C49330g) fVar.instance;
        str5.getClass();
        gVar5.f127490a |= 1024;
        gVar5.f127502m = str5;
        fVar.copyOnWrite();
        C49330g gVar6 = (C49330g) fVar.instance;
        gVar6.f127498i = C49279ay.m85401a(5);
        gVar6.f127490a |= 128;
        fVar.copyOnWrite();
        C49330g gVar7 = (C49330g) fVar.instance;
        gVar7.f127499j = C49277aw.m85399a(6);
        gVar7.f127490a |= 256;
        String str6 = apVar.f127361g;
        fVar.copyOnWrite();
        C49330g gVar8 = (C49330g) fVar.instance;
        str6.getClass();
        gVar8.f127490a |= 32;
        gVar8.f127496g = str6;
        return (C49330g) fVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
