package com.google.android.libraries.search.silk.p3162a.p3180r;

import com.google.p4184bj.p4204d.p4205a.p4210e.C56021e;
import com.google.p4184bj.p4204d.p4205a.p4210e.C56022f;
import com.google.protos.p4874ap.p4877b.p4878a.C63695f;
import com.google.protos.p4874ap.p4877b.p4878a.C63696g;
import com.google.protos.p4874ap.p4877b.p4878a.C63697h;
import com.google.protos.p4874ap.p4877b.p4878a.C63698i;
import com.google.protos.p4874ap.p4877b.p4878a.C63702m;
import com.google.protos.p4874ap.p4877b.p4878a.C63704o;
import com.google.protos.p4874ap.p4877b.p4878a.C63705p;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.silk.a.r.e */
/* compiled from: PG */
public final /* synthetic */ class C40640e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C63704o f106649a;

    public /* synthetic */ C40640e(C63704o oVar) {
        this.f106649a = oVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63704o oVar = this.f106649a;
        String str = (String) obj;
        C63702m mVar = (C63702m) C63705p.f172236d.createBuilder();
        C63695f fVar = (C63695f) C63698i.f172221d.createBuilder();
        fVar.copyOnWrite();
        C63698i iVar = (C63698i) fVar.instance;
        iVar.f172224b = 59;
        iVar.f172223a |= 1;
        C63696g gVar = (C63696g) C63697h.f172217c.createBuilder();
        C56021e eVar = (C56021e) C56022f.f149189c.createBuilder();
        eVar.copyOnWrite();
        C56022f fVar2 = (C56022f) eVar.instance;
        str.getClass();
        fVar2.f149191a = 2;
        fVar2.f149192b = str;
        gVar.copyOnWrite();
        C63697h hVar = (C63697h) gVar.instance;
        C56022f fVar3 = (C56022f) eVar.build();
        fVar3.getClass();
        hVar.f172220b = fVar3;
        hVar.f172219a = 1;
        fVar.copyOnWrite();
        C63698i iVar2 = (C63698i) fVar.instance;
        C63697h hVar2 = (C63697h) gVar.build();
        hVar2.getClass();
        iVar2.f172225c = hVar2;
        iVar2.f172223a |= 2;
        C63698i iVar3 = (C63698i) fVar.build();
        mVar.copyOnWrite();
        C63705p pVar = (C63705p) mVar.instance;
        iVar3.getClass();
        pVar.f172239b = iVar3;
        pVar.f172238a |= 1;
        mVar.copyOnWrite();
        C63705p pVar2 = (C63705p) mVar.instance;
        oVar.getClass();
        pVar2.f172240c = oVar;
        pVar2.f172238a |= 2;
        return (C63705p) mVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
