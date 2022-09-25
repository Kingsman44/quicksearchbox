package com.google.android.libraries.lens.view.education;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.lens.view.education.x */
/* compiled from: PG */
public final class C25794x {

    /* renamed from: a */
    public final C19576m f70064a;

    /* renamed from: b */
    public final C58881cr f70065b = C58886cw.m90973a(new C25786p(this));

    /* renamed from: c */
    public final C58881cr f70066c = C58886cw.m90973a(new C25789s(this));

    /* renamed from: d */
    public final C58881cr f70067d = C58886cw.m90973a(new C25790t(this));

    /* renamed from: e */
    public final C58881cr f70068e = C58886cw.m90973a(new C25791u(this));

    /* renamed from: f */
    public final C58881cr f70069f = C58886cw.m90973a(new C25792v(this));

    /* renamed from: g */
    public final C58881cr f70070g = C58886cw.m90973a(new C25793w(this));

    /* renamed from: h */
    private final C19575l f70071h;

    /* renamed from: i */
    private final C58881cr f70072i = C58886cw.m90973a(new C25787q(this));

    /* renamed from: j */
    private final C58881cr f70073j = C58886cw.m90973a(new C25788r(this));

    public C25794x(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C19576m e = C19576m.m37335e("lens_android");
        this.f70064a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f70071h = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f70071h = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }

    /* renamed from: a */
    public final void mo30933a(String str, boolean z) {
        ((C19567d) this.f70073j.mo6453a()).mo24822a(1, str, Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final void mo30934b(String str) {
        ((C19567d) this.f70072i.mo6453a()).mo24822a(1, str);
    }
}
