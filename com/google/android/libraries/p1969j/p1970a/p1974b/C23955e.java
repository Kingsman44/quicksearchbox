package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.j.a.b.e */
/* compiled from: PG */
public final class C23955e {

    /* renamed from: a */
    public final C19576m f65510a;

    /* renamed from: b */
    public final C58881cr f65511b = C58886cw.m90973a(new C23954d(this));

    /* renamed from: c */
    private final C19575l f65512c;

    public C23955e(ScheduledExecutorService scheduledExecutorService, C19566c cVar) {
        C19576m e = C19576m.m37335e("STREAMZ_FOOTPRINTS_CONSENT_FLOWS");
        this.f65510a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f65512c = C19579p.m37339c(cVar, scheduledExecutorService, e, (Application) null);
            return;
        }
        this.f65512c = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
