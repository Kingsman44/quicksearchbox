package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.os.Bundle;
import android.widget.CompoundButton;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97349a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97350b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.b */
/* compiled from: PG */
public final /* synthetic */ class C97373b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C97376e f271946a;

    public /* synthetic */ C97373b(C97376e eVar) {
        this.f271946a = eVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C97349a aVar = this.f271946a.f271950b.f271969a.f271891e;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isChecked", Boolean.valueOf(z).booleanValue());
        ((C97350b) aVar).f271880a.mo28345s("onIncognitoInterstitialDoNotShowClicked_boolean", "ParticleDiscEventsDispatcher", bundle);
    }
}
