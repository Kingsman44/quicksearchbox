package com.google.android.libraries.assistant.auto.tng.p944e;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.libraries.componentview.services.application.C20557ak;
import com.google.android.libraries.componentview.services.application.C20579bf;
import com.google.android.libraries.componentview.services.application.LogData;
import com.google.android.libraries.search.logging.p3034a.C38769r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.assistant.auto.tng.e.f */
/* compiled from: PG */
final class C13349f extends C20557ak {

    /* renamed from: a */
    public static final C59071e f41074a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.e.f");

    /* renamed from: b */
    public final Context f41075b;

    /* renamed from: c */
    public final C86034c f41076c;

    /* renamed from: com.google.android.libraries.assistant.auto.tng.e.f$a */
    /* compiled from: PG */
    public interface C13350a {
        /* renamed from: nU */
        C38769r mo21038nU();
    }

    public C13349f(C20579bf bfVar, C60887da daVar, Context context, C86034c cVar) {
        super(bfVar, daVar);
        this.f41075b = context;
        this.f41076c = cVar;
    }

    /* renamed from: a */
    public final void mo21037a(LogData logData) {
        C13346c cVar = new C13346c(this, logData);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(cVar), this.f57736e);
        C13348e eVar = new C13348e(logData);
        C60856cj.m92911t(n, C47810es.m84974n(eVar), this.f57736e);
    }
}
