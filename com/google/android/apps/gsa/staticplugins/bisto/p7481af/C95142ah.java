package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.content.Intent;
import android.hardware.usb.UsbDevice;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.C89433a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.ah */
/* compiled from: PG */
final class C95142ah implements C89433a {

    /* renamed from: a */
    final /* synthetic */ String f266181a;

    /* renamed from: b */
    final /* synthetic */ Intent f266182b;

    /* renamed from: c */
    final /* synthetic */ C2164c f266183c;

    /* renamed from: d */
    final /* synthetic */ C95144aj f266184d;

    public C95142ah(C95144aj ajVar, String str, Intent intent, C2164c cVar) {
        this.f266184d = ajVar;
        this.f266181a = str;
        this.f266182b = intent;
        this.f266183c = cVar;
    }

    /* renamed from: a */
    public final void mo83342a(UsbDevice usbDevice) {
        C59071e eVar = C95144aj.f266188a;
        C58976aa aaVar = C58975e.f156826a;
        if ("bypass_oobe".equals(this.f266181a)) {
            this.f266184d.mo89071w(this.f266182b);
        } else {
            this.f266184d.mo89061B(this.f266182b, usbDevice, true);
        }
        this.f266183c.mo5437b(C118826c.f331422a);
    }

    /* renamed from: b */
    public final void mo83343b() {
        C59071e eVar = C95144aj.f266188a;
        C58976aa aaVar = C58975e.f156826a;
        this.f266183c.mo5437b(C118826c.f331422a);
    }

    /* renamed from: c */
    public final void mo83344c(C124539a aVar) {
        if ("bypass_oobe".equals(this.f266181a)) {
            this.f266184d.mo89071w(this.f266182b);
        } else {
            C59071e eVar = C95144aj.f266188a;
            C58976aa aaVar = C58975e.f156826a;
            this.f266184d.mo89066G(this.f266182b, aVar);
        }
        this.f266183c.mo5437b(C118826c.f331422a);
    }
}
