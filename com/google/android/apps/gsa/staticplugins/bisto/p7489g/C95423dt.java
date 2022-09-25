package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.dt */
/* compiled from: PG */
public final /* synthetic */ class C95423dt implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95425dv f266983a;

    /* renamed from: b */
    public final /* synthetic */ int f266984b;

    /* renamed from: c */
    public final /* synthetic */ int f266985c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f266986d;

    public /* synthetic */ C95423dt(C95425dv dvVar, int i, int i2, byte[] bArr) {
        this.f266983a = dvVar;
        this.f266984b = i;
        this.f266985c = i2;
        this.f266986d = bArr;
    }

    public final void run() {
        C95425dv dvVar = this.f266983a;
        int i = this.f266984b;
        int i2 = this.f266985c;
        byte[] bArr = this.f266986d;
        if (!dvVar.f266997h.mo83530d()) {
            C59104x b = C95425dv.f266990b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
            ((C59052c) ((C59052c) b).mo56372aa(15051)).mo56393w("Not connected anymore trying to log message group=%d type=%d", i, i2);
            return;
        }
        C95352bc bcVar = (C95352bc) dvVar.f266995f.get();
        int i3 = 5;
        if (bcVar != null) {
            String str = dvVar.f266998i;
            if (i == 126) {
                i3 = 127;
            } else if (i != 127) {
                switch (i) {
                    case 0:
                        i3 = 1;
                        break;
                    case 1:
                        i3 = 2;
                        break;
                    case 2:
                        i3 = 3;
                        break;
                    case 3:
                        i3 = 4;
                        break;
                    case 4:
                        break;
                    case 5:
                        i3 = 6;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 8;
                        break;
                    case 8:
                        i3 = 9;
                        break;
                    case 9:
                        i3 = 10;
                        break;
                    case 10:
                        i3 = 11;
                        break;
                    case 11:
                        i3 = 12;
                        break;
                    case 12:
                        i3 = 13;
                        break;
                    case 13:
                        i3 = 14;
                        break;
                    case 14:
                        i3 = 15;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
            } else {
                i3 = 128;
            }
            bcVar.mo89254E(str, i3, i2, bArr);
        } else if (i == 5) {
            C60856cj.m92911t(((C89492cd) dvVar.f266992c.mo27525b()).mo83408n(dvVar.f266998i), new C95424du(dvVar, i2, bArr), dvVar.f266999j);
        } else {
            C59104x d = C95425dv.f266990b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
            ((C59052c) ((C59052c) d).mo56372aa(15050)).mo56393w("No callback registered G=%d T=%d", i, i2);
        }
    }
}
