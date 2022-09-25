package com.google.android.apps.search.assistant.surfaces.appactions.service;

import android.os.Binder;
import com.google.android.apps.search.assistant.platform.p8988a.C119500b;
import com.google.android.libraries.appactions.service.C147859a;
import com.google.android.libraries.appactions.service.C147861c;
import com.google.android.libraries.appactions.service.ShortcutLookupRequest;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.service.j */
/* compiled from: PG */
public final class C124378j extends C147859a {

    /* renamed from: a */
    public static final C59071e f343305a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.appactions.service.j");

    /* renamed from: b */
    private final C119500b f343306b;

    /* renamed from: c */
    private final Executor f343307c;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.service.j$a */
    /* compiled from: PG */
    public interface C124379a {
        /* renamed from: au */
        C124371c mo106401au();

        /* renamed from: mT */
        boolean mo106402mT();

        /* renamed from: mU */
        boolean mo106403mU();
    }

    public C124378j(C119500b bVar, Executor executor) {
        this.f343306b = bVar;
        this.f343307c = executor;
    }

    /* renamed from: a */
    public final void mo106400a(ShortcutLookupRequest shortcutLookupRequest, C147861c cVar) {
        int callingUid = Binder.getCallingUid();
        C60870cx a = this.f343306b.mo104411a(C124379a.class);
        C124377i iVar = new C124377i(shortcutLookupRequest, cVar, callingUid);
        C60856cj.m92911t(a, C47810es.m84974n(iVar), this.f343307c);
    }
}
