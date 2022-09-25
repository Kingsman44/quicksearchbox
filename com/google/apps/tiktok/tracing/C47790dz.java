package com.google.apps.tiktok.tracing;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47628a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47629b;
import com.google.common.util.concurrent.C60809aq;
import com.google.common.util.concurrent.C60813au;

/* renamed from: com.google.apps.tiktok.tracing.dz */
/* compiled from: PG */
public final /* synthetic */ class C47790dz implements C60809aq {

    /* renamed from: a */
    public final /* synthetic */ C47572bw f123784a;

    /* renamed from: b */
    public final /* synthetic */ C60809aq f123785b;

    public /* synthetic */ C47790dz(C47572bw bwVar, C60809aq aqVar) {
        this.f123784a = bwVar;
        this.f123785b = aqVar;
    }

    /* renamed from: a */
    public final Object mo51504a(C60813au auVar) {
        C47572bw bwVar = this.f123784a;
        C60809aq aqVar = this.f123785b;
        int i = C47810es.f123822b;
        C47572bw h = C47831fm.m85013h(bwVar);
        try {
            Object a = C47629b.m84723a(((C47628a) aqVar).f123558a, auVar);
            C47831fm.m85013h(h);
            return a;
        } catch (Throwable th) {
            C47831fm.m85013h(h);
            throw th;
        }
    }
}
