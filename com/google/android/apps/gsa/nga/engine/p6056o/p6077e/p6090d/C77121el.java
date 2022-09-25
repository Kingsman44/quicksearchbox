package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52308my;
import com.google.assistant.p3897e.p3921j.C52311na;
import com.google.assistant.p3897e.p3921j.C52312nb;
import com.google.assistant.p3897e.p3921j.C52321nk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.el */
/* compiled from: PG */
public final /* synthetic */ class C77121el implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212834a;

    /* renamed from: b */
    public final /* synthetic */ C80399l f212835b;

    /* renamed from: c */
    public final /* synthetic */ C80303ay f212836c;

    /* renamed from: d */
    public final /* synthetic */ Uri f212837d;

    /* renamed from: e */
    public final /* synthetic */ String f212838e;

    public /* synthetic */ C77121el(C77123en enVar, C80399l lVar, C80303ay ayVar, Uri uri, String str) {
        this.f212834a = enVar;
        this.f212835b = lVar;
        this.f212836c = ayVar;
        this.f212837d = uri;
        this.f212838e = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77123en enVar = this.f212834a;
        C80399l lVar = this.f212835b;
        C80303ay ayVar = this.f212836c;
        Uri uri = this.f212837d;
        String str = this.f212838e;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C77123en.m123789f();
        }
        C77131l lVar2 = (C77131l) optional.get();
        C74851z b = lVar2.mo72434b();
        af c = lVar2.mo72435c();
        C22871g gVar = enVar.f212853j;
        C52308my myVar = (C52308my) C52321nk.f137326j.createBuilder();
        myVar.copyOnWrite();
        ((C52321nk) myVar.instance).f137335h = true;
        C52311na naVar = (C52311na) C52312nb.f137312c.createBuilder();
        naVar.mo53829b(uri.toString());
        naVar.copyOnWrite();
        str.getClass();
        ((C52312nb) naVar.instance).f137315b = str;
        myVar.copyOnWrite();
        C52321nk nkVar = (C52321nk) myVar.instance;
        C52312nb nbVar = (C52312nb) naVar.build();
        nbVar.getClass();
        nkVar.f137329b = nbVar;
        nkVar.f137328a = 13;
        return enVar.mo72427c(lVar, ayVar, gVar.mo28209i(enVar.mo72429e(b, c, myVar), "[NGA] ShareFulfiller.createImageShareClientOp", C77090dh.f212756a));
    }
}
