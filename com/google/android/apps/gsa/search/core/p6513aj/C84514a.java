package com.google.android.apps.gsa.search.core.p6513aj;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.search.core.aj.a */
/* compiled from: PG */
public final class C84514a {

    /* renamed from: a */
    public static final C59071e f230011a = C59071e.m91332i("com.google.android.apps.gsa.search.core.aj.a");

    /* renamed from: b */
    public static final Pattern f230012b = Pattern.compile("sig=[^&]+");

    /* renamed from: c */
    public final C86054o f230013c;

    /* renamed from: d */
    public final C68214a f230014d;

    /* renamed from: e */
    private final C68214a f230015e;

    /* renamed from: f */
    private final int f230016f;

    public C84514a(C68214a aVar, C86054o oVar, int i, C68214a aVar2) {
        this.f230015e = aVar;
        this.f230013c = oVar;
        this.f230016f = i;
        this.f230014d = aVar2;
    }

    /* renamed from: a */
    public final String mo78217a(String str, Map map, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(str);
            c.mo82991c(map);
            c.f241244j = z;
            c.f241245k = this.f230016f;
            return ((C89057m) C90877ak.m148472f(((C89012aj) this.f230015e.mo27525b()).mo27495f(c.mo82989a(), C89009ag.f241207b, ((C89012aj) this.f230015e.mo27525b()).mo27510b(C89066v.f241382a)))).mo83035e();
        } catch (C89013ak | C90457d | InterruptedException e) {
            C59104x c2 = f230011a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "HttpUtils");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(9390)).mo56386p("HTTP request failed.");
            return null;
        } catch (MalformedURLException | ExecutionException e2) {
            C59104x d = f230011a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HttpUtils");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(9391)).mo56386p("HTTP request failed.");
            int i = C90755l.f253831a;
            return null;
        }
    }
}
