package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.view.View;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135767j;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135769l;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135770m;
import com.google.common.p4552o.C60425pt;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ao */
/* compiled from: PG */
public final /* synthetic */ class C136058ao implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C136059ap f370541a;

    /* renamed from: b */
    public final /* synthetic */ View f370542b;

    public /* synthetic */ C136058ao(C136059ap apVar, View view) {
        this.f370541a = apVar;
        this.f370542b = view;
    }

    public final void accept(Object obj) {
        C135769l lVar;
        C136059ap apVar = this.f370541a;
        View view = this.f370542b;
        C135767j jVar = (C135767j) obj;
        if (jVar.f369808b && (lVar = jVar.f369811e) != null && lVar.isAdded() && C135770m.m220278a(lVar.mo17754z().f369823g)) {
            apVar.f370545b = apVar.mo112723c(C60425pt.BOTTOM_SHEET_PEEK_OPEN, view);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
