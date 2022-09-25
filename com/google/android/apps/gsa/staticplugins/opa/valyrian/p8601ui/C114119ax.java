package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ax */
/* compiled from: PG */
public final class C114119ax extends C0658ft {

    /* renamed from: a */
    private final C114132bj f316316a;

    /* renamed from: b */
    private final C114106ak f316317b;

    /* renamed from: c */
    private final int f316318c;

    public C114119ax(C114132bj bjVar, C114106ak akVar, int i) {
        this.f316318c = i;
        this.f316316a = bjVar;
        this.f316317b = akVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C114132bj bjVar = this.f316316a;
        if (bjVar != null && bjVar.mo101172s() == this.f316318c) {
            this.f316317b.mo101149a();
        }
    }
}
