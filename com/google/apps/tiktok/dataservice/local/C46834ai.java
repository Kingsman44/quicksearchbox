package com.google.apps.tiktok.dataservice.local;

import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.dataservice.local.ai */
/* compiled from: PG */
public final /* synthetic */ class C46834ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46838am f122252a;

    public /* synthetic */ C46834ai(C46838am amVar) {
        this.f122252a = amVar;
    }

    public final void run() {
        C46838am amVar = this.f122252a;
        amVar.f122263g = 3;
        C0978h hVar = new C0978h((C0979i) amVar.f122262f);
        while (hVar.hasNext()) {
            ((C60870cx) hVar.next()).cancel(false);
        }
        amVar.f122262f = null;
    }
}
