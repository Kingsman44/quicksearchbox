package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.settings.features.av.al;
import com.google.assistant.p3897e.p3929l.p3930a.C52704bj;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.aq */
/* compiled from: PG */
public final /* synthetic */ class C10113aq implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10115as f34421a;

    public /* synthetic */ C10113aq(C10115as asVar) {
        this.f34421a = asVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10115as asVar = this.f34421a;
        if (!z) {
            al.a(asVar.f34423a, 19, asVar.f34424b, (String) null);
            return;
        }
        int a = C52704bj.m86696a(asVar.mo18254b().f129034c);
        if (a != 0 && a == 4) {
            al.a(asVar.f34423a, 16, asVar.f34424b, (String) null);
        } else {
            al.a(asVar.f34423a, 17, asVar.f34424b, (String) null);
        }
    }
}
