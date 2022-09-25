package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.common.p4526f.p4527a.C58974d;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.af */
/* compiled from: PG */
public final /* synthetic */ class C103826af implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103826af f289076a = new C103826af();

    private /* synthetic */ C103826af() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C58974d dVar = C103868bu.f289129a;
        String valueOf = String.valueOf(entry.getValue());
        return ((String) entry.getKey()) + " -> " + valueOf;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
