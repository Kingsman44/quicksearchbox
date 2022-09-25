package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9664a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutorService;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.a.b */
/* compiled from: PG */
public final class C127935b {

    /* renamed from: a */
    public static final C58974d f352154a = C58974d.m91136j();

    /* renamed from: b */
    public final String f352155b;

    /* renamed from: c */
    private volatile C60870cx f352156c = C60856cj.m92899h(new IllegalStateException("update was not requested yet"));

    /* renamed from: d */
    private final ExecutorService f352157d;

    public C127935b(String str, ExecutorService executorService) {
        this.f352155b = str;
        this.f352157d = executorService;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo108283a() {
        return C60856cj.m92901j(this.f352156c);
    }

    /* renamed from: b */
    public final synchronized void mo108284b(Supplier supplier) {
        if (this.f352156c.isDone()) {
            this.f352156c = (C60870cx) supplier.get();
            C60870cx cxVar = this.f352156c;
            C127934a aVar = new C127934a(this);
            C60856cj.m92911t(cxVar, C47810es.m84974n(aVar), this.f352157d);
        }
    }
}
