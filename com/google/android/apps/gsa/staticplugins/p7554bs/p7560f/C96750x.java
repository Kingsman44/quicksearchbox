package com.google.android.apps.gsa.staticplugins.p7554bs.p7560f;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.f.x */
/* compiled from: PG */
public final class C96750x {

    /* renamed from: a */
    public final C19576m f270626a;

    /* renamed from: b */
    public final C58881cr f270627b = C58886cw.m90973a(new C96739m(this));

    /* renamed from: c */
    public final C58881cr f270628c = C58886cw.m90973a(new C96742p(this));

    /* renamed from: d */
    public final C58881cr f270629d = C58886cw.m90973a(new C96743q(this));

    /* renamed from: e */
    public final C58881cr f270630e = C58886cw.m90973a(new C96744r(this));

    /* renamed from: f */
    public final C58881cr f270631f;

    /* renamed from: g */
    public final C58881cr f270632g;

    /* renamed from: h */
    public final C58881cr f270633h;

    /* renamed from: i */
    private final C19575l f270634i;

    public C96750x(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C58886cw.m90973a(new C96745s(this));
        C58886cw.m90973a(new C96746t(this));
        this.f270631f = C58886cw.m90973a(new C96747u(this));
        this.f270632g = C58886cw.m90973a(new C96748v(this));
        this.f270633h = C58886cw.m90973a(new C96749w(this));
        C58886cw.m90973a(new C96740n(this));
        C58886cw.m90973a(new C96741o(this));
        C19576m e = C19576m.m37335e("lenslite_android");
        this.f270626a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f270634i = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f270634i = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
