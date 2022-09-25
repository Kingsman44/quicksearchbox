package com.google.android.apps.gsa.search.core.p6820r.p6839k.p6840a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85965dk;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.k.a.g */
/* compiled from: PG */
public final class C86520g extends C68247h {

    /* renamed from: a */
    private final C68283d f233805a;

    /* renamed from: c */
    private final C68283d f233806c;

    /* renamed from: d */
    private final C68283d f233807d;

    /* renamed from: e */
    private final C68283d f233808e;

    public C86520g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C86520g.class), aVar);
        this.f233805a = C68236af.m98549d(dVar);
        this.f233806c = C68236af.m98549d(dVar2);
        this.f233807d = C68236af.m98549d(dVar3);
        this.f233808e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85981c cVar = (C85981c) list.get(1);
        C86124t tVar = (C86124t) list.get(2);
        C90476a aVar = (C90476a) list.get(3);
        Uri uri = cVar.f232493a;
        uri.getClass();
        cVar.mo79637c(cVar.f232497e, "Host", uri.getAuthority());
        return C60856cj.m92900i(new C85965dk(cVar, (C86338r) list.get(0)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233805a.mo60297gq(), this.f233806c.mo60297gq(), this.f233807d.mo60297gq(), this.f233808e.mo60297gq());
    }
}
