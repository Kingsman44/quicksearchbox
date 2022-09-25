package com.google.android.libraries.web.profile.p3439b;

import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.profile.p3431a.C44051c;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61531o;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.web.profile.b.c */
/* compiled from: PG */
public final class C44064c {

    /* renamed from: a */
    public final C61531o f114728a;

    /* renamed from: b */
    public final C44051c f114729b;

    /* renamed from: c */
    private final Executor f114730c;

    public C44064c(Profile profile, C61531o oVar, C44058f fVar, Executor executor) {
        this.f114728a = oVar;
        this.f114729b = fVar.mo47022b(profile);
        this.f114730c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo47023a(String str, C61363ae aeVar) {
        C60870cx a = this.f114729b.mo47012a(str);
        C44062a aVar = new C44062a(this, aeVar, str);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(aVar), this.f114730c);
        C44063b bVar = new C44063b(this, str);
        C60856cj.m92911t(h, C47810es.m84974n(bVar), this.f114730c);
        return h;
    }
}
