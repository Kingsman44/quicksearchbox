package com.google.android.apps.gsa.staticplugins.p8793w.p8795b.p8796a.p8801d;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.b.a.d.a */
/* compiled from: PG */
public final /* synthetic */ class C117754a implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C86034c f326840a;

    /* renamed from: b */
    public final /* synthetic */ Context f326841b;

    /* renamed from: c */
    public final /* synthetic */ Executor f326842c;

    public /* synthetic */ C117754a(C86034c cVar, Context context, Executor executor) {
        this.f326840a = cVar;
        this.f326841b = context;
        this.f326842c = executor;
    }

    public final Object get() {
        C86034c cVar = this.f326840a;
        Context context = this.f326841b;
        return C60922j.m93044g(cVar.mo79697b(), C47810es.m84963c(new C117755b(context)), this.f326842c);
    }
}
