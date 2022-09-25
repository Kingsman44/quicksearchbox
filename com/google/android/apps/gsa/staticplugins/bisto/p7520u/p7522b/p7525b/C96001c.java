package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b;

import android.hardware.usb.UsbDevice;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95364bo;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95371bv;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.c */
/* compiled from: PG */
public final /* synthetic */ class C96001c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96002d f268780a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f268781b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f268782c;

    public /* synthetic */ C96001c(C96002d dVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f268780a = dVar;
        this.f268781b = cxVar;
        this.f268782c = cxVar2;
    }

    public final void run() {
        C96002d dVar = this.f268780a;
        C60870cx cxVar = this.f268781b;
        C60870cx cxVar2 = this.f268782c;
        C58485gu guVar = (C58485gu) C60856cj.m92910s(cxVar);
        boolean booleanValue = ((Boolean) C60856cj.m92910s(cxVar2)).booleanValue();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            UsbDevice usbDevice = (UsbDevice) guVar.get(i);
            String c = C124521b.m203980c(usbDevice);
            C95371bv c2 = dVar.f268784a.mo89299c(usbDevice, c);
            if (!dVar.f268786c.containsKey(c)) {
                dVar.mo89874a(c2);
            }
        }
        if (booleanValue) {
            C95364bo b = dVar.f268784a.mo89298b();
            if (!dVar.f268786c.containsKey("wired")) {
                dVar.mo89874a(b);
            }
        }
    }
}
