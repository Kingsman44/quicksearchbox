package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.p6796f.C85980b;
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
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.google.ck */
/* compiled from: PG */
final class C85917ck extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C85929cw f232276a;

    /* renamed from: b */
    final /* synthetic */ String f232277b;

    /* renamed from: c */
    final /* synthetic */ Long f232278c;

    /* renamed from: d */
    final /* synthetic */ long f232279d;

    /* renamed from: e */
    final /* synthetic */ int f232280e;

    /* renamed from: f */
    final /* synthetic */ C85919cm f232281f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85917ck(C85919cm cmVar, C85929cw cwVar, String str, Long l, long j, int i) {
        super("Log card above SRP", 2, 12);
        this.f232281f = cmVar;
        this.f232276a = cwVar;
        this.f232277b = str;
        this.f232278c = l;
        this.f232279d = j;
        this.f232280e = i;
    }

    public final void run() {
        C85929cw cwVar = this.f232276a;
        String str = this.f232277b;
        C85981c h = cwVar.mo79568h(Uri.parse(String.format(C85980b.f232491a, "%1$s://%2$s/velog/action", new Object[]{cwVar.f232332h.mo83212j(), cwVar.f232332h.mo83211i()})));
        h.mo79638d("ei", str);
        C58976aa aaVar = C58975e.f156826a;
        Long l = this.f232278c;
        if (l != null) {
            C85955da.m138191a(h, l.longValue());
        }
        long j = this.f232279d;
        if (j >= 0) {
            h.mo79638d("auto_exec_ms", Long.toString(j));
        }
        h.mo79638d("ved", Integer.toString(this.f232280e));
        ((C85963di) this.f232281f.f232291e.mo27525b()).mo79491a(h);
        UriRequest b = this.f232276a.mo79566f(h).mo79626b((C85966dl) null);
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(b.f236331a.toString());
            c.mo82991c(b.mo81502a());
            c.f241244j = true;
            c.f241245k = 5;
            ((C89057m) C90877ak.m148472f(((C89012aj) this.f232281f.f232289c.mo27525b()).mo27495f(c.mo82989a(), C89009ag.f241207b, ((C89012aj) this.f232281f.f232289c.mo27525b()).mo27510b(C89066v.f241382a)))).mo83036f();
        } catch (C89013ak | C90457d | InterruptedException e) {
            C59104x d = C85919cm.f232286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7887)).mo56389s("Could not log card above SRP %s", this.f232277b);
        } catch (MalformedURLException | ExecutionException e2) {
            C59104x d2 = C85919cm.f232286a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(7888)).mo56389s("Could not log card above SRP %s", this.f232277b);
        }
    }
}
