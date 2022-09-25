package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.q */
/* compiled from: PG */
public final /* synthetic */ class C81542q implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C81542q f222988a = new C81542q();

    private /* synthetic */ C81542q() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Optional optional = (Optional) obj;
        C59071e eVar = C81525ae.f222944a;
        if (((Boolean) obj2).booleanValue()) {
            return optional;
        }
        return Optional.empty();
    }
}
