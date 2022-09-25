package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.C44520p;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.bv */
/* compiled from: PG */
final class C10246bv implements C44520p {

    /* renamed from: a */
    final /* synthetic */ View f34740a;

    public C10246bv(View view) {
        this.f34740a = view;
    }

    /* renamed from: a */
    public final void mo18107a(AppBarLayout appBarLayout, int i) {
        if (appBarLayout.mo47400j() + i <= 0) {
            this.f34740a.setVisibility(0);
        } else {
            this.f34740a.setVisibility(8);
        }
    }
}
