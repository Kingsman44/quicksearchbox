package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p033v7.app.C0359at;

/* renamed from: com.google.android.material.bottomsheet.q */
/* compiled from: PG */
public class C44566q extends C0359at {
    public C44566q() {
    }

    /* renamed from: a */
    private final void mo18360a() {
        Dialog dialog = getDialog();
        if (dialog instanceof C44565p) {
            boolean z = ((C44565p) dialog).mo47541h().f115859B;
        }
    }

    public void dismiss() {
        mo18360a();
        super.dismiss();
    }

    public final void dismissAllowingStateLoss() {
        mo18360a();
        super.dismissAllowingStateLoss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new C44565p(getContext(), getTheme());
    }

    public C44566q(int i) {
        super(i);
    }
}
