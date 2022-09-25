package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import android.util.LruCache;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.c */
/* compiled from: PG */
final class C126326c extends LruCache {

    /* renamed from: a */
    final /* synthetic */ C60931s f347994a;

    /* renamed from: b */
    final /* synthetic */ Executor f347995b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126326c(C60931s sVar, Executor executor) {
        super(1);
        this.f347994a = sVar;
        this.f347995b = executor;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        return new C46423aj(new C126318b(this.f347994a, obj), this.f347995b);
    }
}
