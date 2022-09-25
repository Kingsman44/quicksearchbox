package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9990s;

import com.google.assistant.p4016z.C53692aq;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.s.d */
/* compiled from: PG */
public final /* synthetic */ class C131549d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131549d f359432a = new C131549d();

    private /* synthetic */ C131549d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53692aq aqVar = (C53692aq) obj;
        Object[] objArr = new Object[2];
        C8242v vVar = aqVar.f140942d;
        if (vVar == null) {
            vVar = C8242v.f28952d;
        }
        objArr[0] = Long.toHexString(vVar.f28955b);
        C8242v vVar2 = aqVar.f140942d;
        if (vVar2 == null) {
            vVar2 = C8242v.f28952d;
        }
        objArr[1] = Long.toHexString(vVar2.f28956c);
        return String.format("0x%s:0x%s", objArr);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
