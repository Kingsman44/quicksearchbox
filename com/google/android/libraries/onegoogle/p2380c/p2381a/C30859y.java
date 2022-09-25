package com.google.android.libraries.onegoogle.p2380c.p2381a;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.c.a.y */
/* compiled from: PG */
public final class C30859y {

    /* renamed from: a */
    public final C19576m f83235a;

    /* renamed from: b */
    public final C58881cr f83236b = C58886cw.m90973a(new C30848n(this));

    /* renamed from: c */
    public final C58881cr f83237c = C58886cw.m90973a(new C30851q(this));

    /* renamed from: d */
    public final C58881cr f83238d = C58886cw.m90973a(new C30852r(this));

    /* renamed from: e */
    public final C58881cr f83239e = C58886cw.m90973a(new C30853s(this));

    /* renamed from: f */
    public final C58881cr f83240f;

    /* renamed from: g */
    public final C58881cr f83241g;

    /* renamed from: h */
    public final C58881cr f83242h;

    /* renamed from: i */
    public final C58881cr f83243i;

    /* renamed from: j */
    private final C19575l f83244j;

    public C30859y(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C58886cw.m90973a(new C30854t(this));
        this.f83240f = C58886cw.m90973a(new C30855u(this));
        this.f83241g = C58886cw.m90973a(new C30856v(this));
        this.f83242h = C58886cw.m90973a(new C30857w(this));
        this.f83243i = C58886cw.m90973a(new C30858x(this));
        C58886cw.m90973a(new C30849o(this));
        C58886cw.m90973a(new C30850p(this));
        C19576m e = C19576m.m37335e("STREAMZ_ONEGOOGLE_ANDROID");
        this.f83235a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f83244j = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f83244j = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
