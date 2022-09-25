package com.google.android.apps.gsa.search.core.p6820r.p6839k;

import com.google.android.apps.gsa.search.core.google.C85859aq;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89997bc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.k.w */
/* compiled from: PG */
public final class C86562w extends C68247h {

    /* renamed from: a */
    private final C68283d f233880a;

    /* renamed from: c */
    private final C68283d f233881c;

    /* renamed from: d */
    private final C68283d f233882d;

    public C86562w(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C86562w.class), aVar);
        this.f233880a = C68236af.m98549d(dVar);
        this.f233881c = C68236af.m98549d(dVar2);
        this.f233882d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85859aq aqVar = (C85859aq) list.get(0);
        C58009ae aeVar = (C58009ae) list.get(1);
        if (!((C86124t) list.get(2)).mo79746e(C89997bc.f246812i)) {
            return C60856cj.m92900i(new C85981c());
        }
        return aeVar.mo54597a(new C86557r(aqVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233880a.mo60297gq(), this.f233881c.mo60297gq(), this.f233882d.mo60297gq());
    }
}
