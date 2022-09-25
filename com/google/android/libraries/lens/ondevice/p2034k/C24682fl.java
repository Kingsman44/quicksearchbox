package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.lens.p4701g.C62320cp;
import com.google.lens.p4701g.C62324ct;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.ondevice.k.fl */
/* compiled from: PG */
public final class C24682fl {

    /* renamed from: a */
    public final OnDeviceEngineNativeApi f67510a;

    /* renamed from: b */
    public final C26243ad f67511b;

    /* renamed from: c */
    private final C24530h f67512c;

    public C24682fl(OnDeviceEngineNativeApi onDeviceEngineNativeApi, C24530h hVar, C26243ad adVar) {
        this.f67510a = onDeviceEngineNativeApi;
        this.f67512c = hVar;
        this.f67511b = adVar;
    }

    /* renamed from: a */
    public final C62324ct mo29981a(Bitmap bitmap, C62320cp cpVar) {
        try {
            C24653ej.m45755b(C24679fi.class, this.f67512c);
            C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
            oVar.copyOnWrite();
            C62353p pVar = (C62353p) oVar.instance;
            pVar.f168330d = 7;
            pVar.f168327a |= 1;
            oVar.copyOnWrite();
            C62353p pVar2 = (C62353p) oVar.instance;
            cpVar.getClass();
            pVar2.f168329c = cpVar;
            pVar2.f168328b = 9;
            C62355r c = this.f67510a.mo30012c((C62353p) oVar.build(), bitmap);
            C24653ej.m45756c(C24679fi.class, this.f67512c, c);
            if (c.f168334a == 9) {
                return (C62324ct) c.f168335b;
            }
            return C62324ct.f168237e;
        } catch (C62974ct e) {
            C24653ej.m45754a(C24679fi.class, this.f67512c);
            throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
        }
    }
}
