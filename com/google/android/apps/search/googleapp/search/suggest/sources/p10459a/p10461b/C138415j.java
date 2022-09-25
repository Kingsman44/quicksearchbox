package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138495y;
import com.google.p395al.p417d.p418a.C8575bc;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.b.j */
/* compiled from: PG */
public final class C138415j implements C138495y {

    /* renamed from: a */
    private final boolean f376516a;

    public C138415j(boolean z) {
        this.f376516a = z;
    }

    /* renamed from: a */
    public final void mo114276a(C138133o oVar, Map map) {
        if (this.f376516a && oVar.f375837n) {
            C8575bc bcVar = oVar.f375831h;
            if (bcVar == null) {
                bcVar = C8575bc.f29690g;
            }
            map.put("ofp", C138413h.m224824b(bcVar));
        }
    }

    /* renamed from: b */
    public final int mo114277b(C138133o oVar) {
        return 1;
    }
}
