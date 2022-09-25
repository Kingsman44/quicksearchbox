package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62306cb;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ef */
/* compiled from: PG */
public final class C24649ef extends C68247h {

    /* renamed from: a */
    private final C68283d f67391a;

    /* renamed from: c */
    private final C68283d f67392c;

    /* renamed from: d */
    private final C68283d f67393d;

    public C24649ef(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C24649ef.class), aVar);
        this.f67391a = C68236af.m98549d(dVar);
        this.f67392c = C68236af.m98549d(dVar2);
        this.f67393d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62306cb cbVar;
        List list = (List) obj;
        OnDeviceEngineNativeApi onDeviceEngineNativeApi = (OnDeviceEngineNativeApi) list.get(0);
        C24530h hVar = (C24530h) list.get(1);
        Bitmap bitmap = (Bitmap) list.get(2);
        C24653ej.m45755b(C24645eb.class, hVar);
        try {
            C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
            oVar.copyOnWrite();
            C62353p pVar = (C62353p) oVar.instance;
            pVar.f168330d = 13;
            pVar.f168327a = 1 | pVar.f168327a;
            C62355r c = onDeviceEngineNativeApi.mo30012c((C62353p) oVar.build(), bitmap);
            C24653ej.m45756c(C24645eb.class, hVar, C62355r.f168332e);
            if (c.f168334a == 15) {
                cbVar = (C62306cb) c.f168335b;
            } else {
                cbVar = C62306cb.f168197b;
            }
            return C60856cj.m92900i(cbVar);
        } catch (C62974ct e) {
            C24653ej.m45754a(C24645eb.class, hVar);
            throw new IllegalArgumentException("Unable to send request due to proto parsing error", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67391a.mo60297gq(), this.f67392c.mo60297gq(), this.f67393d.mo60297gq());
    }
}
