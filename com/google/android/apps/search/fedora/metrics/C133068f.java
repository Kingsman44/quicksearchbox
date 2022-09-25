package com.google.android.apps.search.fedora.metrics;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.apps.search.fedora.metrics.f */
/* compiled from: PG */
public final class C133068f {

    /* renamed from: a */
    public final C19576m f362820a;

    /* renamed from: b */
    public final C58881cr f362821b = C58886cw.m90973a(new C133063a(this));

    /* renamed from: c */
    public final C58881cr f362822c = C58886cw.m90973a(new C133064b(this));

    /* renamed from: d */
    public final C58881cr f362823d = C58886cw.m90973a(new C133065c(this));

    /* renamed from: e */
    public final C58881cr f362824e = C58886cw.m90973a(new C133066d(this));

    /* renamed from: f */
    private final C19575l f362825f;

    public C133068f(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C58886cw.m90973a(new C133067e(this));
        C19576m e = C19576m.m37335e("fedass");
        this.f362820a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f362825f = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f362825f = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
