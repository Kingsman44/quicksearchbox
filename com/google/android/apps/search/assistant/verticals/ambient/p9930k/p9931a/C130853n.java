package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131129ae;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53704bb;
import com.google.assistant.p4016z.C53708bf;
import com.google.assistant.p4016z.C53738w;
import com.google.common.p4543n.p4551g.C59443c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.n */
/* compiled from: PG */
public final /* synthetic */ class C130853n implements Function {

    /* renamed from: a */
    public final /* synthetic */ C53738w f358114a;

    /* renamed from: b */
    public final /* synthetic */ C130883x f358115b;

    public /* synthetic */ C130853n(C53738w wVar, C130883x xVar) {
        this.f358114a = wVar;
        this.f358115b = xVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53738w wVar = this.f358114a;
        C130883x xVar = this.f358115b;
        C53708bf bfVar = (C53708bf) obj;
        int i = C130857r.f358121f;
        C53692aq aqVar = bfVar.f140996c;
        if (aqVar == null) {
            aqVar = C53692aq.f140937k;
        }
        C59443c b = C131129ae.m213653b(aqVar, wVar, xVar);
        C53704bb bbVar = (C53704bb) bfVar.toBuilder();
        double a = b.mo56958a();
        bbVar.copyOnWrite();
        C53708bf bfVar2 = (C53708bf) bbVar.instance;
        bfVar2.f140994a |= 16;
        bfVar2.f140999f = a;
        return (C53708bf) bbVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
