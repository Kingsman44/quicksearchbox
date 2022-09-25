package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52308my;
import com.google.assistant.p3897e.p3921j.C52316nf;
import com.google.assistant.p3897e.p3921j.C52321nk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.ed */
/* compiled from: PG */
public final /* synthetic */ class C77113ed implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212817a;

    /* renamed from: b */
    public final /* synthetic */ String f212818b;

    /* renamed from: c */
    public final /* synthetic */ C80399l f212819c;

    /* renamed from: d */
    public final /* synthetic */ C80303ay f212820d;

    public /* synthetic */ C77113ed(C77123en enVar, String str, C80399l lVar, C80303ay ayVar) {
        this.f212817a = enVar;
        this.f212818b = str;
        this.f212819c = lVar;
        this.f212820d = ayVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77123en enVar = this.f212817a;
        String str = this.f212818b;
        C80399l lVar = this.f212819c;
        C80303ay ayVar = this.f212820d;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C77123en.m123789f();
        }
        C77131l lVar2 = (C77131l) optional.get();
        C74851z b = lVar2.mo72434b();
        af c = lVar2.mo72435c();
        C22871g gVar = enVar.f212853j;
        C52308my myVar = (C52308my) C52321nk.f137326j.createBuilder();
        boolean i = enVar.mo72432i();
        myVar.copyOnWrite();
        ((C52321nk) myVar.instance).f137335h = !i;
        C52316nf nfVar = C52316nf.f137318a;
        myVar.copyOnWrite();
        C52321nk nkVar = (C52321nk) myVar.instance;
        nfVar.getClass();
        nkVar.f137329b = nfVar;
        nkVar.f137328a = 9;
        myVar.copyOnWrite();
        str.getClass();
        ((C52321nk) myVar.instance).f137334g = str;
        return enVar.f212853j.mo28210j(gVar.mo28209i(enVar.mo72429e(b, c, myVar), "[NGA] ShareFulfiller.createLocationShareClientOp", C77090dh.f212756a), "[NGA] ShareFulfiller.addClientOp", new C77096dn(enVar, str, lVar, ayVar, lVar2));
    }
}
