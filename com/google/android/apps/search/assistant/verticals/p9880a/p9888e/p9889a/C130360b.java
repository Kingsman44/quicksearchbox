package com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a;

import com.google.assistant.p3781ad.p3789d.p3791b.C48734p;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C130360b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f357280a;

    /* renamed from: b */
    public final /* synthetic */ C58487gw f357281b;

    public /* synthetic */ C130360b(C58495hd hdVar, C58487gw gwVar) {
        this.f357280a = hdVar;
        this.f357281b = gwVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58495hd hdVar = this.f357280a;
        C58487gw gwVar = this.f357281b;
        C48734p pVar = (C48734p) hdVar.getOrDefault((String) obj, C48734p.f126105j);
        if ((pVar.f126107a & 128) != 0) {
            return Collection.EL.stream(gwVar.mo55277g(pVar.f126112f)).map(new C130368j(pVar));
        }
        return Stream.CC.m71935of(pVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
