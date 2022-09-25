package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.an */
/* compiled from: PG */
public final class C106334an {

    /* renamed from: a */
    public static final C59071e f296653a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.al.an");

    /* renamed from: a */
    public static C90456c m177102a(Throwable th) {
        C90523o oVar;
        if (th instanceof C90523o) {
            return (C90523o) th;
        }
        if (th instanceof C90455b) {
            oVar = new C90523o(th, ((C90455b) th).mo79843a());
        } else {
            oVar = new C90523o(th, (int) C89885b.INTERNAL_ERROR_SEE_STACK_TRACE_VALUE);
        }
        return oVar;
    }
}
