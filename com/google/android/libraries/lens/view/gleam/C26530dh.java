package com.google.android.libraries.lens.view.gleam;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25498ad;

/* renamed from: com.google.android.libraries.lens.view.gleam.dh */
/* compiled from: PG */
public final /* synthetic */ class C26530dh implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26540dr f72320a;

    public /* synthetic */ C26530dh(C26540dr drVar) {
        this.f72320a = drVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26540dr drVar = this.f72320a;
        C25498ad adVar = (C25498ad) obj;
        if ((adVar != C25498ad.NONE || !drVar.f72343j.mo31462g(C26239a.ENABLE_MATH_GLEAMS_IN_EDUCATION_FILTER) || !((C25497ac) drVar.f72354u.mo3842a()).mo30525b() || !drVar.f72340g.f70642a.f70649b.equals(C25980d.EDUCATION) || !drVar.f72338e.f72283F.mo56113h()) && adVar != C25498ad.REGION) {
            drVar.f72338e.mo31804x();
        }
    }
}
