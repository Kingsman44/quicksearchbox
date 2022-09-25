package com.google.android.apps.gsa.staticplugins.collectpin.numericpad;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.collectpin.C98493g;
import com.google.android.apps.gsa.staticplugins.collectpin.pinentry.PinEntryView;

/* renamed from: com.google.android.apps.gsa.staticplugins.collectpin.numericpad.a */
/* compiled from: PG */
public final /* synthetic */ class C98496a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NumericPinPad f275043a;

    public /* synthetic */ C98496a(NumericPinPad numericPinPad) {
        this.f275043a = numericPinPad;
    }

    public final void onClick(View view) {
        NumericPinPad numericPinPad = this.f275043a;
        if (numericPinPad.f275042f != null) {
            Object tag = view.getTag(view.getId());
            tag.getClass();
            int intValue = ((Integer) tag).intValue();
            C98493g gVar = numericPinPad.f275042f;
            gVar.getClass();
            gVar.f275033a.requestFocus();
            PinEntryView pinEntryView = gVar.f275033a;
            pinEntryView.mo91147c(String.valueOf(pinEntryView.mo91146b()).concat(String.valueOf(String.valueOf(intValue))));
            view.performHapticFeedback(1);
        }
    }
}
