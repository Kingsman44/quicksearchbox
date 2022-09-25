package com.google.android.apps.gsa.assistant.settings.features.p5748p.p5750b;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.p.b.e */
/* compiled from: PG */
public final /* synthetic */ class C73258e implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C73260g f194100a;

    /* renamed from: b */
    public final /* synthetic */ View f194101b;

    /* renamed from: c */
    public final /* synthetic */ C0392m f194102c;

    /* renamed from: d */
    public final /* synthetic */ View f194103d;

    public /* synthetic */ C73258e(C73260g gVar, View view, C0392m mVar, View view2) {
        this.f194100a = gVar;
        this.f194101b = view;
        this.f194102c = mVar;
        this.f194103d = view2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C73260g gVar = this.f194100a;
        View view = this.f194101b;
        C0392m mVar = this.f194102c;
        View view2 = this.f194103d;
        view.setOnClickListener(new C73256c(gVar, mVar));
        view2.setOnClickListener(new C73257d(gVar, mVar));
    }
}
