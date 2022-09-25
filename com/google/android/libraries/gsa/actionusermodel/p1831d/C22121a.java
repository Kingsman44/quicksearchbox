package com.google.android.libraries.gsa.actionusermodel.p1831d;

import com.google.android.libraries.gsa.actionusermodel.C22095by;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4985f.p4986a.C64683bj;
import com.google.protos.p4985f.p4986a.p4987a.C64646b;
import com.google.protos.p4985f.p5001d.C64820b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.d.a */
/* compiled from: PG */
public final /* synthetic */ class C22121a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C22121a f60960a = new C22121a();

    private /* synthetic */ C22121a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C64646b bVar = (C64646b) obj;
        String str = bVar.f175233b;
        boolean z = bVar.f175234c;
        C64683bj bjVar = bVar.f175235d;
        if (bjVar == null) {
            bjVar = C64683bj.f175334c;
        }
        C64683bj bjVar2 = bjVar;
        C64820b a = C64820b.m96466a(bVar.f175236e);
        if (a == null) {
            a = C64820b.UNSPECIFIED;
        }
        return new C22095by(str, z, bjVar2, a, C58485gu.m89842j(bVar.f175237f));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
