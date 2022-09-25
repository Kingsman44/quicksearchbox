package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123051cr;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.e */
/* compiled from: PG */
final class C122805e {

    /* renamed from: a */
    public static final C59071e f340165a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.e");

    /* renamed from: b */
    public C122799ad f340166b;

    /* renamed from: c */
    public C123051cr f340167c = new C123051cr(C60866ct.f164955a);

    /* renamed from: d */
    private final C47632e f340168d = new C47632e();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo105747a(C122799ad adVar) {
        C122825y yVar = new C122825y(adVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(yVar), adVar.f340150b);
        C122804d dVar = new C122804d(this, adVar);
        return C60922j.m93045h(m, C47810es.m84966f(dVar), C60826bg.f164896a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C60870cx mo105748b() {
        mo105749c(this.f340166b);
        this.f340166b = null;
        return C60856cj.m92901j(this.f340167c.f340614a);
    }

    /* renamed from: c */
    public final synchronized void mo105749c(C122799ad adVar) {
        if (adVar != null) {
            this.f340167c = new C123051cr(this.f340168d.mo51512b(new C122803c(adVar), C60826bg.f164896a));
        }
    }
}
