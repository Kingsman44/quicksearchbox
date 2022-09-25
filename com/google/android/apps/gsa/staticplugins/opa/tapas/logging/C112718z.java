package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54828au;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54913dy;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54914e;
import com.google.p4500cm.p4518d.C58192i;
import com.google.protobuf.C62961ch;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.z */
/* compiled from: PG */
public final /* synthetic */ class C112718z implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112665ac f312460a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f312461b;

    /* renamed from: c */
    public final /* synthetic */ C59743a f312462c;

    public /* synthetic */ C112718z(C112665ac acVar, C60870cx cxVar, C59743a aVar) {
        this.f312460a = acVar;
        this.f312461b = cxVar;
        this.f312462c = aVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112665ac acVar = this.f312460a;
        C60870cx cxVar = this.f312461b;
        C59743a aVar = this.f312462c;
        C54914e eVar = (C54914e) C90877ak.m148474h(cxVar);
        C143657j d = ((C143658k) acVar.f312276d.mo27525b()).mo118999d((C58192i) obj);
        d.mo118996e(acVar.f312278f.mo79659F());
        C54828au auVar = eVar.f144347f;
        if (auVar == null) {
            auVar = C54828au.f143868g;
        }
        auVar.f143872c.size();
        C54913dy dyVar = eVar.f144348g;
        if (dyVar == null) {
            dyVar = C54913dy.f144335d;
        }
        dyVar.f144339c.size();
        String str = eVar.f144343b;
        C62961ch chVar = eVar.f144344c;
        C112665ac.f312274b.mo105240i("tapasMLLogger_log_".concat(String.valueOf(aVar.name())));
        d.mo118992a();
    }
}
