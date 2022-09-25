package com.google.android.apps.gsa.speech.setupwizard;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.speech.setupwizard.b */
/* compiled from: PG */
final class C92650b implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ HotwordSetupWizardActivity f258632a;

    public C92650b(HotwordSetupWizardActivity hotwordSetupWizardActivity) {
        this.f258632a = hotwordSetupWizardActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ((C92653e) this.f258632a.f258627c.mo27525b()).mo87423a();
        this.f258632a.setResult(2);
        this.f258632a.finish();
    }
}
