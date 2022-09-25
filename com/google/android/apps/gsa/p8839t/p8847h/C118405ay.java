package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.apps.gsa.p8839t.p8845f.C118363e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.common.p4522b.C58487gw;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.t.h.ay */
/* compiled from: PG */
public final /* synthetic */ class C118405ay implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C118405ay f328642a = new C118405ay();

    private /* synthetic */ C118405ay() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123742bi biVar;
        C118363e eVar = (C118363e) obj;
        C58487gw gwVar = C118426bs.f328679a;
        if (eVar.f328535b == 6) {
            biVar = (C123742bi) eVar.f328536c;
        } else {
            biVar = C123742bi.f341800b;
        }
        return Collection.EL.stream(biVar.f341802a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
