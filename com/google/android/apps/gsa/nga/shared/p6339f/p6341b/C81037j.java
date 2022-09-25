package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.common.base.C58833ax;
import java.util.concurrent.LinkedBlockingQueue;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.j */
/* compiled from: PG */
public final /* synthetic */ class C81037j implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C81037j f222104a = new C81037j();

    private /* synthetic */ C81037j() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        cf cfVar = (cf) obj;
        C81040m mVar = (C81040m) obj2;
        int i = C81041n.f222106b;
        if (mVar == null) {
            C81039l d = C81040m.m128987d();
            d.mo74816b(true);
            ((C81028a) d).f222087a = C58833ax.m90834k(new LinkedBlockingQueue());
            return d.mo74815a();
        } else if (!mVar.mo74818b().mo56113h()) {
            C81039l e = mVar.mo74826e();
            e.mo74816b(true);
            ((C81028a) e).f222087a = C58833ax.m90834k(new LinkedBlockingQueue());
            return e.mo74815a();
        } else {
            throw new IllegalArgumentException("RohanSodaEventStore.handleStart already called with token");
        }
    }
}
