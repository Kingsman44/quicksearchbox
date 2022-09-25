package com.google.android.apps.gsa.staticplugins.p7385ak;

import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51061ey;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p5129p.p5131b.C65760ar;
import com.google.protos.p5129p.p5131b.C65761as;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.c */
/* compiled from: PG */
public final /* synthetic */ class C93898c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C93898c f262243a = new C93898c();

    private /* synthetic */ C93898c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51061ey eyVar = (C51061ey) obj;
        C65760ar arVar = (C65760ar) C65761as.f178776d.createBuilder();
        C63042fg fgVar = eyVar.f132963d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        long c = C62953e.m95478c(fgVar);
        arVar.copyOnWrite();
        C65761as asVar = (C65761as) arVar.instance;
        asVar.f178778a |= 2;
        asVar.f178780c = c;
        C51058ev evVar = eyVar.f132961b;
        if (evVar == null) {
            evVar = C51058ev.f132941o;
        }
        arVar.copyOnWrite();
        C65761as asVar2 = (C65761as) arVar.instance;
        evVar.getClass();
        asVar2.f178779b = evVar;
        asVar2.f178778a |= 1;
        return (C65761as) arVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
