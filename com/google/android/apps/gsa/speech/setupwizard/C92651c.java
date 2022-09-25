package com.google.android.apps.gsa.speech.setupwizard;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.setupwizard.c */
/* compiled from: PG */
final class C92651c implements C91096f {

    /* renamed from: a */
    final /* synthetic */ HotwordSetupWizardActivity f258633a;

    public C92651c(HotwordSetupWizardActivity hotwordSetupWizardActivity) {
        this.f258633a = hotwordSetupWizardActivity;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C58976aa aaVar = C58975e.f156826a;
        this.f258633a.setResult(i);
        this.f258633a.finish();
        return true;
    }
}
