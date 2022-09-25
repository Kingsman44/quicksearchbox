package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.af */
/* compiled from: PG */
public final /* synthetic */ class C13124af implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C13124af f40705a = new C13124af();

    private /* synthetic */ C13124af() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123730ax axVar;
        C123744bk bkVar = (C123744bk) obj;
        if (bkVar.f341808c == 5) {
            axVar = (C123730ax) bkVar.f341809d;
        } else {
            axVar = C123730ax.f341767b;
        }
        return Collection.EL.stream(axVar.f341769a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
