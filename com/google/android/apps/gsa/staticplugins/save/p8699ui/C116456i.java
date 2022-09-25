package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.content.DialogInterface;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.i */
/* compiled from: PG */
public final /* synthetic */ class C116456i implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f322911a;

    public /* synthetic */ C116456i(TextView textView) {
        this.f322911a = textView;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        TextView textView = this.f322911a;
        Interpolator interpolator = Interstitial.f322858a;
        C89949q.m146521e(C28285c.m52882i(textView, 5, (Integer) null), false);
    }
}
