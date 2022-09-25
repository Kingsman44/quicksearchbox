package com.google.android.libraries.lens.view.p2065ai;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.ai.p */
/* compiled from: PG */
public final /* synthetic */ class C25178p implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C25183u f68580a;

    public /* synthetic */ C25178p(C25183u uVar) {
        this.f68580a = uVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C25183u uVar = this.f68580a;
        C25175m mVar = uVar.f68585a;
        if (mVar.isAdded()) {
            C47393f.m84236g(new C25173k(), mVar);
        }
        C0392m mVar2 = uVar.f68595k;
        mVar2.getClass();
        mVar2.dismiss();
    }
}
