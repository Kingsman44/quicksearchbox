package com.google.apps.tiktok.account.api.controller;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.account.api.controller.by */
/* compiled from: PG */
public final /* synthetic */ class C46014by implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46015bz f120862a;

    public /* synthetic */ C46014by(C46015bz bzVar) {
        this.f120862a = bzVar;
    }

    public final void run() {
        C46015bz bzVar = this.f120862a;
        for (int i = 0; i < bzVar.f120864b; i++) {
            ((C60870cx) bzVar.f120863a.get(i)).cancel(true);
        }
    }
}
