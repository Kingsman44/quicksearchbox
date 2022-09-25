package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52308my;
import com.google.assistant.p3897e.p3921j.C52318nh;
import com.google.assistant.p3897e.p3921j.C52321nk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.du */
/* compiled from: PG */
public final /* synthetic */ class C77103du implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212791a;

    /* renamed from: b */
    public final /* synthetic */ C80399l f212792b;

    /* renamed from: c */
    public final /* synthetic */ C80303ay f212793c;

    public /* synthetic */ C77103du(C77123en enVar, C80399l lVar, C80303ay ayVar) {
        this.f212791a = enVar;
        this.f212792b = lVar;
        this.f212793c = ayVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77123en enVar = this.f212791a;
        C80399l lVar = this.f212792b;
        C80303ay ayVar = this.f212793c;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C77123en.m123789f();
        }
        C77131l lVar2 = (C77131l) optional.get();
        C74851z b = lVar2.mo72434b();
        af c = lVar2.mo72435c();
        C22871g gVar = enVar.f212853j;
        C52308my myVar = (C52308my) C52321nk.f137326j.createBuilder();
        C52318nh nhVar = C52318nh.f137320b;
        myVar.copyOnWrite();
        C52321nk nkVar = (C52321nk) myVar.instance;
        nhVar.getClass();
        nkVar.f137329b = nhVar;
        nkVar.f137328a = 10;
        return enVar.mo72427c(lVar, ayVar, gVar.mo28209i(enVar.mo72429e(b, c, myVar), "[NGA] ShareFulfiller.createScreenshtoShareClientOp", C77090dh.f212756a));
    }
}
