package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52075eh;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.u */
/* compiled from: PG */
public final /* synthetic */ class C79712u implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79713v f218607a;

    public /* synthetic */ C79712u(C79713v vVar) {
        this.f218607a = vVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79713v vVar = this.f218607a;
        C51809dy dyVar = (C51809dy) obj;
        C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
        int i = vVar.f218608a;
        vVar.f218608a = i + 1;
        eoVar.copyOnWrite();
        C52083ep epVar = (C52083ep) eoVar.instance;
        epVar.f136691a |= 1;
        epVar.f136694d = (i << 3) | 1;
        C52075eh ehVar = (C52075eh) C52076ei.f136664f.createBuilder();
        ehVar.copyOnWrite();
        C52076ei eiVar = (C52076ei) ehVar.instance;
        dyVar.getClass();
        eiVar.f136668c = dyVar;
        eiVar.f136666a |= 32;
        eoVar.copyOnWrite();
        C52083ep epVar2 = (C52083ep) eoVar.instance;
        C52076ei eiVar2 = (C52076ei) ehVar.build();
        eiVar2.getClass();
        epVar2.f136693c = eiVar2;
        epVar2.f136692b = 4;
        return (C52083ep) eoVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
