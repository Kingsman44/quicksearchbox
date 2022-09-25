package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9290f;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.C122828c;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1512a.C18254al;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.C70148al;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.f.e */
/* compiled from: PG */
public final class C122878e {

    /* renamed from: a */
    private final C122828c f340342a;

    public C122878e(C122828c cVar) {
        this.f340342a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo105772a() {
        String str = (String) C18254al.f51819a.mo61711a(C70148al.m102135m());
        if (!C58837ba.m90859h(str)) {
            return C47633f.m84733g(this.f340342a.mo105754a(str)).mo51516i(C122876c.f340340a, C60826bg.f164896a).mo51515h(C122877d.f340341a, C60826bg.f164896a);
        }
        throw new IllegalStateException("locale empty");
    }
}
