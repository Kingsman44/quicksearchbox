package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.apps.gsa.nga.engine.p5900ag.C74831y;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.b */
/* compiled from: PG */
public final /* synthetic */ class C79115b implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f217507a;

    public /* synthetic */ C79115b(String str) {
        this.f217507a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f217507a;
        C74831y yVar = (C74831y) obj;
        C63772a aVar = (C63772a) C63775d.f172518h.createBuilder();
        aVar.copyOnWrite();
        C63775d dVar = (C63775d) aVar.instance;
        str.getClass();
        dVar.f172520a |= 1;
        dVar.f172521b = str;
        String e = yVar.mo71226e();
        aVar.copyOnWrite();
        C63775d dVar2 = (C63775d) aVar.instance;
        e.getClass();
        dVar2.f172520a |= 2;
        dVar2.f172522c = e;
        String f = yVar.mo71227f();
        aVar.copyOnWrite();
        C63775d dVar3 = (C63775d) aVar.instance;
        f.getClass();
        dVar3.f172520a |= 4;
        dVar3.f172523d = f;
        return (C63775d) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
