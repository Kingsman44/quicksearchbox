package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.os.Bundle;
import android.widget.RadioGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.ae */
/* compiled from: PG */
final class C117104ae implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ C117105af f325108a;

    public C117104ae(C117105af afVar) {
        this.f325108a = afVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C117105af afVar = this.f325108a;
        if (!afVar.f325111c) {
            if (i == afVar.f325109a.getId()) {
                this.f325108a.f63126Q.mo28345s("CLICK", "LOGO_FULL", new Bundle());
            } else if (i == this.f325108a.f325110b.getId()) {
                this.f325108a.f63126Q.mo28345s("CLICK", "SUPER_G", new Bundle());
            }
        }
    }
}
