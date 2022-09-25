package com.google.android.libraries.lens.view.filters;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2099c.C25940e;

/* renamed from: com.google.android.libraries.lens.view.filters.an */
/* compiled from: PG */
public final /* synthetic */ class C25907an implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C25909ap f70380a;

    public /* synthetic */ C25907an(C25909ap apVar) {
        this.f70380a = apVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C25909ap apVar = this.f70380a;
        String b = ((C25940e) obj).mo31104b();
        LvfButtonsView lvfButtonsView = apVar.f70395n;
        if (lvfButtonsView != null) {
            C26237y.m48444b(b, lvfButtonsView.mo17754z().f70409a.findViewById(R.id.lvf_filter_guidance));
        }
    }
}
