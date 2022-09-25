package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.p6222a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6197n.C78739e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80704cf;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80705cg;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.w.a.b */
/* compiled from: PG */
public final /* synthetic */ class C78852b implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C78739e f217007a;

    public /* synthetic */ C78852b(C78739e eVar) {
        this.f217007a = eVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C78739e eVar = this.f217007a;
        Boolean bool = (Boolean) obj;
        C80704cf c = ((C80705cg) obj2).mo74458c();
        c.mo74455f(bool.booleanValue());
        if (bool.booleanValue()) {
            c.mo74452c(eVar.mo73593a("com.google.android.apps.googlequicksearchbox.nga.ON_CONFIGURATION"));
            c.mo74454e(eVar.mo73593a("com.google.android.apps.googlequicksearchbox.nga.ON_KEYBOARD_SHOWING_CHANGED"));
        }
        return c.mo74450a();
    }
}
