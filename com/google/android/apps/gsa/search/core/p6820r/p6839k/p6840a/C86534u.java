package com.google.android.apps.gsa.search.core.p6820r.p6839k.p6840a;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.C85910cd;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.k.a.u */
/* compiled from: PG */
public final class C86534u extends C68247h {

    /* renamed from: a */
    private final C68283d f233834a;

    /* renamed from: c */
    private final C68283d f233835c;

    public C86534u(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86534u.class), aVar);
        this.f233834a = C68236af.m98549d(dVar);
        this.f233835c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C85981c cVar;
        List list = (List) obj;
        C85910cd cdVar = (C85910cd) list.get(0);
        Query query = (Query) list.get(1);
        if (!TextUtils.isEmpty(query.f252770i)) {
            cVar = C86524k.m139368a(cdVar, query);
        } else {
            cVar = new C85981c();
        }
        return C60856cj.m92900i(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233834a.mo60297gq(), this.f233835c.mo60297gq());
    }
}
