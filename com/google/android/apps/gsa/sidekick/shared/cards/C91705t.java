package com.google.android.apps.gsa.sidekick.shared.cards;

import com.google.android.apps.p489g.p494d.C9167bc;
import com.google.android.apps.p489g.p494d.C9169be;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65929g;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65936n;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;
import com.google.protos.p5146w.p5147a.p5148a.C65940r;
import com.google.protos.p5146w.p5147a.p5148a.C65941s;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.t */
/* compiled from: PG */
public final /* synthetic */ class C91705t implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C91705t f255792a = new C91705t();

    private /* synthetic */ C91705t() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C9169be beVar = (C9169be) obj;
        C65929g gVar = (C65929g) C65930h.f179300i.createBuilder();
        if ((beVar.f31666a & 1) != 0) {
            String str = beVar.f31667b;
            gVar.copyOnWrite();
            C65930h hVar = (C65930h) gVar.instance;
            str.getClass();
            hVar.f179302a |= 2;
            hVar.f179303b = str;
        }
        if ((beVar.f31666a & 2) != 0) {
            C9167bc bcVar = beVar.f31668c;
            if (bcVar == null) {
                bcVar = C9167bc.f31658e;
            }
            C65928f a = C91706u.m150211a(bcVar);
            gVar.copyOnWrite();
            C65930h hVar2 = (C65930h) gVar.instance;
            a.getClass();
            hVar2.f179304c = a;
            hVar2.f179302a |= 4;
        }
        if ((beVar.f31666a & 4) != 0) {
            C9167bc bcVar2 = beVar.f31669d;
            if (bcVar2 == null) {
                bcVar2 = C9167bc.f31658e;
            }
            C65928f a2 = C91706u.m150211a(bcVar2);
            gVar.copyOnWrite();
            C65930h hVar3 = (C65930h) gVar.instance;
            a2.getClass();
            hVar3.f179305d = a2;
            hVar3.f179302a |= 16;
        }
        C65936n nVar = (C65936n) C65937o.f179332k.createBuilder();
        C65940r rVar = (C65940r) C65941s.f179349d.createBuilder();
        if ((beVar.f31666a & 8) != 0) {
            String str2 = beVar.f31670e;
            nVar.copyOnWrite();
            C65937o oVar = (C65937o) nVar.instance;
            str2.getClass();
            oVar.f179335a |= 2;
            oVar.f179337c = str2;
        }
        if ((beVar.f31666a & 32) != 0) {
            String str3 = beVar.f31672g;
            nVar.copyOnWrite();
            C65937o oVar2 = (C65937o) nVar.instance;
            str3.getClass();
            oVar2.f179335a |= 8;
            oVar2.f179339e = str3;
            String str4 = beVar.f31672g;
            rVar.copyOnWrite();
            C65941s sVar = (C65941s) rVar.instance;
            str4.getClass();
            sVar.f179352a |= 2;
            sVar.f179354c = str4;
        }
        if ((beVar.f31666a & 64) != 0) {
            String str5 = beVar.f31673h;
            nVar.copyOnWrite();
            C65937o oVar3 = (C65937o) nVar.instance;
            str5.getClass();
            oVar3.f179335a |= 1024;
            oVar3.f179344j = str5;
            String str6 = beVar.f31673h;
            rVar.copyOnWrite();
            C65941s sVar2 = (C65941s) rVar.instance;
            str6.getClass();
            sVar2.f179352a |= 1;
            sVar2.f179353b = str6;
        }
        if ((beVar.f31666a & 16) != 0) {
            String str7 = beVar.f31671f;
            nVar.copyOnWrite();
            C65937o oVar4 = (C65937o) nVar.instance;
            str7.getClass();
            oVar4.f179335a |= 4;
            oVar4.f179338d = str7;
        }
        C65937o oVar5 = (C65937o) nVar.build();
        C65941s sVar3 = (C65941s) rVar.build();
        if (!oVar5.equals(C65937o.f179332k)) {
            gVar.mo58885m(C65937o.f179333l, oVar5);
        }
        if (!sVar3.equals(C65941s.f179349d)) {
            gVar.mo58885m(C65941s.f179350e, sVar3);
        }
        return (C65930h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
