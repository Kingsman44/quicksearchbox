package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4985f.p5030q.C65191ey;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.i */
/* compiled from: PG */
public final /* synthetic */ class C122966i implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C123081m f340507a;

    /* renamed from: b */
    public final /* synthetic */ C65191ey f340508b;

    public /* synthetic */ C122966i(C123081m mVar, C65191ey eyVar) {
        this.f340507a = mVar;
        this.f340508b = eyVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C123081m mVar = this.f340507a;
        C65191ey eyVar = this.f340508b;
        C47633f i = C47633f.m84733g(mVar.f340653c.mo105754a(eyVar.f176432g)).mo51516i(C122873f.f340337a, mVar.f340652b).mo51516i(new C122882g(mVar, eyVar), mVar.f340652b);
        C123080l lVar = new C123080l(mVar, cVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(lVar), mVar.f340652b);
        return "initializeStream";
    }
}
