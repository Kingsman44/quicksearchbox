package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.c */
/* compiled from: PG */
public final class C131646c implements C21851cg {

    /* renamed from: a */
    public static final C59071e f359698a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.c");

    /* renamed from: b */
    public final Context f359699b;

    /* renamed from: c */
    private final C60887da f359700c;

    /* renamed from: d */
    private final C46128f f359701d;

    /* renamed from: e */
    private final boolean f359702e;

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.c$a */
    /* compiled from: PG */
    public interface C131647a {
        /* renamed from: fM */
        C38469m mo110240fM();
    }

    public C131646c(Context context, C60887da daVar, C46128f fVar, boolean z) {
        this.f359699b = context;
        this.f359700c = daVar;
        this.f359701d = fVar;
        this.f359702e = z;
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (account != null && this.f359702e && akVar.equals(C65753ak.CROSS_DEVICE_TIMER)) {
            C60870cx c = this.f359701d.mo50216c(account.name);
            C131600a aVar = new C131600a(this);
            C60870cx h = C60922j.m93045h(c, C47810es.m84966f(aVar), this.f359700c);
            C131602b bVar = new C131602b();
            C60856cj.m92911t(h, C47810es.m84974n(bVar), this.f359700c);
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
