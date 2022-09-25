package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.i */
/* compiled from: PG */
public final /* synthetic */ class C110379i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C110381k f307628a;

    public /* synthetic */ C110379i(C110381k kVar) {
        this.f307628a = kVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C110381k kVar = this.f307628a;
        if (z) {
            String F = ((C86054o) kVar.f307633b.mo27525b()).mo79659F();
            if (F != null) {
                C110346be beVar = (C110346be) kVar.f307634c.mo27525b();
                kVar.f307635d.mo65090b(C110346be.m183748a(compoundButton.getContext(), F), new C110376f(kVar));
            }
            kVar.f307640i.setChecked(false);
        }
    }
}
