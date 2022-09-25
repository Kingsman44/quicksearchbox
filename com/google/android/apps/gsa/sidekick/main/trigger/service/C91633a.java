package com.google.android.apps.gsa.sidekick.main.trigger.service;

import android.content.Context;
import android.content.Intent;
import androidx.p122k.p123a.C2303a;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.sidekick.main.trigger.service.a */
/* compiled from: PG */
class C91633a extends C2303a {

    /* renamed from: c */
    private volatile boolean f255579c = false;

    /* renamed from: d */
    private final Object f255580d = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86012b(Context context) {
        if (!this.f255579c) {
            synchronized (this.f255580d) {
                if (!this.f255579c) {
                    ((C91636d) C68323g.m98667a(context)).mo86015rE((TriggerConditionReceiver) this);
                    this.f255579c = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo86012b(context);
    }
}
