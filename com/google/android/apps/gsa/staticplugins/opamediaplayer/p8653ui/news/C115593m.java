package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.app.Activity;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.m */
/* compiled from: PG */
final class C115593m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C115595o f320667a;

    public C115593m(C115595o oVar) {
        this.f320667a = oVar;
    }

    public final void onClick(View view) {
        C115595o oVar = this.f320667a;
        if (oVar.f63126Q.mo28316z() && oVar.f320671c.mo56113h()) {
            ((Activity) oVar.f320671c.mo56107c()).onBackPressed();
        }
    }
}
