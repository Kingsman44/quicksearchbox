package com.google.android.apps.gsa.staticplugins.immersiveactions;

import com.google.android.apps.gsa.shared.util.p7187ui.C91113l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.ad */
/* compiled from: PG */
public final /* synthetic */ class C102397ad implements C91113l {

    /* renamed from: a */
    public final /* synthetic */ C102401ah f285791a;

    public /* synthetic */ C102397ad(C102401ah ahVar) {
        this.f285791a = ahVar;
    }

    /* renamed from: a */
    public final void mo85382a(Integer num) {
        C102401ah ahVar = this.f285791a;
        if (num != null) {
            ahVar.setBackgroundColor(num.intValue());
        } else {
            ahVar.setBackgroundColor(ahVar.getResources().getColor(R.color.immersive_actions_relationship_header));
        }
    }
}
