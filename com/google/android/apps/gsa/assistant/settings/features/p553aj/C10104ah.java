package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.ah */
/* compiled from: PG */
public final /* synthetic */ class C10104ah implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10107ak f34400a;

    public /* synthetic */ C10104ah(C10107ak akVar) {
        this.f34400a = akVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10107ak akVar = this.f34400a;
        int i = 4;
        if (z && compoundButton == akVar.f34410h) {
            akVar.f34405c.L(akVar.f34404b, 4, C10107ak.m24927a());
        } else if (z && compoundButton == akVar.f34411i) {
            akVar.f34405c.L(akVar.f34404b, 2, C10107ak.m24927a());
        } else if (compoundButton == akVar.f34412j.q()) {
            dn dnVar = akVar.f34405c;
            String str = akVar.f34404b;
            if (z) {
                i = 3;
            }
            dnVar.L(str, i, C10107ak.m24927a());
        }
        akVar.mo18248d();
    }
}
