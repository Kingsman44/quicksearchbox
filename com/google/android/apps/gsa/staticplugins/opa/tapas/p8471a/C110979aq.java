package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.aq */
/* compiled from: PG */
public final class C110979aq {

    /* renamed from: a */
    private final C68214a f309158a;

    /* renamed from: b */
    private final C86124t f309159b;

    public C110979aq(C68214a aVar, C86124t tVar) {
        this.f309158a = aVar;
        this.f309159b = tVar;
    }

    /* renamed from: a */
    public final C58495hd mo99003a(String str, String str2, C113502n nVar) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C112142i.DISPLAY_TEXT, ((C113188cs) this.f309158a.mo27525b()).mo99902c(C48580an.APP_ACTION, str, str2));
        nVar.mo100250p().ifPresent(new C110977ao(gzVar, str2, nVar));
        if (this.f309159b.mo79746e(C90063do.f249337bd)) {
            nVar.mo99957q().ifPresent(new C110978ap(gzVar));
        }
        return gzVar.mo55427f(false);
    }
}
