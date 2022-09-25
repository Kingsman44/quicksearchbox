package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.p6222a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78532ao;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78535ar;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.w.a.o */
/* compiled from: PG */
public final /* synthetic */ class C78865o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C78865o f217037a = new C78865o();

    private /* synthetic */ C78865o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C78540aw awVar = (C78540aw) obj;
        boolean z = false;
        if ((!awVar.mo73484f() || awVar.mo73483e() || awVar.mo73485g() || !awVar.mo73436b().mo73472a().equals(C78535ar.CHIPS)) && !awVar.mo73435a().mo73464a().equals(C78532ao.FRE_SUGGESTION)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
