package com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip;

import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83996h;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83999k;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C84002n;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.a */
/* compiled from: PG */
public final /* synthetic */ class C83988a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CheckableFlipComponent f228809a;

    public /* synthetic */ C83988a(CheckableFlipComponent checkableFlipComponent) {
        this.f228809a = checkableFlipComponent;
    }

    public final void onClick(View view) {
        CheckableFlipComponent checkableFlipComponent = this.f228809a;
        if (!checkableFlipComponent.f228788b || !checkableFlipComponent.f228792f) {
            checkableFlipComponent.f228789c.mo77452a();
            boolean z = !checkableFlipComponent.f228788b;
            checkableFlipComponent.f228788b = z;
            C83996h hVar = checkableFlipComponent.f228793g;
            if (hVar != null) {
                C84002n nVar = hVar.f228821a;
                C83999k kVar = hVar.f228822b;
                Object tag = checkableFlipComponent.getTag();
                tag.getClass();
                int intValue = ((Integer) tag).intValue();
                C83992d dVar = (C83992d) nVar.f228831a.get(intValue);
                if (dVar.mo77443h()) {
                    dVar.mo77441f(z);
                    CheckableFlipComponent checkableFlipComponent2 = kVar.f228829d;
                    nVar.mo77449c(z, kVar.f228827b, kVar.f228828c);
                    checkableFlipComponent2.mo77427a(z);
                    if (z && nVar.f228833c) {
                        nVar.mo77448b(intValue);
                    }
                }
            }
        }
    }
}
