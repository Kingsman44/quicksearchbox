package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.search.core.p6519al.p6522aa.C84609a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.av */
/* compiled from: PG */
public final class C93736av extends C68247h {

    /* renamed from: a */
    private final C68283d f261602a;

    /* renamed from: c */
    private final C68283d f261603c;

    public C93736av(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C93736av.class), aVar);
        this.f261602a = C68236af.m98549d(dVar);
        this.f261603c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        C84609a aVar = (C84609a) list.get(0);
        if (((Query) list.get(1)).f252759Q != null) {
            z = true;
        }
        return aVar.mo78372c(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f261602a.mo60297gq(), this.f261603c.mo60297gq());
    }
}
