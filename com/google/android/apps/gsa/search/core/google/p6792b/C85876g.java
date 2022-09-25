package com.google.android.apps.gsa.search.core.google.p6792b;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85854al;
import com.google.android.apps.gsa.search.core.google.C85902by;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C85958dd;
import com.google.android.apps.gsa.search.core.google.C85966dl;
import com.google.android.apps.gsa.search.core.google.C85968dn;
import com.google.android.apps.gsa.search.core.google.C86074p;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4060h.p4073d.p4074a.C54225an;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.protobuf.C62974ct;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.google.b.g */
/* compiled from: PG */
public final class C85876g extends C85875f {

    /* renamed from: b */
    private static final C59071e f232192b = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.b.g");

    /* renamed from: c */
    private final C85929cw f232193c;

    /* renamed from: d */
    private final C87242k f232194d;

    /* renamed from: e */
    private final C84466a f232195e;

    public C85876g(C86124t tVar, C87242k kVar, C84466a aVar, C85929cw cwVar) {
        super(tVar, (C86054o) null);
        this.f232194d = kVar;
        this.f232195e = aVar;
        this.f232193c = cwVar;
    }

    /* renamed from: c */
    public final C85874e mo79509c(Query query, boolean z) {
        UriRequest uriRequest;
        C54229ar arVar;
        int i = 1;
        if (z) {
            try {
                uriRequest = this.f232193c.mo79572l(query);
            } catch (C89013ak | C90457d | C62974ct | InterruptedException e) {
                ((C59052c) ((C59052c) ((C59052c) f232192b.mo56226d()).mo56382g(e)).mo56372aa(8022)).mo56386p("Error getting suggestions.");
                return null;
            } catch (MalformedURLException | ExecutionException e2) {
                ((C59052c) ((C59052c) ((C59052c) f232192b.mo56226d()).mo56382g(e2)).mo56372aa(8023)).mo56386p("Error getting suggestions.");
                int i2 = C90755l.f253831a;
                return null;
            }
        } else {
            C85929cw cwVar = this.f232193c;
            String bk = query.mo84352bk();
            C58838bb.m90868c(!TextUtils.isEmpty(bk));
            String x = cwVar.f232330f.mo79758x(C90120fr.f250846m);
            C85981c cVar = new C85981c();
            ((C85968dn) cwVar.f232341q.mo27525b()).mo79435c(cVar, cwVar.f232330f.mo79758x(C90120fr.f250764D));
            cVar.mo79638d("client", x);
            C85902by byVar = (C85902by) cwVar.f232339o.mo27525b();
            byVar.mo79531h(cVar);
            cVar.mo79638d("hl", ((C85854al) cwVar.f232343s.mo27525b()).mo79488a());
            byVar.mo79529f(cVar);
            byVar.mo79528e(cVar);
            C85902by.m138030j(cVar);
            byVar.mo79532i(cVar);
            if (!TextUtils.isEmpty(bk)) {
                cVar.mo79638d("q", bk);
            }
            C86074p pVar = (C86074p) cwVar.f232335k.mo27525b();
            pVar.mo79715c(cVar, false, false, pVar.mo79714b());
            ((C85958dd) cwVar.f232338n.mo27525b()).mo79624a(cVar, query, (String) null);
            uriRequest = cwVar.mo79566f(cVar).mo79626b((C85966dl) null);
        }
        String uri = uriRequest.f236331a.toString();
        Map a = uriRequest.mo81502a();
        if (!z) {
            a = new HashMap(uriRequest.mo81502a());
            a.remove("Cookie");
            i = 43;
        }
        C89019aq c = C89020ar.m144758c();
        c.mo82994f(uri);
        c.mo82991c(a);
        c.f241244j = z;
        c.f241245k = i;
        C89057m mVar = (C89057m) C90877ak.m148472f(this.f232194d.mo80852a(this.f232195e.mo78025a("SuggestionOnlyFetcher", 148, 513), C89066v.f241382a, new C89018ap(c.mo82989a(), C89009ag.f241207b)));
        String jL = mo79508jL();
        String a2 = mVar.mo82999g().mo83000a("Content-Type", "unknown_content_type");
        if (a2.contains("application/x-protobuffer")) {
            arVar = (C54229ar) ((C54225an) ((C54225an) C54229ar.f142352d.createBuilder()).mergeFrom(mVar.mo83036f())).build();
        } else {
            ((C59052c) ((C59052c) f232192b.mo56225c()).mo56372aa(8024)).mo56389s("unrecognized content type: %s", a2);
            arVar = null;
        }
        return new C85874e(BuildConfig.FLAVOR, arVar, jL);
    }
}
