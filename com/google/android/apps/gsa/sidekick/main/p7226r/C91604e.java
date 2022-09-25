package com.google.android.apps.gsa.sidekick.main.p7226r;

import android.util.SparseArray;
import com.google.android.apps.gsa.search.core.p6519al.p6544al.C84701a;
import com.google.android.apps.gsa.search.core.p6519al.p6634ca.C85051a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89981at;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7159c.C90952r;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91909g;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91910h;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.main.r.e */
/* compiled from: PG */
public class C91604e implements C91647a {

    /* renamed from: a */
    private static final C59071e f255484a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.r.e");

    /* renamed from: b */
    private final C68214a f255485b;

    /* renamed from: c */
    private final C85051a f255486c;

    /* renamed from: d */
    private final C68214a f255487d;

    /* renamed from: e */
    private final C8142xb f255488e;

    /* renamed from: f */
    private final C84701a f255489f;

    /* renamed from: g */
    private final C86124t f255490g;

    /* renamed from: h */
    private final SparseArray f255491h;

    public C91604e(C68214a aVar, C85051a aVar2, C68214a aVar3, C84701a aVar4, C86124t tVar, C8142xb xbVar) {
        this.f255485b = aVar;
        this.f255486c = aVar2;
        this.f255487d = aVar3;
        this.f255488e = xbVar;
        this.f255489f = aVar4;
        this.f255490g = tVar;
        SparseArray sparseArray = new SparseArray();
        if (tVar.mo79746e(C89981at.f246634d)) {
            for (Map.Entry entry : tVar.mo79752r(C89981at.f246637g).entrySet()) {
                try {
                    sparseArray.put(Integer.parseInt((String) entry.getKey()), (String) entry.getValue());
                } catch (NumberFormatException e) {
                    C59104x d = f255484a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "ServiceActionLogger");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11778)).mo56389s("Invalid event (expected int): %s", entry.getKey());
                }
            }
        }
        this.f255491h = sparseArray;
    }

    /* renamed from: a */
    public final C8142xb mo85966a() {
        return this.f255488e;
    }

    /* renamed from: b */
    public final void mo85967b(LoggingRequest loggingRequest) {
        C7708h k = loggingRequest.mo86502k();
        if (k != null && this.f255490g.mo79746e(C89981at.f246634d)) {
            SparseArray sparseArray = this.f255491h;
            C7681g a = C7681g.m22802a(k.f26897b);
            if (a == null) {
                a = C7681g.INVALID;
            }
            String str = (String) sparseArray.get(a.f26835cv);
            if (str != null) {
                this.f255489f.mo78427a(str);
            }
        }
        ((C90931ca) this.f255487d.mo27525b()).mo85142g(this.f255486c.mo78674d(C58485gu.m89846n(loggingRequest)), new C90952r("ServiceActionLogger", "logAction", "failure"));
    }

    /* renamed from: c */
    public final void mo85968c(C7718hj hjVar, C7681g gVar, C7526an anVar) {
        if (C91978bb.m150937c(hjVar, gVar, new C7681g[0]) == null) {
            C59104x d = f255484a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ServiceActionLogger");
            ((C59052c) ((C59052c) d).mo56372aa(11779)).mo56386p("Cannot find action in entry");
            return;
        }
        C91909g b = ((C91910h) this.f255485b.mo27525b()).mo86565b(hjVar, gVar);
        b.mo86543g(anVar);
        b.mo86548l(this.f255488e);
        mo85967b(b.mo86537a());
    }

    /* renamed from: d */
    public void mo85969d(C7718hj hjVar, C7681g gVar) {
        if (C91978bb.m150937c(hjVar, gVar, new C7681g[0]) == null) {
            C59104x d = f255484a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ServiceActionLogger");
            ((C59052c) ((C59052c) d).mo56372aa(11780)).mo56386p("Cannot find action in entry");
            return;
        }
        C91909g b = ((C91910h) this.f255485b.mo27525b()).mo86565b(hjVar, gVar);
        b.mo86548l(this.f255488e);
        b.mo86545i(true);
        b.mo86546j(true);
        mo85967b(b.mo86537a());
    }
}
