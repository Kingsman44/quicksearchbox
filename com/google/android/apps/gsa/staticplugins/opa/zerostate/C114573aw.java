package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114864dg;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53287ih;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.aw */
/* compiled from: PG */
final class C114573aw implements C114864dg {

    /* renamed from: a */
    final /* synthetic */ C114574ax f317709a;

    public C114573aw(C114574ax axVar) {
        this.f317709a = axVar;
    }

    /* renamed from: a */
    public final void mo101408a(C89062r rVar) {
        if (!rVar.mo83040a()) {
            this.f317709a.f317710a.mo101415e(false);
            this.f317709a.f317710a.mo101426p();
            return;
        }
        C114711cl clVar = this.f317709a.f317710a.f317713B;
        if (clVar != null) {
            C28293k a = clVar.mo33782a();
            C114742l lVar = this.f317709a.f317710a.f317746f;
            C28292j jVar = new C28292j(61152);
            jVar.mo33795i(22);
            C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
            lVar.mo101570e(e, a);
            lVar.mo101571f(e, 22);
        }
        C114575ay ayVar = this.f317709a.f317710a;
        if (!ayVar.f317759s) {
            ayVar.mo101436z(C53270hr.REFRESH, (C53287ih) null);
        }
        if (this.f317709a.f317710a.f317749i.mo79746e(C90080ee.f249815n)) {
            this.f317709a.f317710a.f317755o.mo101589a();
        }
        this.f317709a.f317710a.mo101425o();
    }
}
