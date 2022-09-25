package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9205d;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9179a.C121213a;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121283c;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9207f.C121372a;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9207f.C121373b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Comparator;
import java.util.concurrent.Executor;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.d.p */
/* compiled from: PG */
public final class C121365p implements C121283c {

    /* renamed from: a */
    public static final Comparator f336990a = Comparator.EL.reversed(Comparator.CC.comparing(C121359j.f336984a, Comparator.CC.comparingDouble(C121360k.f336985a)));

    /* renamed from: b */
    public final PackageManager f336991b;

    /* renamed from: c */
    private final Context f336992c;

    /* renamed from: d */
    private final Executor f336993d;

    /* renamed from: e */
    private final C121373b f336994e;

    public C121365p(Context context, Executor executor, C121373b bVar) {
        this.f336992c = context;
        this.f336993d = executor;
        this.f336991b = context.getPackageManager();
        this.f336994e = bVar;
    }

    /* renamed from: b */
    public final C60870cx mo105108b(String str, int i) {
        C121373b bVar = this.f336994e;
        String trim = C58890d.m90988c(str).trim();
        C58976aa aaVar = C58975e.f156826a;
        C121213a aVar = bVar.f337003a;
        C60870cx a = aVar.f336733a.mo105085a(C48714bv.APP_NICKNAME_SIGNAL);
        C121372a aVar2 = new C121372a(trim);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(aVar2), bVar.f337004b);
        C121361l lVar = new C121361l(this);
        C60870cx g2 = C60922j.m93044g(g, C47810es.m84963c(lVar), this.f336993d);
        C121358i iVar = new C121358i(i);
        return C60922j.m93045h(g2, C47810es.m84966f(iVar), this.f336993d);
    }
}
