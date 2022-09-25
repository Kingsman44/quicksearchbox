package com.google.android.apps.gsa.search.core.p6841s;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.udc.C87215k;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;

/* renamed from: com.google.android.apps.gsa.search.core.s.f */
/* compiled from: PG */
public final class C86587f {

    /* renamed from: a */
    final /* synthetic */ C86590i f233912a;

    public C86587f(C86590i iVar) {
        this.f233912a = iVar;
    }

    /* renamed from: a */
    public final Boolean mo80201a(Account account, C86585d dVar) {
        ((C87215k) this.f233912a.f233931i.mo27525b()).mo80848i(9);
        try {
            return (Boolean) dVar.mo80199a(account);
        } catch (C89013ak | C90457d | InterruptedException | JSONException e) {
            C59104x d = C86590i.f233923a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SearchHistoryHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8218)).mo56386p("Failed to get search history setting");
            return null;
        } catch (MalformedURLException | ExecutionException e2) {
            C59104x d2 = C86590i.f233923a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SearchHistoryHelper");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(8219)).mo56386p("Failed to get search history setting");
            int i = C90755l.f253831a;
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo80202b(Account account, C86589h hVar, boolean z) {
        ((C87215k) this.f233912a.f233931i.mo27525b()).mo80848i(11);
        try {
            return Boolean.TRUE.equals(new C86588g(this.f233912a, hVar, z).mo80199a(account));
        } catch (C89013ak | C90457d | InterruptedException | JSONException e) {
            C59104x d = C86590i.f233923a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SearchHistoryHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8220)).mo56386p("Failed to set search history setting");
            return false;
        } catch (MalformedURLException | ExecutionException e2) {
            C59104x d2 = C86590i.f233923a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SearchHistoryHelper");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(8221)).mo56386p("Failed to set search history setting");
            int i = C90755l.f253831a;
            return false;
        }
    }
}
