package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.C122828c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.C123141a;
import com.google.android.libraries.search.assistant.p2716p.p2720b.p2721a.C34923a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.w */
/* compiled from: PG */
public final class C122823w implements C122828c {

    /* renamed from: a */
    public static final C59071e f340198a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.w");

    /* renamed from: b */
    public final C122800ae f340199b;

    /* renamed from: c */
    public final C122805e f340200c;

    /* renamed from: d */
    public final boolean f340201d;

    /* renamed from: e */
    public final Executor f340202e;

    /* renamed from: f */
    public C122799ad f340203f = null;

    /* renamed from: g */
    public final C34923a f340204g;

    /* renamed from: h */
    public final C123141a f340205h;

    public C122823w(C34923a aVar, C122800ae aeVar, C122805e eVar, C123141a aVar2, boolean z, Executor executor) {
        this.f340204g = aVar;
        this.f340199b = aeVar;
        this.f340200c = eVar;
        this.f340205h = aVar2;
        this.f340201d = z;
        this.f340202e = new C60904dr(executor);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo105754a(String str) {
        C60870cx cxVar;
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (this.f340205h.mo105894a().f339500f) {
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = this.f340204g.mo39636a();
        }
        C122818r rVar = new C122818r(this, forLanguageTag);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(rVar), this.f340202e);
        C122820t tVar = new C122820t(this);
        return C60922j.m93045h(h, C47810es.m84966f(tVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo105755b() {
        C122819s sVar = new C122819s(this);
        return C60856cj.m92905n(C47810es.m84965e(sVar), this.f340202e);
    }

    /* renamed from: c */
    public final C60870cx mo105756c() {
        return this.f340200c.mo105748b();
    }
}
