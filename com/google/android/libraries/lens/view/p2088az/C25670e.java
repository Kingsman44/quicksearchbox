package com.google.android.libraries.lens.view.p2088az;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.libraries.lens.view.p2056af.C25070bo;
import com.google.android.libraries.search.udcdataservice.C41385a;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41409h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.az.e */
/* compiled from: PG */
public final class C25670e implements C25667b {

    /* renamed from: a */
    public final C25070bo f69807a;

    /* renamed from: b */
    private final C41409h f69808b;

    /* renamed from: c */
    private final Executor f69809c;

    /* renamed from: d */
    private C60870cx f69810d;

    public C25670e(C41409h hVar, C25070bo boVar, Executor executor) {
        this.f69808b = hVar;
        this.f69807a = boVar;
        this.f69809c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo30779a() {
        if (this.f69810d == null) {
            this.f69810d = this.f69808b.mo43949b(new C41387c[]{C41387c.WEB_HISTORY}, C41385a.LENS);
            this.f69807a.mo30251a(C118575h.PLUGIN_LENS, C118569b.LENS_UDC_SETTINGS_CHECK_ATTEMPT_COUNT, 1);
            C60870cx cxVar = this.f69810d;
            C25669d dVar = new C25669d(this);
            C60856cj.m92911t(cxVar, C47810es.m84974n(dVar), this.f69809c);
        }
        C60870cx cxVar2 = this.f69810d;
        C25668c cVar = C25668c.f69805a;
        return C60922j.m93044g(cxVar2, C47810es.m84963c(cVar), this.f69809c);
    }
}
