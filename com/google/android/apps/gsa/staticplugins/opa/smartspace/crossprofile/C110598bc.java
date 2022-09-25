package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83724a;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110764bi;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.bc */
/* compiled from: PG */
public final class C110598bc implements C110592ax {

    /* renamed from: a */
    public final C110764bi f308264a;

    /* renamed from: b */
    public final C58974d f308265b;

    /* renamed from: c */
    private final C110656v f308266c;

    /* renamed from: d */
    private final C22871g f308267d;

    /* renamed from: e */
    private final Context f308268e;

    /* renamed from: f */
    private final C83793i f308269f;

    public C110598bc(C110764bi biVar, C110656v vVar, C22871g gVar, Context context, C83793i iVar, C83564a aVar) {
        this.f308264a = biVar;
        this.f308266c = vVar;
        this.f308267d = gVar;
        this.f308268e = context;
        this.f308269f = iVar;
        this.f308265b = aVar.mo76900a("CPServiceManager");
    }

    /* renamed from: h */
    private final void m184257h(C60870cx cxVar) {
        C60856cj.m92911t(cxVar, new C110597bb(this), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo98789a(C83741am amVar) {
        C110656v vVar = this.f308266c;
        C83798n k = C83800p.m133473k();
        k.mo77043b(amVar);
        ((C83724a) k).f228192c = C58485gu.m89842j(C58485gu.m89845m());
        C60870cx b = vVar.mo98831b(k.mo77042a());
        m184257h(b);
        return this.f308264a.mo98871i(b);
    }

    /* renamed from: b */
    public final C60870cx mo98790b(C83741am amVar, Bitmap bitmap) {
        C110656v vVar = this.f308266c;
        C83798n k = C83800p.m133473k();
        k.mo77043b(amVar);
        ((C83724a) k).f228192c = C58485gu.m89842j(bitmap == null ? C58485gu.m89845m() : C58485gu.m89846n(bitmap));
        C60870cx b = vVar.mo98831b(k.mo77042a());
        m184257h(b);
        return this.f308264a.mo98871i(b);
    }

    /* renamed from: c */
    public final C60870cx mo98791c(C83800p pVar) {
        C60870cx b = this.f308266c.mo98831b(pVar);
        m184257h(b);
        return this.f308264a.mo98872j(b);
    }

    /* renamed from: d */
    public final C60870cx mo98792d() {
        C60870cx b = this.f308266c.mo98831b(C83800p.m133473k().mo77042a());
        m184257h(b);
        return this.f308267d.mo28210j(b, "resendCurrentCards", new C110596ba(this));
    }

    /* renamed from: e */
    public final C60870cx mo98793e() {
        C60870cx b = this.f308266c.mo98831b(C83800p.m133473k().mo77042a());
        m184257h(b);
        return this.f308267d.mo28210j(b, "resendCurrentCardsForLauncher", new C110594az(this));
    }

    /* renamed from: f */
    public final C60870cx mo98794f(Intent intent) {
        this.f308269f.mo77156l(this.f308268e, intent);
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: g */
    public final C60870cx mo98795g() {
        C60870cx b = this.f308266c.mo98831b(C83800p.m133473k().mo77042a());
        m184257h(b);
        return this.f308267d.mo28210j(b, "updateCurrentCard", new C110593ay(this));
    }
}
