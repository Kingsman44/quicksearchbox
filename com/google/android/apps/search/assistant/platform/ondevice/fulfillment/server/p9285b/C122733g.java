package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9285b;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.C122828c;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.b.g */
/* compiled from: PG */
public final class C122733g implements C46675m {

    /* renamed from: a */
    public static final C59071e f340047a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.b.g");

    /* renamed from: b */
    private final C122828c f340048b;

    public C122733g(C122828c cVar) {
        this.f340048b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        if (!oVar.mo50698b().contains(C46667e.TEXT)) {
            return C60856cj.m92900i(C46675m.f121943k);
        }
        C122727a a = new C122727a(0, new StringBuilder()).mo105730a("NLUFF");
        return C47633f.m84733g(this.f340048b.mo105755b()).mo51516i(new C122730d(a), C60826bg.f164896a).mo51515h(new C122731e(a), C60826bg.f164896a).mo51513e(Throwable.class, C122732f.f340046a, C60826bg.f164896a);
    }
}
