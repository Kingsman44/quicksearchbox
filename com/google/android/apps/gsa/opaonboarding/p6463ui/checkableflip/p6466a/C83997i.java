package com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a;

import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.CheckableFlipComponent;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.a.i */
/* compiled from: PG */
public final /* synthetic */ class C83997i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C84002n f228823a;

    /* renamed from: b */
    public final /* synthetic */ C83999k f228824b;

    public /* synthetic */ C83997i(C84002n nVar, C83999k kVar) {
        this.f228823a = nVar;
        this.f228824b = kVar;
    }

    public final void onClick(View view) {
        C84002n nVar = this.f228823a;
        C83999k kVar = this.f228824b;
        Object tag = view.getTag();
        tag.getClass();
        int intValue = ((Integer) tag).intValue();
        C83992d dVar = (C83992d) nVar.f228831a.get(intValue);
        if (dVar.mo77443h()) {
            if (!nVar.f228833c || !dVar.mo77444i()) {
                dVar.mo77441f(!dVar.mo77444i());
            }
            boolean i = dVar.mo77444i();
            CheckableFlipComponent checkableFlipComponent = kVar.f228829d;
            nVar.mo77449c(i, kVar.f228827b, kVar.f228828c);
            checkableFlipComponent.mo77427a(i);
            dVar.mo77444i();
            if (dVar.mo77444i() && nVar.f228833c) {
                nVar.mo77448b(intValue);
            }
        }
    }
}
