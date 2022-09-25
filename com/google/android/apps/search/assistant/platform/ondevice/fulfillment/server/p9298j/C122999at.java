package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.at */
/* compiled from: PG */
public final class C122999at {

    /* renamed from: a */
    public static final C59071e f340537a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.at");

    /* renamed from: b */
    public final C122997ar f340538b;

    /* renamed from: c */
    private final C122998as f340539c;

    /* renamed from: d */
    private final Executor f340540d;

    /* renamed from: e */
    private final Executor f340541e;

    /* renamed from: f */
    private C123051cr f340542f;

    /* renamed from: g */
    private C123051cr f340543g;

    public C122999at(C122998as asVar, C122997ar arVar, Executor executor) {
        this.f340539c = asVar;
        this.f340538b = arVar;
        this.f340540d = executor;
        this.f340541e = executor;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo105816b() {
        if (this.f340543g != null) {
            return C60856cj.m92899h(new C122872ec("LazyInstanceProvider", "Instance is already destroyed"));
        }
        C123051cr crVar = this.f340542f;
        if (crVar != null) {
            return C60856cj.m92901j(crVar.f340614a);
        }
        C122998as asVar = this.f340539c;
        Objects.requireNonNull(asVar);
        C122995ap apVar = new C122995ap(asVar);
        C123051cr crVar2 = new C123051cr(C60856cj.m92905n(C47810es.m84965e(apVar), this.f340540d));
        this.f340542f = crVar2;
        C123047cn.m202382b(C60856cj.m92901j(crVar2.f340614a), new C122996aq(this), C60826bg.f164896a);
        return C60856cj.m92901j(crVar2.f340614a);
    }

    /* renamed from: c */
    public final synchronized void mo105817c() {
        this.f340542f = null;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo105815a() {
        C60870cx cxVar;
        if (this.f340543g == null) {
            C123051cr crVar = this.f340542f;
            if (crVar != null) {
                cxVar = C47633f.m84733g(C60856cj.m92901j(crVar.f340614a)).mo51515h(C122992am.f340532a, C60826bg.f164896a).mo51513e(Throwable.class, C122993an.f340533a, C60826bg.f164896a).mo51516i(new C122994ao(this), this.f340541e);
            } else {
                cxVar = C60866ct.f164955a;
            }
            this.f340543g = new C123051cr(cxVar);
        }
        return C60856cj.m92901j(this.f340543g.f340614a);
    }
}
