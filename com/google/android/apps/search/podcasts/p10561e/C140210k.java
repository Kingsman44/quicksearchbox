package com.google.android.apps.search.podcasts.p10561e;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.C58817ah;
import p5462h.C69788q;

/* renamed from: com.google.android.apps.search.podcasts.e.k */
/* compiled from: PG */
final class C140210k implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ Context f380925a;

    public C140210k(Context context) {
        this.f380925a = context;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Intent intent = (Intent) obj;
        if (intent == null) {
            return null;
        }
        this.f380925a.sendBroadcast(intent);
        return C69788q.f186170a;
    }
}
