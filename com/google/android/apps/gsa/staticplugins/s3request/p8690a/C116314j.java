package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.assist.p502b.C9357a;
import com.google.android.apps.gsa.assistant.shared.k;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.j */
/* compiled from: PG */
public final class C116314j extends C68247h {

    /* renamed from: a */
    private final C68283d f322466a;

    /* renamed from: c */
    private final C68283d f322467c;

    /* renamed from: d */
    private final C68283d f322468d;

    /* renamed from: e */
    private final C68283d f322469e;

    public C116314j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C116314j.class), aVar);
        this.f322466a = C68236af.m98549d(dVar);
        this.f322467c = C68236af.m98549d(dVar2);
        this.f322468d = C68236af.m98549d(dVar3);
        this.f322469e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C9357a aVar = (C9357a) list.get(2);
        C58009ae aeVar = (C58009ae) list.get(3);
        if (!k.b((C86124t) list.get(0), (Query) list.get(1))) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return aeVar.mo54597a(new C116308d(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322466a.mo60297gq(), this.f322467c.mo60297gq(), this.f322468d.mo60297gq(), this.f322469e.mo60297gq());
    }
}
