package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.a */
/* compiled from: PG */
public final class C113115a {

    /* renamed from: a */
    private final C86124t f313400a;

    public C113115a(C86124t tVar) {
        this.f313400a = tVar;
    }

    /* renamed from: a */
    public final C58495hd mo99841a(String str, String str2) {
        C58490gz gzVar = new C58490gz(4);
        if (!str2.isEmpty()) {
            C112142i iVar = C112142i.APP_PACKAGE;
            C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
            hVar.mo99420b(str2, 1.0f);
            gzVar.mo55429h(iVar, (C112144k) hVar.build());
        }
        if (this.f313400a.mo79746e(C90063do.f249405cs) && !str.isEmpty()) {
            C112142i iVar2 = C112142i.DISPLAY_TEXT;
            C112141h hVar2 = (C112141h) C112144k.f311414b.createBuilder();
            hVar2.mo99420b(C58890d.m90988c(str), 1.0f);
            gzVar.mo55429h(iVar2, (C112144k) hVar2.build());
        }
        return gzVar.mo55427f(false);
    }
}
