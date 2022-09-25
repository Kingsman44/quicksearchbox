package com.google.android.apps.gsa.opaonboarding;

import android.app.AlertDialog;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.opaonboarding.az */
/* compiled from: PG */
public final class C83892az {

    /* renamed from: a */
    private final AlertDialog f228528a;

    public C83892az(AlertDialog alertDialog) {
        this.f228528a = alertDialog;
    }

    /* renamed from: a */
    public final void mo77277a() {
        this.f228528a.show();
        TextView textView = (TextView) this.f228528a.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
