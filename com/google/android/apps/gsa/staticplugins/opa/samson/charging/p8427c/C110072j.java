package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83902bh;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108924e;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.C110111i;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8435j.C110191ab;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.j */
/* compiled from: PG */
public final class C110072j extends C84036z implements C83904bj {

    /* renamed from: a */
    final Bundle f306669a;

    /* renamed from: b */
    private final C110076n f306670b;

    /* renamed from: c */
    private final C110087y f306671c;

    /* renamed from: d */
    private final C110191ab f306672d;

    /* renamed from: e */
    private final C110111i f306673e;

    /* renamed from: f */
    private final C110082t f306674f;

    /* renamed from: g */
    private final C110088z f306675g;

    /* renamed from: h */
    private final C108924e f306676h;

    /* renamed from: i */
    private final C110402b f306677i;

    public C110072j(C108924e eVar, Bundle bundle, C110076n nVar, C110087y yVar, C110082t tVar, C110088z zVar, C110191ab abVar, C110111i iVar, C110402b bVar) {
        this.f306676h = eVar;
        this.f306669a = bundle;
        this.f306670b = nVar;
        this.f306671c = yVar;
        this.f306674f = tVar;
        this.f306675g = zVar;
        this.f306672d = abVar;
        this.f306673e = iVar;
        this.f306677i = bVar;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f306673e.mo98385b(true, true);
        C83902bh d = C83903bi.m133648d();
        d.mo77306c(-1);
        d.mo77305b(R.anim.charging_oobe_fade_out);
        return d.mo77304a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f306677i.mo98629a()) {
            return C58485gu.m89845m();
        }
        if (this.f306669a.getBoolean("use_compact_flow")) {
            C58976aa aaVar = C58975e.f156826a;
            return C58485gu.m89849q(this.f306676h, C83875ai.m133537b(new C110071i()), C83875ai.m133537b(new C110067e()), C83875ai.m133537b(this.f306671c));
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return C58485gu.m89852t(this.f306676h, C83875ai.m133537b(new C110071i()), this.f306675g, this.f306674f, this.f306672d.mo98465a(C58836b.f156633a), this.f306670b, C83875ai.m133537b(this.f306671c));
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        C83902bh d = C83903bi.m133648d();
        d.mo77306c(1);
        return d.mo77304a();
    }
}
