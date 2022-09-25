package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.C89646bc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.be */
/* compiled from: PG */
final class C96546be {

    /* renamed from: a */
    public final boolean f270088a;

    /* renamed from: b */
    public final C89646bc f270089b = new C89646bc(C96547bf.f270093b, 3, C96547bf.f270094c, 0);

    /* renamed from: c */
    public C60870cx f270090c;

    /* renamed from: d */
    final /* synthetic */ C96547bf f270091d;

    public C96546be(C96547bf bfVar, boolean z) {
        this.f270091d = bfVar;
        this.f270088a = z;
    }

    /* renamed from: a */
    public final void mo90234a() {
        C59071e eVar = C96547bf.f270092a;
        C58976aa aaVar = C58975e.f156826a;
        this.f270091d.f270138p.mo89270k();
        if (this.f270091d.f270137o.mo90223d()) {
            C96547bf bfVar = this.f270091d;
            bfVar.mo90241p(bfVar.f270140r.mo90206c(bfVar.f270138p, bfVar.f270134l.mo106514l(), this.f270091d.f270133k), "checkApplySuccess.", new C96544bc(this), C96545bd.f270087a);
            return;
        }
        C59104x c = C96547bf.f270092a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OtaStateApplySent");
        ((C59052c) ((C59052c) c).mo56372aa(16603)).mo56386p("Unacceptable connection for OTA");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo90235b() {
        C60870cx cxVar = this.f270090c;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f270090c = null;
        }
        this.f270089b.mo83535b();
        mo90234a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo90236c() {
        C60870cx cxVar = this.f270090c;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f270090c = null;
        }
    }
}
