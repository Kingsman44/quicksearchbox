package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.android.apps.auto.p450a.p451a.C8857ab;
import com.google.android.apps.auto.p450a.p451a.C8879ax;
import com.google.android.apps.auto.p450a.p451a.C8881az;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.aj */
/* compiled from: PG */
public final /* synthetic */ class C13128aj implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C13128aj f40710a = new C13128aj();

    private /* synthetic */ C13128aj() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C8879ax axVar = ((C8857ab) obj).f30770c;
        if (axVar == null) {
            axVar = C8879ax.f30820i;
        }
        C8881az azVar = axVar.f30826e;
        if (azVar == null) {
            azVar = C8881az.f30830c;
        }
        return Collection.EL.stream(azVar.f30832a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
