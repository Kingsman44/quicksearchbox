package com.google.android.apps.gsa.staticplugins.p7385ak;

import android.text.TextUtils;
import com.google.android.apps.gsa.p5850f.C74522b;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6532af.C84671a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.y */
/* compiled from: PG */
public final class C93920y implements C74522b {

    /* renamed from: a */
    private final C84671a f262284a;

    /* renamed from: b */
    private final C93916u f262285b;

    /* renamed from: c */
    private final C86054o f262286c;

    /* renamed from: d */
    private final C85664bo f262287d;

    /* renamed from: e */
    private final C22871g f262288e;

    /* renamed from: f */
    private boolean f262289f = false;

    public C93920y(C84671a aVar, C93916u uVar, C22871g gVar, C85664bo boVar, C86054o oVar) {
        this.f262286c = oVar;
        this.f262284a = aVar;
        this.f262288e = gVar;
        this.f262285b = uVar;
        this.f262287d = boVar;
    }

    /* renamed from: a */
    public final C58833ax mo70829a() {
        C58833ax axVar;
        if (!this.f262287d.mo79197l(C85662bm.DEVICE_APPS)) {
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        }
        String F = this.f262286c.mo79659F();
        if (TextUtils.isEmpty(F)) {
            C58976aa aaVar2 = C58975e.f156826a;
            return C58836b.f156633a;
        }
        C93916u uVar = this.f262285b;
        if (TextUtils.isEmpty(F) || !F.equals(uVar.f262282b)) {
            axVar = C58836b.f156633a;
        } else {
            axVar = uVar.f262281a;
        }
        if (axVar.mo56113h()) {
            return axVar;
        }
        if (!this.f262289f) {
            this.f262289f = true;
            C58976aa aaVar3 = C58975e.f156826a;
            this.f262288e.mo28213m("delay refresh", 10000, new C93918w(this));
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final synchronized void mo88214b() {
        this.f262288e.mo28211k(this.f262284a.mo78410b(), "update refresh status", new C93919x());
    }
}
