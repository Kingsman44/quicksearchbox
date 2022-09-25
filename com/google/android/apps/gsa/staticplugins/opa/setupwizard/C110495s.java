package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108842az;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108846bc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.s */
/* compiled from: PG */
final class C110495s extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C110500x f308054a;

    public C110495s(C110500x xVar) {
        this.f308054a = xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        if (this.f308054a.f308063e.mo79746e(C90062dn.f249205d)) {
            Bundle bundle = new Bundle();
            bundle.putBundle("opa_suw_intent_extras_param", this.f308054a.f308061c.mo98714a());
            return C83875ai.m133540e(new C110460aj(), bundle);
        } else if (TextUtils.isEmpty(this.f308054a.f308063e.mo79758x(C90062dn.f249220s))) {
            C58976aa aaVar = C58975e.f156826a;
            return C83875ai.m133537b(new C108842az());
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("opa-suw-intent-extras-param", this.f308054a.f308061c.mo98714a());
            return C83875ai.m133540e(new C108846bc(), bundle2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return mo98738d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo98738d() {
        C59104x b = C110500x.f308059a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaSuwContentSeq");
        C59052c cVar = (C59052c) b;
        cVar.mo56378ag(C58975e.f156826a, "SuwHBSequence");
        ((C59052c) cVar.mo56372aa(26388)).mo56389s("#isEnabled = %b", Boolean.valueOf(this.f308054a.f308061c.mo98716c()));
        return this.f308054a.f308061c.mo98716c() && !this.f308054a.f308060b.mo98725e();
    }
}
