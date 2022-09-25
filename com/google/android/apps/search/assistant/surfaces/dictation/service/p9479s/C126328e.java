package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import android.util.LruCache;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.e */
/* compiled from: PG */
public final class C126328e {

    /* renamed from: a */
    private final LruCache f347997a;

    public C126328e(C60931s sVar, Executor executor) {
        this.f347997a = new C126326c(sVar, executor);
    }

    /* renamed from: a */
    public final C60870cx mo107545a(Object obj) {
        C46423aj ajVar = (C46423aj) this.f347997a.get(obj);
        ajVar.getClass();
        return ajVar.mo50395b();
    }
}
