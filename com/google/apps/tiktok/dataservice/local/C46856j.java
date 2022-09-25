package com.google.apps.tiktok.dataservice.local;

import androidx.lifecycle.C2384o;
import com.google.apps.tiktok.dataservice.C46785db;
import com.google.apps.tiktok.lifecycle.C47439h;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.local.j */
/* compiled from: PG */
public final class C46856j {
    /* renamed from: a */
    public static C46855i m83479a(C2384o oVar, C47439h hVar, C46785db dbVar, Executor executor) {
        return new C46867u(new LocalSubscriptionMixinResultPropagator(new LocalSubscriptionMixinImpl(oVar, hVar, executor), hVar, dbVar, executor, oVar));
    }
}
