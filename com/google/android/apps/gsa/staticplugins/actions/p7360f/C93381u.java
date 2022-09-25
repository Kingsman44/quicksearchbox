package com.google.android.apps.gsa.staticplugins.actions.p7360f;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86356b;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.f.u */
/* compiled from: PG */
public final class C93381u extends C68247h {

    /* renamed from: a */
    private final C68283d f260445a;

    /* renamed from: c */
    private final C68283d f260446c;

    /* renamed from: d */
    private final C68283d f260447d;

    public C93381u(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C93381u.class), aVar);
        this.f260445a = C68236af.m98549d(dVar);
        this.f260446c = C68236af.m98549d(dVar2);
        this.f260447d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C86603d) list.get(2)).mo54597a(new C93380t((C86356b) list.get(1), (ActionData) list.get(0)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f260445a.mo60297gq(), this.f260446c.mo60297gq(), this.f260447d.mo60297gq());
    }
}
