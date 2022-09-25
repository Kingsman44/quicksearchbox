package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.android.libraries.geller.p1818f.C21859i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.au */
/* compiled from: PG */
public final /* synthetic */ class C96776au implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C96776au f270674a = new C96776au();

    private /* synthetic */ C96776au() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C21859i iVar = (C21859i) obj;
        C21859i iVar2 = (C21859i) obj2;
        C59104x c = C96783ba.f270686a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SimpleGddUtils");
        ((C59052c) ((C59052c) c).mo56372aa(20915)).mo56386p("Having to merge 2 duplicate keys when transforming a multibinding map. This should not happen.");
        return iVar;
    }
}
