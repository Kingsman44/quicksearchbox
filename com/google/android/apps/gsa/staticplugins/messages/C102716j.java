package com.google.android.apps.gsa.staticplugins.messages;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6828g.C86375a;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.j */
/* compiled from: PG */
public final class C102716j extends C68247h {

    /* renamed from: a */
    private final C68283d f286745a;

    /* renamed from: c */
    private final C68283d f286746c;

    /* renamed from: d */
    private final C68283d f286747d;

    public C102716j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C102716j.class), aVar);
        this.f286745a = C68236af.m98549d(dVar);
        this.f286746c = C68236af.m98549d(dVar2);
        this.f286747d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C86603d) list.get(1)).mo54598b(new C102714h((C86375a) list.get(0), (Query) list.get(2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286745a.mo60297gq(), this.f286746c.mo60297gq(), this.f286747d.mo60297gq());
    }
}
