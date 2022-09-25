package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6345h.C81241af;
import com.google.android.apps.gsa.nga.shared.p6345h.C81270ba;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62995dn;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.dg */
/* compiled from: PG */
public final /* synthetic */ class C81158dg implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C81158dg f222279a = new C81158dg();

    private /* synthetic */ C81158dg() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C58833ax axVar = (C58833ax) obj2;
        C81270ba baVar = ((C81241af) obj).f222415d;
        if (baVar == null) {
            baVar = C81270ba.f222463g;
        }
        String str = (String) axVar.mo56109e(BuildConfig.FLAVOR);
        str.getClass();
        C62995dn dnVar = baVar.f222466b;
        return Integer.valueOf(dnVar.containsKey(str) ? ((Integer) dnVar.get(str)).intValue() : 0);
    }
}
