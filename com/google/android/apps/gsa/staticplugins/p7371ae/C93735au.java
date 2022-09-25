package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.location.p5873a.C74632a;
import com.google.android.apps.gsa.location.s;
import com.google.android.apps.gsa.location.z;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.au */
/* compiled from: PG */
public final class C93735au extends C68247h {

    /* renamed from: a */
    private final C68283d f261600a;

    /* renamed from: c */
    private final C68283d f261601c;

    public C93735au(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C93735au.class), aVar);
        this.f261600a = C68236af.m98549d(dVar);
        this.f261601c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        z zVar = (z) list.get(0);
        C118826c cVar = (C118826c) list.get(1);
        boolean g = zVar.g.mo79190b(z.a).mo79181g(C85662bm.LOCATION_HISTORY_AND_REPORTING);
        C74632a aVar = (C74632a) ((C58847bk) zVar.e).f156646a;
        C60870cx b = aVar.mo71011b();
        C60870cx c = aVar.mo71012c();
        return C60856cj.m92893b(b, c).mo57335b(new s(zVar, g, b, c), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f261600a.mo60297gq(), this.f261601c.mo60297gq());
    }
}
