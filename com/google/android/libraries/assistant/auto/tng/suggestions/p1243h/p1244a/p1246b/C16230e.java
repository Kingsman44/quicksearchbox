package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1244a.p1246b;

import com.google.android.libraries.search.assistant.p2782r.C36379e;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.a.b.e */
/* compiled from: PG */
public final class C16230e extends C68247h {

    /* renamed from: a */
    private final C68283d f47814a;

    /* renamed from: c */
    private final C68283d f47815c;

    public C16230e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16230e.class), aVar);
        this.f47814a = C68236af.m98549d(dVar);
        this.f47815c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C36379e eVar = (C36379e) list.get(0);
        if (((C53270hr) list.get(1)).equals(C53270hr.BACKGROUND_REFRESH)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return eVar.mo21009c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f47814a.mo60297gq(), this.f47815c.mo60297gq());
    }
}
