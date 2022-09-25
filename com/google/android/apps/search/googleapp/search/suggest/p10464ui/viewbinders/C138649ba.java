package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import com.google.android.apps.search.googleapp.search.suggest.C138014af;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.common.base.C58817ah;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ba */
/* compiled from: PG */
public final class C138649ba implements C58817ah {

    /* renamed from: a */
    private final Map f377102a;

    /* renamed from: b */
    private final Map f377103b = new EnumMap(C138014af.class);

    public C138649ba(Map map) {
        this.f377102a = map;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C138646ay ayVar;
        C138014af a = C138014af.m224326a(((C138015ag) obj).f375482b);
        if (a == null) {
            a = C138014af.UNKNOWN;
        }
        C46756m mVar = (C46756m) this.f377103b.get(a);
        if (mVar == null && (ayVar = (C138646ay) this.f377102a.get(a)) != null) {
            mVar = ayVar.mo114164a();
            this.f377103b.put(a, mVar);
        }
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalArgumentException("No ViewBinder found for suggestion container type ".concat(String.valueOf(a.name())));
    }
}
