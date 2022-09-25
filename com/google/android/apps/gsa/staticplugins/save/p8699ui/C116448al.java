package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.al */
/* compiled from: PG */
public final /* synthetic */ class C116448al implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Snackbar f322902a;

    /* renamed from: b */
    public final /* synthetic */ TextView f322903b;

    public /* synthetic */ C116448al(Snackbar snackbar, TextView textView) {
        this.f322902a = snackbar;
        this.f322903b = textView;
    }

    public final void run() {
        Snackbar snackbar = this.f322902a;
        if (this.f322903b.getLineCount() > 1) {
            int dimensionPixelSize = snackbar.getResources().getDimensionPixelSize(R.dimen.multi_line_snackbar_padding);
            snackbar.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
    }
}
