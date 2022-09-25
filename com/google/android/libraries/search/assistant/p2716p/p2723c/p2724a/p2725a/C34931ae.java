package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35733aa;
import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35758z;
import com.google.p4152bb.p4153a.C55072ev;
import com.google.p4152bb.p4153a.C55073ew;
import com.google.p4152bb.p4153a.C55097ft;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C34931ae implements Function {

    /* renamed from: a */
    public final /* synthetic */ C34942ap f92597a;

    public /* synthetic */ C34931ae(C34942ap apVar) {
        this.f92597a = apVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C34942ap apVar = this.f92597a;
        C35758z zVar = (C35758z) obj;
        C55072ev evVar = (C55072ev) C55073ew.f144880e.createBuilder();
        String c = zVar.mo39820c();
        evVar.copyOnWrite();
        C55073ew ewVar = (C55073ew) evVar.instance;
        c.getClass();
        ewVar.f144882a |= 1;
        ewVar.f144883b = c;
        C55097ft f = C35733aa.m64112f(apVar.f92613d, zVar);
        evVar.copyOnWrite();
        C55073ew ewVar2 = (C55073ew) evVar.instance;
        f.getClass();
        ewVar2.f144884c = f;
        ewVar2.f144882a |= 2;
        boolean d = zVar.mo39821d();
        evVar.copyOnWrite();
        C55073ew ewVar3 = (C55073ew) evVar.instance;
        ewVar3.f144882a |= 16;
        ewVar3.f144885d = d;
        return (C55073ew) evVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
