package com.google.android.apps.gsa.shared.p7129r;

import android.content.Context;
import android.content.DialogInterface;
import com.google.apps.tiktok.inject.C47231d;

/* renamed from: com.google.android.apps.gsa.shared.r.l */
/* compiled from: PG */
public final /* synthetic */ class C90470l implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C90474p f252725a;

    public /* synthetic */ C90470l(C90474p pVar) {
        this.f252725a = pVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C90474p pVar = this.f252725a;
        Context context = pVar.f252730b;
        if (context instanceof C90471m) {
            ((C90471m) context).mo84220a();
        } else if ((context instanceof C47231d) && (((C47231d) context).mo17754z() instanceof C90471m)) {
            C90471m mVar = (C90471m) ((C47231d) pVar.f252730b).mo17754z();
            mVar.getClass();
            mVar.mo84220a();
        }
    }
}
