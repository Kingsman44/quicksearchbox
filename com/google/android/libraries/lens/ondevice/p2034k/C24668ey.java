package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.lens.p4701g.C62312ch;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.lens.p4705i.p4706a.C62377h;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ey */
/* compiled from: PG */
public final class C24668ey {

    /* renamed from: a */
    public final OnDeviceEngineNativeApi f67482a;

    /* renamed from: b */
    public final C26243ad f67483b;

    /* renamed from: c */
    private final C24530h f67484c;

    public C24668ey(OnDeviceEngineNativeApi onDeviceEngineNativeApi, C24530h hVar, C26243ad adVar) {
        this.f67482a = onDeviceEngineNativeApi;
        this.f67484c = hVar;
        this.f67483b = adVar;
    }

    /* renamed from: a */
    public final C62377h mo29979a(Bitmap bitmap, C62312ch chVar) {
        C24653ej.m45755b(C24665ev.class, this.f67484c);
        C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
        oVar.copyOnWrite();
        C62353p pVar = (C62353p) oVar.instance;
        pVar.f168330d = 12;
        pVar.f168327a |= 1;
        oVar.copyOnWrite();
        C62353p pVar2 = (C62353p) oVar.instance;
        chVar.getClass();
        pVar2.f168329c = chVar;
        pVar2.f168328b = 11;
        try {
            C62355r c = this.f67482a.mo30012c((C62353p) oVar.build(), bitmap);
            C24653ej.m45756c(C24665ev.class, this.f67484c, c);
            if (c.f168334a == 14) {
                return (C62377h) c.f168335b;
            }
            return C62377h.f168391c;
        } catch (C62974ct e) {
            C24653ej.m45754a(C24665ev.class, this.f67484c);
            throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
        }
    }
}
