package com.google.android.apps.gsa.staticplugins.p7406ar.p7407a;

import com.google.android.apps.gsa.search.core.google.C86071m;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.a.k */
/* compiled from: PG */
public final class C94082k extends C68247h {

    /* renamed from: a */
    private final C68283d f262877a;

    /* renamed from: c */
    private final C68283d f262878c;

    public C94082k(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C94082k.class), aVar);
        this.f262877a = C68236af.m98549d(dVar);
        this.f262878c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85981c cVar = new C85981c();
        ((C86071m) list.get(0)).mo79491a(cVar);
        cVar.mo79637c(cVar.f232497e, "X-Device-Elapsed-Time", Long.toString(((C21370a) list.get(1)).mo26872d()));
        return C60856cj.m92900i(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f262877a.mo60297gq(), this.f262878c.mo60297gq());
    }
}
