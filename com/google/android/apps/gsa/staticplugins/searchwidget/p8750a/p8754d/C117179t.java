package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.t */
/* compiled from: PG */
final class C117179t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C117182w f325279a;

    public C117179t(C117182w wVar) {
        this.f325279a = wVar;
    }

    public final void onClick(View view) {
        C22945j jVar = this.f325279a.f63126Q;
        int intValue = ((Integer) Objects.requireNonNull((Integer) view.getTag())).intValue();
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_THEME", intValue);
        jVar.mo28345s("THEME_CHANGED", "THEME_CHANGED", bundle);
    }
}
