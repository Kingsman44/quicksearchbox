package com.google.android.apps.gsa.staticplugins.p7643cc.p7644a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86245ca;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cc.a.l */
/* compiled from: PG */
public final class C97530l extends C68247h {

    /* renamed from: a */
    private final C68283d f272433a;

    /* renamed from: c */
    private final C68283d f272434c;

    /* renamed from: d */
    private final C69464a f272435d;

    /* renamed from: e */
    private final C68283d f272436e;

    /* renamed from: f */
    private final C68283d f272437f;

    /* renamed from: g */
    private final C69464a f272438g;

    /* renamed from: h */
    private final C68283d f272439h;

    public C97530l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3, C68283d dVar3, C68283d dVar4, C69464a aVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C97530l.class), aVar);
        this.f272433a = C68236af.m98549d(dVar);
        this.f272434c = C68236af.m98549d(dVar2);
        this.f272435d = aVar3;
        this.f272436e = C68236af.m98549d(dVar3);
        this.f272437f = C68236af.m98549d(dVar4);
        this.f272438g = aVar4;
        this.f272439h = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C21370a aVar = (C21370a) list.get(0);
        C86246cb b = C86245ca.m138882b((Query) list.get(1), aVar.mo26871c(), C68219e.m98518a(this.f272435d), (C89859i) list.get(2), ((C89061q) list.get(3)).mo27433c(), C68219e.m98518a(this.f272438g), (C86124t) list.get(4));
        b.mo79931av(aVar.mo26870b());
        b.mo79921al(ActionData.f235991b);
        return C60856cj.m92900i(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f272433a.mo60297gq(), this.f272434c.mo60297gq(), this.f272436e.mo60297gq(), this.f272437f.mo60297gq(), this.f272439h.mo60297gq());
    }
}
