package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.common.base.C58833ax;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.k */
/* compiled from: PG */
public final /* synthetic */ class C81038k implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C19347o f222105a;

    public /* synthetic */ C81038k(C19347o oVar) {
        this.f222105a = oVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C19347o oVar = this.f222105a;
        cf cfVar = (cf) obj;
        C81040m mVar = (C81040m) obj2;
        int i = C81041n.f222106b;
        if (mVar == null) {
            C81039l d = C81040m.m128987d();
            ((C81028a) d).f222088b = C58833ax.m90834k(oVar);
            return d.mo74815a();
        } else if (!mVar.mo74817a().mo56113h()) {
            C81039l e = mVar.mo74826e();
            ((C81028a) e).f222088b = C58833ax.m90834k(oVar);
            return e.mo74815a();
        } else {
            throw new IllegalArgumentException("RohanSodaEventPusher.start already called with token");
        }
    }
}
