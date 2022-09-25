package com.google.android.apps.search.podcasts.p10591p;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.apps.search.podcasts.p.k */
/* compiled from: PG */
public final class C140745k {

    /* renamed from: a */
    public final C19576m f382183a;

    /* renamed from: b */
    public final C58881cr f382184b = C58886cw.m90973a(new C140740f(this));

    /* renamed from: c */
    public final C58881cr f382185c = C58886cw.m90973a(new C140741g(this));

    /* renamed from: d */
    public final C58881cr f382186d = C58886cw.m90973a(new C140742h(this));

    /* renamed from: e */
    private final C19575l f382187e;

    /* renamed from: f */
    private final C58881cr f382188f = C58886cw.m90973a(new C140743i(this));

    /* renamed from: g */
    private final C58881cr f382189g = C58886cw.m90973a(new C140744j(this));

    public C140745k(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C58886cw.m90973a(new C140736b(this));
        C58886cw.m90973a(new C140737c(this));
        C58886cw.m90973a(new C140738d(this));
        C58886cw.m90973a(new C140739e(this));
        C19576m e = C19576m.m37335e("podcasts_android");
        this.f382183a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f382187e = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f382187e = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }

    /* renamed from: a */
    public final void mo115849a(String str, String str2, String str3) {
        ((C19567d) this.f382188f.mo6453a()).mo24822a(1, str, str2, str3);
    }

    /* renamed from: b */
    public final void mo115850b(double d, String str, String str2, String str3) {
        ((C19569f) this.f382189g.mo6453a()).mo24824b(d, str, str2, str3);
    }
}
