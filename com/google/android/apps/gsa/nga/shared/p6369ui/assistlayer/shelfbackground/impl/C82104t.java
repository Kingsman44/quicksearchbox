package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80768ep;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80770er;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80771es;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80772et;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.t */
/* compiled from: PG */
public final /* synthetic */ class C82104t implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C82104t f224468a = new C82104t();

    private /* synthetic */ C82104t() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C80772et etVar = (C80772et) obj;
        if (((C82099o) obj2).equals(C82099o.ACTIVE_WITH_CARD)) {
            return C80771es.f221679b;
        }
        C80771es esVar = etVar.f221684a;
        if (esVar == null) {
            esVar = C80771es.f221679b;
        }
        C80768ep epVar = (C80768ep) C80771es.f221679b.createBuilder();
        C80770er erVar = esVar.f221681a;
        if (erVar != null) {
            epVar.copyOnWrite();
            ((C80771es) epVar.instance).f221681a = erVar;
        }
        return (C80771es) epVar.build();
    }
}
