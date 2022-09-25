package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.google.cj */
/* compiled from: PG */
final class C85916cj extends C90888av {

    /* renamed from: a */
    final /* synthetic */ String f232272a;

    /* renamed from: b */
    final /* synthetic */ Long f232273b;

    /* renamed from: c */
    final /* synthetic */ C85929cw f232274c;

    /* renamed from: d */
    final /* synthetic */ C85919cm f232275d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85916cj(C85919cm cmVar, String str, Long l, C85929cw cwVar) {
        super("logEventToGws", 2, 12);
        this.f232275d = cmVar;
        this.f232272a = str;
        this.f232273b = l;
        this.f232274c = cwVar;
    }

    public final void run() {
        try {
            C85919cm cmVar = this.f232275d;
            String str = this.f232272a;
            Long l = this.f232273b;
            C85929cw cwVar = this.f232274c;
            C85981c h = cwVar.mo79568h(cwVar.mo79563b(false));
            if (l != null) {
                C85955da.m138191a(h, l.longValue());
            }
            ((C85963di) cmVar.f232291e.mo27525b()).mo79491a(h);
            UriRequest b = cwVar.mo79566f(h).mo79626b((C85966dl) null);
            String uri = C85929cw.m138087c(b.f236331a, Uri.parse(str), (Set) null, (Map) null).toString();
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uri);
            c.mo82991c(b.mo81502a());
            c.f241244j = true;
            c.f241245k = 5;
            C89020ar a = c.mo82989a();
            C58976aa aaVar = C58975e.f156826a;
            ((C89057m) C90877ak.m148472f(((C89012aj) this.f232275d.f232289c.mo27525b()).mo27495f(a, C89009ag.f241207b, ((C89012aj) this.f232275d.f232289c.mo27525b()).mo27510b(C89066v.f241382a)))).mo83036f();
        } catch (C89013ak | C90457d | InterruptedException e) {
            C59104x d = C85919cm.f232286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7884)).mo56386p("Could not do GWS gen_204");
        } catch (MalformedURLException | ExecutionException e2) {
            C59104x d2 = C85919cm.f232286a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(7885)).mo56386p("Could not do GWS gen_204");
        }
    }
}
