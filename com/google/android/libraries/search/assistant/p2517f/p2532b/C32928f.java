package com.google.android.libraries.search.assistant.p2517f.p2532b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32791am;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70923h;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70924i;

/* renamed from: com.google.android.libraries.search.assistant.f.b.f */
/* compiled from: PG */
class C32928f implements Function {
    /* renamed from: a */
    public final C70924i apply(C32791am amVar) {
        C70923h hVar = (C70923h) C70924i.f189126c.createBuilder();
        if ((amVar.f87967a & 1) != 0) {
            String str = amVar.f87968b;
            hVar.copyOnWrite();
            C70924i iVar = (C70924i) hVar.instance;
            str.getClass();
            iVar.f189128a |= 1;
            iVar.f189129b = str;
        }
        return (C70924i) hVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
