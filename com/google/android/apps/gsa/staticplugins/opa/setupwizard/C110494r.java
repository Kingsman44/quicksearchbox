package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109800at;
import com.google.android.apps.gsa.staticplugins.opa.setupwizard.p8447a.C110450k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.r */
/* compiled from: PG */
final class C110494r extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C110500x f308050a;

    /* renamed from: b */
    private final boolean f308051b;

    /* renamed from: c */
    private final boolean f308052c;

    /* renamed from: d */
    private final boolean f308053d;

    public C110494r(C110500x xVar, boolean z, boolean z2, boolean z3) {
        this.f308050a = xVar;
        this.f308051b = z;
        this.f308052c = z2;
        this.f308053d = z3;
    }

    /* renamed from: d */
    private final String m184063d() {
        return this.f308051b ? this.f308050a.f308063e.mo79758x(C90014bt.f247054S) : this.f308050a.f308063e.mo79758x(C90014bt.f247053R);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        String str;
        Bundle bundle = new Bundle();
        if (this.f308051b) {
            str = "edu1";
        } else {
            str = this.f308050a.f308063e.mo79746e(C90062dn.f249208g) ? "ngas" : "edu2";
        }
        bundle.putString("url-screen-param", str);
        boolean z = this.f308052c;
        if (this.f308053d) {
            z |= true;
        }
        bundle.putInt("url-config-param", z ? 1 : 0);
        bundle.putString("web-view-url", m184063d());
        bundle.putInt("fragment-ve-id", true != this.f308051b ? 61485 : 84764);
        bundle.putBundle("opa-suw-intent-extras-param", this.f308050a.f308061c.mo98714a());
        return C83875ai.m133540e(new C110450k(), bundle);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [com.google.android.apps.gsa.opaonboarding.as, com.google.android.apps.gsa.opaonboarding.t] */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        ? r0;
        C109800at atVar;
        if (!this.f308051b && this.f308050a.f308063e.mo79746e(C90062dn.f249223v) && this.f308050a.f308063e.mo79746e(C90062dn.f249208g) && !this.f308050a.f308062d.mo87249w()) {
            return false;
        }
        if ((!this.f308051b || !this.f308050a.f308063e.mo79746e(C90062dn.f249209h) || (r0 = this.f308050a.f308065g) == 0 || (((atVar = r0.f305914a) != null && atVar.f305955g) || (r0.mo77270a() != 2 && r0.mo77270a() != 3))) && !TextUtils.isEmpty(m184063d())) {
            return true;
        }
        return false;
    }
}
