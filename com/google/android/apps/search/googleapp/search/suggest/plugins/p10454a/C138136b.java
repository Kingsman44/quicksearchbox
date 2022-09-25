package com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a;

import android.support.p033v7.widget.C0632eu;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47715f;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.a.b */
/* compiled from: PG */
public final /* synthetic */ class C138136b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C138138d f375839a;

    /* renamed from: b */
    public final /* synthetic */ View f375840b;

    /* renamed from: c */
    public final /* synthetic */ View f375841c;

    public /* synthetic */ C138136b(C138138d dVar, View view, View view2) {
        this.f375839a = dVar;
        this.f375840b = view;
        this.f375841c = view2;
    }

    public final void onClick(View view) {
        C138138d dVar = this.f375839a;
        View view2 = this.f375840b;
        C0632eu euVar = new C0632eu(view2.getContext(), this.f375841c, 8388693);
        euVar.f2394a.add(R.string.googleapp_dismiss_in_context_control_suggestion);
        euVar.f2396c = new C47715f(dVar.f375843a, "Dismiss menu item click", new C138137c(view2));
        euVar.f2395b.mo1539f();
    }
}
