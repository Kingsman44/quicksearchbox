package android.support.p033v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;

/* renamed from: android.support.v7.app.at */
/* compiled from: PG */
public class C0359at extends C0260w {
    public C0359at() {
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new C0358as(getContext(), getTheme());
    }

    public final void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof C0358as) {
            C0358as asVar = (C0358as) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            asVar.mo1201e();
            return;
        }
        super.setupDialog(dialog, i);
    }

    public C0359at(int i) {
        super(i);
    }
}
