package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114864dg;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53287ih;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.o */
/* compiled from: PG */
final class C114899o implements C114864dg {

    /* renamed from: a */
    final /* synthetic */ C114900p f318784a;

    public C114899o(C114900p pVar) {
        this.f318784a = pVar;
    }

    /* renamed from: a */
    public final void mo101408a(C89062r rVar) {
        if (!rVar.mo83040a()) {
            this.f318784a.f318785a.mo8794l(false, false);
            this.f318784a.f318786b.mo101756A(false);
            return;
        }
        C114966q qVar = this.f318784a.f318786b;
        C114711cl clVar = qVar.f319061z;
        if (clVar != null) {
            C28293k a = clVar.mo33782a();
            C114742l lVar = qVar.f319051p;
            C28292j jVar = new C28292j(61152);
            jVar.mo33795i(22);
            C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
            lVar.mo101570e(e, a);
            lVar.mo101571f(e, 22);
        }
        C114966q qVar2 = this.f318784a.f318786b;
        qVar2.f319057v = true;
        if (!qVar2.f319056u) {
            qVar2.f319056u = true;
            qVar2.f319042g.mo101530f(C53270hr.REFRESH, (C53287ih) null);
        }
    }
}
