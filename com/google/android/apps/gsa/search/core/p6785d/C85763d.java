package com.google.android.apps.gsa.search.core.p6785d;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89017ao;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.d.d */
/* compiled from: PG */
public final class C85763d {

    /* renamed from: b */
    private static final C59071e f231913b = C59071e.m91332i("com.google.android.apps.gsa.search.core.d.d");

    /* renamed from: a */
    public C58881cr f231914a;

    /* renamed from: c */
    private final C90931ca f231915c;

    /* renamed from: d */
    private final C22871g f231916d;

    /* renamed from: e */
    private final C87242k f231917e;

    /* renamed from: f */
    private final C84466a f231918f;

    public C85763d(C90931ca caVar, C22871g gVar, C87242k kVar, C84466a aVar) {
        this.f231915c = caVar;
        this.f231916d = gVar;
        this.f231917e = kVar;
        this.f231918f = aVar;
    }

    /* renamed from: a */
    public final void mo79415a() {
        C22872h.m42743c(C86593a.class);
        this.f231914a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo79416b(Uri uri, C58881cr crVar, C85762c cVar, long j) {
        Uri uri2;
        UriRequest uriRequest = (UriRequest) crVar.mo6453a();
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uriRequest.f236331a.toString());
            c.mo82991c(uriRequest.mo81502a());
            c.f241239e = false;
            c.f241244j = true;
            c.f241245k = 5;
            C89020ar a = c.mo82989a();
            C58976aa aaVar = C58975e.f156826a;
            ((C89057m) C90877ak.m148472f(this.f231917e.mo80852a(this.f231918f.mo78025a("AdClickHandler", 406, 35), C89066v.f241382a, new C89018ap(a, C89009ag.f241207b)))).mo83036f();
            C59104x d = f231913b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.AdClickHandler");
            ((C59052c) ((C59052c) d).mo56372aa(7558)).mo56386p("Did not receive a redirect from an ad click!");
        } catch (C89017ao e) {
            Uri parse = Uri.parse(e.f241232b);
            C58976aa aaVar2 = C58975e.f156826a;
            uri2 = parse;
        } catch (C89013ak | C90457d | InterruptedException e2) {
            C59104x d2 = f231913b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Velvet.AdClickHandler");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(7560)).mo56386p("Ad click failed.");
        } catch (MalformedURLException | ExecutionException e3) {
            C59104x d3 = f231913b.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "Velvet.AdClickHandler");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(7561)).mo56386p("Ad click failed.");
            int i = C90755l.f253831a;
        }
        uri2 = null;
        this.f231916d.mo28212l("logAdClickAndGetRedirectDestination", new C85760a(this, crVar, uri, uri2, cVar, j));
    }

    /* renamed from: c */
    public final void mo79417c(Uri uri, C58881cr crVar, C85762c cVar, long j) {
        C22872h.m42743c(C86593a.class);
        this.f231914a = crVar;
        this.f231915c.mo85139d(new C85761b(this, uri, crVar, cVar, j));
    }
}
