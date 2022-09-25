package com.google.android.apps.gsa.assistant.settings.features.p5748p.p5750b;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.p.b.k */
/* compiled from: PG */
public final /* synthetic */ class C73261k implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C73265o f194113a;

    /* renamed from: b */
    public final /* synthetic */ View f194114b;

    /* renamed from: c */
    public final /* synthetic */ C0392m f194115c;

    /* renamed from: d */
    public final /* synthetic */ View f194116d;

    public /* synthetic */ C73261k(C73265o oVar, View view, C0392m mVar, View view2) {
        this.f194113a = oVar;
        this.f194114b = view;
        this.f194115c = mVar;
        this.f194116d = view2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C73265o oVar = this.f194113a;
        View view = this.f194114b;
        C0392m mVar = this.f194115c;
        View view2 = this.f194116d;
        view.setOnClickListener(new C73263m(oVar, mVar));
        view2.setOnClickListener(new C73264n(oVar, mVar));
    }
}
