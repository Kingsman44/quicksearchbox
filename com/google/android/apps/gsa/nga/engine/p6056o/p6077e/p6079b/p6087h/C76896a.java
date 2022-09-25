package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.h.a */
/* compiled from: PG */
public final class C76896a implements C76591c {

    /* renamed from: a */
    private final C81252aq f212348a;

    /* renamed from: b */
    private final C81515c f212349b;

    /* renamed from: c */
    private final C76591c f212350c;

    public C76896a(C81252aq aqVar, C81515c cVar, C76591c cVar2) {
        this.f212348a = aqVar;
        this.f212349b = cVar;
        this.f212350c = cVar2;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        return this.f212350c.mo71711a();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        if (this.f212348a.mo74957r()) {
            return this.f212350c.mo71712b(bgVar, nVar);
        }
        Locale q = nVar.mo71342q();
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C81442m.m129557s(lVar, t.r(this.f212349b.mo75121a(q).getString(R.string.nga_fulfillment_pr_bit_off_punt, new Object[0])));
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
