package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.gsa.unifiedime.C118605w;
import com.google.android.apps.gsa.unifiedime.C118606x;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.s */
/* compiled from: PG */
public final /* synthetic */ class C126342s implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C126342s f348031a = new C126342s();

    private /* synthetic */ C126342s() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C118605w wVar = (C118605w) ((C118606x) obj).toBuilder();
        wVar.copyOnWrite();
        C118606x xVar = (C118606x) wVar.instance;
        xVar.f330894a |= 2;
        xVar.f330896c = true;
        return (C118606x) wVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
