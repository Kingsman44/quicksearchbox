package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.lens.p4701g.C62328cx;
import com.google.lens.p4701g.C62333db;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.ondevice.k.gd */
/* compiled from: PG */
public final class C24701gd {

    /* renamed from: a */
    public final OnDeviceEngineNativeApi f67549a;

    /* renamed from: b */
    public final C26243ad f67550b;

    /* renamed from: c */
    private final C24530h f67551c;

    public C24701gd(OnDeviceEngineNativeApi onDeviceEngineNativeApi, C24530h hVar, C26243ad adVar) {
        this.f67549a = onDeviceEngineNativeApi;
        this.f67551c = hVar;
        this.f67550b = adVar;
    }

    /* renamed from: a */
    public final C62333db mo29985a(Bitmap bitmap, C62328cx cxVar) {
        C24653ej.m45755b(C24698ga.class, this.f67551c);
        try {
            C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
            oVar.copyOnWrite();
            C62353p pVar = (C62353p) oVar.instance;
            pVar.f168330d = 6;
            pVar.f168327a |= 1;
            oVar.copyOnWrite();
            C62353p pVar2 = (C62353p) oVar.instance;
            cxVar.getClass();
            pVar2.f168329c = cxVar;
            pVar2.f168328b = 10;
            C62355r c = this.f67549a.mo30012c((C62353p) oVar.build(), bitmap);
            C24653ej.m45756c(C24698ga.class, this.f67551c, c);
            if (c.f168334a == 8) {
                return (C62333db) c.f168335b;
            }
            return C62333db.f168274e;
        } catch (C62974ct e) {
            C24653ej.m45754a(C24698ga.class, this.f67551c);
            throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
        }
    }
}
