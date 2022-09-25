package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.p6792b.C85874e;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6513aj.C84547g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89033bd;
import com.google.android.apps.gsa.shared.p7066m.C90083eh;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.p4449cd.C57937b;
import dagger.C68214a;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.p.au */
/* compiled from: PG */
public final class C86211au extends C86224bg implements C90991b {

    /* renamed from: l */
    private static final C59071e f232959l = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.au");

    /* renamed from: a */
    public final Query f232960a;

    /* renamed from: b */
    public final C84547g f232961b;

    /* renamed from: c */
    public final Object f232962c = new Object();

    /* renamed from: d */
    public boolean f232963d;

    /* renamed from: e */
    public UriRequest f232964e;

    /* renamed from: f */
    C89033bd f232965f;

    /* renamed from: g */
    public final C21370a f232966g;

    /* renamed from: h */
    public final C89859i f232967h;

    /* renamed from: m */
    private final String f232968m;

    /* renamed from: n */
    private boolean f232969n;

    /* renamed from: o */
    private boolean f232970o;

    /* renamed from: p */
    private final C89033bd f232971p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86211au(C86246cb cbVar, String str, Query query, C21370a aVar, C89859i iVar, C68214a aVar2, C86124t tVar, C84474e eVar, C90931ca caVar, C90476a aVar3, C90479a aVar4) {
        super(cbVar, aVar, aVar2, eVar, caVar, aVar3);
        C86124t tVar2 = tVar;
        this.f232968m = str;
        this.f232960a = query;
        this.f232966g = aVar;
        this.f232967h = iVar;
        this.f232971p = new C89033bd(tVar2.mo79758x(C90083eh.f250091b), tVar2.mo79758x(C90083eh.f250090a));
        this.f232961b = new C84547g(new C86223bf(this));
    }

    /* renamed from: a */
    public final void mo79836a() {
        if (C90918bo.m148517d(this.f233010k.mo79865A())) {
            Query query = (Query) C90918bo.m148515b(this.f233010k.mo79865A());
            synchronized (this.f232962c) {
                if (!this.f232969n) {
                    UriRequest uriRequest = this.f232964e;
                    C84547g gVar = this.f232961b;
                    this.f232969n = true;
                    uriRequest.getClass();
                    this.f233010k.mo79932aw(new C87504b(C85929cw.m138088n(uriRequest, query.f252770i), this.f232971p, gVar));
                    C60856cj.m92911t(this.f233010k.mo79900x(), new C86210at(this), C60826bg.f164896a);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo79594b(Throwable th) {
        boolean z;
        boolean z2;
        synchronized (this.f232962c) {
            z = this.f232970o;
            z2 = this.f232969n;
        }
        if (!z) {
            C59104x d = f232959l.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HFPelletExtrasConsumer");
            ((C59052c) ((C59052c) d).mo56372aa(7753)).mo56386p("Chunk processing should not be complete before the fetch task is.");
        }
        C86246cb cbVar = this.f233010k;
        if (th != null) {
            Throwable th2 = (Throwable) C57937b.m88572b(th, ExecutionException.class).mo56109e(th);
            if (th2 instanceof C90456c) {
                cbVar.mo79840k((C90456c) th2);
            } else {
                cbVar.mo79840k(new C90452a(th2, 211, C89885b.INTERNAL_ERROR_SEE_STACK_TRACE_VALUE));
            }
        } else if (z2 || cbVar.mo79884T() || C90918bo.m148517d(cbVar.mo79895s()) || C90918bo.m148517d(cbVar.mo79873I()) || !((ActionData) C90918bo.m148516c(cbVar.mo79893q(), ActionData.f235991b)).equals(ActionData.f235991b)) {
            cbVar.mo79914ae();
        } else {
            cbVar.mo79840k(new C90457d(C89885b.GWS_MISSING_REQUIRED_DATA_VALUE));
        }
    }

    /* renamed from: c */
    public final void mo79595c() {
        this.f233010k.mo79936h();
        synchronized (this.f232962c) {
            this.f232970o = true;
        }
    }

    /* renamed from: f */
    public final void mo79597f(String str) {
        this.f233010k.mo79922am(str);
        mo79836a();
    }

    /* renamed from: g */
    public final void mo79598g(String str, C54229ar arVar) {
        this.f233010k.mo79930au(new C85874e(str, arVar, this.f232968m));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HttpFetchPelletExtrasConsumer");
        synchronized (this.f232962c) {
            fVar.mo85288o("query", this.f232960a);
            fVar.mo85279c("headers set").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f232963d)));
            fVar.mo85279c("webpage created").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f232969n)));
            fVar.mo85279c("complete").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f232970o)));
            fVar.mo85279c("SRP content type").mo85276a(C90752i.m148229c(String.valueOf(this.f232965f)));
        }
    }

    /* renamed from: e */
    public final void mo79596e(String str) {
        C89033bd bdVar;
        str.getClass();
        C89033bd a = C89033bd.m144788a(str);
        if (a == null) {
            C59104x d = f232959l.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HFPelletExtrasConsumer");
            ((C59052c) ((C59052c) d).mo56372aa(7754)).mo56389s("Failed to parse content type '%s'", str);
        }
        synchronized (this.f232962c) {
            bdVar = this.f232965f;
        }
        if (bdVar == null) {
            synchronized (this.f232962c) {
                this.f232965f = a;
            }
            if (a != null) {
                C89033bd bdVar2 = this.f232971p;
                if (!C90772bp.m148275B(bdVar2.f241307b, a.f241307b) || !C90772bp.m148275B(bdVar2.f241308c, a.f241308c)) {
                    C59104x d2 = f232959l.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "HFPelletExtrasConsumer");
                    ((C59052c) ((C59052c) d2).mo56372aa(7752)).mo56354G("Actual content type is different from assumed: actual=%s, assumed=%s", a, this.f232971p);
                    ((C89911f) this.f233009j.mo27525b()).mo83755a((Throwable) null, 63758192, 29).mo83721a();
                }
            }
            mo79836a();
            return;
        }
        C58838bb.m90868c(bdVar.equals(a));
    }
}
