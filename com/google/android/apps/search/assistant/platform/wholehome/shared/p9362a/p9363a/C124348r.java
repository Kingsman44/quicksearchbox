package com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a;

import android.content.Context;
import com.google.android.gms.common.moduleinstall.C143962c;
import com.google.android.gms.common.moduleinstall.internal.C143985s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.a.a.r */
/* compiled from: PG */
public final class C124348r {

    /* renamed from: a */
    public static final C58974d f343234a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f343235b;

    /* renamed from: c */
    public final C143962c f343236c;

    /* renamed from: d */
    public final Executor f343237d;

    /* renamed from: e */
    public C60870cx f343238e;

    /* renamed from: f */
    private final Executor f343239f;

    public C124348r(Context context, C124330a aVar, Executor executor) {
        this.f343235b = context;
        this.f343236c = new C143985s(aVar.f343208a);
        this.f343237d = executor;
        this.f343239f = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo106379a() {
        C124346p pVar = new C124346p(this);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(pVar), this.f343239f));
    }
}
