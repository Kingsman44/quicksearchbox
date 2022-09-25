package com.google.android.apps.search.googleapp.incognito.p10329g;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.C46459k;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.x */
/* compiled from: PG */
public final /* synthetic */ class C136335x implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C136337z f371203a;

    /* renamed from: b */
    public final /* synthetic */ Snackbar f371204b;

    public /* synthetic */ C136335x(C136337z zVar, Snackbar snackbar) {
        this.f371203a = zVar;
        this.f371204b = snackbar;
    }

    public final void onClick(View view) {
        C136337z zVar = this.f371203a;
        this.f371204b.mo48340e(3);
        C46459k.m82829b(zVar.f371213h.mo112855b(4), "Failed to start Incognito session.", new Object[0]);
        zVar.f371214i.mo112861a();
    }
}
