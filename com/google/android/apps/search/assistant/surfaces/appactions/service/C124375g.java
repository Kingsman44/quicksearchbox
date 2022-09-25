package com.google.android.apps.search.assistant.surfaces.appactions.service;

import android.content.Context;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.assistant.p3825an.p3830c.p3831a.C49312cd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.service.g */
/* compiled from: PG */
public final class C124375g extends C68247h {

    /* renamed from: a */
    private final C68283d f343298a;

    /* renamed from: c */
    private final C68283d f343299c;

    /* renamed from: d */
    private final C68283d f343300d;

    public C124375g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C124375g.class), aVar);
        this.f343298a = C68236af.m98549d(dVar);
        this.f343299c = C68236af.m98549d(dVar2);
        this.f343300d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C38469m mVar = (C38469m) list.get(2);
        return ((C124374f) C47245e.m84045a((Context) list.get(0), C124374f.class, (AccountId) list.get(1))).mo106399fM().mo41431b(C65753ak.APP_SHORTCUTS, "APP_SHORTCUTS", C63662ac.f172144a, C49312cd.f127451c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f343298a.mo60297gq(), this.f343299c.mo60297gq(), this.f343300d.mo60297gq());
    }
}
