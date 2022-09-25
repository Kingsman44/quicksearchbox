package com.google.android.apps.gsa.sidekick.main.p7218m;

import com.google.android.apps.gsa.k.d;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.shared.C91729f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7722hn;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C7799kj;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.m.f */
/* compiled from: PG */
public final class C91467f implements C91729f {

    /* renamed from: a */
    public static final C59071e f255126a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.m.f");

    /* renamed from: b */
    public final Object f255127b = new Object();

    /* renamed from: c */
    public final C91474m f255128c;

    /* renamed from: d */
    public final d f255129d;

    /* renamed from: e */
    public final C21370a f255130e;

    /* renamed from: f */
    public final Map f255131f = new HashMap();

    /* renamed from: g */
    private final C22871g f255132g;

    public C91467f(C91474m mVar, d dVar, C90929bz bzVar, C22871g gVar, C21370a aVar) {
        this.f255128c = mVar;
        this.f255129d = dVar;
        this.f255132g = gVar;
        this.f255130e = aVar;
        bzVar.mo85139d(new C91464c(this));
    }

    /* renamed from: a */
    public final C60870cx mo85815a(C7642eo eoVar, C7799kj kjVar, boolean z, boolean z2) {
        return this.f255132g.mo28201a("InterestLoader", new C91462a(this, kjVar, z, eoVar, z2));
    }

    /* renamed from: b */
    public final void mo85816b() {
        this.f255129d.d(new C91463b(this));
    }

    /* renamed from: c */
    public final boolean mo85817c(C7722hn hnVar) {
        long j;
        boolean z = false;
        if (hnVar.f26996b.size() == 0) {
            C59104x b = f255126a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
            ((C59052c) ((C59052c) b).mo56372aa(11745)).mo56386p("No expirationTimestampMillis because no EntryTree present.");
        } else if ((((C7744ii) hnVar.f26996b.get(0)).f27056a & 2) != 0) {
            j = TimeUnit.SECONDS.toMillis(((C7744ii) hnVar.f26996b.get(0)).f27058c);
            if (j != 0 && j > this.f255130e.mo26870b()) {
                z = true;
            }
            C59104x b2 = f255126a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
            ((C59052c) ((C59052c) b2).mo56372aa(11751)).mo56377af(z, j);
            return z;
        } else {
            C59104x b3 = f255126a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
            ((C59052c) ((C59052c) b3).mo56372aa(11744)).mo56386p("No expirationTimestampMillis set on EntryTree.");
        }
        j = 0;
        z = true;
        C59104x b22 = f255126a.mo56224b();
        b22.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
        ((C59052c) ((C59052c) b22).mo56372aa(11751)).mo56377af(z, j);
        return z;
    }
}
