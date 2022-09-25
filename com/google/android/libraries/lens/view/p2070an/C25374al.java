package com.google.android.libraries.lens.view.p2070an;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.an.al */
/* compiled from: PG */
public final /* synthetic */ class C25374al implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f69098a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f69099b;

    public /* synthetic */ C25374al(C60870cx cxVar, C60870cx cxVar2) {
        this.f69098a = cxVar;
        this.f69099b = cxVar2;
    }

    public final void run() {
        C60870cx cxVar = this.f69098a;
        C60870cx cxVar2 = this.f69099b;
        C58974d dVar = C25383au.f69112a;
        cxVar.cancel(false);
        cxVar2.cancel(false);
    }
}
