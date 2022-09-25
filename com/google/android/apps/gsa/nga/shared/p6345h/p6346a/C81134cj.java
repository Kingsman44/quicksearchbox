package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6345h.C81241af;
import com.google.android.apps.gsa.nga.shared.p6345h.C81326v;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62995dn;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.cj */
/* compiled from: PG */
public final /* synthetic */ class C81134cj implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C81134cj f222255a = new C81134cj();

    private /* synthetic */ C81134cj() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C58833ax axVar = (C58833ax) obj2;
        C81326v vVar = ((C81241af) obj).f222416e;
        if (vVar == null) {
            vVar = C81326v.f222601b;
        }
        String str = (String) axVar.mo56109e(BuildConfig.FLAVOR);
        str.getClass();
        C62995dn dnVar = vVar.f222603a;
        return Boolean.valueOf(dnVar.containsKey(str) ? ((Boolean) dnVar.get(str)).booleanValue() : false);
    }
}
