package com.google.android.apps.gsa.search.core.p6820r.p6839k.p6840a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85886bi;
import com.google.android.apps.gsa.search.core.google.C85965dk;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.k.a.a */
/* compiled from: PG */
public final class C86503a extends C68247h {

    /* renamed from: a */
    private final C68283d f233772a;

    /* renamed from: c */
    private final C68283d f233773c;

    /* renamed from: d */
    private final C68283d f233774d;

    /* renamed from: e */
    private final C68283d f233775e;

    /* renamed from: f */
    private final C68283d f233776f;

    /* renamed from: g */
    private final C68283d f233777g;

    public C86503a(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C86503a.class), aVar);
        this.f233772a = C68236af.m98549d(dVar);
        this.f233773c = C68236af.m98549d(dVar2);
        this.f233774d = C68236af.m98549d(dVar3);
        this.f233775e = C68236af.m98549d(dVar4);
        this.f233776f = C68236af.m98549d(dVar5);
        this.f233777g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(1);
        C85981c cVar = (C85981c) list.get(3);
        C86124t tVar = (C86124t) list.get(4);
        C90476a aVar = (C90476a) list.get(5);
        Uri uri = cVar.f232493a;
        uri.getClass();
        String authority = uri.getAuthority();
        authority.getClass();
        cVar.mo79637c(cVar.f232497e, "Host", authority);
        C85965dk dkVar = new C85965dk(cVar, (C86338r) list.get(2));
        Map c = dkVar.mo79627c();
        C85981c cVar2 = dkVar.f232475a;
        C54188e b = ((C85886bi) list.get(0)).mo79520b(c, cVar2.f232498f, cVar2.f232497e);
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233772a.mo60297gq(), this.f233773c.mo60297gq(), this.f233774d.mo60297gq(), this.f233775e.mo60297gq(), this.f233776f.mo60297gq(), this.f233777g.mo60297gq());
    }
}
