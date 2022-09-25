package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import android.widget.CompoundButton;
import android.widget.Switch;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.n */
/* compiled from: PG */
public final /* synthetic */ class C9845n implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9849r f33855a;

    /* renamed from: b */
    public final /* synthetic */ Switch f33856b;

    /* renamed from: c */
    public final /* synthetic */ Switch f33857c;

    public /* synthetic */ C9845n(C9849r rVar, Switch switchR, Switch switchR2) {
        this.f33855a = rVar;
        this.f33856b = switchR;
        this.f33857c = switchR2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9849r rVar = this.f33855a;
        Switch switchR = this.f33856b;
        Switch switchR2 = this.f33857c;
        if (!z) {
            switchR.setChecked(false);
            switchR2.setChecked(false);
        }
        rVar.f33862b.mo18047g(z ? C9855w.ENABLED : C9855w.DISABLED);
    }
}
