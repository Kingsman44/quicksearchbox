package com.google.android.apps.gsa.p6427o;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p6427o.p6428a.C83557a;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.integrations.p3019d.p3020a.C38510a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.o.c */
/* compiled from: PG */
public final class C83559c {

    /* renamed from: a */
    public static final C59071e f227863a = C59071e.m91332i("com.google.android.apps.gsa.o.c");

    /* renamed from: b */
    public final SharedPreferences f227864b;

    /* renamed from: c */
    public final C83561e f227865c;

    /* renamed from: d */
    private final C22871g f227866d;

    /* renamed from: e */
    private final C84474e f227867e;

    /* renamed from: f */
    private final Optional f227868f;

    /* renamed from: g */
    private final C84486a f227869g;

    public C83559c(C22871g gVar, C84474e eVar, SharedPreferences sharedPreferences, C83561e eVar2, Optional optional, C84486a aVar) {
        this.f227866d = gVar;
        this.f227867e = eVar;
        this.f227864b = sharedPreferences;
        this.f227865c = eVar2;
        this.f227868f = optional;
        this.f227869g = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo76890a() {
        if (this.f227868f.isEmpty()) {
            return C60856cj.m92900i(false);
        }
        return ((C83557a) this.f227868f.get()).f227861a.mo47087a();
    }

    /* renamed from: b */
    public final void mo76891b(C60870cx cxVar) {
        new C90873ag(cxVar, this.f227866d, "Update Weblayer availability cache", new C83556a(this)).mo85223a(C83558b.f227862a);
    }

    /* renamed from: c */
    public final boolean mo76892c() {
        if (mo76895f()) {
            return false;
        }
        if (this.f227869g.mo78195a() == C38510a.OPT_IN) {
            return true;
        }
        if (this.f227869g.mo78195a() == C38510a.OPT_OUT) {
            return false;
        }
        return this.f227867e.mo78064I();
    }

    @Deprecated
    /* renamed from: d */
    public final boolean mo76893d(String str) {
        if (!mo76894e(str)) {
            return false;
        }
        mo76891b(mo76890a());
        if (!this.f227864b.contains("web_layer_available")) {
            C59104x d = f227863a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GabAvailability");
            ((C59052c) ((C59052c) d).mo56372aa(2302)).mo56386p("WebLayer availability state not available in cache");
        }
        return this.f227864b.getBoolean("web_layer_available", false);
    }

    /* renamed from: e */
    public final boolean mo76894e(String str) {
        if (mo76892c()) {
            C83561e eVar = this.f227865c;
            if (str != null) {
                if (eVar.f227870a.getInt(String.format("opa_unicorn_status_%s", new Object[]{str}), 0) == 2) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo76895f() {
        return this.f227867e.mo78066K();
    }
}
