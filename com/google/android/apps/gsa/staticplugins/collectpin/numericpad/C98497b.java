package com.google.android.apps.gsa.staticplugins.collectpin.numericpad;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.collectpin.C98493g;
import com.google.android.apps.gsa.staticplugins.collectpin.pinentry.PinEntryView;

/* renamed from: com.google.android.apps.gsa.staticplugins.collectpin.numericpad.b */
/* compiled from: PG */
public final /* synthetic */ class C98497b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NumericPinPad f275044a;

    public /* synthetic */ C98497b(NumericPinPad numericPinPad) {
        this.f275044a = numericPinPad;
    }

    public final void onClick(View view) {
        C98493g gVar = this.f275044a.f275042f;
        if (gVar != null) {
            gVar.f275033a.requestFocus();
            PinEntryView pinEntryView = gVar.f275033a;
            String b = pinEntryView.mo91146b();
            if (b.length() > 0) {
                pinEntryView.mo91147c(b.substring(0, b.length() - 1));
            }
            view.performHapticFeedback(1);
        }
    }
}
