package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3592c.C45729e;
import com.google.apps.p3589d.p3593d.C45763v;

/* renamed from: com.google.apps.d.e.aa */
/* compiled from: PG */
public final class C45769aa {

    /* renamed from: a */
    public C45729e f120352a = null;

    /* renamed from: b */
    public final boolean f120353b;

    public C45769aa(boolean z) {
        this.f120353b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C45763v mo49901a(C45763v vVar, C45763v vVar2) {
        if (vVar == null) {
            return vVar2;
        }
        if (vVar2 == null) {
            return vVar;
        }
        C45796z c = mo49903c();
        c.mo49920c(mo49902b(vVar, this.f120352a));
        c.mo49920c(mo49902b(vVar2, this.f120352a));
        return c.mo49918a();
    }

    /* renamed from: b */
    public final C45796z mo49902b(C45763v vVar, C45729e eVar) {
        boolean z;
        if (eVar != null) {
            z = eVar.mo49847c(vVar);
            if (!z) {
                this.f120352a = eVar;
            }
        } else {
            z = false;
        }
        return new C45796z(this, C45723n.m81491g(vVar.f120342a), z);
    }

    /* renamed from: c */
    public final C45796z mo49903c() {
        return new C45796z(this, new C45723n(0), false);
    }
}
