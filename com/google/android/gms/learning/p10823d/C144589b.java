package com.google.android.gms.learning.p10823d;

import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29704n;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.android.libraries.micore.learning.p2258a.C29707q;
import com.google.android.libraries.micore.learning.p2258a.C29708r;
import com.google.common.base.C58835az;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.learning.d.b */
/* compiled from: PG */
public final /* synthetic */ class C144589b implements C144587ac {

    /* renamed from: a */
    public final /* synthetic */ C144588ad f391256a;

    /* renamed from: b */
    public final /* synthetic */ int f391257b;

    public /* synthetic */ C144589b(C144588ad adVar, int i) {
        this.f391256a = adVar;
        this.f391257b = i;
    }

    /* renamed from: a */
    public final C58835az mo120064a(C29708r rVar) {
        boolean z;
        C144588ad adVar = this.f391256a;
        int i = this.f391257b;
        C29707q qVar = (C29707q) rVar.toBuilder();
        C29706p d = C144588ad.m235081d(qVar, i);
        if (d == null) {
            return new C58835az(rVar, (Object) null);
        }
        boolean z2 = true;
        if (!adVar.f391250f.mo119969aC(adVar.f391249e.getPackageName())) {
            adVar.f391251g.mo120056h(1168);
            z = true;
        } else {
            z = false;
        }
        long millis = TimeUnit.SECONDS.toMillis(adVar.f391250f.mo120046z());
        long a = adVar.f391252h.mo34859a();
        C63042fg fgVar = d.f80456g;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        long c = C62953e.m95478c(fgVar);
        if (millis <= 0 || a - c <= millis) {
            z2 = z;
        } else {
            adVar.f391251g.mo120056h(1167);
        }
        if (d.f80450a == 13 && ((C29697g) d.f80451b).f80434c.isEmpty()) {
            adVar.f391251g.mo120056h(1147);
        } else if (!z2) {
            C29704n nVar = (C29704n) d.toBuilder();
            C63042fg i2 = C62953e.m95484i(adVar.f391252h.mo34859a());
            nVar.copyOnWrite();
            i2.getClass();
            ((C29706p) nVar.instance).f80457h = i2;
            C29706p pVar = (C29706p) nVar.build();
            qVar.mo34848a(pVar);
            return new C58835az((C29708r) qVar.build(), pVar);
        }
        return new C58835az((C29708r) qVar.build(), (Object) null);
    }
}
