package com.google.apps.tiktok.dataservice.local;

import com.google.common.util.concurrent.C60870cx;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.dataservice.local.z */
/* compiled from: PG */
public final /* synthetic */ class C46872z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46838am f122300a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f122301b;

    public /* synthetic */ C46872z(C46838am amVar, C60870cx cxVar) {
        this.f122300a = amVar;
        this.f122301b = cxVar;
    }

    public final void run() {
        C46838am amVar = this.f122300a;
        C60870cx cxVar = this.f122301b;
        Set set = amVar.f122262f;
        if (set != null) {
            set.remove(cxVar);
        }
    }
}
