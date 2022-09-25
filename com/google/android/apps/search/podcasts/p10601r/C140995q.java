package com.google.android.apps.search.podcasts.p10601r;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.podcasts.r.q */
/* compiled from: PG */
final class C140995q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C140997s f382788a;

    /* renamed from: b */
    final /* synthetic */ View.OnClickListener f382789b;

    public C140995q(C140997s sVar, View.OnClickListener onClickListener) {
        this.f382788a = sVar;
        this.f382789b = onClickListener;
    }

    public final void onClick(View view) {
        this.f382788a.f382792a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        this.f382789b.onClick(view);
    }
}
