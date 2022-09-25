package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52308my;
import com.google.assistant.p3897e.p3921j.C52321nk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.dw */
/* compiled from: PG */
public final /* synthetic */ class C77105dw implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212799a;

    /* renamed from: b */
    public final /* synthetic */ Uri f212800b;

    /* renamed from: c */
    public final /* synthetic */ C80399l f212801c;

    /* renamed from: d */
    public final /* synthetic */ C80303ay f212802d;

    public /* synthetic */ C77105dw(C77123en enVar, Uri uri, C80399l lVar, C80303ay ayVar) {
        this.f212799a = enVar;
        this.f212800b = uri;
        this.f212801c = lVar;
        this.f212802d = ayVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77123en enVar = this.f212799a;
        Uri uri = this.f212800b;
        C80399l lVar = this.f212801c;
        C80303ay ayVar = this.f212802d;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C77123en.m123789f();
        }
        C77131l lVar2 = (C77131l) optional.get();
        C74851z b = lVar2.mo72434b();
        af c = lVar2.mo72435c();
        String uri2 = uri.toString();
        C52308my myVar = (C52308my) C52321nk.f137326j.createBuilder();
        boolean i = enVar.mo72432i();
        myVar.copyOnWrite();
        ((C52321nk) myVar.instance).f137335h = !i;
        myVar.copyOnWrite();
        uri2.getClass();
        ((C52321nk) myVar.instance).f137334g = uri2;
        return enVar.f212853j.mo28210j(enVar.f212853j.mo28209i(enVar.mo72429e(b, c, myVar), "[NGA] ShareFulfiller.createTextSendClientOp", C77090dh.f212756a), "[NGA] ShareFulfiller.addClientOp", new C77104dv(enVar, uri, lVar, ayVar, lVar2));
    }
}
