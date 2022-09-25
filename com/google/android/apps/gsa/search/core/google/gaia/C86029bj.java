package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65806cj;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.bj */
/* compiled from: PG */
public final class C86029bj implements C86021bb {

    /* renamed from: a */
    public static final C59071e f232589a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.gaia.bj");

    /* renamed from: b */
    private final i f232590b;

    /* renamed from: c */
    private final C22871g f232591c;

    public C86029bj(i iVar, C22871g gVar) {
        this.f232590b = iVar;
        this.f232591c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo79693a(Account account) {
        return this.f232591c.mo28209i(this.f232590b.a(account.name, C65753ak.PRIVACY_SETTINGS, C65806cj.SEARCH_AND_ASSISTANT.name(), C63662ac.f172144a, C65798cb.f178854e), "Get the Search And Assistant bit from privacy setting corpus", C86028bi.f232588a);
    }

    /* renamed from: b */
    public final C60870cx mo79694b(List list) {
        C58495hd hdVar = (C58495hd) Collection.EL.stream(list).collect(C58370cn.m89403c(C86024be.f232584a, new C86025bf(this), C86026bg.f232586a));
        return C60856cj.m92892a(hdVar.values()).mo57334a(new C86027bh(hdVar), C60826bg.f164896a);
    }
}
