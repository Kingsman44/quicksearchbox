package com.google.android.apps.search.googleapp.compliance.p10147d;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44044g;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44046i;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44050m;
import com.google.android.libraries.web.profile.p3439b.C44065d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.compliance.d.i */
/* compiled from: PG */
public final /* synthetic */ class C133633i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133637m f364023a;

    public /* synthetic */ C133633i(C133637m mVar) {
        this.f364023a = mVar;
    }

    public final C60870cx apply(Object obj) {
        C133637m mVar = this.f364023a;
        C44046i iVar = (C44046i) obj;
        C44050m a = C44050m.m77773a(iVar.f114688b);
        if (a == null) {
            a = C44050m.UNSPECIFIED_VERIFY_COOKIES_RESULT;
        }
        C44044g a2 = C44044g.m77768a(iVar.f114689c);
        if (a2 == null) {
            a2 = C44044g.UNSPECIFIED_REFRESH_COOKIES_RESULT;
        }
        if (C44050m.VALID.equals(a) || C44050m.VALID_NON_GOOGLE_ACCOUNT_TYPE.equals(a) || C44044g.SUCCESS.equals(a2)) {
            mVar.f364034f.mo19974a(C37182a.f98137gy);
            C47633f c = mVar.mo111303c();
            C44065d dVar = mVar.f364031c;
            Objects.requireNonNull(dVar);
            return c.mo51515h(new C133627c(dVar), mVar.f364030b).mo51516i(new C133630f(mVar), mVar.f364030b).mo51516i(C133631g.f364018a, mVar.f364030b);
        }
        Object[] objArr = new Object[2];
        C44050m a3 = C44050m.m77773a(iVar.f114688b);
        if (a3 == null) {
            a3 = C44050m.UNSPECIFIED_VERIFY_COOKIES_RESULT;
        }
        objArr[0] = a3.name();
        C44044g a4 = C44044g.m77768a(iVar.f114689c);
        if (a4 == null) {
            a4 = C44044g.UNSPECIFIED_REFRESH_COOKIES_RESULT;
        }
        objArr[1] = a4.name();
        return C47633f.m84733g(C60856cj.m92899h(new C133625a(String.format("Unable to validate cookies.\nVerifyCookiesResult = %s\nRefreshCookiesResult = %s", objArr))));
    }
}
