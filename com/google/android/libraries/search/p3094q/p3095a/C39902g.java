package com.google.android.libraries.search.p3094q.p3095a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44044g;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44046i;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44050m;
import com.google.android.libraries.web.profile.p3439b.C44065d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.q.a.g */
/* compiled from: PG */
public final /* synthetic */ class C39902g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39904i f104912a;

    public /* synthetic */ C39902g(C39904i iVar) {
        this.f104912a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C39904i iVar = this.f104912a;
        C44046i iVar2 = (C44046i) obj;
        C44050m a = C44050m.m77773a(iVar2.f114688b);
        if (a == null) {
            a = C44050m.UNSPECIFIED_VERIFY_COOKIES_RESULT;
        }
        C44044g a2 = C44044g.m77768a(iVar2.f114689c);
        if (a2 == null) {
            a2 = C44044g.UNSPECIFIED_REFRESH_COOKIES_RESULT;
        }
        if (C44050m.VALID.equals(a) || C44050m.VALID_NON_GOOGLE_ACCOUNT_TYPE.equals(a) || C44044g.SUCCESS.equals(a2)) {
            C61363ae aeVar = new C61363ae();
            aeVar.mo57933b("GET");
            aeVar.mo57932a(C61362ad.m93870b("Cache-Control"), "no-cache, no-store");
            Uri.Builder buildUpon = Uri.parse("https://www.google.com").buildUpon();
            if (!TextUtils.isEmpty(iVar.f104918e)) {
                buildUpon = Uri.parse(iVar.f104918e).buildUpon();
            }
            buildUpon.path("preferences");
            buildUpon.appendQueryParameter("output", "base64");
            String uri = buildUpon.build().toString();
            C47633f g = C47633f.m84733g(iVar.f104917d.mo47042b(C43271v.WEB_VIEW));
            C44065d dVar = iVar.f104916c;
            Objects.requireNonNull(dVar);
            return g.mo51515h(new C39898c(dVar), iVar.f104915b).mo51516i(new C39899d(uri, aeVar), iVar.f104915b).mo51516i(C39900e.f104910a, iVar.f104915b);
        }
        Object[] objArr = new Object[2];
        C44050m a3 = C44050m.m77773a(iVar2.f114688b);
        if (a3 == null) {
            a3 = C44050m.UNSPECIFIED_VERIFY_COOKIES_RESULT;
        }
        objArr[0] = a3.name();
        C44044g a4 = C44044g.m77768a(iVar2.f114689c);
        if (a4 == null) {
            a4 = C44044g.UNSPECIFIED_REFRESH_COOKIES_RESULT;
        }
        objArr[1] = a4.name();
        return C47633f.m84733g(C60856cj.m92899h(new C39896a(String.format("Unable to validate cookies.\nVerifyCookiesResult = %s\nRefreshCookiesResult = %s", objArr))));
    }
}
