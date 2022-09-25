package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.w */
/* compiled from: PG */
public final class C110085w extends C84036z implements C83904bj {

    /* renamed from: a */
    private final C110076n f306711a;

    /* renamed from: b */
    private final C110087y f306712b;

    /* renamed from: c */
    private final C110082t f306713c;

    /* renamed from: d */
    private final C110088z f306714d;

    /* renamed from: e */
    private final C110191ab f306715e;

    /* renamed from: f */
    private final C110111i f306716f;

    /* renamed from: g */
    private final C108924e f306717g;

    /* renamed from: h */
    private final C110402b f306718h;

    public C110085w(C108924e eVar, C110076n nVar, C110087y yVar, C110082t tVar, C110088z zVar, C110191ab abVar, C110111i iVar, C110402b bVar) {
        this.f306717g = eVar;
        this.f306711a = nVar;
        this.f306712b = yVar;
        this.f306713c = tVar;
        this.f306714d = zVar;
        this.f306715e = abVar;
        this.f306716f = iVar;
        this.f306718h = bVar;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        this.f306716f.mo98385b(true, true);
        C83902bh d = C83903bi.m133648d();
        d.mo77306c(-1);
        d.mo77305b(R.anim.charging_oobe_fade_out);
        return d.mo77304a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f306718h.mo98629a()) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89852t(this.f306717g, C83875ai.m133537b(new C110075m()), this.f306714d, this.f306713c, this.f306715e.mo98465a(C58836b.f156633a), this.f306711a, C83875ai.m133537b(this.f306712b));
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        C83902bh d = C83903bi.m133648d();
        d.mo77306c(1);
        return d.mo77304a();
    }
}
