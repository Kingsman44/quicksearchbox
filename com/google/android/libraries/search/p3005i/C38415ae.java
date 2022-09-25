package com.google.android.libraries.search.p3005i;

import com.google.android.libraries.geller.p1818f.C21859i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.i.ae */
/* compiled from: PG */
public final /* synthetic */ class C38415ae implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C38415ae f101684a = new C38415ae();

    private /* synthetic */ C38415ae() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C21859i iVar = (C21859i) obj;
        C21859i iVar2 = (C21859i) obj2;
        C59104x c = C38416af.f101685a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GellerModule");
        ((C59052c) ((C59052c) c).mo56372aa(53104)).mo56386p("Having to merge 2 duplicate keys when transforming a multibinding map. This should not happen.");
        return iVar;
    }
}
