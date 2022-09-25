package com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice;

import android.telecom.Call;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.g */
/* compiled from: PG */
final class C79520g extends Call.Callback {

    /* renamed from: a */
    final /* synthetic */ WarmActionsInCallService f218227a;

    public C79520g(WarmActionsInCallService warmActionsInCallService) {
        this.f218227a = warmActionsInCallService;
    }

    public final void onStateChanged(Call call, int i) {
        int i2 = WarmActionsInCallService.f218216c;
        WarmActionsInCallService.m127600a(this.f218227a.f218218b, call, i);
    }
}
