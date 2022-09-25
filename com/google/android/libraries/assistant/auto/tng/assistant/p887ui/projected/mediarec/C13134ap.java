package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ap */
/* compiled from: PG */
public final /* synthetic */ class C13134ap implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C13134ap f40716a = new C13134ap();

    private /* synthetic */ C13134ap() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123742bi biVar;
        C123744bk bkVar = (C123744bk) obj;
        if (bkVar.f341808c == 6) {
            biVar = (C123742bi) bkVar.f341809d;
        } else {
            biVar = C123742bi.f341800b;
        }
        return Collection.EL.stream(biVar.f341802a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
