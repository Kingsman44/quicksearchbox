package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.g */
/* compiled from: PG */
public final /* synthetic */ class C110109g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C110111i f306807a;

    /* renamed from: b */
    public final /* synthetic */ Intent f306808b;

    public /* synthetic */ C110109g(C110111i iVar, Intent intent) {
        this.f306807a = iVar;
        this.f306808b = intent;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C110111i iVar = this.f306807a;
        Intent intent = this.f306808b;
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
            iVar.f306814d.f307686b = true;
            return iVar.mo98385b(false, false);
        }
        if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(intent.getAction())) {
            iVar.f306814d.f307686b = false;
            iVar.mo98388e(false);
        }
        return C118826c.f331423b;
    }
}
