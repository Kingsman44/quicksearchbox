package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cn */
/* compiled from: PG */
public final /* synthetic */ class C35585cn implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C35591ct f93411a;

    /* renamed from: b */
    public final /* synthetic */ Intent f93412b;

    public /* synthetic */ C35585cn(C35591ct ctVar, Intent intent) {
        this.f93411a = ctVar;
        this.f93412b = intent;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C35591ct ctVar = this.f93411a;
        ctVar.f93421c.bindService(this.f93412b, new C35589cr(cVar), 1);
        return "bindServiceCallbackFuture, binding the InCallService";
    }
}
