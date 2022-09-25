package com.google.android.material.textfield;

/* renamed from: com.google.android.material.textfield.an */
/* compiled from: PG */
final class C44933an implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f117393a;

    public C44933an(TextInputLayout textInputLayout) {
        this.f117393a = textInputLayout;
    }

    public final void run() {
        C44962y yVar = this.f117393a.f117308b;
        yVar.f117445d.performClick();
        yVar.f117445d.jumpDrawablesToCurrentState();
    }
}
