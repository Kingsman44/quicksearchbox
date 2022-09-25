package com.google.android.libraries.search.logging.appflows.startup.logger;

import android.content.Context;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.logging.appflows.startup.C38807b;
import com.google.android.libraries.search.p2871b.C37172a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.search.logging.appflows.startup.logger.c */
/* compiled from: PG */
public final class C38821c implements C38824e {

    /* renamed from: a */
    public C58833ax f102435a = C58836b.f156633a;

    /* renamed from: b */
    private final Context f102436b;

    /* renamed from: c */
    private final C38807b f102437c;

    /* renamed from: d */
    private final C38828b f102438d;

    /* renamed from: e */
    private final C38780c f102439e;

    /* renamed from: com.google.android.libraries.search.logging.appflows.startup.logger.c$a */
    /* compiled from: PG */
    interface C38822a {
        /* renamed from: gf */
        C38780c mo41661gf();
    }

    public C38821c(C38828b bVar, C38807b bVar2, C38780c cVar, Context context) {
        this.f102436b = context;
        this.f102437c = bVar2;
        this.f102438d = bVar;
        this.f102439e = cVar;
    }

    /* renamed from: b */
    private final C58833ax m68168b() {
        return this.f102435a.mo56113h() ? C58833ax.m90834k(((C38822a) C47245e.m84045a(this.f102436b, C38822a.class, (AccountId) this.f102435a.mo56107c())).mo41661gf().mo41619a(this.f102438d)) : C58836b.f156633a;
    }

    /* renamed from: a */
    public final void mo41660a() {
        C37215b bVar = (C37215b) m68168b().mo56109e(this.f102439e.mo41619a(this.f102438d));
        C38807b bVar2 = this.f102437c;
        List list = bVar2.f102417j;
        bVar2.f102417j = new ArrayList();
        C58485gu j = C58485gu.m89842j(list);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C37172a) j.get(i)).mo40689a(bVar);
        }
    }

    /* renamed from: g */
    public final void mo41659g(C37172a aVar) {
        C58833ax b = m68168b();
        if (b.mo56113h()) {
            aVar.mo40689a((C37215b) b.mo56107c());
        } else {
            this.f102437c.f102417j.add(aVar);
        }
    }
}
