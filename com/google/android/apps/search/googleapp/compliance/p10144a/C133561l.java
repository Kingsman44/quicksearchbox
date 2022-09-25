package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.l */
/* compiled from: PG */
public final /* synthetic */ class C133561l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133567r f363886a;

    /* renamed from: b */
    public final /* synthetic */ C133569t f363887b;

    public /* synthetic */ C133561l(C133567r rVar, C133569t tVar) {
        this.f363886a = rVar;
        this.f363887b = tVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C133567r rVar = this.f363886a;
        C133569t tVar = this.f363887b;
        if (!((C46108a) obj).mo50210b().f121165j.equals("pseudonymous")) {
            return C60866ct.f164955a;
        }
        String f = rVar.f363901f.mo111250f();
        if (f != null) {
            C47633f c = rVar.f363898c.mo111303c();
            C44058f fVar = rVar.f363904i;
            Objects.requireNonNull(fVar);
            return c.mo51515h(new C133563n(fVar), rVar.f363897b).mo51516i(new C133564o(rVar, f), rVar.f363897b);
        }
        if (!tVar.equals(C133569t.BACKGROUND)) {
            cxVar = C60856cj.m92900i(true);
        } else {
            cxVar = C47633f.m84733g(rVar.f363899d.mo46042d()).mo51515h(new C133558i(rVar), rVar.f363897b);
        }
        return C47633f.m84733g(cxVar).mo51516i(new C133565p(rVar, tVar), rVar.f363897b);
    }
}
