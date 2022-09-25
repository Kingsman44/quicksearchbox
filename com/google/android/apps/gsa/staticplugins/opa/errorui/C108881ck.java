package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65849r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ck */
/* compiled from: PG */
public final class C108881ck extends C84036z implements C83904bj {

    /* renamed from: a */
    public static final C59071e f302733a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.ck");

    /* renamed from: b */
    private final C14096x f302734b;

    /* renamed from: c */
    private final C58485gu f302735c;

    public C108881ck(i iVar, C14096x xVar, C86054o oVar, C91077d dVar, C86124t tVar, Context context) {
        C60870cx cxVar;
        this.f302734b = xVar;
        xVar.mo21406j(3);
        String F = oVar.mo79659F();
        if (F != null) {
            cxVar = iVar.c(F, C65753ak.ASSISTANT_SETTINGS, "driving_settings", C63662ac.f172144a, C65849r.f179002c);
        } else {
            cxVar = C60856cj.m92900i(C58485gu.m89846n(C65849r.f179002c));
        }
        C58480gp e = C58485gu.m89837e();
        if (tVar.mo79746e(C90053de.f248935B)) {
            e.mo55395g(new C108878ch(dVar));
        }
        if (tVar.mo79746e(C90053de.f248936C)) {
            e.mo55395g(new C108879ci(cxVar));
        }
        e.mo55395g(new C108880cj(context));
        this.f302735c = e.mo55394f();
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        this.f302734b.mo21406j(4);
        return C83903bi.m133649e(-1, (Intent) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        return this.f302735c;
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        this.f302734b.mo21406j(4);
        return C83903bi.m133649e(1, (Intent) null);
    }
}
