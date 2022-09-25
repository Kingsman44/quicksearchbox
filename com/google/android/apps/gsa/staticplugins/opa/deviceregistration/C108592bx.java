package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.view.View;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bx */
/* compiled from: PG */
public final /* synthetic */ class C108592bx implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108604cd f302070a;

    public /* synthetic */ C108592bx(C108604cd cdVar) {
        this.f302070a = cdVar;
    }

    public final void onClick(View view) {
        C108604cd cdVar = this.f302070a;
        CountDownLatch countDownLatch = (CountDownLatch) cdVar.f302103b.f301999g.get();
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        cdVar.mo77318iT().mo77313b();
    }
}
