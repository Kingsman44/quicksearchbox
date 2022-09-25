package com.google.android.apps.search.fedora.p10100f;

import com.google.android.apps.search.fedora.p10099e.C132772ac;
import com.google.android.apps.search.fedora.p10099e.C132773ad;
import com.google.android.apps.search.fedora.p10099e.C132779aj;
import com.google.common.base.C58817ah;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.fedora.f.j */
/* compiled from: PG */
public final /* synthetic */ class C132843j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Function f362447a;

    public /* synthetic */ C132843j(Function function) {
        this.f362447a = function;
    }

    public final Object apply(Object obj) {
        Function function = this.f362447a;
        C132773ad adVar = (C132773ad) obj;
        C132779aj ajVar = adVar.f362229c;
        if (ajVar == null) {
            ajVar = C132779aj.f362244h;
        }
        C132779aj ajVar2 = (C132779aj) function.apply(ajVar);
        C132772ac acVar = (C132772ac) adVar.toBuilder();
        acVar.copyOnWrite();
        C132773ad adVar2 = (C132773ad) acVar.instance;
        ajVar2.getClass();
        adVar2.f362229c = ajVar2;
        adVar2.f362227a |= 2;
        return (C132773ad) acVar.build();
    }
}
