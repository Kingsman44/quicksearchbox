package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;
import com.google.apps.tiktok.tracing.C47591co;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.q */
/* compiled from: PG */
public final /* synthetic */ class C135997q implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C135999s f370383a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f370384b;

    public /* synthetic */ C135997q(C135999s sVar, C0392m mVar) {
        this.f370383a = sVar;
        this.f370384b = mVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C135999s sVar = this.f370383a;
        C0392m mVar = this.f370384b;
        mVar.f1349a.f1110j.setOnClickListener(new C47591co(sVar.f370390e, "Clicked on delete data", new C135998r(sVar)));
        DialogVisualElements.m53173a(sVar.f370393h, mVar, new C136003t(sVar));
    }
}
