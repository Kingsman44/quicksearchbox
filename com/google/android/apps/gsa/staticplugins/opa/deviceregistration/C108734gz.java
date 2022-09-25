package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.shared.util.C90772bp;
import java.nio.charset.Charset;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.gz */
/* compiled from: PG */
public final /* synthetic */ class C108734gz implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108739hd f302380a;

    public /* synthetic */ C108734gz(C108739hd hdVar) {
        this.f302380a = hdVar;
    }

    public final void onClick(View view) {
        C108739hd hdVar = this.f302380a;
        C108733gy gyVar = hdVar.f302384b;
        C108738hc hcVar = new C108738hc(hdVar);
        Context context = gyVar.f302379b;
        Charset charset = C90772bp.f253863a;
        gyVar.f302378a.mo65090b(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"), hcVar);
    }
}
