package com.google.android.libraries.search.p3025k;

import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.k.m */
/* compiled from: PG */
public final class C38558m {

    /* renamed from: a */
    private final C46175b f101935a;

    /* renamed from: b */
    private final C46723bg f101936b;

    /* renamed from: c */
    private final Executor f101937c;

    public C38558m(C46175b bVar, C46723bg bgVar, Executor executor) {
        this.f101935a = bVar;
        this.f101936b = bgVar;
        this.f101937c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo41485a() {
        C60870cx c = this.f101936b.mo50750c(this.f101935a.mo50245b(), C46788de.FEW_SECONDS);
        C38556k kVar = C38556k.f101933a;
        return C60922j.m93044g(c, C47810es.m84963c(kVar), this.f101937c);
    }

    /* renamed from: b */
    public final C60870cx mo41486b() {
        C47633f g = C47633f.m84733g(mo41485a());
        C46175b bVar = this.f101935a;
        Objects.requireNonNull(bVar);
        return g.mo51516i(new C38554i(bVar), this.f101937c).mo51513e(C46167as.class, C38555j.f101932a, this.f101937c);
    }
}
