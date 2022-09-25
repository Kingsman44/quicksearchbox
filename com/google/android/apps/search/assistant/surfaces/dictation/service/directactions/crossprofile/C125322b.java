package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile;

import android.content.Context;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.b */
/* compiled from: PG */
public final /* synthetic */ class C125322b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ Context f345699a;

    /* renamed from: b */
    public final /* synthetic */ C46194e f345700b;

    /* renamed from: c */
    public final /* synthetic */ Executor f345701c;

    public /* synthetic */ C125322b(Context context, C46194e eVar, Executor executor) {
        this.f345699a = context;
        this.f345700b = eVar;
        this.f345701c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Context context = this.f345699a;
        C46194e eVar = this.f345700b;
        return C60922j.m93044g(eVar.mo50254a(), C47810es.m84963c(new C125325e(context)), this.f345701c);
    }
}
