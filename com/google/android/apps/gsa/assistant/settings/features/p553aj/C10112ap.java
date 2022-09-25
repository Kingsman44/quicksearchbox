package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.ap */
/* compiled from: PG */
public final /* synthetic */ class C10112ap implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10115as f34420a;

    public /* synthetic */ C10112ap(C10115as asVar) {
        this.f34420a = asVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10115as asVar = this.f34420a;
        int i = 4;
        if (z && compoundButton == asVar.f34429g) {
            asVar.f34425c.K(asVar.f34424b, 4, C10115as.m24941a());
        } else if (z && compoundButton == asVar.f34430h) {
            asVar.f34425c.K(asVar.f34424b, 2, C10115as.m24941a());
        } else if (compoundButton == asVar.f34431i.q()) {
            dn dnVar = asVar.f34425c;
            String str = asVar.f34424b;
            if (z) {
                i = 3;
            }
            dnVar.K(str, i, C10115as.m24941a());
        }
        asVar.mo18255c();
    }
}
