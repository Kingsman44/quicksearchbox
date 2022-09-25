package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bf */
/* compiled from: PG */
public final /* synthetic */ class C103933bf implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C103933bf f289265a = new C103933bf();

    private /* synthetic */ C103933bf() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C48773e eVar = (C48773e) obj;
        C48773e eVar2 = (C48773e) obj2;
        C58974d dVar = C103943bp.f289282a;
        int i = eVar.f126204e;
        int i2 = eVar2.f126204e;
        if (i == i2) {
            boolean contains = eVar.f126203d.contains("experiment");
            boolean contains2 = eVar2.f126203d.contains("experiment");
            if (!contains ? contains2 : contains2) {
                if (!contains) {
                    return eVar2;
                }
            }
            return eVar;
        } else if (i == i2 || i >= i2) {
            return eVar;
        }
        return eVar2;
    }
}
