package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.os.Build;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.crossprofile.C83754b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.enterprise.connectedapps.C142574h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.bg */
/* compiled from: PG */
public final class C110602bg {

    /* renamed from: a */
    public final C110592ax f308276a;

    /* renamed from: b */
    public final C83794j f308277b;

    /* renamed from: c */
    public final C58974d f308278c;

    /* renamed from: d */
    public final C130895ag f308279d;

    /* renamed from: e */
    public final C110632ch f308280e;

    /* renamed from: f */
    public final C83754b f308281f;

    public C110602bg(C110632ch chVar, C110592ax axVar, C83754b bVar, C83794j jVar, C83564a aVar, C130895ag agVar) {
        this.f308280e = chVar;
        this.f308276a = axVar;
        this.f308281f = bVar;
        this.f308277b = jVar;
        this.f308278c = aVar.mo76900a("CPServiceMediator");
        this.f308279d = agVar;
    }

    /* renamed from: a */
    public final C60870cx mo98804a() {
        ((C58970a) ((C58970a) this.f308278c.mo56224b()).mo56372aa(26617)).mo56386p("CrossProfileServiceManagerMediator#updateCurrentCard");
        C60870cx f = this.f308280e.mo98825a().mo98815f();
        if (mo98806c()) {
            mo98805b(f);
            this.f308280e.mo98827c().mo98815f();
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: b */
    public final void mo98805b(C60870cx cxVar) {
        String h = this.f308277b.mo77170h();
        String str = Build.MANUFACTURER;
        this.f308279d.mo109952y(h, str, "CROSS_PROFILE_CALL");
        C60856cj.m92911t(cxVar, new C110601bf(this, h, str), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final boolean mo98806c() {
        return C142574h.m231178b(this.f308281f.mo117178i().f386862c);
    }
}
