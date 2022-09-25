package com.google.android.libraries.social.populous.p3289c.p3290a;

import android.content.Context;
import com.google.android.libraries.social.populous.core.C42351l;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.common.base.C58837ba;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.social.populous.c.a.b */
/* compiled from: PG */
public final class C42210b {

    /* renamed from: a */
    public final Context f110534a;

    /* renamed from: b */
    final Map f110535b = new ConcurrentHashMap();

    public C42210b(Context context) {
        this.f110534a = context;
    }

    /* renamed from: a */
    public final void mo44908a(C42352m mVar) {
        if (mVar.f111091c == C42351l.SUCCESS_LOGGED_IN && !C58837ba.m90859h(mVar.f111092d)) {
            this.f110535b.put(mVar.f111089a, mVar);
        }
    }
}
