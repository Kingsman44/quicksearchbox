package com.google.android.apps.gsa.search.core.p6841s;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C90109fg;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.search.core.s.d */
/* compiled from: PG */
public final class C86585d extends C86584c {

    /* renamed from: b */
    final /* synthetic */ C86590i f233910b;

    /* renamed from: c */
    private final C86589h f233911c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86585d(C86590i iVar, C86589h hVar) {
        super(iVar);
        this.f233910b = iVar;
        this.f233911c = hVar;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo80200b(Account account, Map map) {
        C86590i iVar = this.f233910b;
        String a = iVar.f233930h.mo85530a(account);
        String a2 = this.f233911c.mo80203a(this.f233910b.f233926d);
        Uri.Builder buildUpon = Uri.parse(iVar.f233927e.mo79758x(C90109fg.f250571m)).buildUpon();
        buildUpon.appendQueryParameter("client", a2);
        buildUpon.appendQueryParameter("num", Integer.toString(0));
        if (a != null) {
            buildUpon.appendQueryParameter("kvi", a);
        }
        Uri build = buildUpon.build();
        C89019aq c = C89020ar.m144758c();
        c.mo82994f(build.toString());
        c.mo82991c(map);
        c.f241244j = false;
        c.f241245k = 2;
        C89020ar a3 = c.mo82989a();
        C58976aa aaVar = C58975e.f156826a;
        return Boolean.valueOf(new JSONObject(((C89057m) C90877ak.m148472f(((C89012aj) this.f233910b.f233924b.mo27525b()).mo27495f(a3, C89009ag.f241207b, ((C89012aj) this.f233910b.f233924b.mo27525b()).mo27510b(C89066v.f241382a)))).mo83035e()).getBoolean("history_recording_enabled"));
    }
}
