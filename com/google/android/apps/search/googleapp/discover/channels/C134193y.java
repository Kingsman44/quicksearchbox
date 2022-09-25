package com.google.android.apps.search.googleapp.discover.channels;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.y */
/* compiled from: PG */
public final /* synthetic */ class C134193y implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ C134744f f365537a;

    /* renamed from: b */
    public final /* synthetic */ View f365538b;

    public /* synthetic */ C134193y(C134744f fVar, View view) {
        this.f365537a = fVar;
        this.f365538b = view;
    }

    public final void onGlobalLayout() {
        this.f365537a.mo111959m(this.f365538b.getHeight());
    }
}
