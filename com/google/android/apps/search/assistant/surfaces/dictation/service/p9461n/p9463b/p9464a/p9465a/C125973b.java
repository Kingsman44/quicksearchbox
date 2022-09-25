package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9464a.p9465a;

import android.util.LruCache;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a.a.b */
/* compiled from: PG */
public final class C125973b {

    /* renamed from: a */
    public final LruCache f347203a = new LruCache(5);

    /* renamed from: b */
    private final Executor f347204b;

    public C125973b(Executor executor) {
        this.f347204b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo107223a(Object obj, C60931s sVar) {
        C46423aj ajVar = (C46423aj) this.f347203a.get(obj);
        if (ajVar != null && C126309ar.m206529h(ajVar.mo50395b())) {
            return ajVar.mo50395b();
        }
        C46423aj ajVar2 = new C46423aj(new C125972a(sVar, obj), this.f347204b);
        this.f347203a.put(obj, ajVar2);
        return ajVar2.mo50395b();
    }
}
