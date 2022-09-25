package com.google.android.apps.gsa.shared.p6993ao;

import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;

/* renamed from: com.google.android.apps.gsa.shared.ao.s */
/* compiled from: PG */
public final class C89254s {

    /* renamed from: a */
    public C89248m f242015a;

    /* renamed from: b */
    private int f242016b = 4;

    public C89254s(C87680ah ahVar) {
        ahVar.mo81959a(new C89253r(this), C88244um.SET_SEARCH_PLATE_MODE);
    }

    /* renamed from: a */
    public final void mo83210a(int i) {
        if (this.f242016b != i) {
            this.f242016b = i;
            C89248m mVar = this.f242015a;
            if (mVar != null) {
                int i2 = i - 1;
                if (i2 == 0 || i2 == 1 || i2 == 2) {
                    C89240e eVar = mVar.f241997a.f242001c;
                    if (!eVar.f241978c.f241970a.isRunning()) {
                        eVar.f241977b.setVisibility(0);
                        eVar.mo83192c();
                    }
                } else if (i2 != 3) {
                    mVar.f241997a.mo83201a(C90208n.SEARCH_TAB);
                    C89249n nVar = mVar.f241997a;
                    nVar.f242001c.mo83193d(C89249n.f241998a.contains(nVar.f242002d));
                } else {
                    C89249n nVar2 = mVar.f241997a;
                    nVar2.f242001c.mo83196g(C89249n.f241998a.contains(nVar2.f242002d));
                    C89249n nVar3 = mVar.f241997a;
                    nVar3.f242001c.mo83193d(C89249n.f241998a.contains(nVar3.f242002d));
                }
            }
        }
    }
}
