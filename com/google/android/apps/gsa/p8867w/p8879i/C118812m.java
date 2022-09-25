package com.google.android.apps.gsa.p8867w.p8879i;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.search.googleapp.promomanager.p10371a.C136897a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.w.i.m */
/* compiled from: PG */
final class C118812m implements C136897a {

    /* renamed from: a */
    private final Executor f331384a;

    /* renamed from: b */
    private final C86338r f331385b;

    /* renamed from: c */
    private final C42876ab f331386c;

    public C118812m(Executor executor, C86338r rVar, C42876ab abVar) {
        this.f331384a = executor;
        this.f331385b = rVar;
        this.f331386c = abVar;
    }

    /* renamed from: a */
    public final C60870cx mo103976a() {
        C60870cx d = this.f331386c.mo46042d();
        C118810k kVar = C118810k.f331382a;
        return C60922j.m93044g(d, C47810es.m84963c(kVar), this.f331384a);
    }

    /* renamed from: b */
    public final C60870cx mo103977b() {
        return C60856cj.m92900i(Boolean.valueOf(this.f331385b.getBoolean("search_widget_present", false)));
    }

    /* renamed from: c */
    public final C60870cx mo103978c(long j) {
        return this.f331386c.mo46039a(new C118811l(j), this.f331384a);
    }

    /* renamed from: d */
    public final C60870cx mo103979d(boolean z) {
        C86337q b = this.f331385b.mo80076b();
        b.mo80067b("search_widget_present", z);
        b.apply();
        return C60866ct.f164955a;
    }
}
