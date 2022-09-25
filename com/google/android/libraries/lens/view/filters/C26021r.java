package com.google.android.libraries.lens.view.filters;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2099c.C25940e;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.p2085ax.p2086a.C25593a;
import com.google.android.libraries.lens.view.p2085ax.p2086a.C25595c;
import com.google.android.libraries.lens.view.p2085ax.p2086a.C25596d;
import com.google.android.libraries.lens.view.p2085ax.p2086a.C25598f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.filters.r */
/* compiled from: PG */
public final /* synthetic */ class C26021r implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26022s f70710a;

    public /* synthetic */ C26021r(C26022s sVar) {
        this.f70710a = sVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26022s sVar = this.f70710a;
        C25940e eVar = (C25940e) obj;
        if (sVar.f70720i.mo31462g(C26239a.PARTIAL_TRANSLATE_GUIDANCE_ENABLED) && (!sVar.f70720i.mo31462g(C26239a.SELECTION_STATE_ENABLED) || sVar.f70717f)) {
            C26237y.m48444b(eVar.mo31103a(), sVar.f70712a.requireView().findViewById(R.id.frozen_filter_guidance));
        }
        if (sVar.f70723l) {
            String a = ((Boolean) sVar.f70716e.mo3842a()).booleanValue() ? eVar.mo31103a() : eVar.mo31104b();
            if (C58837ba.m90859h(a)) {
                sVar.mo31229j();
                return;
            }
            C25598f fVar = sVar.f70722k;
            if (!C58837ba.m90859h(a) && !a.equals(fVar.f69644g)) {
                int i = fVar.f69640c.mo30349e().f68754b;
                if (i < 5 || fVar.f69638a.get()) {
                    fVar.f69644g = a;
                    C60870cx cxVar = fVar.f69645h;
                    if (cxVar != null) {
                        cxVar.cancel(true);
                    }
                    C47633f h = C47633f.m84733g(fVar.f69641d.mo19399b(new C25593a(fVar))).mo51516i(new C25595c(fVar, a), fVar.f69641d).mo51515h(new C25596d(fVar, i), fVar.f69641d);
                    fVar.f69645h = h;
                    C46459k.m82829b(h, "Filter audio guidance not available", new Object[0]);
                }
            }
        }
    }
}
