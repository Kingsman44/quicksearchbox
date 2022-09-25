package com.google.android.apps.gsa.staticplugins.actions.p7360f;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86356b;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.f.v */
/* compiled from: PG */
public final class C93382v extends C68247h {

    /* renamed from: a */
    private final C68283d f260448a;

    /* renamed from: c */
    private final C68283d f260449c;

    public C93382v(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C93382v.class), aVar);
        this.f260448a = C68236af.m98549d(dVar);
        this.f260449c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C86356b bVar = (C86356b) list.get(0);
        Objects.requireNonNull(bVar);
        return ((C86603d) list.get(1)).mo54598b(new C93378r(bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f260448a.mo60297gq(), this.f260449c.mo60297gq());
    }
}
