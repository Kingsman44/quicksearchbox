package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.speech.p5218j.C66911ea;
import com.google.speech.p5218j.C66913ec;
import com.google.speech.p5218j.C66914ed;
import com.google.speech.p5218j.C66915ee;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.at */
/* compiled from: PG */
public final /* synthetic */ class C79664at implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79672ba f218485a;

    public /* synthetic */ C79664at(C79672ba baVar) {
        this.f218485a = baVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79672ba baVar = this.f218485a;
        String str = (String) obj;
        C66914ed edVar = (C66914ed) C66915ee.f181900b.createBuilder();
        C66911ea eaVar = (C66911ea) C66913ec.f181884n.createBuilder();
        eaVar.copyOnWrite();
        C66913ec ecVar = (C66913ec) eaVar.instance;
        str.getClass();
        ecVar.f181886a |= 2;
        ecVar.f181890e = str;
        eaVar.copyOnWrite();
        C66913ec ecVar2 = (C66913ec) eaVar.instance;
        ecVar2.f181889d = 1;
        ecVar2.f181886a = 1 | ecVar2.f181886a;
        boolean x = baVar.f218495b.mo74963x();
        eaVar.copyOnWrite();
        C66913ec ecVar3 = (C66913ec) eaVar.instance;
        ecVar3.f181886a |= 8;
        ecVar3.f181892g = x;
        boolean w = baVar.f218495b.mo74962w();
        eaVar.copyOnWrite();
        C66913ec ecVar4 = (C66913ec) eaVar.instance;
        ecVar4.f181886a |= 16;
        ecVar4.f181893h = w;
        edVar.mo59747a(eaVar);
        return (C66915ee) edVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
