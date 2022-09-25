package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8580d;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.d.b */
/* compiled from: PG */
public final class C113358b implements C113425ff {

    /* renamed from: a */
    public Optional f313897a = Optional.empty();

    /* renamed from: b */
    private final C86054o f313898b;

    /* renamed from: c */
    private final C9684l f313899c;

    /* renamed from: d */
    private final C85664bo f313900d;

    /* renamed from: e */
    private final C86124t f313901e;

    /* renamed from: f */
    private C60870cx f313902f = C60856cj.m92900i(false);

    public C113358b(C86054o oVar, C9684l lVar, C85664bo boVar, C86124t tVar) {
        this.f313898b = oVar;
        this.f313899c = lVar;
        this.f313900d = boVar;
        this.f313901e = tVar;
    }

    @Deprecated
    /* renamed from: a */
    public final synchronized C60870cx mo100135a() {
        return this.f313902f;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo100136b() {
        if (this.f313901e.mo79746e(C90063do.f249407cu)) {
            return this.f313902f;
        }
        return mo100137c();
    }

    /* renamed from: c */
    public final synchronized C60870cx mo100137c() {
        Account a = this.f313898b.mo79668a();
        if (a == null) {
            this.f313897a = Optional.m71637of(false);
            C60870cx i = C60856cj.m92900i(false);
            this.f313902f = i;
            return i;
        }
        C60870cx g = C60922j.m93044g(this.f313899c.mo17952a(a), new C113357a(this), C60826bg.f164896a);
        this.f313902f = g;
        return g;
    }

    @Deprecated
    /* renamed from: d */
    public final synchronized boolean mo100138d() {
        if (!this.f313897a.isPresent()) {
            return false;
        }
        return ((Boolean) this.f313897a.get()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo100139e() {
        return this.f313900d.mo79197l(C85662bm.DEVICE_APPS);
    }

    /* renamed from: f */
    public final boolean mo100140f() {
        return this.f313900d.mo79197l(C85662bm.DEVICE_CONTACTS);
    }

    /* renamed from: g */
    public final boolean mo100141g() {
        return this.f313900d.mo79197l(C85662bm.LOCATION_HISTORY_AND_REPORTING);
    }

    /* renamed from: h */
    public final boolean mo100142h() {
        return this.f313900d.mo79197l(C85662bm.WEB_AND_APP_HISTORY);
    }

    /* renamed from: i */
    public final boolean mo100143i() {
        return this.f313900d.mo79197l(C85662bm.WEB_HISTORY);
    }
}
