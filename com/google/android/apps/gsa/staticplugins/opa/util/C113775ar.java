package com.google.android.apps.gsa.staticplugins.opa.util;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109658ac;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ar */
/* compiled from: PG */
public final class C113775ar {

    /* renamed from: a */
    public static final C59071e f315097a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.ar");

    /* renamed from: b */
    public final C60950i f315098b;

    /* renamed from: c */
    public final Context f315099c;

    /* renamed from: d */
    public final Resources f315100d;

    /* renamed from: e */
    public final C86124t f315101e;

    /* renamed from: f */
    public final C22871g f315102f;

    /* renamed from: g */
    public final C109658ac f315103g;

    /* renamed from: h */
    public final C14096x f315104h;

    /* renamed from: i */
    public final C85005h f315105i;

    /* renamed from: j */
    public final C113773ap f315106j;

    /* renamed from: k */
    public final i f315107k;

    /* renamed from: l */
    public final C86054o f315108l;

    /* renamed from: m */
    public volatile C17823i f315109m = C17823i.UNKNOWN;

    /* renamed from: n */
    private final C86034c f315110n;

    public C113775ar(C60950i iVar, Context context, Resources resources, C86124t tVar, C22871g gVar, C109658ac acVar, C14096x xVar, C85005h hVar, i iVar2, C86054o oVar, C86034c cVar) {
        this.f315098b = iVar;
        this.f315099c = context;
        this.f315100d = resources;
        this.f315101e = tVar;
        this.f315102f = gVar;
        this.f315103g = acVar;
        this.f315104h = xVar;
        this.f315105i = hVar;
        this.f315107k = iVar2;
        this.f315108l = oVar;
        this.f315110n = cVar;
        C113773ap apVar = new C113773ap(this);
        this.f315106j = apVar;
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(apVar);
    }

    /* renamed from: a */
    public final void mo100620a(boolean z, boolean z2) {
        if (this.f315109m == C17823i.STOPPED || this.f315109m == C17823i.UNKNOWN) {
            if (!z) {
                if (z2) {
                    z2 = true;
                } else {
                    return;
                }
            }
            C14096x xVar = this.f315104h;
            C58976aa aaVar = C58975e.f156826a;
            C60856cj.m92911t(xVar.f42764b.mo46042d(), new C113769al(this, z2), C60826bg.f164896a);
        }
    }

    /* renamed from: b */
    public final void mo100621b(C113774aq aqVar, C14077e eVar, boolean z) {
        C60856cj.m92911t(this.f315110n.mo79696a(), new C113771an(this, aqVar, eVar, z), C60826bg.f164896a);
    }
}
