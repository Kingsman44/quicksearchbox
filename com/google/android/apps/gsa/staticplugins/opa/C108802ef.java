package com.google.android.apps.gsa.staticplugins.opa;

import android.text.TextUtils;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110014a;
import com.google.android.apps.gsa.staticplugins.opa.util.C113798bn;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19629c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ef */
/* compiled from: PG */
final class C108802ef {

    /* renamed from: a */
    public long f302542a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f302543b;

    public C108802ef(C109040fj fjVar) {
        this.f302543b = fjVar;
    }

    /* renamed from: a */
    public final void mo97172a(long j, String str, String str2) {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        this.f302543b.mo97469ae(j);
        if (!TextUtils.isEmpty(str)) {
            this.f302543b.f303244aD = true;
        }
        this.f302543b.f303450o.mo95368J(j, str, str2);
        if (str != null) {
            ((C113798bn) this.f302543b.f303258aR.mo27525b()).mo24921c(new C19623a(7), new C19629c(str));
        }
        C109040fj fjVar = this.f302543b;
        fjVar.f303445j.mo100721a(j, fjVar.f303235U, fjVar.f303450o.mo95427p(C109040fj.m181410j(str)));
        this.f302543b.mo97436X(false);
        this.f302543b.mo97479ao(j);
    }

    /* renamed from: b */
    public final void mo97173b() {
        this.f302543b.mo97487aw();
        this.f302543b.mo97490az(false);
        C110014a aVar = this.f302543b.f303265aY;
        if (aVar != null) {
            aVar.mo98291a();
        }
        this.f302543b.f303320ba.mo100767k();
    }
}
