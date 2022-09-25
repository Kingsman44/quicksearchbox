package com.google.android.apps.gsa.assistant.settings.features.p5748p.p5750b;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.p.b.w */
/* compiled from: PG */
public final /* synthetic */ class C73268w implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C73270y f194134a;

    /* renamed from: b */
    public final /* synthetic */ View f194135b;

    /* renamed from: c */
    public final /* synthetic */ C0392m f194136c;

    /* renamed from: d */
    public final /* synthetic */ View f194137d;

    public /* synthetic */ C73268w(C73270y yVar, View view, C0392m mVar, View view2) {
        this.f194134a = yVar;
        this.f194135b = view;
        this.f194136c = mVar;
        this.f194137d = view2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C73270y yVar = this.f194134a;
        View view = this.f194135b;
        C0392m mVar = this.f194136c;
        View view2 = this.f194137d;
        view.setOnClickListener(new C73266u(yVar, mVar));
        view2.setOnClickListener(new C73267v(yVar, mVar));
    }
}
