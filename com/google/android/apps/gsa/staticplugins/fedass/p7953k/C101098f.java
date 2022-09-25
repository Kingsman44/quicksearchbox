package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import android.text.TextUtils;
import com.google.android.apps.gsa.p6482q.p6483a.C84233f;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.f */
/* compiled from: PG */
public final class C101098f {

    /* renamed from: a */
    public static final C59071e f282291a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.k.f");

    /* renamed from: b */
    public final C68214a f282292b;

    /* renamed from: c */
    public final C84233f f282293c;

    /* renamed from: d */
    private final C86124t f282294d;

    /* renamed from: e */
    private final C100719ab f282295e;

    public C101098f(C86124t tVar, C68214a aVar, C100719ab abVar, C84233f fVar) {
        this.f282294d = tVar;
        this.f282292b = aVar;
        this.f282295e = abVar;
        this.f282293c = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo92137a(boolean z) {
        C59071e eVar = f282291a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(19767)).mo56386p("registerTraining()");
        if (!this.f282294d.mo79746e(C89978aq.f246602a)) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(19770)).mo56386p("No training registered: ekho flag not enabled.");
            return C60866ct.f164955a;
        } else if (!this.f282294d.mo79746e(C89978aq.f246617p)) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(19769)).mo56386p("No training registered: training flag not enabled.");
            return C60866ct.f164955a;
        } else {
            String F = ((C86054o) this.f282292b.mo27525b()).mo79659F();
            if (TextUtils.isEmpty(F)) {
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(19768)).mo56386p("No training registered: empty account.");
                return C60866ct.f164955a;
            }
            C100742h e = C100742h.m166944c(this.f282295e.mo92021e(F)).mo92035e(new C101095c(this, F, z));
            e.mo92038i(C101096d.f282288a);
            return e.f281631a;
        }
    }

    /* renamed from: b */
    public final C60870cx mo92138b() {
        ((C59052c) ((C59052c) f282291a.mo56224b()).mo56372aa(19772)).mo56386p("unRegisterTraining()");
        C100742h c = C100742h.m166944c(this.f282293c.mo77708e());
        c.mo92038i(C101076a.f282242a);
        return c.f281631a;
    }
}
