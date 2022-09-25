package com.google.android.apps.search.assistant.verticals.p10036c;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.c.i */
/* compiled from: PG */
public final class C131943i implements C47352j {

    /* renamed from: a */
    public static final C58974d f360252a = C58974d.m91135i("DeeplinkSynclet");

    /* renamed from: b */
    public final Context f360253b;

    /* renamed from: c */
    public final Executor f360254c;

    /* renamed from: d */
    public final C131941g f360255d;

    /* renamed from: e */
    private final C121011a f360256e;

    /* renamed from: f */
    private final boolean f360257f;

    public C131943i(Context context, Executor executor, C121011a aVar, boolean z) {
        this.f360253b = context;
        this.f360254c = executor;
        this.f360256e = aVar;
        this.f360257f = z;
        this.f360255d = new C131942h(context);
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        if (!this.f360257f) {
            return C60856cj.m92900i(false);
        }
        if (Build.VERSION.SDK_INT < 30) {
            return C60856cj.m92900i(false);
        }
        C60870cx a = this.f360256e.mo104231a();
        C131938d dVar = new C131938d(this);
        return C60922j.m93045h(a, C47810es.m84966f(dVar), this.f360254c);
    }
}
