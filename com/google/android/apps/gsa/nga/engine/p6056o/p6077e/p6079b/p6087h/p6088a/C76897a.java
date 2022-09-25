package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a;

import com.google.android.apps.gsa.nga.engine.am.l.c.f;
import com.google.android.apps.gsa.nga.engine.am.l.c.h;
import com.google.android.apps.gsa.nga.engine.am.l.c.l;
import com.google.android.apps.gsa.nga.engine.am.l.c.r;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.h.a.a */
/* compiled from: PG */
public final /* synthetic */ class C76897a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76899c f212351a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212352b;

    public /* synthetic */ C76897a(C76899c cVar, C74965n nVar) {
        this.f212351a = cVar;
        this.f212352b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76899c cVar = this.f212351a;
        C74965n nVar = this.f212352b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60856cj.m92900i(C80401n.f220656k);
        }
        C22871g gVar = cVar.f212356c;
        r rVar = cVar.f212355b;
        C18100a aVar = (C18100a) optional.get();
        C83320io k = nVar.mo71336k();
        h a = rVar.d.a();
        a.e = aVar;
        C60870cx i = rVar.f.mo28209i(rVar.a(true, a, k), "[NGA] isActionSupported", new l(aVar));
        C60856cj.m92911t(i, new f(a), C60826bg.f164896a);
        return gVar.mo28209i(i, "[NGA] ActionSendingFulfiller.fulfill", new C76898b(cVar, optional));
    }
}
