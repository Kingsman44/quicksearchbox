package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80696by;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C81533h implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C81533h f222979a = new C81533h();

    private /* synthetic */ C81533h() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C80696by byVar = (C80696by) obj;
        C60870cx cxVar = (C60870cx) obj2;
        C59071e eVar = C81525ae.f222944a;
        if (byVar.mo74428b().isEmpty()) {
            int c = byVar.mo74429c();
            if (c == 0) {
                throw null;
            } else if (c == 1) {
                return cxVar;
            }
        }
        return C60856cj.m92900i(byVar.mo74428b());
    }
}
