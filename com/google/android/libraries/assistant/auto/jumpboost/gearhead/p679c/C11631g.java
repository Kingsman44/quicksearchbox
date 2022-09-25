package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c;

import com.google.android.apps.auto.p450a.p452b.C8953s;
import com.google.android.apps.auto.p450a.p452b.C8954t;
import com.google.common.p4552o.p4553a.C59466aq;
import com.google.common.p4552o.p4553a.C59467ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.g */
/* compiled from: PG */
public final /* synthetic */ class C11631g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C11631g f37585a = new C11631g();

    private /* synthetic */ C11631g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C8954t tVar = (C8954t) obj;
        C59466aq aqVar = (C59466aq) C59467ar.f157757e.createBuilder();
        String str = tVar.f31029a;
        aqVar.copyOnWrite();
        C59467ar arVar = (C59467ar) aqVar.instance;
        str.getClass();
        int i = 1;
        arVar.f157759a |= 1;
        arVar.f157760b = str;
        C63042fg fgVar = tVar.f31030b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        long a = C11634j.m27335a(C62953e.m95478c(fgVar));
        aqVar.copyOnWrite();
        C59467ar arVar2 = (C59467ar) aqVar.instance;
        arVar2.f157759a |= 2;
        arVar2.f157761c = a;
        int a2 = C8953s.m23521a(tVar.f31031c);
        if (a2 != 0) {
            i = a2;
        }
        aqVar.copyOnWrite();
        C59467ar arVar3 = (C59467ar) aqVar.instance;
        arVar3.f157759a |= 4;
        arVar3.f157762d = i - 1;
        return (C59467ar) aqVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
