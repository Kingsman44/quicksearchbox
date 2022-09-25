package com.google.android.apps.search.googleapp.compliance.p10147d;

import com.google.android.libraries.web.profile.p3439b.C44064c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;

/* renamed from: com.google.android.apps.search.googleapp.compliance.d.h */
/* compiled from: PG */
public final /* synthetic */ class C133632h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133637m f364019a;

    /* renamed from: b */
    public final /* synthetic */ C61363ae f364020b;

    /* renamed from: c */
    public final /* synthetic */ C44064c f364021c;

    /* renamed from: d */
    public final /* synthetic */ String f364022d;

    public /* synthetic */ C133632h(C133637m mVar, C61363ae aeVar, C44064c cVar, String str) {
        this.f364019a = mVar;
        this.f364020b = aeVar;
        this.f364021c = cVar;
        this.f364022d = str;
    }

    public final C60870cx apply(Object obj) {
        C133637m mVar = this.f364019a;
        C61363ae aeVar = this.f364020b;
        C44064c cVar = this.f364021c;
        String str = this.f364022d;
        aeVar.mo57932a(C61362ad.m93870b("User-Agent"), (String) obj);
        return C47633f.m84733g(cVar.mo47023a(str, aeVar)).mo51516i(new C133636l(mVar), mVar.f364030b);
    }
}
