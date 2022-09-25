package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p8019j.C102550al;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.y */
/* compiled from: PG */
public final class C102537y extends C68247h {

    /* renamed from: a */
    private final C68283d f286164a;

    /* renamed from: c */
    private final C68283d f286165c;

    /* renamed from: d */
    private final C68283d f286166d;

    public C102537y(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C102537y.class), aVar);
        this.f286164a = C68236af.m98549d(dVar);
        this.f286165c = C68236af.m98549d(dVar2);
        this.f286166d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C102550al) list.get(2)).mo93328c((Query) list.get(0), (C58833ax) list.get(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286164a.mo60297gq(), this.f286165c.mo60297gq(), this.f286166d.mo60297gq());
    }
}
