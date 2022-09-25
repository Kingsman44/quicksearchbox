package com.google.android.apps.gsa.smartspace.p7258b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.smartspace.b.at */
/* compiled from: PG */
public final class C92057at {

    /* renamed from: a */
    public final C86034c f256652a;

    /* renamed from: b */
    public final Executor f256653b;

    /* renamed from: c */
    public final Context f256654c;

    public C92057at(Executor executor, C86034c cVar, Context context) {
        this.f256653b = executor;
        this.f256652a = cVar;
        this.f256654c = context;
    }

    /* renamed from: a */
    public final C60870cx mo86723a() {
        C60870cx b = this.f256652a.mo79697b();
        C92055ar arVar = new C92055ar(this);
        return C60922j.m93044g(b, C47810es.m84963c(arVar), this.f256653b);
    }
}
