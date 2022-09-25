package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3861at.C50179nm;
import com.google.assistant.p3861at.C50181no;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.go */
/* compiled from: PG */
final class C108723go extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C108724gp f302352a;

    /* renamed from: b */
    private final C60870cx f302353b;

    /* renamed from: c */
    private C50181no f302354c;

    public C108723go(C108724gp gpVar, C60870cx cxVar) {
        this.f302352a = gpVar;
        this.f302353b = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        this.f302352a.f302359e.mo97059c();
        C50181no noVar = this.f302354c;
        boolean z = this.f302352a.f302355a;
        C59071e eVar = C108719gk.f302341b;
        C58976aa aaVar = C58975e.f156826a;
        C108719gk gkVar = new C108719gk();
        Bundle bundle = new Bundle();
        bundle.putByteArray("home-automation-provider", noVar.toByteArray());
        bundle.putBoolean("skip-upsell", z);
        gkVar.setArguments(bundle);
        return C83875ai.m133540e(gkVar, gkVar.getArguments());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        try {
            C58833ax axVar = (C58833ax) C90877ak.m148472f(this.f302353b);
            if (axVar.mo56113h()) {
                this.f302354c = (C50181no) axVar.mo56107c();
                C58976aa aaVar = C58975e.f156826a;
                int a = C50179nm.m85783a(this.f302354c.f130449d);
                if (a == 0) {
                    return true;
                }
                if (a == 2) {
                    return false;
                }
                return true;
            }
            if (!C58837ba.m90859h(this.f302352a.f302357c)) {
                C89949q.m146525j(C108607cg.m180627a(16), (C60321oe) null, (C63196b) null, (String) null);
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
