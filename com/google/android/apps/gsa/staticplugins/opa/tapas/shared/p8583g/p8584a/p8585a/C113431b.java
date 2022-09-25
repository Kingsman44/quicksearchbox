package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8584a.p8585a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4457a.C57978d;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.a.a.b */
/* compiled from: PG */
public final class C113431b extends C68247h {

    /* renamed from: a */
    private final C68283d f314087a;

    /* renamed from: c */
    private final C68283d f314088c;

    /* renamed from: d */
    private final C69464a f314089d;

    /* renamed from: e */
    private final C68283d f314090e;

    /* renamed from: f */
    private final C68283d f314091f;

    public C113431b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C113431b.class), aVar);
        this.f314087a = C68236af.m98549d(dVar);
        this.f314088c = C68236af.m98549d(dVar2);
        this.f314089d = aVar3;
        this.f314090e = C68236af.m98549d(dVar3);
        this.f314091f = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C57981b bVar = (C57981b) list.get(0);
        C21370a aVar = (C21370a) list.get(1);
        C68214a a = C68219e.m98518a(this.f314089d);
        Optional optional = (Optional) list.get(3);
        C58976aa aaVar = C58975e.f156826a;
        if (((C86124t) list.get(2)).mo79746e(C90063do.f249319bL) && ((C111248k) a.mo27525b()).mo99077b()) {
            ((C111248k) a.mo27525b()).mo99076a(C111255r.STREAMING, String.format(Locale.US, "S3 connected at: %d\n", new Object[]{Long.valueOf(aVar.mo26870b())}));
        }
        optional.ifPresent(C113430a.f314086a);
        C57978d dVar = new C57978d();
        bVar.mo20440jJ(dVar);
        return C60856cj.m92900i(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f314087a.mo60297gq(), this.f314088c.mo60297gq(), this.f314090e.mo60297gq(), this.f314091f.mo60297gq());
    }
}
